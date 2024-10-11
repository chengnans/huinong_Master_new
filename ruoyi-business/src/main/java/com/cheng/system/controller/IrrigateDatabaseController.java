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
import com.cheng.system.domain.IrrigateDatabase;
import com.cheng.system.service.IIrrigateDatabaseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 灌区数据库Controller
 * 
 * @author cheng
 * @date 2024-10-11
 */
@RestController
@RequestMapping("/system/irrigate_database")
public class IrrigateDatabaseController extends BaseController
{
    @Autowired
    private IIrrigateDatabaseService irrigateDatabaseService;

    /**
     * 查询灌区数据库列表
     */
    @PreAuthorize("@ss.hasPermi('system:irrigate_database:list')")
    @GetMapping("/list")
    public TableDataInfo list(IrrigateDatabase irrigateDatabase)
    {
        startPage();
        List<IrrigateDatabase> list = irrigateDatabaseService.selectIrrigateDatabaseList(irrigateDatabase);
        return getDataTable(list);
    }

    /**
     * 导出灌区数据库列表
     */
    @PreAuthorize("@ss.hasPermi('system:irrigate_database:export')")
    @Log(title = "灌区数据库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, IrrigateDatabase irrigateDatabase)
    {
        List<IrrigateDatabase> list = irrigateDatabaseService.selectIrrigateDatabaseList(irrigateDatabase);
        ExcelUtil<IrrigateDatabase> util = new ExcelUtil<IrrigateDatabase>(IrrigateDatabase.class);
        util.exportExcel(response, list, "灌区数据库数据");
    }

    /**
     * 获取灌区数据库详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:irrigate_database:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(irrigateDatabaseService.selectIrrigateDatabaseById(id));
    }

    /**
     * 新增灌区数据库
     */
    @PreAuthorize("@ss.hasPermi('system:irrigate_database:add')")
    @Log(title = "灌区数据库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody IrrigateDatabase irrigateDatabase)
    {
        return toAjax(irrigateDatabaseService.insertIrrigateDatabase(irrigateDatabase));
    }

    /**
     * 修改灌区数据库
     */
    @PreAuthorize("@ss.hasPermi('system:irrigate_database:edit')")
    @Log(title = "灌区数据库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody IrrigateDatabase irrigateDatabase)
    {
        return toAjax(irrigateDatabaseService.updateIrrigateDatabase(irrigateDatabase));
    }

    /**
     * 删除灌区数据库
     */
    @PreAuthorize("@ss.hasPermi('system:irrigate_database:remove')")
    @Log(title = "灌区数据库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(irrigateDatabaseService.deleteIrrigateDatabaseByIds(ids));
    }
}
