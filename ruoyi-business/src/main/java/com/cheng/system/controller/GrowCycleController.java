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
import com.cheng.system.domain.GrowCycle;
import com.cheng.system.service.IGrowCycleService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 生长周期识别Controller
 * 
 * @author cheng
 * @date 2024-10-09
 */
@RestController
@RequestMapping("/system/grow_cycle")
public class GrowCycleController extends BaseController
{
    @Autowired
    private IGrowCycleService growCycleService;

    /**
     * 查询生长周期识别列表
     */
    @PreAuthorize("@ss.hasPermi('system:grow_cycle:list')")
    @GetMapping("/list")
    public TableDataInfo list(GrowCycle growCycle)
    {
        startPage();
        List<GrowCycle> list = growCycleService.selectGrowCycleList(growCycle);
        return getDataTable(list);
    }

    /**
     * 导出生长周期识别列表
     */
    @PreAuthorize("@ss.hasPermi('system:grow_cycle:export')")
    @Log(title = "生长周期识别", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, GrowCycle growCycle)
    {
        List<GrowCycle> list = growCycleService.selectGrowCycleList(growCycle);
        ExcelUtil<GrowCycle> util = new ExcelUtil<GrowCycle>(GrowCycle.class);
        util.exportExcel(response, list, "生长周期识别数据");
    }

    /**
     * 获取生长周期识别详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:grow_cycle:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(growCycleService.selectGrowCycleById(id));
    }

    /**
     * 新增生长周期识别
     */
    @PreAuthorize("@ss.hasPermi('system:grow_cycle:add')")
    @Log(title = "生长周期识别", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody GrowCycle growCycle)
    {
        return toAjax(growCycleService.insertGrowCycle(growCycle));
    }

    /**
     * 修改生长周期识别
     */
    @PreAuthorize("@ss.hasPermi('system:grow_cycle:edit')")
    @Log(title = "生长周期识别", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody GrowCycle growCycle)
    {
        return toAjax(growCycleService.updateGrowCycle(growCycle));
    }

    /**
     * 删除生长周期识别
     */
    @PreAuthorize("@ss.hasPermi('system:grow_cycle:remove')")
    @Log(title = "生长周期识别", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(growCycleService.deleteGrowCycleByIds(ids));
    }
}
