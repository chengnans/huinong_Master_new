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
import com.cheng.system.domain.DepartmentManage;
import com.cheng.system.service.IDepartmentManageService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 部门管理Controller
 * 
 * @author cheng
 * @date 2024-10-13
 */
@RestController
@RequestMapping("/system/department_manage")
public class DepartmentManageController extends BaseController
{
    @Autowired
    private IDepartmentManageService departmentManageService;

    /**
     * 查询部门管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:department_manage:list')")
    @GetMapping("/list")
    public TableDataInfo list(DepartmentManage departmentManage)
    {
        startPage();
        List<DepartmentManage> list = departmentManageService.selectDepartmentManageList(departmentManage);
        return getDataTable(list);
    }

    /**
     * 导出部门管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:department_manage:export')")
    @Log(title = "部门管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DepartmentManage departmentManage)
    {
        List<DepartmentManage> list = departmentManageService.selectDepartmentManageList(departmentManage);
        ExcelUtil<DepartmentManage> util = new ExcelUtil<DepartmentManage>(DepartmentManage.class);
        util.exportExcel(response, list, "部门管理数据");
    }

    /**
     * 获取部门管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:department_manage:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(departmentManageService.selectDepartmentManageById(id));
    }

    /**
     * 新增部门管理
     */
    @PreAuthorize("@ss.hasPermi('system:department_manage:add')")
    @Log(title = "部门管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DepartmentManage departmentManage)
    {
        return toAjax(departmentManageService.insertDepartmentManage(departmentManage));
    }

    /**
     * 修改部门管理
     */
    @PreAuthorize("@ss.hasPermi('system:department_manage:edit')")
    @Log(title = "部门管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DepartmentManage departmentManage)
    {
        return toAjax(departmentManageService.updateDepartmentManage(departmentManage));
    }

    /**
     * 删除部门管理
     */
    @PreAuthorize("@ss.hasPermi('system:department_manage:remove')")
    @Log(title = "部门管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(departmentManageService.deleteDepartmentManageByIds(ids));
    }
}
