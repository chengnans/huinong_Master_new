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
import com.cheng.system.domain.FertilizerDatabase;
import com.cheng.system.service.IFertilizerDatabaseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 肥料数据库Controller
 * 
 * @author cheng
 * @date 2024-10-09
 */
@RestController
@RequestMapping("/system/fertilizer_database")
public class FertilizerDatabaseController extends BaseController
{
    @Autowired
    private IFertilizerDatabaseService fertilizerDatabaseService;

    /**
     * 查询肥料数据库列表
     */
    @PreAuthorize("@ss.hasPermi('system:fertilizer_database:list')")
    @GetMapping("/list")
    public TableDataInfo list(FertilizerDatabase fertilizerDatabase)
    {
        startPage();
        List<FertilizerDatabase> list = fertilizerDatabaseService.selectFertilizerDatabaseList(fertilizerDatabase);
        return getDataTable(list);
    }

    /**
     * 导出肥料数据库列表
     */
    @PreAuthorize("@ss.hasPermi('system:fertilizer_database:export')")
    @Log(title = "肥料数据库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FertilizerDatabase fertilizerDatabase)
    {
        List<FertilizerDatabase> list = fertilizerDatabaseService.selectFertilizerDatabaseList(fertilizerDatabase);
        ExcelUtil<FertilizerDatabase> util = new ExcelUtil<FertilizerDatabase>(FertilizerDatabase.class);
        util.exportExcel(response, list, "肥料数据库数据");
    }

    /**
     * 获取肥料数据库详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:fertilizer_database:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(fertilizerDatabaseService.selectFertilizerDatabaseById(id));
    }

    /**
     * 新增肥料数据库
     */
    @PreAuthorize("@ss.hasPermi('system:fertilizer_database:add')")
    @Log(title = "肥料数据库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FertilizerDatabase fertilizerDatabase)
    {
        return toAjax(fertilizerDatabaseService.insertFertilizerDatabase(fertilizerDatabase));
    }

    /**
     * 修改肥料数据库
     */
    @PreAuthorize("@ss.hasPermi('system:fertilizer_database:edit')")
    @Log(title = "肥料数据库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FertilizerDatabase fertilizerDatabase)
    {
        return toAjax(fertilizerDatabaseService.updateFertilizerDatabase(fertilizerDatabase));
    }

    /**
     * 删除肥料数据库
     */
    @PreAuthorize("@ss.hasPermi('system:fertilizer_database:remove')")
    @Log(title = "肥料数据库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(fertilizerDatabaseService.deleteFertilizerDatabaseByIds(ids));
    }
}
