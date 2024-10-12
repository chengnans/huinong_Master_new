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
import com.cheng.system.domain.ToolbarSet;
import com.cheng.system.service.IToolbarSetService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工具栏配置Controller
 * 
 * @author cheng
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/system/toolbar_set")
public class ToolbarSetController extends BaseController
{
    @Autowired
    private IToolbarSetService toolbarSetService;

    /**
     * 查询工具栏配置列表
     */
    @PreAuthorize("@ss.hasPermi('system:toolbar_set:list')")
    @GetMapping("/list")
    public TableDataInfo list(ToolbarSet toolbarSet)
    {
        startPage();
        List<ToolbarSet> list = toolbarSetService.selectToolbarSetList(toolbarSet);
        return getDataTable(list);
    }

    /**
     * 导出工具栏配置列表
     */
    @PreAuthorize("@ss.hasPermi('system:toolbar_set:export')")
    @Log(title = "工具栏配置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ToolbarSet toolbarSet)
    {
        List<ToolbarSet> list = toolbarSetService.selectToolbarSetList(toolbarSet);
        ExcelUtil<ToolbarSet> util = new ExcelUtil<ToolbarSet>(ToolbarSet.class);
        util.exportExcel(response, list, "工具栏配置数据");
    }

    /**
     * 获取工具栏配置详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:toolbar_set:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(toolbarSetService.selectToolbarSetById(id));
    }

    /**
     * 新增工具栏配置
     */
    @PreAuthorize("@ss.hasPermi('system:toolbar_set:add')")
    @Log(title = "工具栏配置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ToolbarSet toolbarSet)
    {
        return toAjax(toolbarSetService.insertToolbarSet(toolbarSet));
    }

    /**
     * 修改工具栏配置
     */
    @PreAuthorize("@ss.hasPermi('system:toolbar_set:edit')")
    @Log(title = "工具栏配置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ToolbarSet toolbarSet)
    {
        return toAjax(toolbarSetService.updateToolbarSet(toolbarSet));
    }

    /**
     * 删除工具栏配置
     */
    @PreAuthorize("@ss.hasPermi('system:toolbar_set:remove')")
    @Log(title = "工具栏配置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(toolbarSetService.deleteToolbarSetByIds(ids));
    }
}
