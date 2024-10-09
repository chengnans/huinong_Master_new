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
import com.cheng.system.domain.OverviewStatistics;
import com.cheng.system.service.IOverviewStatisticsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 概览统计Controller
 * 
 * @author cheng
 * @date 2024-10-09
 */
@RestController
@RequestMapping("/system/overview_statistics")
public class OverviewStatisticsController extends BaseController
{
    @Autowired
    private IOverviewStatisticsService overviewStatisticsService;

    /**
     * 查询概览统计列表
     */
    @PreAuthorize("@ss.hasPermi('system:overview_statistics:list')")
    @GetMapping("/list")
    public TableDataInfo list(OverviewStatistics overviewStatistics)
    {
        startPage();
        List<OverviewStatistics> list = overviewStatisticsService.selectOverviewStatisticsList(overviewStatistics);
        return getDataTable(list);
    }

    /**
     * 导出概览统计列表
     */
    @PreAuthorize("@ss.hasPermi('system:overview_statistics:export')")
    @Log(title = "概览统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OverviewStatistics overviewStatistics)
    {
        List<OverviewStatistics> list = overviewStatisticsService.selectOverviewStatisticsList(overviewStatistics);
        ExcelUtil<OverviewStatistics> util = new ExcelUtil<OverviewStatistics>(OverviewStatistics.class);
        util.exportExcel(response, list, "概览统计数据");
    }

    /**
     * 获取概览统计详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:overview_statistics:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(overviewStatisticsService.selectOverviewStatisticsById(id));
    }

    /**
     * 新增概览统计
     */
    @PreAuthorize("@ss.hasPermi('system:overview_statistics:add')")
    @Log(title = "概览统计", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OverviewStatistics overviewStatistics)
    {
        return toAjax(overviewStatisticsService.insertOverviewStatistics(overviewStatistics));
    }

    /**
     * 修改概览统计
     */
    @PreAuthorize("@ss.hasPermi('system:overview_statistics:edit')")
    @Log(title = "概览统计", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OverviewStatistics overviewStatistics)
    {
        return toAjax(overviewStatisticsService.updateOverviewStatistics(overviewStatistics));
    }

    /**
     * 删除概览统计
     */
    @PreAuthorize("@ss.hasPermi('system:overview_statistics:remove')")
    @Log(title = "概览统计", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(overviewStatisticsService.deleteOverviewStatisticsByIds(ids));
    }
}
