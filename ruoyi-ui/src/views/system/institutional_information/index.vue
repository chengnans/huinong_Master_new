<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="机构名称" prop="institutionName">
        <el-input
          v-model="queryParams.institutionName"
          placeholder="请输入机构名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="机构简介" prop="insitutionAbbreviation">
        <el-input
          v-model="queryParams.insitutionAbbreviation"
          placeholder="请输入机构简介"
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
      <el-form-item label="联系电话" prop="contactNumber">
        <el-input
          v-model="queryParams.contactNumber"
          placeholder="请输入联系电话"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="机构规模" prop="institutionScale">
        <el-input
          v-model="queryParams.institutionScale"
          placeholder="请输入机构规模"
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
      <el-form-item label="详细地址" prop="fullAddress">
        <el-input
          v-model="queryParams.fullAddress"
          placeholder="请输入详细地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="经度" prop="longitude">
        <el-input
          v-model="queryParams.longitude"
          placeholder="请输入经度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="维度" prop="dimension">
        <el-input
          v-model="queryParams.dimension"
          placeholder="请输入维度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="备注信息" prop="remarksinFormation">
        <el-input
          v-model="queryParams.remarksinFormation"
          placeholder="请输入备注信息"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="营业执照号" prop="businessLicenseNumber">
        <el-input
          v-model="queryParams.businessLicenseNumber"
          placeholder="请输入营业执照号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="经营许可证编号" prop="licenseNumber">
        <el-input
          v-model="queryParams.licenseNumber"
          placeholder="请输入经营许可证编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商标名称" prop="tradeName">
        <el-input
          v-model="queryParams.tradeName"
          placeholder="请输入商标名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="创建时间" prop="creationTime">
        <el-date-picker clearable
          v-model="queryParams.creationTime"
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
          v-hasPermi="['system:institutional_information:add']"
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
          v-hasPermi="['system:institutional_information:edit']"
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
          v-hasPermi="['system:institutional_information:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:institutional_information:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="institutional_informationList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" align="center" prop="id" />
      <el-table-column label="机构名称" align="center" prop="institutionName" />
      <el-table-column label="机构简介" align="center" prop="insitutionAbbreviation" />
      <el-table-column label="联系人" align="center" prop="contact" />
      <el-table-column label="联系电话" align="center" prop="contactNumber" />
      <el-table-column label="机构类型" align="center" prop="institutionType" />
      <el-table-column label="机构规模" align="center" prop="institutionScale" />
      <el-table-column label="所属区域" align="center" prop="region" />
      <el-table-column label="详细地址" align="center" prop="fullAddress" />
      <el-table-column label="经度" align="center" prop="longitude" />
      <el-table-column label="维度" align="center" prop="dimension" />
      <el-table-column label="备注信息" align="center" prop="remarksinFormation" />
      <el-table-column label="营业执照号" align="center" prop="businessLicenseNumber" />
      <el-table-column label="经营许可证编号" align="center" prop="licenseNumber" />
      <el-table-column label="商标名称" align="center" prop="tradeName" />
      <el-table-column label="创建时间" align="center" prop="creationTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.creationTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:institutional_information:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:institutional_information:remove']"
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

    <!-- 添加或修改机构信息对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="机构名称" prop="institutionName">
          <el-input v-model="form.institutionName" placeholder="请输入机构名称" />
        </el-form-item>
        <el-form-item label="机构简介" prop="insitutionAbbreviation">
          <el-input v-model="form.insitutionAbbreviation" placeholder="请输入机构简介" />
        </el-form-item>
        <el-form-item label="联系人" prop="contact">
          <el-input v-model="form.contact" placeholder="请输入联系人" />
        </el-form-item>
        <el-form-item label="联系电话" prop="contactNumber">
          <el-input v-model="form.contactNumber" placeholder="请输入联系电话" />
        </el-form-item>
        <el-form-item label="机构规模" prop="institutionScale">
          <el-input v-model="form.institutionScale" placeholder="请输入机构规模" />
        </el-form-item>
        <el-form-item label="所属区域" prop="region">
          <el-input v-model="form.region" placeholder="请输入所属区域" />
        </el-form-item>
        <el-form-item label="详细地址" prop="fullAddress">
          <el-input v-model="form.fullAddress" placeholder="请输入详细地址" />
        </el-form-item>
        <el-form-item label="经度" prop="longitude">
          <el-input v-model="form.longitude" placeholder="请输入经度" />
        </el-form-item>
        <el-form-item label="维度" prop="dimension">
          <el-input v-model="form.dimension" placeholder="请输入维度" />
        </el-form-item>
        <el-form-item label="备注信息" prop="remarksinFormation">
          <el-input v-model="form.remarksinFormation" placeholder="请输入备注信息" />
        </el-form-item>
        <el-form-item label="营业执照号" prop="businessLicenseNumber">
          <el-input v-model="form.businessLicenseNumber" placeholder="请输入营业执照号" />
        </el-form-item>
        <el-form-item label="经营许可证编号" prop="licenseNumber">
          <el-input v-model="form.licenseNumber" placeholder="请输入经营许可证编号" />
        </el-form-item>
        <el-form-item label="商标名称" prop="tradeName">
          <el-input v-model="form.tradeName" placeholder="请输入商标名称" />
        </el-form-item>
        <el-form-item label="创建时间" prop="creationTime">
          <el-date-picker clearable
            v-model="form.creationTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择创建时间">
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
import { listInstitutional_information, getInstitutional_information, delInstitutional_information, addInstitutional_information, updateInstitutional_information } from "@/api/system/institutional_information";

export default {
  name: "Institutional_information",
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
      // 机构信息表格数据
      institutional_informationList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        institutionName: null,
        insitutionAbbreviation: null,
        contact: null,
        contactNumber: null,
        institutionType: null,
        institutionScale: null,
        region: null,
        fullAddress: null,
        longitude: null,
        dimension: null,
        remarksinFormation: null,
        businessLicenseNumber: null,
        licenseNumber: null,
        tradeName: null,
        creationTime: null
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
    /** 查询机构信息列表 */
    getList() {
      this.loading = true;
      listInstitutional_information(this.queryParams).then(response => {
        this.institutional_informationList = response.rows;
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
        institutionName: null,
        insitutionAbbreviation: null,
        contact: null,
        contactNumber: null,
        institutionType: null,
        institutionScale: null,
        region: null,
        fullAddress: null,
        longitude: null,
        dimension: null,
        remarksinFormation: null,
        businessLicenseNumber: null,
        licenseNumber: null,
        tradeName: null,
        creationTime: null
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
      this.title = "添加机构信息";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getInstitutional_information(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改机构信息";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateInstitutional_information(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addInstitutional_information(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除机构信息编号为"' + ids + '"的数据项？').then(function() {
        return delInstitutional_information(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/institutional_information/export', {
        ...this.queryParams
      }, `institutional_information_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
