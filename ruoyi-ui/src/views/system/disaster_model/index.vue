<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="灾害名称" prop="disasterName">
        <el-input
          v-model="queryParams.disasterName"
          placeholder="请输入灾害名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="发生时段" prop="occurTime">
        <el-input
          v-model="queryParams.occurTime"
          placeholder="请输入发生时段"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="主要参数" prop="mainParameter">
        <el-input
          v-model="queryParams.mainParameter"
          placeholder="请输入主要参数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="参数区间" prop="parameterInterval">
        <el-input
          v-model="queryParams.parameterInterval"
          placeholder="请输入参数区间"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="灾害说明" prop="disasterDetail">
        <el-input
          v-model="queryParams.disasterDetail"
          placeholder="请输入灾害说明"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="应对措施" prop="measures">
        <el-input
          v-model="queryParams.measures"
          placeholder="请输入应对措施"
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
          v-hasPermi="['system:disaster_model:add']"
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
          v-hasPermi="['system:disaster_model:edit']"
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
          v-hasPermi="['system:disaster_model:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:disaster_model:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="disaster_modelList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" align="center" prop="id" />
      <el-table-column label="灾害类型" align="center" prop="disasterType" />
      <el-table-column label="灾害名称" align="center" prop="disasterName" />
      <el-table-column label="发生时段" align="center" prop="occurTime" />
      <el-table-column label="主要参数" align="center" prop="mainParameter" />
      <el-table-column label="参数区间" align="center" prop="parameterInterval" />
      <el-table-column label="灾害说明" align="center" prop="disasterDetail" />
      <el-table-column label="应对措施" align="center" prop="measures" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:disaster_model:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:disaster_model:remove']"
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

    <!-- 添加或修改灾害模型对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="灾害名称" prop="disasterName">
          <el-input v-model="form.disasterName" placeholder="请输入灾害名称" />
        </el-form-item>
        <el-form-item label="发生时段" prop="occurTime">
          <el-input v-model="form.occurTime" placeholder="请输入发生时段" />
        </el-form-item>
        <el-form-item label="主要参数" prop="mainParameter">
          <el-input v-model="form.mainParameter" placeholder="请输入主要参数" />
        </el-form-item>
        <el-form-item label="参数区间" prop="parameterInterval">
          <el-input v-model="form.parameterInterval" placeholder="请输入参数区间" />
        </el-form-item>
        <el-form-item label="灾害说明" prop="disasterDetail">
          <el-input v-model="form.disasterDetail" placeholder="请输入灾害说明" />
        </el-form-item>
        <el-form-item label="应对措施" prop="measures">
          <el-input v-model="form.measures" placeholder="请输入应对措施" />
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
import { listDisaster_model, getDisaster_model, delDisaster_model, addDisaster_model, updateDisaster_model } from "@/api/system/disaster_model";

export default {
  name: "Disaster_model",
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
      // 灾害模型表格数据
      disaster_modelList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        disasterType: null,
        disasterName: null,
        occurTime: null,
        mainParameter: null,
        parameterInterval: null,
        disasterDetail: null,
        measures: null,
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
    /** 查询灾害模型列表 */
    getList() {
      this.loading = true;
      listDisaster_model(this.queryParams).then(response => {
        this.disaster_modelList = response.rows;
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
        disasterType: null,
        disasterName: null,
        occurTime: null,
        mainParameter: null,
        parameterInterval: null,
        disasterDetail: null,
        measures: null,
        createTime: null
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
      this.title = "添加灾害模型";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getDisaster_model(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改灾害模型";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateDisaster_model(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addDisaster_model(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除灾害模型编号为"' + ids + '"的数据项？').then(function() {
        return delDisaster_model(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/disaster_model/export', {
        ...this.queryParams
      }, `disaster_model_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
