<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="分类名称" prop="classifyName">
        <el-input
          v-model="queryParams.classifyName"
          placeholder="请输入分类名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="上级分类" prop="classify">
        <el-input
          v-model="queryParams.classify"
          placeholder="请输入上级分类"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="APP首页图片" prop="photoApp">
        <el-input
          v-model="queryParams.photoApp"
          placeholder="请输入APP首页图片"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="农作物详情图片" prop="photoCrop">
        <el-input
          v-model="queryParams.photoCrop"
          placeholder="请输入农作物详情图片"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="默认分类图片" prop="photoDefault">
        <el-input
          v-model="queryParams.photoDefault"
          placeholder="请输入默认分类图片"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="灌区背景图" prop="photoBackground">
        <el-input
          v-model="queryParams.photoBackground"
          placeholder="请输入灌区背景图"
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
          v-hasPermi="['system:agricultural_classification:add']"
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
          v-hasPermi="['system:agricultural_classification:edit']"
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
          v-hasPermi="['system:agricultural_classification:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:agricultural_classification:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="agricultural_classificationList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" align="center" prop="id" />
      <el-table-column label="分类名称" align="center" prop="classifyName" />
      <el-table-column label="上级分类" align="center" prop="classify" />
      <el-table-column label="APP首页图片" align="center" prop="photoApp" />
      <el-table-column label="农作物详情图片" align="center" prop="photoCrop" />
      <el-table-column label="默认分类图片" align="center" prop="photoDefault" />
      <el-table-column label="灌区背景图" align="center" prop="photoBackground" />
      <el-table-column label="数据状态" align="center" prop="status" />
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
            v-hasPermi="['system:agricultural_classification:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:agricultural_classification:remove']"
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

    <!-- 添加或修改农业分类设置对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="分类名称" prop="classifyName">
          <el-input v-model="form.classifyName" placeholder="请输入分类名称" />
        </el-form-item>
        <el-form-item label="上级分类" prop="classify">
          <el-input v-model="form.classify" placeholder="请输入上级分类" />
        </el-form-item>
        <el-form-item label="APP首页图片" prop="photoApp">
          <el-input v-model="form.photoApp" placeholder="请输入APP首页图片" />
        </el-form-item>
        <el-form-item label="农作物详情图片" prop="photoCrop">
          <el-input v-model="form.photoCrop" placeholder="请输入农作物详情图片" />
        </el-form-item>
        <el-form-item label="默认分类图片" prop="photoDefault">
          <el-input v-model="form.photoDefault" placeholder="请输入默认分类图片" />
        </el-form-item>
        <el-form-item label="灌区背景图" prop="photoBackground">
          <el-input v-model="form.photoBackground" placeholder="请输入灌区背景图" />
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
import { listAgricultural_classification, getAgricultural_classification, delAgricultural_classification, addAgricultural_classification, updateAgricultural_classification } from "@/api/system/agricultural_classification";

export default {
  name: "Agricultural_classification",
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
      // 农业分类设置表格数据
      agricultural_classificationList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        classifyName: null,
        classify: null,
        photoApp: null,
        photoCrop: null,
        photoDefault: null,
        photoBackground: null,
        status: null,
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
    /** 查询农业分类设置列表 */
    getList() {
      this.loading = true;
      listAgricultural_classification(this.queryParams).then(response => {
        this.agricultural_classificationList = response.rows;
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
        classifyName: null,
        classify: null,
        photoApp: null,
        photoCrop: null,
        photoDefault: null,
        photoBackground: null,
        status: null,
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
      this.title = "添加农业分类设置";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getAgricultural_classification(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改农业分类设置";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateAgricultural_classification(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addAgricultural_classification(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除农业分类设置编号为"' + ids + '"的数据项？').then(function() {
        return delAgricultural_classification(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/agricultural_classification/export', {
        ...this.queryParams
      }, `agricultural_classification_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
