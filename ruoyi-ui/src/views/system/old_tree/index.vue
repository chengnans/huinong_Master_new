<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="古树编号" prop="bid">
        <el-input
          v-model="queryParams.bid"
          placeholder="请输入古树编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="古树年龄" prop="year">
        <el-input
          v-model="queryParams.year"
          placeholder="请输入古树年龄"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="古树名称" prop="treeName">
        <el-input
          v-model="queryParams.treeName"
          placeholder="请输入古树名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="管理人员" prop="manager">
        <el-input
          v-model="queryParams.manager"
          placeholder="请输入管理人员"
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
      <el-form-item label="所属基地" prop="treeBaseland">
        <el-input
          v-model="queryParams.treeBaseland"
          placeholder="请输入所属基地"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="古树地址" prop="treeAddress">
        <el-input
          v-model="queryParams.treeAddress"
          placeholder="请输入古树地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="图片" prop="photo">
        <el-input
          v-model="queryParams.photo"
          placeholder="请输入图片"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="视频" prop="video">
        <el-input
          v-model="queryParams.video"
          placeholder="请输入视频"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="二维码" prop="qr">
        <el-input
          v-model="queryParams.qr"
          placeholder="请输入二维码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="古树简介" prop="detail">
        <el-input
          v-model="queryParams.detail"
          placeholder="请输入古树简介"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="创建日期" prop="creatTime">
        <el-date-picker clearable
          v-model="queryParams.creatTime"
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
          v-hasPermi="['system:old_tree:add']"
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
          v-hasPermi="['system:old_tree:edit']"
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
          v-hasPermi="['system:old_tree:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:old_tree:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="old_treeList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" align="center" prop="id" />
      <el-table-column label="古树编号" align="center" prop="bid" />
      <el-table-column label="古树年龄" align="center" prop="year" />
      <el-table-column label="古树名称" align="center" prop="treeName" />
      <el-table-column label="古树类别" align="center" prop="treeType" />
      <el-table-column label="管理人员" align="center" prop="manager" />
      <el-table-column label="联系电话" align="center" prop="phone" />
      <el-table-column label="所属基地" align="center" prop="treeBaseland" />
      <el-table-column label="古树地址" align="center" prop="treeAddress" />
      <el-table-column label="状态" align="center" prop="status" />
      <el-table-column label="图片" align="center" prop="photo" />
      <el-table-column label="视频" align="center" prop="video" />
      <el-table-column label="二维码" align="center" prop="qr" />
      <el-table-column label="古树简介" align="center" prop="detail" />
      <el-table-column label="创建日期" align="center" prop="creatTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.creatTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:old_tree:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:old_tree:remove']"
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

    <!-- 添加或修改古树管理对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="古树编号" prop="bid">
          <el-input v-model="form.bid" placeholder="请输入古树编号" />
        </el-form-item>
        <el-form-item label="古树年龄" prop="year">
          <el-input v-model="form.year" placeholder="请输入古树年龄" />
        </el-form-item>
        <el-form-item label="古树名称" prop="treeName">
          <el-input v-model="form.treeName" placeholder="请输入古树名称" />
        </el-form-item>
        <el-form-item label="管理人员" prop="manager">
          <el-input v-model="form.manager" placeholder="请输入管理人员" />
        </el-form-item>
        <el-form-item label="联系电话" prop="phone">
          <el-input v-model="form.phone" placeholder="请输入联系电话" />
        </el-form-item>
        <el-form-item label="所属基地" prop="treeBaseland">
          <el-input v-model="form.treeBaseland" placeholder="请输入所属基地" />
        </el-form-item>
        <el-form-item label="古树地址" prop="treeAddress">
          <el-input v-model="form.treeAddress" placeholder="请输入古树地址" />
        </el-form-item>
        <el-form-item label="图片" prop="photo">
          <el-input v-model="form.photo" placeholder="请输入图片" />
        </el-form-item>
        <el-form-item label="视频" prop="video">
          <el-input v-model="form.video" placeholder="请输入视频" />
        </el-form-item>
        <el-form-item label="二维码" prop="qr">
          <el-input v-model="form.qr" placeholder="请输入二维码" />
        </el-form-item>
        <el-form-item label="古树简介" prop="detail">
          <el-input v-model="form.detail" placeholder="请输入古树简介" />
        </el-form-item>
        <el-form-item label="创建日期" prop="creatTime">
          <el-date-picker clearable
            v-model="form.creatTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择创建日期">
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
import { listOld_tree, getOld_tree, delOld_tree, addOld_tree, updateOld_tree } from "@/api/system/old_tree";

export default {
  name: "Old_tree",
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
      // 古树管理表格数据
      old_treeList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        bid: null,
        year: null,
        treeName: null,
        treeType: null,
        manager: null,
        phone: null,
        treeBaseland: null,
        treeAddress: null,
        status: null,
        photo: null,
        video: null,
        qr: null,
        detail: null,
        creatTime: null
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
    /** 查询古树管理列表 */
    getList() {
      this.loading = true;
      listOld_tree(this.queryParams).then(response => {
        this.old_treeList = response.rows;
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
        year: null,
        treeName: null,
        treeType: null,
        manager: null,
        phone: null,
        treeBaseland: null,
        treeAddress: null,
        status: null,
        photo: null,
        video: null,
        qr: null,
        detail: null,
        creatTime: null
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
      this.title = "添加古树管理";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getOld_tree(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改古树管理";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateOld_tree(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addOld_tree(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除古树管理编号为"' + ids + '"的数据项？').then(function() {
        return delOld_tree(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/old_tree/export', {
        ...this.queryParams
      }, `old_tree_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
