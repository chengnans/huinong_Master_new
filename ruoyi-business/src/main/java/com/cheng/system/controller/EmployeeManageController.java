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
import com.cheng.system.domain.EmployeeManage;
import com.cheng.system.service.IEmployeeManageService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 员工管理Controller
 * 
 * @author cheng
 * @date 2024-10-13
 */
@RestController
@RequestMapping("/system/employee_manage")
public class EmployeeManageController extends BaseController
{
    @Autowired
    private IEmployeeManageService employeeManageService;

    /**
     * 查询员工管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:employee_manage:list')")
    @GetMapping("/list")
    public TableDataInfo list(EmployeeManage employeeManage)
    {
        startPage();
        List<EmployeeManage> list = employeeManageService.selectEmployeeManageList(employeeManage);
        return getDataTable(list);
    }

    /**
     * 导出员工管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:employee_manage:export')")
    @Log(title = "员工管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EmployeeManage employeeManage)
    {
        List<EmployeeManage> list = employeeManageService.selectEmployeeManageList(employeeManage);
        ExcelUtil<EmployeeManage> util = new ExcelUtil<EmployeeManage>(EmployeeManage.class);
        util.exportExcel(response, list, "员工管理数据");
    }

    /**
     * 获取员工管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:employee_manage:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(employeeManageService.selectEmployeeManageById(id));
    }

    /**
     * 新增员工管理
     */
    @PreAuthorize("@ss.hasPermi('system:employee_manage:add')")
    @Log(title = "员工管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EmployeeManage employeeManage)
    {
        return toAjax(employeeManageService.insertEmployeeManage(employeeManage));
    }

    /**
     * 修改员工管理
     */
    @PreAuthorize("@ss.hasPermi('system:employee_manage:edit')")
    @Log(title = "员工管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EmployeeManage employeeManage)
    {
        return toAjax(employeeManageService.updateEmployeeManage(employeeManage));
    }

    /**
     * 删除员工管理
     */
    @PreAuthorize("@ss.hasPermi('system:employee_manage:remove')")
    @Log(title = "员工管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(employeeManageService.deleteEmployeeManageByIds(ids));
    }
}
