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
import com.cheng.system.domain.RemotePhotos;
import com.cheng.system.service.IRemotePhotosService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 遥感图片Controller
 * 
 * @author cheng
 * @date 2024-10-08
 */
@RestController
@RequestMapping("/system/photos")
public class RemotePhotosController extends BaseController
{
    @Autowired
    private IRemotePhotosService remotePhotosService;

    /**
     * 查询遥感图片列表
     */
    @PreAuthorize("@ss.hasPermi('system:photos:list')")
    @GetMapping("/list")
    public TableDataInfo list(RemotePhotos remotePhotos)
    {
        startPage();
        List<RemotePhotos> list = remotePhotosService.selectRemotePhotosList(remotePhotos);
        return getDataTable(list);
    }

    /**
     * 导出遥感图片列表
     */
    @PreAuthorize("@ss.hasPermi('system:photos:export')")
    @Log(title = "遥感图片", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RemotePhotos remotePhotos)
    {
        List<RemotePhotos> list = remotePhotosService.selectRemotePhotosList(remotePhotos);
        ExcelUtil<RemotePhotos> util = new ExcelUtil<RemotePhotos>(RemotePhotos.class);
        util.exportExcel(response, list, "遥感图片数据");
    }

    /**
     * 获取遥感图片详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:photos:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(remotePhotosService.selectRemotePhotosById(id));
    }

    /**
     * 新增遥感图片
     */
    @PreAuthorize("@ss.hasPermi('system:photos:add')")
    @Log(title = "遥感图片", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RemotePhotos remotePhotos)
    {
        return toAjax(remotePhotosService.insertRemotePhotos(remotePhotos));
    }

    /**
     * 修改遥感图片
     */
    @PreAuthorize("@ss.hasPermi('system:photos:edit')")
    @Log(title = "遥感图片", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RemotePhotos remotePhotos)
    {
        return toAjax(remotePhotosService.updateRemotePhotos(remotePhotos));
    }

    /**
     * 删除遥感图片
     */
    @PreAuthorize("@ss.hasPermi('system:photos:remove')")
    @Log(title = "遥感图片", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(remotePhotosService.deleteRemotePhotosByIds(ids));
    }
}
