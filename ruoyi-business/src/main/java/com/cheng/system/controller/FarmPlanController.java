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
import com.cheng.system.domain.FarmPlan;
import com.cheng.system.service.IFarmPlanService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 农事计划Controller
 * 
 * @author cheng
 * @date 2024-10-09
 */
@RestController
@RequestMapping("/system/farm_plan")
public class FarmPlanController extends BaseController
{
    @Autowired
    private IFarmPlanService farmPlanService;

    /**
     * 查询农事计划列表
     */
    @PreAuthorize("@ss.hasPermi('system:farm_plan:list')")
    @GetMapping("/list")
    public TableDataInfo list(FarmPlan farmPlan)
    {
        startPage();
        List<FarmPlan> list = farmPlanService.selectFarmPlanList(farmPlan);
        return getDataTable(list);
    }

    /**
     * 导出农事计划列表
     */
    @PreAuthorize("@ss.hasPermi('system:farm_plan:export')")
    @Log(title = "农事计划", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FarmPlan farmPlan)
    {
        List<FarmPlan> list = farmPlanService.selectFarmPlanList(farmPlan);
        ExcelUtil<FarmPlan> util = new ExcelUtil<FarmPlan>(FarmPlan.class);
        util.exportExcel(response, list, "农事计划数据");
    }

    /**
     * 获取农事计划详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:farm_plan:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(farmPlanService.selectFarmPlanById(id));
    }

    /**
     * 新增农事计划
     */
    @PreAuthorize("@ss.hasPermi('system:farm_plan:add')")
    @Log(title = "农事计划", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FarmPlan farmPlan)
    {
        return toAjax(farmPlanService.insertFarmPlan(farmPlan));
    }

    /**
     * 修改农事计划
     */
    @PreAuthorize("@ss.hasPermi('system:farm_plan:edit')")
    @Log(title = "农事计划", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FarmPlan farmPlan)
    {
        return toAjax(farmPlanService.updateFarmPlan(farmPlan));
    }

    /**
     * 删除农事计划
     */
    @PreAuthorize("@ss.hasPermi('system:farm_plan:remove')")
    @Log(title = "农事计划", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(farmPlanService.deleteFarmPlanByIds(ids));
    }
}
