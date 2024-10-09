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
import com.cheng.system.domain.FarmClassify;
import com.cheng.system.service.IFarmClassifyService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 农事分类Controller
 * 
 * @author cheng
 * @date 2024-10-09
 */
@RestController
@RequestMapping("/system/farm_classify")
public class FarmClassifyController extends BaseController
{
    @Autowired
    private IFarmClassifyService farmClassifyService;

    /**
     * 查询农事分类列表
     */
    @PreAuthorize("@ss.hasPermi('system:farm_classify:list')")
    @GetMapping("/list")
    public TableDataInfo list(FarmClassify farmClassify)
    {
        startPage();
        List<FarmClassify> list = farmClassifyService.selectFarmClassifyList(farmClassify);
        return getDataTable(list);
    }

    /**
     * 导出农事分类列表
     */
    @PreAuthorize("@ss.hasPermi('system:farm_classify:export')")
    @Log(title = "农事分类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FarmClassify farmClassify)
    {
        List<FarmClassify> list = farmClassifyService.selectFarmClassifyList(farmClassify);
        ExcelUtil<FarmClassify> util = new ExcelUtil<FarmClassify>(FarmClassify.class);
        util.exportExcel(response, list, "农事分类数据");
    }

    /**
     * 获取农事分类详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:farm_classify:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(farmClassifyService.selectFarmClassifyById(id));
    }

    /**
     * 新增农事分类
     */
    @PreAuthorize("@ss.hasPermi('system:farm_classify:add')")
    @Log(title = "农事分类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FarmClassify farmClassify)
    {
        return toAjax(farmClassifyService.insertFarmClassify(farmClassify));
    }

    /**
     * 修改农事分类
     */
    @PreAuthorize("@ss.hasPermi('system:farm_classify:edit')")
    @Log(title = "农事分类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FarmClassify farmClassify)
    {
        return toAjax(farmClassifyService.updateFarmClassify(farmClassify));
    }

    /**
     * 删除农事分类
     */
    @PreAuthorize("@ss.hasPermi('system:farm_classify:remove')")
    @Log(title = "农事分类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(farmClassifyService.deleteFarmClassifyByIds(ids));
    }
}
