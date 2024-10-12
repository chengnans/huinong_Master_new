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
import com.cheng.system.domain.FacilityList;
import com.cheng.system.service.IFacilityListService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设施列表Controller
 * 
 * @author cheng
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/system/facility_list")
public class FacilityListController extends BaseController
{
    @Autowired
    private IFacilityListService facilityListService;

    /**
     * 查询设施列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:facility_list:list')")
    @GetMapping("/list")
    public TableDataInfo list(FacilityList facilityList)
    {
        startPage();
        List<FacilityList> list = facilityListService.selectFacilityListList(facilityList);
        return getDataTable(list);
    }

    /**
     * 导出设施列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:facility_list:export')")
    @Log(title = "设施列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FacilityList facilityList)
    {
        List<FacilityList> list = facilityListService.selectFacilityListList(facilityList);
        ExcelUtil<FacilityList> util = new ExcelUtil<FacilityList>(FacilityList.class);
        util.exportExcel(response, list, "设施列表数据");
    }

    /**
     * 获取设施列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:facility_list:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(facilityListService.selectFacilityListById(id));
    }

    /**
     * 新增设施列表
     */
    @PreAuthorize("@ss.hasPermi('system:facility_list:add')")
    @Log(title = "设施列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FacilityList facilityList)
    {
        return toAjax(facilityListService.insertFacilityList(facilityList));
    }

    /**
     * 修改设施列表
     */
    @PreAuthorize("@ss.hasPermi('system:facility_list:edit')")
    @Log(title = "设施列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FacilityList facilityList)
    {
        return toAjax(facilityListService.updateFacilityList(facilityList));
    }

    /**
     * 删除设施列表
     */
    @PreAuthorize("@ss.hasPermi('system:facility_list:remove')")
    @Log(title = "设施列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(facilityListService.deleteFacilityListByIds(ids));
    }
}
