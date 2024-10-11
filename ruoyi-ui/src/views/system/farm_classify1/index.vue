<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="农事分类" prop="farmClassify">
        <el-input
          v-model="queryParams.farmClassify"
          placeholder="请输入农事分类"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="农事名称" prop="farmName">
        <el-input
          v-model="queryParams.farmName"
          placeholder="请输入农事名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="农事要点" prop="farmKey">
        <el-input
          v-model="queryParams.farmKey"
          placeholder="请输入农事要点"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="是否常用" prop="used">
        <el-input
          v-model="queryParams.used"
          placeholder="请输入是否常用"
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
      <el-form-item label="数据来源" prop="resource">
        <el-input
          v-model="queryParams.resource"
          placeholder="请输入数据来源"
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
          v-hasPermi="['system:farm_classify1:add']"
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
          v-hasPermi="['system:farm_classify1:edit']"
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
          v-hasPermi="['system:farm_classify1:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:farm_classify1:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="farm_classify1List" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" align="center" prop="id" />
      <el-table-column label="农事分类" align="center" prop="farmClassify" />
      <el-table-column label="农事名称" align="center" prop="farmName" />
      <el-table-column label="农事要点" align="center" prop="farmKey" />
      <el-table-column label="是否常用" align="center" prop="used" />
      <el-table-column label="所属机构" align="center" prop="organization" />
      <el-table-column label="数据来源" align="center" prop="resource" />
      <el-table-column label="数据状态" align="center" prop="status" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:farm_classify1:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:farm_classify1:remove']"
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

    <!-- 添加或修改农事分类设置对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="农事分类" prop="farmClassify">
          <el-input v-model="form.farmClassify" placeholder="请输入农事分类" />
        </el-form-item>
        <el-form-item label="农事名称" prop="farmName">
          <el-input v-model="form.farmName" placeholder="请输入农事名称" />
        </el-form-item>
        <el-form-item label="农事要点" prop="farmKey">
          <el-input v-model="form.farmKey" placeholder="请输入农事要点" />
        </el-form-item>
        <el-form-item label="是否常用" prop="used">
          <el-input v-model="form.used" placeholder="请输入是否常用" />
        </el-form-item>
        <el-form-item label="所属机构" prop="organization">
          <el-input v-model="form.organization" placeholder="请输入所属机构" />
        </el-form-item>
        <el-form-item label="数据来源" prop="resource">
          <el-input v-model="form.resource" placeholder="请输入数据来源" />
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
import { listFarm_classify1, getFarm_classify1, delFarm_classify1, addFarm_classify1, updateFarm_classify1 } from "@/api/system/farm_classify1";

export default {
  name: "Farm_classify1",
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
      // 农事分类设置表格数据
      farm_classify1List: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        farmClassify: null,
        farmName: null,
        farmKey: null,
        used: null,
        organization: null,
        resource: null,
        status: null,
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
    /** 查询农事分类设置列表 */
    getList() {
      this.loading = true;
      listFarm_classify1(this.queryParams).then(response => {
        this.farm_classify1List = response.rows;
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
        farmClassify: null,
        farmName: null,
        farmKey: null,
        used: null,
        organization: null,
        resource: null,
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
      this.title = "添加农事分类设置";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getFarm_classify1(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改农事分类设置";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateFarm_classify1(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addFarm_classify1(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除农事分类设置编号为"' + ids + '"的数据项？').then(function() {
        return delFarm_classify1(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/farm_classify1/export', {
        ...this.queryParams
      }, `farm_classify1_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
