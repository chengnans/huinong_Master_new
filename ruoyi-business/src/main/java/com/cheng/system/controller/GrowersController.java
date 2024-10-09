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
import com.cheng.system.domain.Growers;
import com.cheng.system.service.IGrowersService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 种植户管理Controller
 * 
 * @author cheng
 * @date 2024-10-08
 */
@RestController
@RequestMapping("/system/growers")
public class GrowersController extends BaseController
{
    @Autowired
    private IGrowersService growersService;

    /**
     * 查询种植户管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:growers:list')")
    @GetMapping("/list")
    public TableDataInfo list(Growers growers)
    {
        startPage();
        List<Growers> list = growersService.selectGrowersList(growers);
        return getDataTable(list);
    }

    /**
     * 导出种植户管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:growers:export')")
    @Log(title = "种植户管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Growers growers)
    {
        List<Growers> list = growersService.selectGrowersList(growers);
        ExcelUtil<Growers> util = new ExcelUtil<Growers>(Growers.class);
        util.exportExcel(response, list, "种植户管理数据");
    }

    /**
     * 获取种植户管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:growers:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(growersService.selectGrowersById(id));
    }

    /**
     * 新增种植户管理
     */
    @PreAuthorize("@ss.hasPermi('system:growers:add')")
    @Log(title = "种植户管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Growers growers)
    {
        return toAjax(growersService.insertGrowers(growers));
    }

    /**
     * 修改种植户管理
     */
    @PreAuthorize("@ss.hasPermi('system:growers:edit')")
    @Log(title = "种植户管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Growers growers)
    {
        return toAjax(growersService.updateGrowers(growers));
    }

    /**
     * 删除种植户管理
     */
    @PreAuthorize("@ss.hasPermi('system:growers:remove')")
    @Log(title = "种植户管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(growersService.deleteGrowersByIds(ids));
    }
}
