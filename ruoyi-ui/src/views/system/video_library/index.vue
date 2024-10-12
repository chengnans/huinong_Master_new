<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="音视频编号" prop="videoId">
        <el-input
          v-model="queryParams.videoId"
          placeholder="请输入音视频编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="音视频名称" prop="videoName">
        <el-input
          v-model="queryParams.videoName"
          placeholder="请输入音视频名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="音视频地址" prop="videoAddress">
        <el-input
          v-model="queryParams.videoAddress"
          placeholder="请输入音视频地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="音视频大小" prop="videoSize">
        <el-input
          v-model="queryParams.videoSize"
          placeholder="请输入音视频大小"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="音视频长度" prop="videoLength">
        <el-input
          v-model="queryParams.videoLength"
          placeholder="请输入音视频长度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="所属机构" prop="affiliatedOrganization">
        <el-input
          v-model="queryParams.affiliatedOrganization"
          placeholder="请输入所属机构"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="备注" prop="detail">
        <el-input
          v-model="queryParams.detail"
          placeholder="请输入备注"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="当前状态" prop="zhuang">
        <el-input
          v-model="queryParams.zhuang"
          placeholder="请输入当前状态"
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
      <el-form-item label="操作人" prop="operator">
        <el-input
          v-model="queryParams.operator"
          placeholder="请输入操作人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="操作时间" prop="operatingTime">
        <el-date-picker clearable
          v-model="queryParams.operatingTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择操作时间">
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
          v-hasPermi="['system:video_library:add']"
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
          v-hasPermi="['system:video_library:edit']"
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
          v-hasPermi="['system:video_library:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:video_library:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="video_libraryList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" align="center" prop="id" />
      <el-table-column label="音视频编号" align="center" prop="videoId" />
      <el-table-column label="音视频名称" align="center" prop="videoName" />
      <el-table-column label="音视频地址" align="center" prop="videoAddress" />
      <el-table-column label="音视频大小" align="center" prop="videoSize" />
      <el-table-column label="音视频长度" align="center" prop="videoLength" />
      <el-table-column label="所属机构" align="center" prop="affiliatedOrganization" />
      <el-table-column label="备注" align="center" prop="detail" />
      <el-table-column label="当前状态" align="center" prop="zhuang" />
      <el-table-column label="创建时间" align="center" prop="createTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.createTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作人" align="center" prop="operator" />
      <el-table-column label="操作时间" align="center" prop="operatingTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.operatingTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:video_library:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:video_library:remove']"
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

    <!-- 添加或修改音视频库对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="音视频编号" prop="videoId">
          <el-input v-model="form.videoId" placeholder="请输入音视频编号" />
        </el-form-item>
        <el-form-item label="音视频名称" prop="videoName">
          <el-input v-model="form.videoName" placeholder="请输入音视频名称" />
        </el-form-item>
        <el-form-item label="音视频地址" prop="videoAddress">
          <el-input v-model="form.videoAddress" placeholder="请输入音视频地址" />
        </el-form-item>
        <el-form-item label="音视频大小" prop="videoSize">
          <el-input v-model="form.videoSize" placeholder="请输入音视频大小" />
        </el-form-item>
        <el-form-item label="音视频长度" prop="videoLength">
          <el-input v-model="form.videoLength" placeholder="请输入音视频长度" />
        </el-form-item>
        <el-form-item label="所属机构" prop="affiliatedOrganization">
          <el-input v-model="form.affiliatedOrganization" placeholder="请输入所属机构" />
        </el-form-item>
        <el-form-item label="备注" prop="detail">
          <el-input v-model="form.detail" placeholder="请输入备注" />
        </el-form-item>
        <el-form-item label="当前状态" prop="zhuang">
          <el-input v-model="form.zhuang" placeholder="请输入当前状态" />
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
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listVideo_library, getVideo_library, delVideo_library, addVideo_library, updateVideo_library } from "@/api/system/video_library";

export default {
  name: "Video_library",
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
      // 音视频库表格数据
      video_libraryList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        videoId: null,
        videoName: null,
        videoAddress: null,
        videoSize: null,
        videoLength: null,
        affiliatedOrganization: null,
        detail: null,
        zhuang: null,
        createTime: null,
        operator: null,
        operatingTime: null
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
    /** 查询音视频库列表 */
    getList() {
      this.loading = true;
      listVideo_library(this.queryParams).then(response => {
        this.video_libraryList = response.rows;
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
        videoId: null,
        videoName: null,
        videoAddress: null,
        videoSize: null,
        videoLength: null,
        affiliatedOrganization: null,
        detail: null,
        zhuang: null,
        createTime: null,
        operator: null,
        operatingTime: null
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
      this.title = "添加音视频库";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getVideo_library(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改音视频库";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateVideo_library(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addVideo_library(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除音视频库编号为"' + ids + '"的数据项？').then(function() {
        return delVideo_library(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/video_library/export', {
        ...this.queryParams
      }, `video_library_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
