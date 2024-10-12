<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="大屏编号" prop="bigScreenId">
        <el-input
          v-model="queryParams.bigScreenId"
          placeholder="请输入大屏编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="大屏分组" prop="bigScreenClassify">
        <el-input
          v-model="queryParams.bigScreenClassify"
          placeholder="请输入大屏分组"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="大屏名称" prop="bigScreenName">
        <el-input
          v-model="queryParams.bigScreenName"
          placeholder="请输入大屏名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="自定义标题" prop="title">
        <el-input
          v-model="queryParams.title"
          placeholder="请输入自定义标题"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="显示级别" prop="displayLevel">
        <el-input
          v-model="queryParams.displayLevel"
          placeholder="请输入显示级别"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="区域级别" prop="areaLevel">
        <el-input
          v-model="queryParams.areaLevel"
          placeholder="请输入区域级别"
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
      <el-form-item label="创建日期" prop="createTime">
        <el-date-picker clearable
          v-model="queryParams.createTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择创建日期">
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
          v-hasPermi="['system:large_screen_set:add']"
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
          v-hasPermi="['system:large_screen_set:edit']"
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
          v-hasPermi="['system:large_screen_set:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:large_screen_set:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="large_screen_setList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" align="center" prop="id" />
      <el-table-column label="大屏编号" align="center" prop="bigScreenId" />
      <el-table-column label="大屏分组" align="center" prop="bigScreenClassify" />
      <el-table-column label="大屏名称" align="center" prop="bigScreenName" />
      <el-table-column label="自定义标题" align="center" prop="title" />
      <el-table-column label="显示级别" align="center" prop="displayLevel" />
      <el-table-column label="区域级别" align="center" prop="areaLevel" />
      <el-table-column label="所属机构" align="center" prop="organization" />
      <el-table-column label="当前状态" align="center" prop="status" />
      <el-table-column label="创建日期" align="center" prop="createTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.createTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:large_screen_set:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:large_screen_set:remove']"
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

    <!-- 添加或修改大屏基础设置对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="大屏编号" prop="bigScreenId">
          <el-input v-model="form.bigScreenId" placeholder="请输入大屏编号" />
        </el-form-item>
        <el-form-item label="大屏分组" prop="bigScreenClassify">
          <el-input v-model="form.bigScreenClassify" placeholder="请输入大屏分组" />
        </el-form-item>
        <el-form-item label="大屏名称" prop="bigScreenName">
          <el-input v-model="form.bigScreenName" placeholder="请输入大屏名称" />
        </el-form-item>
        <el-form-item label="自定义标题" prop="title">
          <el-input v-model="form.title" placeholder="请输入自定义标题" />
        </el-form-item>
        <el-form-item label="显示级别" prop="displayLevel">
          <el-input v-model="form.displayLevel" placeholder="请输入显示级别" />
        </el-form-item>
        <el-form-item label="区域级别" prop="areaLevel">
          <el-input v-model="form.areaLevel" placeholder="请输入区域级别" />
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
import { listLarge_screen_set, getLarge_screen_set, delLarge_screen_set, addLarge_screen_set, updateLarge_screen_set } from "@/api/system/large_screen_set";

export default {
  name: "Large_screen_set",
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
      // 大屏基础设置表格数据
      large_screen_setList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        bigScreenId: null,
        bigScreenClassify: null,
        bigScreenName: null,
        title: null,
        displayLevel: null,
        areaLevel: null,
        organization: null,
        status: null,
        createTime: null
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
    /** 查询大屏基础设置列表 */
    getList() {
      this.loading = true;
      listLarge_screen_set(this.queryParams).then(response => {
        this.large_screen_setList = response.rows;
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
        bigScreenId: null,
        bigScreenClassify: null,
        bigScreenName: null,
        title: null,
        displayLevel: null,
        areaLevel: null,
        organization: null,
        status: null,
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
      this.title = "添加大屏基础设置";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getLarge_screen_set(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改大屏基础设置";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateLarge_screen_set(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addLarge_screen_set(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除大屏基础设置编号为"' + ids + '"的数据项？').then(function() {
        return delLarge_screen_set(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/large_screen_set/export', {
        ...this.queryParams
      }, `large_screen_set_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
