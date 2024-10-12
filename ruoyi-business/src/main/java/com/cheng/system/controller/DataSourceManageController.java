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
import com.cheng.system.domain.DataSourceManage;
import com.cheng.system.service.IDataSourceManageService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 数据源管理Controller
 * 
 * @author cheng
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/system/data_source_manage")
public class DataSourceManageController extends BaseController
{
    @Autowired
    private IDataSourceManageService dataSourceManageService;

    /**
     * 查询数据源管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:data_source_manage:list')")
    @GetMapping("/list")
    public TableDataInfo list(DataSourceManage dataSourceManage)
    {
        startPage();
        List<DataSourceManage> list = dataSourceManageService.selectDataSourceManageList(dataSourceManage);
        return getDataTable(list);
    }

    /**
     * 导出数据源管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:data_source_manage:export')")
    @Log(title = "数据源管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataSourceManage dataSourceManage)
    {
        List<DataSourceManage> list = dataSourceManageService.selectDataSourceManageList(dataSourceManage);
        ExcelUtil<DataSourceManage> util = new ExcelUtil<DataSourceManage>(DataSourceManage.class);
        util.exportExcel(response, list, "数据源管理数据");
    }

    /**
     * 获取数据源管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:data_source_manage:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(dataSourceManageService.selectDataSourceManageById(id));
    }

    /**
     * 新增数据源管理
     */
    @PreAuthorize("@ss.hasPermi('system:data_source_manage:add')")
    @Log(title = "数据源管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataSourceManage dataSourceManage)
    {
        return toAjax(dataSourceManageService.insertDataSourceManage(dataSourceManage));
    }

    /**
     * 修改数据源管理
     */
    @PreAuthorize("@ss.hasPermi('system:data_source_manage:edit')")
    @Log(title = "数据源管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataSourceManage dataSourceManage)
    {
        return toAjax(dataSourceManageService.updateDataSourceManage(dataSourceManage));
    }

    /**
     * 删除数据源管理
     */
    @PreAuthorize("@ss.hasPermi('system:data_source_manage:remove')")
    @Log(title = "数据源管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dataSourceManageService.deleteDataSourceManageByIds(ids));
    }
}
