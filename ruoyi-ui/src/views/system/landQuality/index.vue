<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="基地名称" prop="name">
        <el-input
          v-model="queryParams.name"
          placeholder="请输入基地名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="评定结果" prop="result">
        <el-input
          v-model="queryParams.result"
          placeholder="请输入评定结果"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="评定时间" prop="rateTime">
        <el-date-picker clearable
          v-model="queryParams.rateTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择评定时间">
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
          v-hasPermi="['system:landQuality:add']"
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
          v-hasPermi="['system:landQuality:edit']"
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
          v-hasPermi="['system:landQuality:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:landQuality:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="landQualityList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" align="center" prop="id" />
      <el-table-column label="基地名称" align="center" prop="name" />
      <el-table-column label="划分区域" align="center" prop="area" />
      <el-table-column label="评定结果" align="center" prop="result" />
      <el-table-column label="评定时间" align="center" prop="rateTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.rateTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="评定单位" align="center" prop="rateUnit" />
      <el-table-column label="操作人" align="center" prop="operator" />
      <el-table-column label="操作时间" align="center" prop="operatingTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.operatingTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="地形部位" align="center" prop="landPosition" />
      <el-table-column label="有效土层厚度" align="center" prop="soilThickness" />
      <el-table-column label="耕层质地" align="center" prop="texture" />
      <el-table-column label="土壤容重" align="center" prop="soilWeight" />
      <el-table-column label="质地构型" align="center" prop="soilStructure" />
      <el-table-column label="土壤养分状况" align="center" prop="nutrientStatus" />
      <el-table-column label="生物多样性" align="center" prop="biodiversity" />
      <el-table-column label="清洁程度" align="center" prop="cleanliness" />
      <el-table-column label="阻碍因素" align="center" prop="hinder" />
      <el-table-column label="灌溉能力" align="center" prop="irrigation" />
      <el-table-column label="排水能力" align="center" prop="drainWater" />
      <el-table-column label="农田林网化程度" align="center" prop="forestNetwork" />
      <el-table-column label="酸碱度" align="center" prop="pH" />
      <el-table-column label="耕层厚度" align="center" prop="surfaceThickness" />
      <el-table-column label="盐渍化程度" align="center" prop="salinization" />
      <el-table-column label="地下水埋深" align="center" prop="groundwaterDepth" />
      <el-table-column label="田面坡度" align="center" prop="slope" />
      <el-table-column label="海拔高度" align="center" prop="height" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:landQuality:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:landQuality:remove']"
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

    <!-- 添加或修改耕地质量对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="基地名称" prop="name">
          <el-input v-model="form.name" placeholder="请输入基地名称" />
        </el-form-item>
        <el-form-item label="划分区域" prop="area">
          <el-input v-model="form.area" placeholder="请输入划分区域" />
        </el-form-item>
        <el-form-item label="评定结果" prop="result">
          <el-input v-model="form.result" placeholder="请输入评定结果" />
        </el-form-item>
        <el-form-item label="评定时间" prop="rateTime">
          <el-date-picker clearable
            v-model="form.rateTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择评定时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="评定单位" prop="rateUnit">
          <el-input v-model="form.rateUnit" placeholder="请输入评定单位" />
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
        <el-form-item label="地形部位" prop="landPosition">
          <el-input v-model="form.landPosition" placeholder="请输入地形部位" />
        </el-form-item>
        <el-form-item label="有效土层厚度" prop="soilThickness">
          <el-input v-model="form.soilThickness" placeholder="请输入有效土层厚度" />
        </el-form-item>
        <el-form-item label="耕层质地" prop="texture">
          <el-input v-model="form.texture" placeholder="请输入耕层质地" />
        </el-form-item>
        <el-form-item label="土壤容重" prop="soilWeight">
          <el-input v-model="form.soilWeight" placeholder="请输入土壤容重" />
        </el-form-item>
        <el-form-item label="质地构型" prop="soilStructure">
          <el-input v-model="form.soilStructure" placeholder="请输入质地构型" />
        </el-form-item>
        <el-form-item label="生物多样性" prop="biodiversity">
          <el-input v-model="form.biodiversity" placeholder="请输入生物多样性" />
        </el-form-item>
        <el-form-item label="清洁程度" prop="cleanliness">
          <el-input v-model="form.cleanliness" placeholder="请输入清洁程度" />
        </el-form-item>
        <el-form-item label="阻碍因素" prop="hinder">
          <el-input v-model="form.hinder" placeholder="请输入阻碍因素" />
        </el-form-item>
        <el-form-item label="灌溉能力" prop="irrigation">
          <el-input v-model="form.irrigation" placeholder="请输入灌溉能力" />
        </el-form-item>
        <el-form-item label="排水能力" prop="drainWater">
          <el-input v-model="form.drainWater" placeholder="请输入排水能力" />
        </el-form-item>
        <el-form-item label="农田林网化程度" prop="forestNetwork">
          <el-input v-model="form.forestNetwork" placeholder="请输入农田林网化程度" />
        </el-form-item>
        <el-form-item label="酸碱度" prop="pH">
          <el-input v-model="form.pH" placeholder="请输入酸碱度" />
        </el-form-item>
        <el-form-item label="耕层厚度" prop="surfaceThickness">
          <el-input v-model="form.surfaceThickness" placeholder="请输入耕层厚度" />
        </el-form-item>
        <el-form-item label="盐渍化程度" prop="salinization">
          <el-input v-model="form.salinization" placeholder="请输入盐渍化程度" />
        </el-form-item>
        <el-form-item label="地下水埋深" prop="groundwaterDepth">
          <el-input v-model="form.groundwaterDepth" placeholder="请输入地下水埋深" />
        </el-form-item>
        <el-form-item label="田面坡度" prop="slope">
          <el-input v-model="form.slope" placeholder="请输入田面坡度" />
        </el-form-item>
        <el-form-item label="海拔高度" prop="height">
          <el-input v-model="form.height" placeholder="请输入海拔高度" />
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
import { listLandQuality, getLandQuality, delLandQuality, addLandQuality, updateLandQuality } from "@/api/system/landQuality";

export default {
  name: "LandQuality",
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
      // 耕地质量表格数据
      landQualityList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        name: null,
        area: null,
        result: null,
        rateTime: null,
        rateUnit: null,
        operator: null,
        operatingTime: null,
        landPosition: null,
        soilThickness: null,
        texture: null,
        soilWeight: null,
        soilStructure: null,
        nutrientStatus: null,
        biodiversity: null,
        cleanliness: null,
        hinder: null,
        irrigation: null,
        drainWater: null,
        forestNetwork: null,
        pH: null,
        surfaceThickness: null,
        salinization: null,
        groundwaterDepth: null,
        slope: null,
        height: null
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
    /** 查询耕地质量列表 */
    getList() {
      this.loading = true;
      listLandQuality(this.queryParams).then(response => {
        this.landQualityList = response.rows;
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
        name: null,
        area: null,
        result: null,
        rateTime: null,
        rateUnit: null,
        operator: null,
        operatingTime: null,
        landPosition: null,
        soilThickness: null,
        texture: null,
        soilWeight: null,
        soilStructure: null,
        nutrientStatus: null,
        biodiversity: null,
        cleanliness: null,
        hinder: null,
        irrigation: null,
        drainWater: null,
        forestNetwork: null,
        pH: null,
        surfaceThickness: null,
        salinization: null,
        groundwaterDepth: null,
        slope: null,
        height: null
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
      this.title = "添加耕地质量";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getLandQuality(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改耕地质量";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateLandQuality(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addLandQuality(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除耕地质量编号为"' + ids + '"的数据项？').then(function() {
        return delLandQuality(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/landQuality/export', {
        ...this.queryParams
      }, `landQuality_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
