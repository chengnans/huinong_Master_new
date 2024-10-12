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
import com.cheng.system.domain.MapIconSet;
import com.cheng.system.service.IMapIconSetService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 地图图标配置Controller
 * 
 * @author cheng
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/system/map_icon_set")
public class MapIconSetController extends BaseController
{
    @Autowired
    private IMapIconSetService mapIconSetService;

    /**
     * 查询地图图标配置列表
     */
    @PreAuthorize("@ss.hasPermi('system:map_icon_set:list')")
    @GetMapping("/list")
    public TableDataInfo list(MapIconSet mapIconSet)
    {
        startPage();
        List<MapIconSet> list = mapIconSetService.selectMapIconSetList(mapIconSet);
        return getDataTable(list);
    }

    /**
     * 导出地图图标配置列表
     */
    @PreAuthorize("@ss.hasPermi('system:map_icon_set:export')")
    @Log(title = "地图图标配置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MapIconSet mapIconSet)
    {
        List<MapIconSet> list = mapIconSetService.selectMapIconSetList(mapIconSet);
        ExcelUtil<MapIconSet> util = new ExcelUtil<MapIconSet>(MapIconSet.class);
        util.exportExcel(response, list, "地图图标配置数据");
    }

    /**
     * 获取地图图标配置详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:map_icon_set:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(mapIconSetService.selectMapIconSetById(id));
    }

    /**
     * 新增地图图标配置
     */
    @PreAuthorize("@ss.hasPermi('system:map_icon_set:add')")
    @Log(title = "地图图标配置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MapIconSet mapIconSet)
    {
        return toAjax(mapIconSetService.insertMapIconSet(mapIconSet));
    }

    /**
     * 修改地图图标配置
     */
    @PreAuthorize("@ss.hasPermi('system:map_icon_set:edit')")
    @Log(title = "地图图标配置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MapIconSet mapIconSet)
    {
        return toAjax(mapIconSetService.updateMapIconSet(mapIconSet));
    }

    /**
     * 删除地图图标配置
     */
    @PreAuthorize("@ss.hasPermi('system:map_icon_set:remove')")
    @Log(title = "地图图标配置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mapIconSetService.deleteMapIconSetByIds(ids));
    }
}
