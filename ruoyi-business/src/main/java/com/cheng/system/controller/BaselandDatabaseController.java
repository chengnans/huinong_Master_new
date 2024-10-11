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
import com.cheng.system.domain.BaselandDatabase;
import com.cheng.system.service.IBaselandDatabaseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 基地数据库Controller
 * 
 * @author cheng
 * @date 2024-10-11
 */
@RestController
@RequestMapping("/system/baseland_database")
public class BaselandDatabaseController extends BaseController
{
    @Autowired
    private IBaselandDatabaseService baselandDatabaseService;

    /**
     * 查询基地数据库列表
     */
    @PreAuthorize("@ss.hasPermi('system:baseland_database:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaselandDatabase baselandDatabase)
    {
        startPage();
        List<BaselandDatabase> list = baselandDatabaseService.selectBaselandDatabaseList(baselandDatabase);
        return getDataTable(list);
    }

    /**
     * 导出基地数据库列表
     */
    @PreAuthorize("@ss.hasPermi('system:baseland_database:export')")
    @Log(title = "基地数据库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaselandDatabase baselandDatabase)
    {
        List<BaselandDatabase> list = baselandDatabaseService.selectBaselandDatabaseList(baselandDatabase);
        ExcelUtil<BaselandDatabase> util = new ExcelUtil<BaselandDatabase>(BaselandDatabase.class);
        util.exportExcel(response, list, "基地数据库数据");
    }

    /**
     * 获取基地数据库详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:baseland_database:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(baselandDatabaseService.selectBaselandDatabaseById(id));
    }

    /**
     * 新增基地数据库
     */
    @PreAuthorize("@ss.hasPermi('system:baseland_database:add')")
    @Log(title = "基地数据库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaselandDatabase baselandDatabase)
    {
        return toAjax(baselandDatabaseService.insertBaselandDatabase(baselandDatabase));
    }

    /**
     * 修改基地数据库
     */
    @PreAuthorize("@ss.hasPermi('system:baseland_database:edit')")
    @Log(title = "基地数据库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaselandDatabase baselandDatabase)
    {
        return toAjax(baselandDatabaseService.updateBaselandDatabase(baselandDatabase));
    }

    /**
     * 删除基地数据库
     */
    @PreAuthorize("@ss.hasPermi('system:baseland_database:remove')")
    @Log(title = "基地数据库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(baselandDatabaseService.deleteBaselandDatabaseByIds(ids));
    }
}
