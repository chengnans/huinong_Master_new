<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="地块名称" prop="soilName">
        <el-input
          v-model="queryParams.soilName"
          placeholder="请输入地块名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="作物名称" prop="cropName">
        <el-input
          v-model="queryParams.cropName"
          placeholder="请输入作物名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="土壤等级" prop="soilLevel">
        <el-input
          v-model="queryParams.soilLevel"
          placeholder="请输入土壤等级"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="面积" prop="area">
        <el-input
          v-model="queryParams.area"
          placeholder="请输入面积"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="所属基地" prop="soilBaseland">
        <el-input
          v-model="queryParams.soilBaseland"
          placeholder="请输入所属基地"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="统计日期" prop="soilDate">
        <el-date-picker clearable
          v-model="queryParams.soilDate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择统计日期">
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
          v-hasPermi="['system:soil_report:add']"
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
          v-hasPermi="['system:soil_report:edit']"
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
          v-hasPermi="['system:soil_report:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:soil_report:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="soil_reportList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" align="center" prop="id" />
      <el-table-column label="地块名称" align="center" prop="soilName" />
      <el-table-column label="作物名称" align="center" prop="cropName" />
      <el-table-column label="土壤等级" align="center" prop="soilLevel" />
      <el-table-column label="面积" align="center" prop="area" />
      <el-table-column label="所属基地" align="center" prop="soilBaseland" />
      <el-table-column label="统计日期" align="center" prop="soilDate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.soilDate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:soil_report:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:soil_report:remove']"
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

    <!-- 添加或修改土壤分级报表对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="地块名称" prop="soilName">
          <el-input v-model="form.soilName" placeholder="请输入地块名称" />
        </el-form-item>
        <el-form-item label="作物名称" prop="cropName">
          <el-input v-model="form.cropName" placeholder="请输入作物名称" />
        </el-form-item>
        <el-form-item label="土壤等级" prop="soilLevel">
          <el-input v-model="form.soilLevel" placeholder="请输入土壤等级" />
        </el-form-item>
        <el-form-item label="面积" prop="area">
          <el-input v-model="form.area" placeholder="请输入面积" />
        </el-form-item>
        <el-form-item label="所属基地" prop="soilBaseland">
          <el-input v-model="form.soilBaseland" placeholder="请输入所属基地" />
        </el-form-item>
        <el-form-item label="统计日期" prop="soilDate">
          <el-date-picker clearable
            v-model="form.soilDate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择统计日期">
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
import { listSoil_report, getSoil_report, delSoil_report, addSoil_report, updateSoil_report } from "@/api/system/soil_report";

export default {
  name: "Soil_report",
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
      // 土壤分级报表表格数据
      soil_reportList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        soilName: null,
        cropName: null,
        soilLevel: null,
        area: null,
        soilBaseland: null,
        soilDate: null
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
    /** 查询土壤分级报表列表 */
    getList() {
      this.loading = true;
      listSoil_report(this.queryParams).then(response => {
        this.soil_reportList = response.rows;
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
        soilName: null,
        cropName: null,
        soilLevel: null,
        area: null,
        soilBaseland: null,
        soilDate: null
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
      this.title = "添加土壤分级报表";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getSoil_report(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改土壤分级报表";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateSoil_report(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addSoil_report(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除土壤分级报表编号为"' + ids + '"的数据项？').then(function() {
        return delSoil_report(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/soil_report/export', {
        ...this.queryParams
      }, `soil_report_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
