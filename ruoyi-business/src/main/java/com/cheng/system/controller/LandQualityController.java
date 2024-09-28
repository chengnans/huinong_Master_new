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
import com.cheng.system.domain.LandQuality;
import com.cheng.system.service.ILandQualityService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 耕地质量Controller
 * 
 * @author cheng
 * @date 2024-09-16
 */
@RestController
@RequestMapping("/system/landQuality")
public class LandQualityController extends BaseController
{
    @Autowired
    private ILandQualityService landQualityService;

    /**
     * 查询耕地质量列表
     */
    @PreAuthorize("@ss.hasPermi('system:landQuality:list')")
    @GetMapping("/list")
    public TableDataInfo list(LandQuality landQuality)
    {
        startPage();
        List<LandQuality> list = landQualityService.selectLandQualityList(landQuality);
        return getDataTable(list);
    }

    /**
     * 导出耕地质量列表
     */
    @PreAuthorize("@ss.hasPermi('system:landQuality:export')")
    @Log(title = "耕地质量", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LandQuality landQuality)
    {
        List<LandQuality> list = landQualityService.selectLandQualityList(landQuality);
        ExcelUtil<LandQuality> util = new ExcelUtil<LandQuality>(LandQuality.class);
        util.exportExcel(response, list, "耕地质量数据");
    }

    /**
     * 获取耕地质量详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:landQuality:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(landQualityService.selectLandQualityById(id));
    }

    /**
     * 新增耕地质量
     */
    @PreAuthorize("@ss.hasPermi('system:landQuality:add')")
    @Log(title = "耕地质量", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LandQuality landQuality)
    {
        return toAjax(landQualityService.insertLandQuality(landQuality));
    }

    /**
     * 修改耕地质量
     */
    @PreAuthorize("@ss.hasPermi('system:landQuality:edit')")
    @Log(title = "耕地质量", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LandQuality landQuality)
    {
        return toAjax(landQualityService.updateLandQuality(landQuality));
    }

    /**
     * 删除耕地质量
     */
    @PreAuthorize("@ss.hasPermi('system:landQuality:remove')")
    @Log(title = "耕地质量", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(landQualityService.deleteLandQualityByIds(ids));
    }
}
