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
import com.cheng.system.domain.GeneralMenuSet;
import com.cheng.system.service.IGeneralMenuSetService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 通用菜单配置Controller
 * 
 * @author cheng
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/system/general_menu_set")
public class GeneralMenuSetController extends BaseController
{
    @Autowired
    private IGeneralMenuSetService generalMenuSetService;

    /**
     * 查询通用菜单配置列表
     */
    @PreAuthorize("@ss.hasPermi('system:general_menu_set:list')")
    @GetMapping("/list")
    public TableDataInfo list(GeneralMenuSet generalMenuSet)
    {
        startPage();
        List<GeneralMenuSet> list = generalMenuSetService.selectGeneralMenuSetList(generalMenuSet);
        return getDataTable(list);
    }

    /**
     * 导出通用菜单配置列表
     */
    @PreAuthorize("@ss.hasPermi('system:general_menu_set:export')")
    @Log(title = "通用菜单配置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, GeneralMenuSet generalMenuSet)
    {
        List<GeneralMenuSet> list = generalMenuSetService.selectGeneralMenuSetList(generalMenuSet);
        ExcelUtil<GeneralMenuSet> util = new ExcelUtil<GeneralMenuSet>(GeneralMenuSet.class);
        util.exportExcel(response, list, "通用菜单配置数据");
    }

    /**
     * 获取通用菜单配置详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:general_menu_set:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(generalMenuSetService.selectGeneralMenuSetById(id));
    }

    /**
     * 新增通用菜单配置
     */
    @PreAuthorize("@ss.hasPermi('system:general_menu_set:add')")
    @Log(title = "通用菜单配置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody GeneralMenuSet generalMenuSet)
    {
        return toAjax(generalMenuSetService.insertGeneralMenuSet(generalMenuSet));
    }

    /**
     * 修改通用菜单配置
     */
    @PreAuthorize("@ss.hasPermi('system:general_menu_set:edit')")
    @Log(title = "通用菜单配置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody GeneralMenuSet generalMenuSet)
    {
        return toAjax(generalMenuSetService.updateGeneralMenuSet(generalMenuSet));
    }

    /**
     * 删除通用菜单配置
     */
    @PreAuthorize("@ss.hasPermi('system:general_menu_set:remove')")
    @Log(title = "通用菜单配置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(generalMenuSetService.deleteGeneralMenuSetByIds(ids));
    }
}
