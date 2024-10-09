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
import com.cheng.system.domain.FarmResource;
import com.cheng.system.service.IFarmResourceService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 农资管理Controller
 * 
 * @author cheng
 * @date 2024-10-09
 */
@RestController
@RequestMapping("/system/farm_resource")
public class FarmResourceController extends BaseController
{
    @Autowired
    private IFarmResourceService farmResourceService;

    /**
     * 查询农资管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:farm_resource:list')")
    @GetMapping("/list")
    public TableDataInfo list(FarmResource farmResource)
    {
        startPage();
        List<FarmResource> list = farmResourceService.selectFarmResourceList(farmResource);
        return getDataTable(list);
    }

    /**
     * 导出农资管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:farm_resource:export')")
    @Log(title = "农资管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FarmResource farmResource)
    {
        List<FarmResource> list = farmResourceService.selectFarmResourceList(farmResource);
        ExcelUtil<FarmResource> util = new ExcelUtil<FarmResource>(FarmResource.class);
        util.exportExcel(response, list, "农资管理数据");
    }

    /**
     * 获取农资管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:farm_resource:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(farmResourceService.selectFarmResourceById(id));
    }

    /**
     * 新增农资管理
     */
    @PreAuthorize("@ss.hasPermi('system:farm_resource:add')")
    @Log(title = "农资管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FarmResource farmResource)
    {
        return toAjax(farmResourceService.insertFarmResource(farmResource));
    }

    /**
     * 修改农资管理
     */
    @PreAuthorize("@ss.hasPermi('system:farm_resource:edit')")
    @Log(title = "农资管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FarmResource farmResource)
    {
        return toAjax(farmResourceService.updateFarmResource(farmResource));
    }

    /**
     * 删除农资管理
     */
    @PreAuthorize("@ss.hasPermi('system:farm_resource:remove')")
    @Log(title = "农资管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(farmResourceService.deleteFarmResourceByIds(ids));
    }
}
