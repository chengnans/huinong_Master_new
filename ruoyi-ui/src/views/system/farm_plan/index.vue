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
      <el-form-item label="作物名称" prop="cropName">
        <el-input
          v-model="queryParams.cropName"
          placeholder="请输入作物名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="生长周期" prop="growCycle">
        <el-input
          v-model="queryParams.growCycle"
          placeholder="请输入生长周期"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="农事操作" prop="farmOperation">
        <el-input
          v-model="queryParams.farmOperation"
          placeholder="请输入农事操作"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="农事要求" prop="farmRequire">
        <el-input
          v-model="queryParams.farmRequire"
          placeholder="请输入农事要求"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="农事开始时间" prop="beginTime">
        <el-date-picker clearable
          v-model="queryParams.beginTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择农事开始时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="要求完成时间" prop="endTime">
        <el-date-picker clearable
          v-model="queryParams.endTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择要求完成时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="操作工时" prop="operateTime">
        <el-input
          v-model="queryParams.operateTime"
          placeholder="请输入操作工时"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="参考图片" prop="photos">
        <el-input
          v-model="queryParams.photos"
          placeholder="请输入参考图片"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="参考视频" prop="videos">
        <el-input
          v-model="queryParams.videos"
          placeholder="请输入参考视频"
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
      <el-form-item label="投入量" prop="inputQuantity">
        <el-input
          v-model="queryParams.inputQuantity"
          placeholder="请输入投入量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="农事作业描述" prop="description">
        <el-input
          v-model="queryParams.description"
          placeholder="请输入农事作业描述"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="任务分配给" prop="operator">
        <el-input
          v-model="queryParams.operator"
          placeholder="请输入任务分配给"
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
          v-hasPermi="['system:farm_plan:add']"
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
          v-hasPermi="['system:farm_plan:edit']"
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
          v-hasPermi="['system:farm_plan:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:farm_plan:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="farm_planList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" align="center" prop="id" />
      <el-table-column label="基地" align="center" prop="baselandName" />
      <el-table-column label="作物名称" align="center" prop="cropName" />
      <el-table-column label="生长周期" align="center" prop="growCycle" />
      <el-table-column label="农事操作" align="center" prop="farmOperation" />
      <el-table-column label="农事要求" align="center" prop="farmRequire" />
      <el-table-column label="农事开始时间" align="center" prop="beginTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.beginTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="要求完成时间" align="center" prop="endTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.endTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作工时" align="center" prop="operateTime" />
      <el-table-column label="参考图片" align="center" prop="photos" />
      <el-table-column label="参考视频" align="center" prop="videos" />
      <el-table-column label="投入品" align="center" prop="input" />
      <el-table-column label="投入量" align="center" prop="inputQuantity" />
      <el-table-column label="农事作业描述" align="center" prop="description" />
      <el-table-column label="任务分配给" align="center" prop="operator" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:farm_plan:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:farm_plan:remove']"
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

    <!-- 添加或修改农事计划对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="基地" prop="baselandName">
          <el-input v-model="form.baselandName" placeholder="请输入基地" />
        </el-form-item>
        <el-form-item label="作物名称" prop="cropName">
          <el-input v-model="form.cropName" placeholder="请输入作物名称" />
        </el-form-item>
        <el-form-item label="生长周期" prop="growCycle">
          <el-input v-model="form.growCycle" placeholder="请输入生长周期" />
        </el-form-item>
        <el-form-item label="农事操作" prop="farmOperation">
          <el-input v-model="form.farmOperation" placeholder="请输入农事操作" />
        </el-form-item>
        <el-form-item label="农事要求" prop="farmRequire">
          <el-input v-model="form.farmRequire" placeholder="请输入农事要求" />
        </el-form-item>
        <el-form-item label="农事开始时间" prop="beginTime">
          <el-date-picker clearable
            v-model="form.beginTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择农事开始时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="要求完成时间" prop="endTime">
          <el-date-picker clearable
            v-model="form.endTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择要求完成时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="操作工时" prop="operateTime">
          <el-input v-model="form.operateTime" placeholder="请输入操作工时" />
        </el-form-item>
        <el-form-item label="参考图片" prop="photos">
          <el-input v-model="form.photos" placeholder="请输入参考图片" />
        </el-form-item>
        <el-form-item label="参考视频" prop="videos">
          <el-input v-model="form.videos" placeholder="请输入参考视频" />
        </el-form-item>
        <el-form-item label="投入品" prop="input">
          <el-input v-model="form.input" placeholder="请输入投入品" />
        </el-form-item>
        <el-form-item label="投入量" prop="inputQuantity">
          <el-input v-model="form.inputQuantity" placeholder="请输入投入量" />
        </el-form-item>
        <el-form-item label="农事作业描述" prop="description">
          <el-input v-model="form.description" placeholder="请输入农事作业描述" />
        </el-form-item>
        <el-form-item label="任务分配给" prop="operator">
          <el-input v-model="form.operator" placeholder="请输入任务分配给" />
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
import { listFarm_plan, getFarm_plan, delFarm_plan, addFarm_plan, updateFarm_plan } from "@/api/system/farm_plan";

export default {
  name: "Farm_plan",
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
      // 农事计划表格数据
      farm_planList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        baselandName: null,
        cropName: null,
        growCycle: null,
        farmOperation: null,
        farmRequire: null,
        beginTime: null,
        endTime: null,
        operateTime: null,
        photos: null,
        videos: null,
        input: null,
        inputQuantity: null,
        description: null,
        operator: null
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
    /** 查询农事计划列表 */
    getList() {
      this.loading = true;
      listFarm_plan(this.queryParams).then(response => {
        this.farm_planList = response.rows;
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
        cropName: null,
        growCycle: null,
        farmOperation: null,
        farmRequire: null,
        beginTime: null,
        endTime: null,
        operateTime: null,
        photos: null,
        videos: null,
        input: null,
        inputQuantity: null,
        description: null,
        operator: null
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
      this.title = "添加农事计划";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getFarm_plan(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改农事计划";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateFarm_plan(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addFarm_plan(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除农事计划编号为"' + ids + '"的数据项？').then(function() {
        return delFarm_plan(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/farm_plan/export', {
        ...this.queryParams
      }, `farm_plan_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
