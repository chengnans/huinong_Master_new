<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="系统编号" prop="systemId">
        <el-input
          v-model="queryParams.systemId"
          placeholder="请输入系统编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="设施编号" prop="facilityId">
        <el-input
          v-model="queryParams.facilityId"
          placeholder="请输入设施编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="设施名称" prop="facilityName">
        <el-input
          v-model="queryParams.facilityName"
          placeholder="请输入设施名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="长" prop="facilityLong">
        <el-input
          v-model="queryParams.facilityLong"
          placeholder="请输入长"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="宽" prop="facilityWidth">
        <el-input
          v-model="queryParams.facilityWidth"
          placeholder="请输入宽"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="高" prop="facilityTall">
        <el-input
          v-model="queryParams.facilityTall"
          placeholder="请输入高"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="备注" prop="detail">
        <el-input
          v-model="queryParams.detail"
          placeholder="请输入备注"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="机构名称" prop="organizationName">
        <el-input
          v-model="queryParams.organizationName"
          placeholder="请输入机构名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="监管单位" prop="monitor">
        <el-input
          v-model="queryParams.monitor"
          placeholder="请输入监管单位"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="联系电话" prop="phone">
        <el-input
          v-model="queryParams.phone"
          placeholder="请输入联系电话"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="联系人" prop="contact">
        <el-input
          v-model="queryParams.contact"
          placeholder="请输入联系人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="操作人" prop="operator">
        <el-input
          v-model="queryParams.operator"
          placeholder="请输入操作人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="操作时间" prop="operatingTime">
        <el-date-picker clearable
          v-model="queryParams.operatingTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择操作时间">
        </el-date-picker>
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
          v-hasPermi="['system:facility_list:add']"
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
          v-hasPermi="['system:facility_list:edit']"
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
          v-hasPermi="['system:facility_list:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:facility_list:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="facility_listList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" align="center" prop="id" />
      <el-table-column label="系统编号" align="center" prop="systemId" />
      <el-table-column label="设施编号" align="center" prop="facilityId" />
      <el-table-column label="设施名称" align="center" prop="facilityName" />
      <el-table-column label="设施类型" align="center" prop="facilityType" />
      <el-table-column label="长" align="center" prop="facilityLong" />
      <el-table-column label="宽" align="center" prop="facilityWidth" />
      <el-table-column label="高" align="center" prop="facilityTall" />
      <el-table-column label="备注" align="center" prop="detail" />
      <el-table-column label="机构名称" align="center" prop="organizationName" />
      <el-table-column label="监管单位" align="center" prop="monitor" />
      <el-table-column label="联系电话" align="center" prop="phone" />
      <el-table-column label="联系人" align="center" prop="contact" />
      <el-table-column label="操作人" align="center" prop="operator" />
      <el-table-column label="操作时间" align="center" prop="operatingTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.operatingTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:facility_list:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:facility_list:remove']"
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

    <!-- 添加或修改设施列表对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="系统编号" prop="systemId">
          <el-input v-model="form.systemId" placeholder="请输入系统编号" />
        </el-form-item>
        <el-form-item label="设施编号" prop="facilityId">
          <el-input v-model="form.facilityId" placeholder="请输入设施编号" />
        </el-form-item>
        <el-form-item label="设施名称" prop="facilityName">
          <el-input v-model="form.facilityName" placeholder="请输入设施名称" />
        </el-form-item>
        <el-form-item label="长" prop="facilityLong">
          <el-input v-model="form.facilityLong" placeholder="请输入长" />
        </el-form-item>
        <el-form-item label="宽" prop="facilityWidth">
          <el-input v-model="form.facilityWidth" placeholder="请输入宽" />
        </el-form-item>
        <el-form-item label="高" prop="facilityTall">
          <el-input v-model="form.facilityTall" placeholder="请输入高" />
        </el-form-item>
        <el-form-item label="备注" prop="detail">
          <el-input v-model="form.detail" placeholder="请输入备注" />
        </el-form-item>
        <el-form-item label="机构名称" prop="organizationName">
          <el-input v-model="form.organizationName" placeholder="请输入机构名称" />
        </el-form-item>
        <el-form-item label="监管单位" prop="monitor">
          <el-input v-model="form.monitor" placeholder="请输入监管单位" />
        </el-form-item>
        <el-form-item label="联系电话" prop="phone">
          <el-input v-model="form.phone" placeholder="请输入联系电话" />
        </el-form-item>
        <el-form-item label="联系人" prop="contact">
          <el-input v-model="form.contact" placeholder="请输入联系人" />
        </el-form-item>
        <el-form-item label="操作人" prop="operator">
          <el-input v-model="form.operator" placeholder="请输入操作人" />
        </el-form-item>
        <el-form-item label="操作时间" prop="operatingTime">
          <el-date-picker clearable
            v-model="form.operatingTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择操作时间">
          </el-date-picker>
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
import { listFacility_list, getFacility_list, delFacility_list, addFacility_list, updateFacility_list } from "@/api/system/facility_list";

export default {
  name: "Facility_list",
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
      // 设施列表表格数据
      facility_listList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        systemId: null,
        facilityId: null,
        facilityName: null,
        facilityType: null,
        facilityLong: null,
        facilityWidth: null,
        facilityTall: null,
        detail: null,
        organizationName: null,
        monitor: null,
        phone: null,
        contact: null,
        operator: null,
        operatingTime: null
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
    /** 查询设施列表列表 */
    getList() {
      this.loading = true;
      listFacility_list(this.queryParams).then(response => {
        this.facility_listList = response.rows;
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
        id: null,
        systemId: null,
        facilityId: null,
        facilityName: null,
        facilityType: null,
        facilityLong: null,
        facilityWidth: null,
        facilityTall: null,
        detail: null,
        organizationName: null,
        monitor: null,
        phone: null,
        contact: null,
        operator: null,
        operatingTime: null
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
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加设施列表";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getFacility_list(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改设施列表";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateFacility_list(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addFacility_list(this.form).then(response => {
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
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除设施列表编号为"' + ids + '"的数据项？').then(function() {
        return delFacility_list(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/facility_list/export', {
        ...this.queryParams
      }, `facility_list_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
