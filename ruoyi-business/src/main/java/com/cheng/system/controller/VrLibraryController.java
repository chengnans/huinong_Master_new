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
import com.cheng.system.domain.VrLibrary;
import com.cheng.system.service.IVrLibraryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * VR库Controller
 * 
 * @author cheng
 * @date 2024-10-13
 */
@RestController
@RequestMapping("/system/vr_library")
public class VrLibraryController extends BaseController
{
    @Autowired
    private IVrLibraryService vrLibraryService;

    /**
     * 查询VR库列表
     */
    @PreAuthorize("@ss.hasPermi('system:vr_library:list')")
    @GetMapping("/list")
    public TableDataInfo list(VrLibrary vrLibrary)
    {
        startPage();
        List<VrLibrary> list = vrLibraryService.selectVrLibraryList(vrLibrary);
        return getDataTable(list);
    }

    /**
     * 导出VR库列表
     */
    @PreAuthorize("@ss.hasPermi('system:vr_library:export')")
    @Log(title = "VR库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VrLibrary vrLibrary)
    {
        List<VrLibrary> list = vrLibraryService.selectVrLibraryList(vrLibrary);
        ExcelUtil<VrLibrary> util = new ExcelUtil<VrLibrary>(VrLibrary.class);
        util.exportExcel(response, list, "VR库数据");
    }

    /**
     * 获取VR库详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:vr_library:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(vrLibraryService.selectVrLibraryById(id));
    }

    /**
     * 新增VR库
     */
    @PreAuthorize("@ss.hasPermi('system:vr_library:add')")
    @Log(title = "VR库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VrLibrary vrLibrary)
    {
        return toAjax(vrLibraryService.insertVrLibrary(vrLibrary));
    }

    /**
     * 修改VR库
     */
    @PreAuthorize("@ss.hasPermi('system:vr_library:edit')")
    @Log(title = "VR库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VrLibrary vrLibrary)
    {
        return toAjax(vrLibraryService.updateVrLibrary(vrLibrary));
    }

    /**
     * 删除VR库
     */
    @PreAuthorize("@ss.hasPermi('system:vr_library:remove')")
    @Log(title = "VR库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(vrLibraryService.deleteVrLibraryByIds(ids));
    }
}
