<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="编号" prop="bid">
        <el-input
          v-model="queryParams.bid"
          placeholder="请输入编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="名称" prop="name">
        <el-input
          v-model="queryParams.name"
          placeholder="请输入名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="发布日期" prop="publishTime">
        <el-date-picker clearable
          v-model="queryParams.publishTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择发布日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="施行日期" prop="implementationTime">
        <el-date-picker clearable
          v-model="queryParams.implementationTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择施行日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="土地类型" prop="soilStyle">
        <el-input
          v-model="queryParams.soilStyle"
          placeholder="请输入土地类型"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="土壤质地" prop="soilTexture">
        <el-input
          v-model="queryParams.soilTexture"
          placeholder="请输入土壤质地"
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
          v-hasPermi="['system:soil_health_standard_library:add']"
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
          v-hasPermi="['system:soil_health_standard_library:edit']"
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
          v-hasPermi="['system:soil_health_standard_library:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:soil_health_standard_library:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="soil_health_standard_libraryList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" align="center" prop="id" />
      <el-table-column label="编号" align="center" prop="bid" />
      <el-table-column label="名称" align="center" prop="name" />
      <el-table-column label="发布日期" align="center" prop="publishTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.publishTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="施行日期" align="center" prop="implementationTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.implementationTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="土地类型" align="center" prop="soilStyle" />
      <el-table-column label="土壤质地" align="center" prop="soilTexture" />
      <el-table-column label="备注" align="center" prop="detail" />
      <el-table-column label="状态" align="center" prop="soilStatus" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:soil_health_standard_library:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:soil_health_standard_library:remove']"
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

    <!-- 添加或修改土壤健康标准库对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="编号" prop="bid">
          <el-input v-model="form.bid" placeholder="请输入编号" />
        </el-form-item>
        <el-form-item label="名称" prop="name">
          <el-input v-model="form.name" placeholder="请输入名称" />
        </el-form-item>
        <el-form-item label="发布日期" prop="publishTime">
          <el-date-picker clearable
            v-model="form.publishTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择发布日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="施行日期" prop="implementationTime">
          <el-date-picker clearable
            v-model="form.implementationTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择施行日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="土地类型" prop="soilStyle">
          <el-input v-model="form.soilStyle" placeholder="请输入土地类型" />
        </el-form-item>
        <el-form-item label="土壤质地" prop="soilTexture">
          <el-input v-model="form.soilTexture" placeholder="请输入土壤质地" />
        </el-form-item>
        <el-form-item label="备注" prop="detail">
          <el-input v-model="form.detail" placeholder="请输入备注" />
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
import { listSoil_health_standard_library, getSoil_health_standard_library, delSoil_health_standard_library, addSoil_health_standard_library, updateSoil_health_standard_library } from "@/api/system/soil_health_standard_library";

export default {
  name: "Soil_health_standard_library",
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
      // 土壤健康标准库表格数据
      soil_health_standard_libraryList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        bid: null,
        name: null,
        publishTime: null,
        implementationTime: null,
        soilStyle: null,
        soilTexture: null,
        detail: null,
        soilStatus: null
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
    /** 查询土壤健康标准库列表 */
    getList() {
      this.loading = true;
      listSoil_health_standard_library(this.queryParams).then(response => {
        this.soil_health_standard_libraryList = response.rows;
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
        bid: null,
        name: null,
        publishTime: null,
        implementationTime: null,
        soilStyle: null,
        soilTexture: null,
        detail: null,
        soilStatus: null
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
      this.title = "添加土壤健康标准库";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getSoil_health_standard_library(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改土壤健康标准库";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateSoil_health_standard_library(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addSoil_health_standard_library(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除土壤健康标准库编号为"' + ids + '"的数据项？').then(function() {
        return delSoil_health_standard_library(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/soil_health_standard_library/export', {
        ...this.queryParams
      }, `soil_health_standard_library_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
