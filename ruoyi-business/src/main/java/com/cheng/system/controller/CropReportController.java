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
import com.cheng.system.domain.CropReport;
import com.cheng.system.service.ICropReportService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 农作物监测报表Controller
 * 
 * @author cheng
 * @date 2024-10-09
 */
@RestController
@RequestMapping("/system/crop_report")
public class CropReportController extends BaseController
{
    @Autowired
    private ICropReportService cropReportService;

    /**
     * 查询农作物监测报表列表
     */
    @PreAuthorize("@ss.hasPermi('system:crop_report:list')")
    @GetMapping("/list")
    public TableDataInfo list(CropReport cropReport)
    {
        startPage();
        List<CropReport> list = cropReportService.selectCropReportList(cropReport);
        return getDataTable(list);
    }

    /**
     * 导出农作物监测报表列表
     */
    @PreAuthorize("@ss.hasPermi('system:crop_report:export')")
    @Log(title = "农作物监测报表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CropReport cropReport)
    {
        List<CropReport> list = cropReportService.selectCropReportList(cropReport);
        ExcelUtil<CropReport> util = new ExcelUtil<CropReport>(CropReport.class);
        util.exportExcel(response, list, "农作物监测报表数据");
    }

    /**
     * 获取农作物监测报表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:crop_report:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(cropReportService.selectCropReportById(id));
    }

    /**
     * 新增农作物监测报表
     */
    @PreAuthorize("@ss.hasPermi('system:crop_report:add')")
    @Log(title = "农作物监测报表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CropReport cropReport)
    {
        return toAjax(cropReportService.insertCropReport(cropReport));
    }

    /**
     * 修改农作物监测报表
     */
    @PreAuthorize("@ss.hasPermi('system:crop_report:edit')")
    @Log(title = "农作物监测报表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CropReport cropReport)
    {
        return toAjax(cropReportService.updateCropReport(cropReport));
    }

    /**
     * 删除农作物监测报表
     */
    @PreAuthorize("@ss.hasPermi('system:crop_report:remove')")
    @Log(title = "农作物监测报表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(cropReportService.deleteCropReportByIds(ids));
    }
}
