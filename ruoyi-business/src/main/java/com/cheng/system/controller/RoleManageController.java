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
import com.cheng.system.domain.RoleManage;
import com.cheng.system.service.IRoleManageService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 角色管理Controller
 * 
 * @author cheng
 * @date 2024-10-13
 */
@RestController
@RequestMapping("/system/role_manage")
public class RoleManageController extends BaseController
{
    @Autowired
    private IRoleManageService roleManageService;

    /**
     * 查询角色管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:role_manage:list')")
    @GetMapping("/list")
    public TableDataInfo list(RoleManage roleManage)
    {
        startPage();
        List<RoleManage> list = roleManageService.selectRoleManageList(roleManage);
        return getDataTable(list);
    }

    /**
     * 导出角色管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:role_manage:export')")
    @Log(title = "角色管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RoleManage roleManage)
    {
        List<RoleManage> list = roleManageService.selectRoleManageList(roleManage);
        ExcelUtil<RoleManage> util = new ExcelUtil<RoleManage>(RoleManage.class);
        util.exportExcel(response, list, "角色管理数据");
    }

    /**
     * 获取角色管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:role_manage:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(roleManageService.selectRoleManageById(id));
    }

    /**
     * 新增角色管理
     */
    @PreAuthorize("@ss.hasPermi('system:role_manage:add')")
    @Log(title = "角色管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RoleManage roleManage)
    {
        return toAjax(roleManageService.insertRoleManage(roleManage));
    }

    /**
     * 修改角色管理
     */
    @PreAuthorize("@ss.hasPermi('system:role_manage:edit')")
    @Log(title = "角色管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RoleManage roleManage)
    {
        return toAjax(roleManageService.updateRoleManage(roleManage));
    }

    /**
     * 删除角色管理
     */
    @PreAuthorize("@ss.hasPermi('system:role_manage:remove')")
    @Log(title = "角色管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(roleManageService.deleteRoleManageByIds(ids));
    }
}
