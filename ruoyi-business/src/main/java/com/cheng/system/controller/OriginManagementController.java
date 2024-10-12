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
import com.cheng.system.domain.OriginManagement;
import com.cheng.system.service.IOriginManagementService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 产地管理Controller
 * 
 * @author cheng
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/system/origin_management")
public class OriginManagementController extends BaseController
{
    @Autowired
    private IOriginManagementService originManagementService;

    /**
     * 查询产地管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:origin_management:list')")
    @GetMapping("/list")
    public TableDataInfo list(OriginManagement originManagement)
    {
        startPage();
        List<OriginManagement> list = originManagementService.selectOriginManagementList(originManagement);
        return getDataTable(list);
    }

    /**
     * 导出产地管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:origin_management:export')")
    @Log(title = "产地管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OriginManagement originManagement)
    {
        List<OriginManagement> list = originManagementService.selectOriginManagementList(originManagement);
        ExcelUtil<OriginManagement> util = new ExcelUtil<OriginManagement>(OriginManagement.class);
        util.exportExcel(response, list, "产地管理数据");
    }

    /**
     * 获取产地管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:origin_management:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(originManagementService.selectOriginManagementById(id));
    }

    /**
     * 新增产地管理
     */
    @PreAuthorize("@ss.hasPermi('system:origin_management:add')")
    @Log(title = "产地管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OriginManagement originManagement)
    {
        return toAjax(originManagementService.insertOriginManagement(originManagement));
    }

    /**
     * 修改产地管理
     */
    @PreAuthorize("@ss.hasPermi('system:origin_management:edit')")
    @Log(title = "产地管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OriginManagement originManagement)
    {
        return toAjax(originManagementService.updateOriginManagement(originManagement));
    }

    /**
     * 删除产地管理
     */
    @PreAuthorize("@ss.hasPermi('system:origin_management:remove')")
    @Log(title = "产地管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(originManagementService.deleteOriginManagementByIds(ids));
    }
}
