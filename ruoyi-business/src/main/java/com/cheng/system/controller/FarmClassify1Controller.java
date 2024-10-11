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
import com.cheng.system.domain.FarmClassify1;
import com.cheng.system.service.IFarmClassify1Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 农事分类设置Controller
 * 
 * @author cheng
 * @date 2024-10-11
 */
@RestController
@RequestMapping("/system/farm_classify1")
public class FarmClassify1Controller extends BaseController
{
    @Autowired
    private IFarmClassify1Service farmClassify1Service;

    /**
     * 查询农事分类设置列表
     */
    @PreAuthorize("@ss.hasPermi('system:farm_classify1:list')")
    @GetMapping("/list")
    public TableDataInfo list(FarmClassify1 farmClassify1)
    {
        startPage();
        List<FarmClassify1> list = farmClassify1Service.selectFarmClassify1List(farmClassify1);
        return getDataTable(list);
    }

    /**
     * 导出农事分类设置列表
     */
    @PreAuthorize("@ss.hasPermi('system:farm_classify1:export')")
    @Log(title = "农事分类设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FarmClassify1 farmClassify1)
    {
        List<FarmClassify1> list = farmClassify1Service.selectFarmClassify1List(farmClassify1);
        ExcelUtil<FarmClassify1> util = new ExcelUtil<FarmClassify1>(FarmClassify1.class);
        util.exportExcel(response, list, "农事分类设置数据");
    }

    /**
     * 获取农事分类设置详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:farm_classify1:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(farmClassify1Service.selectFarmClassify1ById(id));
    }

    /**
     * 新增农事分类设置
     */
    @PreAuthorize("@ss.hasPermi('system:farm_classify1:add')")
    @Log(title = "农事分类设置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FarmClassify1 farmClassify1)
    {
        return toAjax(farmClassify1Service.insertFarmClassify1(farmClassify1));
    }

    /**
     * 修改农事分类设置
     */
    @PreAuthorize("@ss.hasPermi('system:farm_classify1:edit')")
    @Log(title = "农事分类设置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FarmClassify1 farmClassify1)
    {
        return toAjax(farmClassify1Service.updateFarmClassify1(farmClassify1));
    }

    /**
     * 删除农事分类设置
     */
    @PreAuthorize("@ss.hasPermi('system:farm_classify1:remove')")
    @Log(title = "农事分类设置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(farmClassify1Service.deleteFarmClassify1ByIds(ids));
    }
}
