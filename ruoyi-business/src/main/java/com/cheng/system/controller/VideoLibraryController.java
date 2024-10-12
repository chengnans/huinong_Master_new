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
import com.cheng.system.domain.VideoLibrary;
import com.cheng.system.service.IVideoLibraryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 音视频库Controller
 * 
 * @author cheng
 * @date 2024-10-13
 */
@RestController
@RequestMapping("/system/video_library")
public class VideoLibraryController extends BaseController
{
    @Autowired
    private IVideoLibraryService videoLibraryService;

    /**
     * 查询音视频库列表
     */
    @PreAuthorize("@ss.hasPermi('system:video_library:list')")
    @GetMapping("/list")
    public TableDataInfo list(VideoLibrary videoLibrary)
    {
        startPage();
        List<VideoLibrary> list = videoLibraryService.selectVideoLibraryList(videoLibrary);
        return getDataTable(list);
    }

    /**
     * 导出音视频库列表
     */
    @PreAuthorize("@ss.hasPermi('system:video_library:export')")
    @Log(title = "音视频库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VideoLibrary videoLibrary)
    {
        List<VideoLibrary> list = videoLibraryService.selectVideoLibraryList(videoLibrary);
        ExcelUtil<VideoLibrary> util = new ExcelUtil<VideoLibrary>(VideoLibrary.class);
        util.exportExcel(response, list, "音视频库数据");
    }

    /**
     * 获取音视频库详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:video_library:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(videoLibraryService.selectVideoLibraryById(id));
    }

    /**
     * 新增音视频库
     */
    @PreAuthorize("@ss.hasPermi('system:video_library:add')")
    @Log(title = "音视频库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VideoLibrary videoLibrary)
    {
        return toAjax(videoLibraryService.insertVideoLibrary(videoLibrary));
    }

    /**
     * 修改音视频库
     */
    @PreAuthorize("@ss.hasPermi('system:video_library:edit')")
    @Log(title = "音视频库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VideoLibrary videoLibrary)
    {
        return toAjax(videoLibraryService.updateVideoLibrary(videoLibrary));
    }

    /**
     * 删除音视频库
     */
    @PreAuthorize("@ss.hasPermi('system:video_library:remove')")
    @Log(title = "音视频库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(videoLibraryService.deleteVideoLibraryByIds(ids));
    }
}
