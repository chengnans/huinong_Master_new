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
import com.cheng.system.domain.AppRoleManage;
import com.cheng.system.service.IAppRoleManageService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * APP角色管理Controller
 * 
 * @author cheng
 * @date 2024-10-13
 */
@RestController
@RequestMapping("/system/app_role_manage")
public class AppRoleManageController extends BaseController
{
    @Autowired
    private IAppRoleManageService appRoleManageService;

    /**
     * 查询APP角色管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:app_role_manage:list')")
    @GetMapping("/list")
    public TableDataInfo list(AppRoleManage appRoleManage)
    {
        startPage();
        List<AppRoleManage> list = appRoleManageService.selectAppRoleManageList(appRoleManage);
        return getDataTable(list);
    }

    /**
     * 导出APP角色管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:app_role_manage:export')")
    @Log(title = "APP角色管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AppRoleManage appRoleManage)
    {
        List<AppRoleManage> list = appRoleManageService.selectAppRoleManageList(appRoleManage);
        ExcelUtil<AppRoleManage> util = new ExcelUtil<AppRoleManage>(AppRoleManage.class);
        util.exportExcel(response, list, "APP角色管理数据");
    }

    /**
     * 获取APP角色管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:app_role_manage:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(appRoleManageService.selectAppRoleManageById(id));
    }

    /**
     * 新增APP角色管理
     */
    @PreAuthorize("@ss.hasPermi('system:app_role_manage:add')")
    @Log(title = "APP角色管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AppRoleManage appRoleManage)
    {
        return toAjax(appRoleManageService.insertAppRoleManage(appRoleManage));
    }

    /**
     * 修改APP角色管理
     */
    @PreAuthorize("@ss.hasPermi('system:app_role_manage:edit')")
    @Log(title = "APP角色管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AppRoleManage appRoleManage)
    {
        return toAjax(appRoleManageService.updateAppRoleManage(appRoleManage));
    }

    /**
     * 删除APP角色管理
     */
    @PreAuthorize("@ss.hasPermi('system:app_role_manage:remove')")
    @Log(title = "APP角色管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(appRoleManageService.deleteAppRoleManageByIds(ids));
    }
}
