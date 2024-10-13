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
import com.cheng.system.domain.BaseAuth;
import com.cheng.system.service.IBaseAuthService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 基地授权Controller
 * 
 * @author cheng
 * @date 2024-10-13
 */
@RestController
@RequestMapping("/system/base_auth")
public class BaseAuthController extends BaseController
{
    @Autowired
    private IBaseAuthService baseAuthService;

    /**
     * 查询基地授权列表
     */
    @PreAuthorize("@ss.hasPermi('system:base_auth:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseAuth baseAuth)
    {
        startPage();
        List<BaseAuth> list = baseAuthService.selectBaseAuthList(baseAuth);
        return getDataTable(list);
    }

    /**
     * 导出基地授权列表
     */
    @PreAuthorize("@ss.hasPermi('system:base_auth:export')")
    @Log(title = "基地授权", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaseAuth baseAuth)
    {
        List<BaseAuth> list = baseAuthService.selectBaseAuthList(baseAuth);
        ExcelUtil<BaseAuth> util = new ExcelUtil<BaseAuth>(BaseAuth.class);
        util.exportExcel(response, list, "基地授权数据");
    }

    /**
     * 获取基地授权详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:base_auth:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(baseAuthService.selectBaseAuthById(id));
    }

    /**
     * 新增基地授权
     */
    @PreAuthorize("@ss.hasPermi('system:base_auth:add')")
    @Log(title = "基地授权", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseAuth baseAuth)
    {
        return toAjax(baseAuthService.insertBaseAuth(baseAuth));
    }

    /**
     * 修改基地授权
     */
    @PreAuthorize("@ss.hasPermi('system:base_auth:edit')")
    @Log(title = "基地授权", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseAuth baseAuth)
    {
        return toAjax(baseAuthService.updateBaseAuth(baseAuth));
    }

    /**
     * 删除基地授权
     */
    @PreAuthorize("@ss.hasPermi('system:base_auth:remove')")
    @Log(title = "基地授权", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(baseAuthService.deleteBaseAuthByIds(ids));
    }
}
