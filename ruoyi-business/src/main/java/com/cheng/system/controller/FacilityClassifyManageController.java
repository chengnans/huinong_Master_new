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
import com.cheng.system.domain.FacilityClassifyManage;
import com.cheng.system.service.IFacilityClassifyManageService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设施分类管理Controller
 * 
 * @author cheng
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/system/facility_classify_manage")
public class FacilityClassifyManageController extends BaseController
{
    @Autowired
    private IFacilityClassifyManageService facilityClassifyManageService;

    /**
     * 查询设施分类管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:facility_classify_manage:list')")
    @GetMapping("/list")
    public TableDataInfo list(FacilityClassifyManage facilityClassifyManage)
    {
        startPage();
        List<FacilityClassifyManage> list = facilityClassifyManageService.selectFacilityClassifyManageList(facilityClassifyManage);
        return getDataTable(list);
    }

    /**
     * 导出设施分类管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:facility_classify_manage:export')")
    @Log(title = "设施分类管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FacilityClassifyManage facilityClassifyManage)
    {
        List<FacilityClassifyManage> list = facilityClassifyManageService.selectFacilityClassifyManageList(facilityClassifyManage);
        ExcelUtil<FacilityClassifyManage> util = new ExcelUtil<FacilityClassifyManage>(FacilityClassifyManage.class);
        util.exportExcel(response, list, "设施分类管理数据");
    }

    /**
     * 获取设施分类管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:facility_classify_manage:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(facilityClassifyManageService.selectFacilityClassifyManageById(id));
    }

    /**
     * 新增设施分类管理
     */
    @PreAuthorize("@ss.hasPermi('system:facility_classify_manage:add')")
    @Log(title = "设施分类管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FacilityClassifyManage facilityClassifyManage)
    {
        return toAjax(facilityClassifyManageService.insertFacilityClassifyManage(facilityClassifyManage));
    }

    /**
     * 修改设施分类管理
     */
    @PreAuthorize("@ss.hasPermi('system:facility_classify_manage:edit')")
    @Log(title = "设施分类管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FacilityClassifyManage facilityClassifyManage)
    {
        return toAjax(facilityClassifyManageService.updateFacilityClassifyManage(facilityClassifyManage));
    }

    /**
     * 删除设施分类管理
     */
    @PreAuthorize("@ss.hasPermi('system:facility_classify_manage:remove')")
    @Log(title = "设施分类管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(facilityClassifyManageService.deleteFacilityClassifyManageByIds(ids));
    }
}
