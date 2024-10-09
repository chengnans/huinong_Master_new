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
import com.cheng.system.domain.BirthCycle;
import com.cheng.system.service.IBirthCycleService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 生育周期设置Controller
 * 
 * @author cheng
 * @date 2024-10-09
 */
@RestController
@RequestMapping("/system/birth_cycle")
public class BirthCycleController extends BaseController
{
    @Autowired
    private IBirthCycleService birthCycleService;

    /**
     * 查询生育周期设置列表
     */
    @PreAuthorize("@ss.hasPermi('system:birth_cycle:list')")
    @GetMapping("/list")
    public TableDataInfo list(BirthCycle birthCycle)
    {
        startPage();
        List<BirthCycle> list = birthCycleService.selectBirthCycleList(birthCycle);
        return getDataTable(list);
    }

    /**
     * 导出生育周期设置列表
     */
    @PreAuthorize("@ss.hasPermi('system:birth_cycle:export')")
    @Log(title = "生育周期设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BirthCycle birthCycle)
    {
        List<BirthCycle> list = birthCycleService.selectBirthCycleList(birthCycle);
        ExcelUtil<BirthCycle> util = new ExcelUtil<BirthCycle>(BirthCycle.class);
        util.exportExcel(response, list, "生育周期设置数据");
    }

    /**
     * 获取生育周期设置详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:birth_cycle:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(birthCycleService.selectBirthCycleById(id));
    }

    /**
     * 新增生育周期设置
     */
    @PreAuthorize("@ss.hasPermi('system:birth_cycle:add')")
    @Log(title = "生育周期设置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BirthCycle birthCycle)
    {
        return toAjax(birthCycleService.insertBirthCycle(birthCycle));
    }

    /**
     * 修改生育周期设置
     */
    @PreAuthorize("@ss.hasPermi('system:birth_cycle:edit')")
    @Log(title = "生育周期设置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BirthCycle birthCycle)
    {
        return toAjax(birthCycleService.updateBirthCycle(birthCycle));
    }

    /**
     * 删除生育周期设置
     */
    @PreAuthorize("@ss.hasPermi('system:birth_cycle:remove')")
    @Log(title = "生育周期设置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(birthCycleService.deleteBirthCycleByIds(ids));
    }
}
