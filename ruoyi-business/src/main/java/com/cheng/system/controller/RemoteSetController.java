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
import com.cheng.system.domain.RemoteSet;
import com.cheng.system.service.IRemoteSetService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 遥感服务配置Controller
 * 
 * @author cheng
 * @date 2024-10-13
 */
@RestController
@RequestMapping("/system/remote_set")
public class RemoteSetController extends BaseController
{
    @Autowired
    private IRemoteSetService remoteSetService;

    /**
     * 查询遥感服务配置列表
     */
    @PreAuthorize("@ss.hasPermi('system:remote_set:list')")
    @GetMapping("/list")
    public TableDataInfo list(RemoteSet remoteSet)
    {
        startPage();
        List<RemoteSet> list = remoteSetService.selectRemoteSetList(remoteSet);
        return getDataTable(list);
    }

    /**
     * 导出遥感服务配置列表
     */
    @PreAuthorize("@ss.hasPermi('system:remote_set:export')")
    @Log(title = "遥感服务配置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RemoteSet remoteSet)
    {
        List<RemoteSet> list = remoteSetService.selectRemoteSetList(remoteSet);
        ExcelUtil<RemoteSet> util = new ExcelUtil<RemoteSet>(RemoteSet.class);
        util.exportExcel(response, list, "遥感服务配置数据");
    }

    /**
     * 获取遥感服务配置详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:remote_set:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(remoteSetService.selectRemoteSetById(id));
    }

    /**
     * 新增遥感服务配置
     */
    @PreAuthorize("@ss.hasPermi('system:remote_set:add')")
    @Log(title = "遥感服务配置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RemoteSet remoteSet)
    {
        return toAjax(remoteSetService.insertRemoteSet(remoteSet));
    }

    /**
     * 修改遥感服务配置
     */
    @PreAuthorize("@ss.hasPermi('system:remote_set:edit')")
    @Log(title = "遥感服务配置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RemoteSet remoteSet)
    {
        return toAjax(remoteSetService.updateRemoteSet(remoteSet));
    }

    /**
     * 删除遥感服务配置
     */
    @PreAuthorize("@ss.hasPermi('system:remote_set:remove')")
    @Log(title = "遥感服务配置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(remoteSetService.deleteRemoteSetByIds(ids));
    }
}
