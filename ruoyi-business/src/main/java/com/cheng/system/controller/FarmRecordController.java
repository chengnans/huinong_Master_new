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
import com.cheng.system.domain.FarmRecord;
import com.cheng.system.service.IFarmRecordService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 农事记录Controller
 * 
 * @author cheng
 * @date 2024-10-09
 */
@RestController
@RequestMapping("/system/farm_record")
public class FarmRecordController extends BaseController
{
    @Autowired
    private IFarmRecordService farmRecordService;

    /**
     * 查询农事记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:farm_record:list')")
    @GetMapping("/list")
    public TableDataInfo list(FarmRecord farmRecord)
    {
        startPage();
        List<FarmRecord> list = farmRecordService.selectFarmRecordList(farmRecord);
        return getDataTable(list);
    }

    /**
     * 导出农事记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:farm_record:export')")
    @Log(title = "农事记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FarmRecord farmRecord)
    {
        List<FarmRecord> list = farmRecordService.selectFarmRecordList(farmRecord);
        ExcelUtil<FarmRecord> util = new ExcelUtil<FarmRecord>(FarmRecord.class);
        util.exportExcel(response, list, "农事记录数据");
    }

    /**
     * 获取农事记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:farm_record:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(farmRecordService.selectFarmRecordById(id));
    }

    /**
     * 新增农事记录
     */
    @PreAuthorize("@ss.hasPermi('system:farm_record:add')")
    @Log(title = "农事记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FarmRecord farmRecord)
    {
        return toAjax(farmRecordService.insertFarmRecord(farmRecord));
    }

    /**
     * 修改农事记录
     */
    @PreAuthorize("@ss.hasPermi('system:farm_record:edit')")
    @Log(title = "农事记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FarmRecord farmRecord)
    {
        return toAjax(farmRecordService.updateFarmRecord(farmRecord));
    }

    /**
     * 删除农事记录
     */
    @PreAuthorize("@ss.hasPermi('system:farm_record:remove')")
    @Log(title = "农事记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(farmRecordService.deleteFarmRecordByIds(ids));
    }
}
