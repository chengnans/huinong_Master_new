package com.cheng.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.cheng.system.domain.ModelDatabase;
import com.cheng.system.service.IModelDatabaseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 模型数据库Controller
 * 
 * @author cheng
 * @date 2024-10-09
 */
@RestController
@RequestMapping("/system/model_database")
public class ModelDatabaseController extends BaseController
{
    @Autowired
    private IModelDatabaseService modelDatabaseService;

    /**
     * 查询模型数据库列表
     */
    @PreAuthorize("@ss.hasPermi('system:model_database:list')")
    @GetMapping("/list")
    public TableDataInfo list(ModelDatabase modelDatabase)
    {
        startPage();
        List<ModelDatabase> list = modelDatabaseService.selectModelDatabaseList(modelDatabase);
        return getDataTable(list);
    }

    /**
     * 导出模型数据库列表
     */
    @PreAuthorize("@ss.hasPermi('system:model_database:export')")
    @Log(title = "模型数据库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ModelDatabase modelDatabase)
    {
        List<ModelDatabase> list = modelDatabaseService.selectModelDatabaseList(modelDatabase);
        ExcelUtil<ModelDatabase> util = new ExcelUtil<ModelDatabase>(ModelDatabase.class);
        util.exportExcel(response, list, "模型数据库数据");
    }

    /**
     * 获取模型数据库详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:model_database:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(modelDatabaseService.selectModelDatabaseById(id));
    }

    /**
     * 新增模型数据库
     */
    @PreAuthorize("@ss.hasPermi('system:model_database:add')")
    @Log(title = "模型数据库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ModelDatabase modelDatabase)
    {
        return toAjax(modelDatabaseService.insertModelDatabase(modelDatabase));
    }

    /**
     * 修改模型数据库
     */
    @PreAuthorize("@ss.hasPermi('system:model_database:edit')")
    @Log(title = "模型数据库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ModelDatabase modelDatabase)
    {
        return toAjax(modelDatabaseService.updateModelDatabase(modelDatabase));
    }

    /**
     * 删除模型数据库
     */
    @PreAuthorize("@ss.hasPermi('system:model_database:remove')")
    @Log(title = "模型数据库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(modelDatabaseService.deleteModelDatabaseByIds(ids));
    }
}
