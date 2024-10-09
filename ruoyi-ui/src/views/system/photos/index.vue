<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="图像名称" prop="imageName">
        <el-input
          v-model="queryParams.imageName"
          placeholder="请输入图像名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="图像地址" prop="imageAddress">
        <el-input
          v-model="queryParams.imageAddress"
          placeholder="请输入图像地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="覆盖区域" prop="area">
        <el-input
          v-model="queryParams.area"
          placeholder="请输入覆盖区域"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="设备名称" prop="deviceName">
        <el-input
          v-model="queryParams.deviceName"
          placeholder="请输入设备名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="是否失效" prop="effect">
        <el-input
          v-model="queryParams.effect"
          placeholder="请输入是否失效"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="关联基地" prop="baseland">
        <el-input
          v-model="queryParams.baseland"
          placeholder="请输入关联基地"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="图像来源" prop="resource">
        <el-input
          v-model="queryParams.resource"
          placeholder="请输入图像来源"
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
          v-hasPermi="['system:photos:add']"
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
          v-hasPermi="['system:photos:edit']"
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
          v-hasPermi="['system:photos:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:photos:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="photosList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" align="center" prop="id" />
      <el-table-column label="图像类型" align="center" prop="imageType" />
      <el-table-column label="图像名称" align="center" prop="imageName" />
      <el-table-column label="图像地址" align="center" prop="imageAddress" />
      <el-table-column label="覆盖区域" align="center" prop="area" />
      <el-table-column label="设备名称" align="center" prop="deviceName" />
      <el-table-column label="是否失效" align="center" prop="effect" />
      <el-table-column label="关联基地" align="center" prop="baseland" />
      <el-table-column label="图像来源" align="center" prop="resource" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:photos:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:photos:remove']"
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

    <!-- 添加或修改遥感图片对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="图像名称" prop="imageName">
          <el-input v-model="form.imageName" placeholder="请输入图像名称" />
        </el-form-item>
        <el-form-item label="图像地址" prop="imageAddress">
          <el-input v-model="form.imageAddress" placeholder="请输入图像地址" />
        </el-form-item>
        <el-form-item label="覆盖区域" prop="area">
          <el-input v-model="form.area" placeholder="请输入覆盖区域" />
        </el-form-item>
        <el-form-item label="设备名称" prop="deviceName">
          <el-input v-model="form.deviceName" placeholder="请输入设备名称" />
        </el-form-item>
        <el-form-item label="是否失效" prop="effect">
          <el-input v-model="form.effect" placeholder="请输入是否失效" />
        </el-form-item>
        <el-form-item label="关联基地" prop="baseland">
          <el-input v-model="form.baseland" placeholder="请输入关联基地" />
        </el-form-item>
        <el-form-item label="图像来源" prop="resource">
          <el-input v-model="form.resource" placeholder="请输入图像来源" />
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
import { listPhotos, getPhotos, delPhotos, addPhotos, updatePhotos } from "@/api/system/photos";

export default {
  name: "Photos",
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
      // 遥感图片表格数据
      photosList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        imageType: null,
        imageName: null,
        imageAddress: null,
        area: null,
        deviceName: null,
        effect: null,
        baseland: null,
        resource: null
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
    /** 查询遥感图片列表 */
    getList() {
      this.loading = true;
      listPhotos(this.queryParams).then(response => {
        this.photosList = response.rows;
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
        imageType: null,
        imageName: null,
        imageAddress: null,
        area: null,
        deviceName: null,
        effect: null,
        baseland: null,
        createTime: null,
        resource: null
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
      this.title = "添加遥感图片";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getPhotos(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改遥感图片";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updatePhotos(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addPhotos(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除遥感图片编号为"' + ids + '"的数据项？').then(function() {
        return delPhotos(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/photos/export', {
        ...this.queryParams
      }, `photos_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
