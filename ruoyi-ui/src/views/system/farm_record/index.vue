<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="基地" prop="baselandName">
        <el-input
          v-model="queryParams.baselandName"
          placeholder="请输入基地"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="作物名称" prop="gropName">
        <el-input
          v-model="queryParams.gropName"
          placeholder="请输入作物名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="生长周期" prop="growCycle">
        <el-date-picker clearable
          v-model="queryParams.growCycle"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择生长周期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="农事操作" prop="farmOperation">
        <el-input
          v-model="queryParams.farmOperation"
          placeholder="请输入农事操作"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="农事要求" prop="farmRequirement">
        <el-date-picker clearable
          v-model="queryParams.farmRequirement"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择农事要求">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="操作日期" prop="operationTime">
        <el-date-picker clearable
          v-model="queryParams.operationTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择操作日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="实际工时" prop="workingHours">
        <el-input
          v-model="queryParams.workingHours"
          placeholder="请输入实际工时"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="作业图片" prop="photos">
        <el-input
          v-model="queryParams.photos"
          placeholder="请输入作业图片"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="投入品" prop="input">
        <el-input
          v-model="queryParams.input"
          placeholder="请输入投入品"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="投入数量" prop="inputQuantity">
        <el-input
          v-model="queryParams.inputQuantity"
          placeholder="请输入投入数量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="详细操作描述" prop="detail">
        <el-input
          v-model="queryParams.detail"
          placeholder="请输入详细操作描述"
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
          v-hasPermi="['system:farm_record:add']"
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
          v-hasPermi="['system:farm_record:edit']"
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
          v-hasPermi="['system:farm_record:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:farm_record:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="farm_recordList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" align="center" prop="id" />
      <el-table-column label="基地" align="center" prop="baselandName" />
      <el-table-column label="作物名称" align="center" prop="gropName" />
      <el-table-column label="生长周期" align="center" prop="growCycle" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.growCycle, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="农事操作" align="center" prop="farmOperation" />
      <el-table-column label="农事要求" align="center" prop="farmRequirement" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.farmRequirement, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作日期" align="center" prop="operationTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.operationTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="实际工时" align="center" prop="workingHours" />
      <el-table-column label="作业图片" align="center" prop="photos" />
      <el-table-column label="投入品" align="center" prop="input" />
      <el-table-column label="投入数量" align="center" prop="inputQuantity" />
      <el-table-column label="详细操作描述" align="center" prop="detail" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:farm_record:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:farm_record:remove']"
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

    <!-- 添加或修改农事记录对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="基地" prop="baselandName">
          <el-input v-model="form.baselandName" placeholder="请输入基地" />
        </el-form-item>
        <el-form-item label="作物名称" prop="gropName">
          <el-input v-model="form.gropName" placeholder="请输入作物名称" />
        </el-form-item>
        <el-form-item label="生长周期" prop="growCycle">
          <el-date-picker clearable
            v-model="form.growCycle"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择生长周期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="农事操作" prop="farmOperation">
          <el-input v-model="form.farmOperation" placeholder="请输入农事操作" />
        </el-form-item>
        <el-form-item label="农事要求" prop="farmRequirement">
          <el-date-picker clearable
            v-model="form.farmRequirement"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择农事要求">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="操作日期" prop="operationTime">
          <el-date-picker clearable
            v-model="form.operationTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择操作日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="实际工时" prop="workingHours">
          <el-input v-model="form.workingHours" placeholder="请输入实际工时" />
        </el-form-item>
        <el-form-item label="作业图片" prop="photos">
          <el-input v-model="form.photos" placeholder="请输入作业图片" />
        </el-form-item>
        <el-form-item label="投入品" prop="input">
          <el-input v-model="form.input" placeholder="请输入投入品" />
        </el-form-item>
        <el-form-item label="投入数量" prop="inputQuantity">
          <el-input v-model="form.inputQuantity" placeholder="请输入投入数量" />
        </el-form-item>
        <el-form-item label="详细操作描述" prop="detail">
          <el-input v-model="form.detail" placeholder="请输入详细操作描述" />
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
import { listFarm_record, getFarm_record, delFarm_record, addFarm_record, updateFarm_record } from "@/api/system/farm_record";

export default {
  name: "Farm_record",
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
      // 农事记录表格数据
      farm_recordList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        baselandName: null,
        gropName: null,
        growCycle: null,
        farmOperation: null,
        farmRequirement: null,
        operationTime: null,
        workingHours: null,
        photos: null,
        input: null,
        inputQuantity: null,
        detail: null
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
    /** 查询农事记录列表 */
    getList() {
      this.loading = true;
      listFarm_record(this.queryParams).then(response => {
        this.farm_recordList = response.rows;
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
        baselandName: null,
        gropName: null,
        growCycle: null,
        farmOperation: null,
        farmRequirement: null,
        operationTime: null,
        workingHours: null,
        photos: null,
        input: null,
        inputQuantity: null,
        detail: null
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
      this.title = "添加农事记录";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getFarm_record(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改农事记录";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateFarm_record(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addFarm_record(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除农事记录编号为"' + ids + '"的数据项？').then(function() {
        return delFarm_record(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/farm_record/export', {
        ...this.queryParams
      }, `farm_record_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
