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
import com.cheng.system.domain.PhotoLibrary;
import com.cheng.system.service.IPhotoLibraryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 图片库Controller
 * 
 * @author cheng
 * @date 2024-10-13
 */
@RestController
@RequestMapping("/system/photo_library")
public class PhotoLibraryController extends BaseController
{
    @Autowired
    private IPhotoLibraryService photoLibraryService;

    /**
     * 查询图片库列表
     */
    @PreAuthorize("@ss.hasPermi('system:photo_library:list')")
    @GetMapping("/list")
    public TableDataInfo list(PhotoLibrary photoLibrary)
    {
        startPage();
        List<PhotoLibrary> list = photoLibraryService.selectPhotoLibraryList(photoLibrary);
        return getDataTable(list);
    }

    /**
     * 导出图片库列表
     */
    @PreAuthorize("@ss.hasPermi('system:photo_library:export')")
    @Log(title = "图片库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PhotoLibrary photoLibrary)
    {
        List<PhotoLibrary> list = photoLibraryService.selectPhotoLibraryList(photoLibrary);
        ExcelUtil<PhotoLibrary> util = new ExcelUtil<PhotoLibrary>(PhotoLibrary.class);
        util.exportExcel(response, list, "图片库数据");
    }

    /**
     * 获取图片库详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:photo_library:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(photoLibraryService.selectPhotoLibraryById(id));
    }

    /**
     * 新增图片库
     */
    @PreAuthorize("@ss.hasPermi('system:photo_library:add')")
    @Log(title = "图片库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PhotoLibrary photoLibrary)
    {
        return toAjax(photoLibraryService.insertPhotoLibrary(photoLibrary));
    }

    /**
     * 修改图片库
     */
    @PreAuthorize("@ss.hasPermi('system:photo_library:edit')")
    @Log(title = "图片库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PhotoLibrary photoLibrary)
    {
        return toAjax(photoLibraryService.updatePhotoLibrary(photoLibrary));
    }

    /**
     * 删除图片库
     */
    @PreAuthorize("@ss.hasPermi('system:photo_library:remove')")
    @Log(title = "图片库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(photoLibraryService.deletePhotoLibraryByIds(ids));
    }
}
