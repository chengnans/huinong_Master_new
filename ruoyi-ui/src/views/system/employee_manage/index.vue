<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="登录账号" prop="loginAccount">
        <el-input
          v-model="queryParams.loginAccount"
          placeholder="请输入登录账号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="登录密码" prop="loginPassword">
        <el-input
          v-model="queryParams.loginPassword"
          placeholder="请输入登录密码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="确认密码" prop="confirmPassword">
        <el-input
          v-model="queryParams.confirmPassword"
          placeholder="请输入确认密码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="昵称" prop="nickname">
        <el-input
          v-model="queryParams.nickname"
          placeholder="请输入昵称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="所属机构" prop="affiliation">
        <el-input
          v-model="queryParams.affiliation"
          placeholder="请输入所属机构"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="姓名" prop="employeeName">
        <el-input
          v-model="queryParams.employeeName"
          placeholder="请输入姓名"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="手机号码" prop="phoneNumber">
        <el-input
          v-model="queryParams.phoneNumber"
          placeholder="请输入手机号码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="邮箱" prop="employeeEmail">
        <el-input
          v-model="queryParams.employeeEmail"
          placeholder="请输入邮箱"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="身份证" prop="idCard">
        <el-input
          v-model="queryParams.idCard"
          placeholder="请输入身份证"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="所在部门" prop="apartment">
        <el-input
          v-model="queryParams.apartment"
          placeholder="请输入所在部门"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="职位" prop="employeePosts">
        <el-input
          v-model="queryParams.employeePosts"
          placeholder="请输入职位"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="区域级别" prop="regionallevel">
        <el-input
          v-model="queryParams.regionallevel"
          placeholder="请输入区域级别"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="所属区域" prop="region">
        <el-input
          v-model="queryParams.region"
          placeholder="请输入所属区域"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="备注信息" prop="remarksinformation">
        <el-input
          v-model="queryParams.remarksinformation"
          placeholder="请输入备注信息"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="创建时间" prop="createTime">
        <el-date-picker clearable
          v-model="queryParams.createTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择创建时间">
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
          v-hasPermi="['system:employee_manage:add']"
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
          v-hasPermi="['system:employee_manage:edit']"
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
          v-hasPermi="['system:employee_manage:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:employee_manage:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="employee_manageList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" align="center" prop="id" />
      <el-table-column label="登录账号" align="center" prop="loginAccount" />
      <el-table-column label="登录密码" align="center" prop="loginPassword" />
      <el-table-column label="确认密码" align="center" prop="confirmPassword" />
      <el-table-column label="昵称" align="center" prop="nickname" />
      <el-table-column label="所属机构" align="center" prop="affiliation" />
      <el-table-column label="姓名" align="center" prop="employeeName" />
      <el-table-column label="性别" align="center" prop="employeeSex" />
      <el-table-column label="手机号码" align="center" prop="phoneNumber" />
      <el-table-column label="邮箱" align="center" prop="employeeEmail" />
      <el-table-column label="身份证" align="center" prop="idCard" />
      <el-table-column label="所在部门" align="center" prop="apartment" />
      <el-table-column label="职位" align="center" prop="employeePosts" />
      <el-table-column label="区域级别" align="center" prop="regionallevel" />
      <el-table-column label="所属区域" align="center" prop="region" />
      <el-table-column label="备注信息" align="center" prop="remarksinformation" />
      <el-table-column label="创建时间" align="center" prop="createTime" width="180">
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
            v-hasPermi="['system:employee_manage:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:employee_manage:remove']"
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

    <!-- 添加或修改员工管理对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="登录账号" prop="loginAccount">
          <el-input v-model="form.loginAccount" placeholder="请输入登录账号" />
        </el-form-item>
        <el-form-item label="登录密码" prop="loginPassword">
          <el-input v-model="form.loginPassword" placeholder="请输入登录密码" />
        </el-form-item>
        <el-form-item label="确认密码" prop="confirmPassword">
          <el-input v-model="form.confirmPassword" placeholder="请输入确认密码" />
        </el-form-item>
        <el-form-item label="昵称" prop="nickname">
          <el-input v-model="form.nickname" placeholder="请输入昵称" />
        </el-form-item>
        <el-form-item label="所属机构" prop="affiliation">
          <el-input v-model="form.affiliation" placeholder="请输入所属机构" />
        </el-form-item>
        <el-form-item label="姓名" prop="employeeName">
          <el-input v-model="form.employeeName" placeholder="请输入姓名" />
        </el-form-item>
        <el-form-item label="手机号码" prop="phoneNumber">
          <el-input v-model="form.phoneNumber" placeholder="请输入手机号码" />
        </el-form-item>
        <el-form-item label="邮箱" prop="employeeEmail">
          <el-input v-model="form.employeeEmail" placeholder="请输入邮箱" />
        </el-form-item>
        <el-form-item label="身份证" prop="idCard">
          <el-input v-model="form.idCard" placeholder="请输入身份证" />
        </el-form-item>
        <el-form-item label="所在部门" prop="apartment">
          <el-input v-model="form.apartment" placeholder="请输入所在部门" />
        </el-form-item>
        <el-form-item label="职位" prop="employeePosts">
          <el-input v-model="form.employeePosts" placeholder="请输入职位" />
        </el-form-item>
        <el-form-item label="区域级别" prop="regionallevel">
          <el-input v-model="form.regionallevel" placeholder="请输入区域级别" />
        </el-form-item>
        <el-form-item label="所属区域" prop="region">
          <el-input v-model="form.region" placeholder="请输入所属区域" />
        </el-form-item>
        <el-form-item label="备注信息" prop="remarksinformation">
          <el-input v-model="form.remarksinformation" placeholder="请输入备注信息" />
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
import { listEmployee_manage, getEmployee_manage, delEmployee_manage, addEmployee_manage, updateEmployee_manage } from "@/api/system/employee_manage";

export default {
  name: "Employee_manage",
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
      // 员工管理表格数据
      employee_manageList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        loginAccount: null,
        loginPassword: null,
        confirmPassword: null,
        nickname: null,
        affiliation: null,
        employeeName: null,
        employeeSex: null,
        phoneNumber: null,
        employeeEmail: null,
        idCard: null,
        apartment: null,
        employeePosts: null,
        regionallevel: null,
        region: null,
        remarksinformation: null,
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
    /** 查询员工管理列表 */
    getList() {
      this.loading = true;
      listEmployee_manage(this.queryParams).then(response => {
        this.employee_manageList = response.rows;
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
        loginAccount: null,
        loginPassword: null,
        confirmPassword: null,
        nickname: null,
        affiliation: null,
        employeeName: null,
        employeeSex: null,
        phoneNumber: null,
        employeeEmail: null,
        idCard: null,
        apartment: null,
        employeePosts: null,
        regionallevel: null,
        region: null,
        remarksinformation: null,
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
      this.title = "添加员工管理";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getEmployee_manage(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改员工管理";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateEmployee_manage(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addEmployee_manage(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除员工管理编号为"' + ids + '"的数据项？').then(function() {
        return delEmployee_manage(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/employee_manage/export', {
        ...this.queryParams
      }, `employee_manage_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
