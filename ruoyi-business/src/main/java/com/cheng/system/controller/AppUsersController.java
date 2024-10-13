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
import com.cheng.system.domain.AppUsers;
import com.cheng.system.service.IAppUsersService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * APP用户Controller
 * 
 * @author cheng
 * @date 2024-10-13
 */
@RestController
@RequestMapping("/system/app_users")
public class AppUsersController extends BaseController
{
    @Autowired
    private IAppUsersService appUsersService;

    /**
     * 查询APP用户列表
     */
    @PreAuthorize("@ss.hasPermi('system:app_users:list')")
    @GetMapping("/list")
    public TableDataInfo list(AppUsers appUsers)
    {
        startPage();
        List<AppUsers> list = appUsersService.selectAppUsersList(appUsers);
        return getDataTable(list);
    }

    /**
     * 导出APP用户列表
     */
    @PreAuthorize("@ss.hasPermi('system:app_users:export')")
    @Log(title = "APP用户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AppUsers appUsers)
    {
        List<AppUsers> list = appUsersService.selectAppUsersList(appUsers);
        ExcelUtil<AppUsers> util = new ExcelUtil<AppUsers>(AppUsers.class);
        util.exportExcel(response, list, "APP用户数据");
    }

    /**
     * 获取APP用户详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:app_users:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(appUsersService.selectAppUsersById(id));
    }

    /**
     * 新增APP用户
     */
    @PreAuthorize("@ss.hasPermi('system:app_users:add')")
    @Log(title = "APP用户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AppUsers appUsers)
    {
        return toAjax(appUsersService.insertAppUsers(appUsers));
    }

    /**
     * 修改APP用户
     */
    @PreAuthorize("@ss.hasPermi('system:app_users:edit')")
    @Log(title = "APP用户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AppUsers appUsers)
    {
        return toAjax(appUsersService.updateAppUsers(appUsers));
    }

    /**
     * 删除APP用户
     */
    @PreAuthorize("@ss.hasPermi('system:app_users:remove')")
    @Log(title = "APP用户", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(appUsersService.deleteAppUsersByIds(ids));
    }
}
