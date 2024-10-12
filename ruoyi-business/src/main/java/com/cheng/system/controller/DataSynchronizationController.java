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
import com.cheng.system.domain.DataSynchronization;
import com.cheng.system.service.IDataSynchronizationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 数据同步任务Controller
 * 
 * @author cheng
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/system/data_synchronization")
public class DataSynchronizationController extends BaseController
{
    @Autowired
    private IDataSynchronizationService dataSynchronizationService;

    /**
     * 查询数据同步任务列表
     */
    @PreAuthorize("@ss.hasPermi('system:data_synchronization:list')")
    @GetMapping("/list")
    public TableDataInfo list(DataSynchronization dataSynchronization)
    {
        startPage();
        List<DataSynchronization> list = dataSynchronizationService.selectDataSynchronizationList(dataSynchronization);
        return getDataTable(list);
    }

    /**
     * 导出数据同步任务列表
     */
    @PreAuthorize("@ss.hasPermi('system:data_synchronization:export')")
    @Log(title = "数据同步任务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataSynchronization dataSynchronization)
    {
        List<DataSynchronization> list = dataSynchronizationService.selectDataSynchronizationList(dataSynchronization);
        ExcelUtil<DataSynchronization> util = new ExcelUtil<DataSynchronization>(DataSynchronization.class);
        util.exportExcel(response, list, "数据同步任务数据");
    }

    /**
     * 获取数据同步任务详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:data_synchronization:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(dataSynchronizationService.selectDataSynchronizationById(id));
    }

    /**
     * 新增数据同步任务
     */
    @PreAuthorize("@ss.hasPermi('system:data_synchronization:add')")
    @Log(title = "数据同步任务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataSynchronization dataSynchronization)
    {
        return toAjax(dataSynchronizationService.insertDataSynchronization(dataSynchronization));
    }

    /**
     * 修改数据同步任务
     */
    @PreAuthorize("@ss.hasPermi('system:data_synchronization:edit')")
    @Log(title = "数据同步任务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataSynchronization dataSynchronization)
    {
        return toAjax(dataSynchronizationService.updateDataSynchronization(dataSynchronization));
    }

    /**
     * 删除数据同步任务
     */
    @PreAuthorize("@ss.hasPermi('system:data_synchronization:remove')")
    @Log(title = "数据同步任务", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dataSynchronizationService.deleteDataSynchronizationByIds(ids));
    }
}
