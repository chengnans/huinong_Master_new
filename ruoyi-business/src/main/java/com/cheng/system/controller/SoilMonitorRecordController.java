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
import com.cheng.system.domain.SoilMonitorRecord;
import com.cheng.system.service.ISoilMonitorRecordService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 土壤检测记录Controller
 * 
 * @author cheng
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/system/soil_monitor_record")
public class SoilMonitorRecordController extends BaseController
{
    @Autowired
    private ISoilMonitorRecordService soilMonitorRecordService;

    /**
     * 查询土壤检测记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:soil_monitor_record:list')")
    @GetMapping("/list")
    public TableDataInfo list(SoilMonitorRecord soilMonitorRecord)
    {
        startPage();
        List<SoilMonitorRecord> list = soilMonitorRecordService.selectSoilMonitorRecordList(soilMonitorRecord);
        return getDataTable(list);
    }

    /**
     * 导出土壤检测记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:soil_monitor_record:export')")
    @Log(title = "土壤检测记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SoilMonitorRecord soilMonitorRecord)
    {
        List<SoilMonitorRecord> list = soilMonitorRecordService.selectSoilMonitorRecordList(soilMonitorRecord);
        ExcelUtil<SoilMonitorRecord> util = new ExcelUtil<SoilMonitorRecord>(SoilMonitorRecord.class);
        util.exportExcel(response, list, "土壤检测记录数据");
    }

    /**
     * 获取土壤检测记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:soil_monitor_record:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(soilMonitorRecordService.selectSoilMonitorRecordById(id));
    }

    /**
     * 新增土壤检测记录
     */
    @PreAuthorize("@ss.hasPermi('system:soil_monitor_record:add')")
    @Log(title = "土壤检测记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SoilMonitorRecord soilMonitorRecord)
    {
        return toAjax(soilMonitorRecordService.insertSoilMonitorRecord(soilMonitorRecord));
    }

    /**
     * 修改土壤检测记录
     */
    @PreAuthorize("@ss.hasPermi('system:soil_monitor_record:edit')")
    @Log(title = "土壤检测记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SoilMonitorRecord soilMonitorRecord)
    {
        return toAjax(soilMonitorRecordService.updateSoilMonitorRecord(soilMonitorRecord));
    }

    /**
     * 删除土壤检测记录
     */
    @PreAuthorize("@ss.hasPermi('system:soil_monitor_record:remove')")
    @Log(title = "土壤检测记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(soilMonitorRecordService.deleteSoilMonitorRecordByIds(ids));
    }
}
