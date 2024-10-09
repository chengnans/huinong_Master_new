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
import com.cheng.system.domain.DiseasesStandardLibrary;
import com.cheng.system.service.IDiseasesStandardLibraryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 病虫害标准库Controller
 * 
 * @author cheng
 * @date 2024-10-09
 */
@RestController
@RequestMapping("/system/diseases_standard_library")
public class DiseasesStandardLibraryController extends BaseController
{
    @Autowired
    private IDiseasesStandardLibraryService diseasesStandardLibraryService;

    /**
     * 查询病虫害标准库列表
     */
    @PreAuthorize("@ss.hasPermi('system:diseases_standard_library:list')")
    @GetMapping("/list")
    public TableDataInfo list(DiseasesStandardLibrary diseasesStandardLibrary)
    {
        startPage();
        List<DiseasesStandardLibrary> list = diseasesStandardLibraryService.selectDiseasesStandardLibraryList(diseasesStandardLibrary);
        return getDataTable(list);
    }

    /**
     * 导出病虫害标准库列表
     */
    @PreAuthorize("@ss.hasPermi('system:diseases_standard_library:export')")
    @Log(title = "病虫害标准库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DiseasesStandardLibrary diseasesStandardLibrary)
    {
        List<DiseasesStandardLibrary> list = diseasesStandardLibraryService.selectDiseasesStandardLibraryList(diseasesStandardLibrary);
        ExcelUtil<DiseasesStandardLibrary> util = new ExcelUtil<DiseasesStandardLibrary>(DiseasesStandardLibrary.class);
        util.exportExcel(response, list, "病虫害标准库数据");
    }

    /**
     * 获取病虫害标准库详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:diseases_standard_library:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(diseasesStandardLibraryService.selectDiseasesStandardLibraryById(id));
    }

    /**
     * 新增病虫害标准库
     */
    @PreAuthorize("@ss.hasPermi('system:diseases_standard_library:add')")
    @Log(title = "病虫害标准库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DiseasesStandardLibrary diseasesStandardLibrary)
    {
        return toAjax(diseasesStandardLibraryService.insertDiseasesStandardLibrary(diseasesStandardLibrary));
    }

    /**
     * 修改病虫害标准库
     */
    @PreAuthorize("@ss.hasPermi('system:diseases_standard_library:edit')")
    @Log(title = "病虫害标准库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DiseasesStandardLibrary diseasesStandardLibrary)
    {
        return toAjax(diseasesStandardLibraryService.updateDiseasesStandardLibrary(diseasesStandardLibrary));
    }

    /**
     * 删除病虫害标准库
     */
    @PreAuthorize("@ss.hasPermi('system:diseases_standard_library:remove')")
    @Log(title = "病虫害标准库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(diseasesStandardLibraryService.deleteDiseasesStandardLibraryByIds(ids));
    }
}
