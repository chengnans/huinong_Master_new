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
import com.cheng.system.domain.StoryLibrary;
import com.cheng.system.service.IStoryLibraryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 故事库Controller
 * 
 * @author cheng
 * @date 2024-10-13
 */
@RestController
@RequestMapping("/system/story_library")
public class StoryLibraryController extends BaseController
{
    @Autowired
    private IStoryLibraryService storyLibraryService;

    /**
     * 查询故事库列表
     */
    @PreAuthorize("@ss.hasPermi('system:story_library:list')")
    @GetMapping("/list")
    public TableDataInfo list(StoryLibrary storyLibrary)
    {
        startPage();
        List<StoryLibrary> list = storyLibraryService.selectStoryLibraryList(storyLibrary);
        return getDataTable(list);
    }

    /**
     * 导出故事库列表
     */
    @PreAuthorize("@ss.hasPermi('system:story_library:export')")
    @Log(title = "故事库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, StoryLibrary storyLibrary)
    {
        List<StoryLibrary> list = storyLibraryService.selectStoryLibraryList(storyLibrary);
        ExcelUtil<StoryLibrary> util = new ExcelUtil<StoryLibrary>(StoryLibrary.class);
        util.exportExcel(response, list, "故事库数据");
    }

    /**
     * 获取故事库详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:story_library:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(storyLibraryService.selectStoryLibraryById(id));
    }

    /**
     * 新增故事库
     */
    @PreAuthorize("@ss.hasPermi('system:story_library:add')")
    @Log(title = "故事库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StoryLibrary storyLibrary)
    {
        return toAjax(storyLibraryService.insertStoryLibrary(storyLibrary));
    }

    /**
     * 修改故事库
     */
    @PreAuthorize("@ss.hasPermi('system:story_library:edit')")
    @Log(title = "故事库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StoryLibrary storyLibrary)
    {
        return toAjax(storyLibraryService.updateStoryLibrary(storyLibrary));
    }

    /**
     * 删除故事库
     */
    @PreAuthorize("@ss.hasPermi('system:story_library:remove')")
    @Log(title = "故事库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(storyLibraryService.deleteStoryLibraryByIds(ids));
    }
}
