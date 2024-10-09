<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="IMEI/MAC" prop="IMEI">
        <el-input
          v-model="queryParams.IMEI"
          placeholder="请输入IMEI/MAC"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="设备分类" prop="deviceClassify">
        <el-input
          v-model="queryParams.deviceClassify"
          placeholder="请输入设备分类"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="产品名称" prop="deviceName">
        <el-input
          v-model="queryParams.deviceName"
          placeholder="请输入产品名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="产品ID" prop="deviceId">
        <el-input
          v-model="queryParams.deviceId"
          placeholder="请输入产品ID"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="接入来源" prop="resource">
        <el-input
          v-model="queryParams.resource"
          placeholder="请输入接入来源"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="所属机构" prop="organization">
        <el-input
          v-model="queryParams.organization"
          placeholder="请输入所属机构"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:device_center:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:device_center:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:device_center:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:device_center:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="device_centerList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="IMEI/MAC" align="center" prop="IMEI" />
      <el-table-column label="设备分类" align="center" prop="deviceClassify" />
      <el-table-column label="产品名称" align="center" prop="deviceName" />
      <el-table-column label="产品ID" align="center" prop="deviceId" />
      <el-table-column label="接入来源" align="center" prop="resource" />
      <el-table-column label="所属机构" align="center" prop="organization" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:device_center:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:device_center:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改设备中心对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="设备分类" prop="deviceClassify">
          <el-input v-model="form.deviceClassify" placeholder="请输入设备分类" />
        </el-form-item>
        <el-form-item label="产品名称" prop="deviceName">
          <el-input v-model="form.deviceName" placeholder="请输入产品名称" />
        </el-form-item>
        <el-form-item label="产品ID" prop="deviceId">
          <el-input v-model="form.deviceId" placeholder="请输入产品ID" />
        </el-form-item>
        <el-form-item label="接入来源" prop="resource">
          <el-input v-model="form.resource" placeholder="请输入接入来源" />
        </el-form-item>
        <el-form-item label="所属机构" prop="organization">
          <el-input v-model="form.organization" placeholder="请输入所属机构" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listDevice_center, getDevice_center, delDevice_center, addDevice_center, updateDevice_center } from "@/api/system/device_center";

export default {
  name: "Device_center",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 设备中心表格数据
      device_centerList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        IMEI: null,
        deviceClassify: null,
        deviceName: null,
        deviceId: null,
        resource: null,
        organization: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询设备中心列表 */
    getList() {
      this.loading = true;
      listDevice_center(this.queryParams).then(response => {
        this.device_centerList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        IMEI: null,
        deviceClassify: null,
        deviceName: null,
        deviceId: null,
        resource: null,
        organization: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.IMEI)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加设备中心";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const IMEI = row.IMEI || this.ids
      getDevice_center(IMEI).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改设备中心";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.IMEI != null) {
            updateDevice_center(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addDevice_center(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const IMEIs = row.IMEI || this.ids;
      this.$modal.confirm('是否确认删除设备中心编号为"' + IMEIs + '"的数据项？').then(function() {
        return delDevice_center(IMEIs);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/device_center/export', {
        ...this.queryParams
      }, `device_center_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
