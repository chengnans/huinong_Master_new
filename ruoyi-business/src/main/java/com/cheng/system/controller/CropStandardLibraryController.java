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
import com.cheng.system.domain.CropStandardLibrary;
import com.cheng.system.service.ICropStandardLibraryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 种植业标准库Controller
 * 
 * @author cheng
 * @date 2024-10-09
 */
@RestController
@RequestMapping("/system/crop_standard_library")
public class CropStandardLibraryController extends BaseController
{
    @Autowired
    private ICropStandardLibraryService cropStandardLibraryService;

    /**
     * 查询种植业标准库列表
     */
    @PreAuthorize("@ss.hasPermi('system:crop_standard_library:list')")
    @GetMapping("/list")
    public TableDataInfo list(CropStandardLibrary cropStandardLibrary)
    {
        startPage();
        List<CropStandardLibrary> list = cropStandardLibraryService.selectCropStandardLibraryList(cropStandardLibrary);
        return getDataTable(list);
    }

    /**
     * 导出种植业标准库列表
     */
    @PreAuthorize("@ss.hasPermi('system:crop_standard_library:export')")
    @Log(title = "种植业标准库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CropStandardLibrary cropStandardLibrary)
    {
        List<CropStandardLibrary> list = cropStandardLibraryService.selectCropStandardLibraryList(cropStandardLibrary);
        ExcelUtil<CropStandardLibrary> util = new ExcelUtil<CropStandardLibrary>(CropStandardLibrary.class);
        util.exportExcel(response, list, "种植业标准库数据");
    }

    /**
     * 获取种植业标准库详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:crop_standard_library:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(cropStandardLibraryService.selectCropStandardLibraryById(id));
    }

    /**
     * 新增种植业标准库
     */
    @PreAuthorize("@ss.hasPermi('system:crop_standard_library:add')")
    @Log(title = "种植业标准库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CropStandardLibrary cropStandardLibrary)
    {
        return toAjax(cropStandardLibraryService.insertCropStandardLibrary(cropStandardLibrary));
    }

    /**
     * 修改种植业标准库
     */
    @PreAuthorize("@ss.hasPermi('system:crop_standard_library:edit')")
    @Log(title = "种植业标准库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CropStandardLibrary cropStandardLibrary)
    {
        return toAjax(cropStandardLibraryService.updateCropStandardLibrary(cropStandardLibrary));
    }

    /**
     * 删除种植业标准库
     */
    @PreAuthorize("@ss.hasPermi('system:crop_standard_library:remove')")
    @Log(title = "种植业标准库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(cropStandardLibraryService.deleteCropStandardLibraryByIds(ids));
    }
}
