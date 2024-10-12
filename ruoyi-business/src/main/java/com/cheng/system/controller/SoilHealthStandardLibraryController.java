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
import com.cheng.system.domain.SoilHealthStandardLibrary;
import com.cheng.system.service.ISoilHealthStandardLibraryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 土壤健康标准库Controller
 * 
 * @author cheng
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/system/soil_health_standard_library")
public class SoilHealthStandardLibraryController extends BaseController
{
    @Autowired
    private ISoilHealthStandardLibraryService soilHealthStandardLibraryService;

    /**
     * 查询土壤健康标准库列表
     */
    @PreAuthorize("@ss.hasPermi('system:soil_health_standard_library:list')")
    @GetMapping("/list")
    public TableDataInfo list(SoilHealthStandardLibrary soilHealthStandardLibrary)
    {
        startPage();
        List<SoilHealthStandardLibrary> list = soilHealthStandardLibraryService.selectSoilHealthStandardLibraryList(soilHealthStandardLibrary);
        return getDataTable(list);
    }

    /**
     * 导出土壤健康标准库列表
     */
    @PreAuthorize("@ss.hasPermi('system:soil_health_standard_library:export')")
    @Log(title = "土壤健康标准库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SoilHealthStandardLibrary soilHealthStandardLibrary)
    {
        List<SoilHealthStandardLibrary> list = soilHealthStandardLibraryService.selectSoilHealthStandardLibraryList(soilHealthStandardLibrary);
        ExcelUtil<SoilHealthStandardLibrary> util = new ExcelUtil<SoilHealthStandardLibrary>(SoilHealthStandardLibrary.class);
        util.exportExcel(response, list, "土壤健康标准库数据");
    }

    /**
     * 获取土壤健康标准库详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:soil_health_standard_library:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(soilHealthStandardLibraryService.selectSoilHealthStandardLibraryById(id));
    }

    /**
     * 新增土壤健康标准库
     */
    @PreAuthorize("@ss.hasPermi('system:soil_health_standard_library:add')")
    @Log(title = "土壤健康标准库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SoilHealthStandardLibrary soilHealthStandardLibrary)
    {
        return toAjax(soilHealthStandardLibraryService.insertSoilHealthStandardLibrary(soilHealthStandardLibrary));
    }

    /**
     * 修改土壤健康标准库
     */
    @PreAuthorize("@ss.hasPermi('system:soil_health_standard_library:edit')")
    @Log(title = "土壤健康标准库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SoilHealthStandardLibrary soilHealthStandardLibrary)
    {
        return toAjax(soilHealthStandardLibraryService.updateSoilHealthStandardLibrary(soilHealthStandardLibrary));
    }

    /**
     * 删除土壤健康标准库
     */
    @PreAuthorize("@ss.hasPermi('system:soil_health_standard_library:remove')")
    @Log(title = "土壤健康标准库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(soilHealthStandardLibraryService.deleteSoilHealthStandardLibraryByIds(ids));
    }
}
