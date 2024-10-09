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
import com.cheng.system.domain.SoilReport;
import com.cheng.system.service.ISoilReportService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 土壤分级报表Controller
 * 
 * @author cheng
 * @date 2024-10-09
 */
@RestController
@RequestMapping("/system/soil_report")
public class SoilReportController extends BaseController
{
    @Autowired
    private ISoilReportService soilReportService;

    /**
     * 查询土壤分级报表列表
     */
    @PreAuthorize("@ss.hasPermi('system:soil_report:list')")
    @GetMapping("/list")
    public TableDataInfo list(SoilReport soilReport)
    {
        startPage();
        List<SoilReport> list = soilReportService.selectSoilReportList(soilReport);
        return getDataTable(list);
    }

    /**
     * 导出土壤分级报表列表
     */
    @PreAuthorize("@ss.hasPermi('system:soil_report:export')")
    @Log(title = "土壤分级报表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SoilReport soilReport)
    {
        List<SoilReport> list = soilReportService.selectSoilReportList(soilReport);
        ExcelUtil<SoilReport> util = new ExcelUtil<SoilReport>(SoilReport.class);
        util.exportExcel(response, list, "土壤分级报表数据");
    }

    /**
     * 获取土壤分级报表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:soil_report:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(soilReportService.selectSoilReportById(id));
    }

    /**
     * 新增土壤分级报表
     */
    @PreAuthorize("@ss.hasPermi('system:soil_report:add')")
    @Log(title = "土壤分级报表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SoilReport soilReport)
    {
        return toAjax(soilReportService.insertSoilReport(soilReport));
    }

    /**
     * 修改土壤分级报表
     */
    @PreAuthorize("@ss.hasPermi('system:soil_report:edit')")
    @Log(title = "土壤分级报表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SoilReport soilReport)
    {
        return toAjax(soilReportService.updateSoilReport(soilReport));
    }

    /**
     * 删除土壤分级报表
     */
    @PreAuthorize("@ss.hasPermi('system:soil_report:remove')")
    @Log(title = "土壤分级报表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(soilReportService.deleteSoilReportByIds(ids));
    }
}
