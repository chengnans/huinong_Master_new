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
import com.cheng.system.domain.LargeScreenSet;
import com.cheng.system.service.ILargeScreenSetService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 大屏基础设置Controller
 * 
 * @author cheng
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/system/large_screen_set")
public class LargeScreenSetController extends BaseController
{
    @Autowired
    private ILargeScreenSetService largeScreenSetService;

    /**
     * 查询大屏基础设置列表
     */
    @PreAuthorize("@ss.hasPermi('system:large_screen_set:list')")
    @GetMapping("/list")
    public TableDataInfo list(LargeScreenSet largeScreenSet)
    {
        startPage();
        List<LargeScreenSet> list = largeScreenSetService.selectLargeScreenSetList(largeScreenSet);
        return getDataTable(list);
    }

    /**
     * 导出大屏基础设置列表
     */
    @PreAuthorize("@ss.hasPermi('system:large_screen_set:export')")
    @Log(title = "大屏基础设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LargeScreenSet largeScreenSet)
    {
        List<LargeScreenSet> list = largeScreenSetService.selectLargeScreenSetList(largeScreenSet);
        ExcelUtil<LargeScreenSet> util = new ExcelUtil<LargeScreenSet>(LargeScreenSet.class);
        util.exportExcel(response, list, "大屏基础设置数据");
    }

    /**
     * 获取大屏基础设置详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:large_screen_set:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(largeScreenSetService.selectLargeScreenSetById(id));
    }

    /**
     * 新增大屏基础设置
     */
    @PreAuthorize("@ss.hasPermi('system:large_screen_set:add')")
    @Log(title = "大屏基础设置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LargeScreenSet largeScreenSet)
    {
        return toAjax(largeScreenSetService.insertLargeScreenSet(largeScreenSet));
    }

    /**
     * 修改大屏基础设置
     */
    @PreAuthorize("@ss.hasPermi('system:large_screen_set:edit')")
    @Log(title = "大屏基础设置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LargeScreenSet largeScreenSet)
    {
        return toAjax(largeScreenSetService.updateLargeScreenSet(largeScreenSet));
    }

    /**
     * 删除大屏基础设置
     */
    @PreAuthorize("@ss.hasPermi('system:large_screen_set:remove')")
    @Log(title = "大屏基础设置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(largeScreenSetService.deleteLargeScreenSetByIds(ids));
    }
}
