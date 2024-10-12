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
import com.cheng.system.domain.LargeScreenMenu;
import com.cheng.system.service.ILargeScreenMenuService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 大屏菜单管理Controller
 * 
 * @author cheng
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/system/large_screen_menu")
public class LargeScreenMenuController extends BaseController
{
    @Autowired
    private ILargeScreenMenuService largeScreenMenuService;

    /**
     * 查询大屏菜单管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:large_screen_menu:list')")
    @GetMapping("/list")
    public TableDataInfo list(LargeScreenMenu largeScreenMenu)
    {
        startPage();
        List<LargeScreenMenu> list = largeScreenMenuService.selectLargeScreenMenuList(largeScreenMenu);
        return getDataTable(list);
    }

    /**
     * 导出大屏菜单管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:large_screen_menu:export')")
    @Log(title = "大屏菜单管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LargeScreenMenu largeScreenMenu)
    {
        List<LargeScreenMenu> list = largeScreenMenuService.selectLargeScreenMenuList(largeScreenMenu);
        ExcelUtil<LargeScreenMenu> util = new ExcelUtil<LargeScreenMenu>(LargeScreenMenu.class);
        util.exportExcel(response, list, "大屏菜单管理数据");
    }

    /**
     * 获取大屏菜单管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:large_screen_menu:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(largeScreenMenuService.selectLargeScreenMenuById(id));
    }

    /**
     * 新增大屏菜单管理
     */
    @PreAuthorize("@ss.hasPermi('system:large_screen_menu:add')")
    @Log(title = "大屏菜单管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LargeScreenMenu largeScreenMenu)
    {
        return toAjax(largeScreenMenuService.insertLargeScreenMenu(largeScreenMenu));
    }

    /**
     * 修改大屏菜单管理
     */
    @PreAuthorize("@ss.hasPermi('system:large_screen_menu:edit')")
    @Log(title = "大屏菜单管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LargeScreenMenu largeScreenMenu)
    {
        return toAjax(largeScreenMenuService.updateLargeScreenMenu(largeScreenMenu));
    }

    /**
     * 删除大屏菜单管理
     */
    @PreAuthorize("@ss.hasPermi('system:large_screen_menu:remove')")
    @Log(title = "大屏菜单管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(largeScreenMenuService.deleteLargeScreenMenuByIds(ids));
    }
}
