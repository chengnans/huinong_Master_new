<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="报告编号" prop="reportId">
        <el-input
          v-model="queryParams.reportId"
          placeholder="请输入报告编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="样品编号" prop="sampleId">
        <el-input
          v-model="queryParams.sampleId"
          placeholder="请输入样品编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="采样日期" prop="samplingDate">
        <el-date-picker clearable
          v-model="queryParams.samplingDate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择采样日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="采样地址" prop="samplingAddress">
        <el-input
          v-model="queryParams.samplingAddress"
          placeholder="请输入采样地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="分析日期" prop="analysisDate">
        <el-date-picker clearable
          v-model="queryParams.analysisDate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择分析日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="行政村" prop="village">
        <el-input
          v-model="queryParams.village"
          placeholder="请输入行政村"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="基地" prop="baseland">
        <el-input
          v-model="queryParams.baseland"
          placeholder="请输入基地"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="地块" prop="plot">
        <el-input
          v-model="queryParams.plot"
          placeholder="请输入地块"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="酸碱度得分" prop="pH">
        <el-input
          v-model="queryParams.pH"
          placeholder="请输入酸碱度得分"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="重金属得分" prop="heavyMetal">
        <el-input
          v-model="queryParams.heavyMetal"
          placeholder="请输入重金属得分"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="农药污染得分" prop="pesticidePollution">
        <el-input
          v-model="queryParams.pesticidePollution"
          placeholder="请输入农药污染得分"
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
          v-hasPermi="['system:soil_monitor_record:add']"
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
          v-hasPermi="['system:soil_monitor_record:edit']"
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
          v-hasPermi="['system:soil_monitor_record:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:soil_monitor_record:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="soil_monitor_recordList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" align="center" prop="id" />
      <el-table-column label="报告编号" align="center" prop="reportId" />
      <el-table-column label="样品编号" align="center" prop="sampleId" />
      <el-table-column label="采样日期" align="center" prop="samplingDate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.samplingDate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="采样地址" align="center" prop="samplingAddress" />
      <el-table-column label="分析日期" align="center" prop="analysisDate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.analysisDate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="行政村" align="center" prop="village" />
      <el-table-column label="基地" align="center" prop="baseland" />
      <el-table-column label="地块" align="center" prop="plot" />
      <el-table-column label="酸碱度得分" align="center" prop="pH" />
      <el-table-column label="重金属得分" align="center" prop="heavyMetal" />
      <el-table-column label="农药污染得分" align="center" prop="pesticidePollution" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:soil_monitor_record:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:soil_monitor_record:remove']"
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

    <!-- 添加或修改土壤检测记录对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="报告编号" prop="reportId">
          <el-input v-model="form.reportId" placeholder="请输入报告编号" />
        </el-form-item>
        <el-form-item label="样品编号" prop="sampleId">
          <el-input v-model="form.sampleId" placeholder="请输入样品编号" />
        </el-form-item>
        <el-form-item label="采样日期" prop="samplingDate">
          <el-date-picker clearable
            v-model="form.samplingDate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择采样日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="采样地址" prop="samplingAddress">
          <el-input v-model="form.samplingAddress" placeholder="请输入采样地址" />
        </el-form-item>
        <el-form-item label="分析日期" prop="analysisDate">
          <el-date-picker clearable
            v-model="form.analysisDate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择分析日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="行政村" prop="village">
          <el-input v-model="form.village" placeholder="请输入行政村" />
        </el-form-item>
        <el-form-item label="基地" prop="baseland">
          <el-input v-model="form.baseland" placeholder="请输入基地" />
        </el-form-item>
        <el-form-item label="地块" prop="plot">
          <el-input v-model="form.plot" placeholder="请输入地块" />
        </el-form-item>
        <el-form-item label="酸碱度得分" prop="pH">
          <el-input v-model="form.pH" placeholder="请输入酸碱度得分" />
        </el-form-item>
        <el-form-item label="重金属得分" prop="heavyMetal">
          <el-input v-model="form.heavyMetal" placeholder="请输入重金属得分" />
        </el-form-item>
        <el-form-item label="农药污染得分" prop="pesticidePollution">
          <el-input v-model="form.pesticidePollution" placeholder="请输入农药污染得分" />
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
import { listSoil_monitor_record, getSoil_monitor_record, delSoil_monitor_record, addSoil_monitor_record, updateSoil_monitor_record } from "@/api/system/soil_monitor_record";

export default {
  name: "Soil_monitor_record",
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
      // 土壤检测记录表格数据
      soil_monitor_recordList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        reportId: null,
        sampleId: null,
        samplingDate: null,
        samplingAddress: null,
        analysisDate: null,
        village: null,
        baseland: null,
        plot: null,
        pH: null,
        heavyMetal: null,
        pesticidePollution: null
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
    /** 查询土壤检测记录列表 */
    getList() {
      this.loading = true;
      listSoil_monitor_record(this.queryParams).then(response => {
        this.soil_monitor_recordList = response.rows;
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
        reportId: null,
        sampleId: null,
        samplingDate: null,
        samplingAddress: null,
        analysisDate: null,
        village: null,
        baseland: null,
        plot: null,
        pH: null,
        heavyMetal: null,
        pesticidePollution: null
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
      this.title = "添加土壤检测记录";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getSoil_monitor_record(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改土壤检测记录";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateSoil_monitor_record(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addSoil_monitor_record(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除土壤检测记录编号为"' + ids + '"的数据项？').then(function() {
        return delSoil_monitor_record(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/soil_monitor_record/export', {
        ...this.queryParams
      }, `soil_monitor_record_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
