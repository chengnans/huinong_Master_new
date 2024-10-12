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
import com.cheng.system.domain.MapEdgeSet;
import com.cheng.system.service.IMapEdgeSetService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 地图边界配置Controller
 * 
 * @author cheng
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/system/map_edge_set")
public class MapEdgeSetController extends BaseController
{
    @Autowired
    private IMapEdgeSetService mapEdgeSetService;

    /**
     * 查询地图边界配置列表
     */
    @PreAuthorize("@ss.hasPermi('system:map_edge_set:list')")
    @GetMapping("/list")
    public TableDataInfo list(MapEdgeSet mapEdgeSet)
    {
        startPage();
        List<MapEdgeSet> list = mapEdgeSetService.selectMapEdgeSetList(mapEdgeSet);
        return getDataTable(list);
    }

    /**
     * 导出地图边界配置列表
     */
    @PreAuthorize("@ss.hasPermi('system:map_edge_set:export')")
    @Log(title = "地图边界配置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MapEdgeSet mapEdgeSet)
    {
        List<MapEdgeSet> list = mapEdgeSetService.selectMapEdgeSetList(mapEdgeSet);
        ExcelUtil<MapEdgeSet> util = new ExcelUtil<MapEdgeSet>(MapEdgeSet.class);
        util.exportExcel(response, list, "地图边界配置数据");
    }

    /**
     * 获取地图边界配置详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:map_edge_set:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(mapEdgeSetService.selectMapEdgeSetById(id));
    }

    /**
     * 新增地图边界配置
     */
    @PreAuthorize("@ss.hasPermi('system:map_edge_set:add')")
    @Log(title = "地图边界配置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MapEdgeSet mapEdgeSet)
    {
        return toAjax(mapEdgeSetService.insertMapEdgeSet(mapEdgeSet));
    }

    /**
     * 修改地图边界配置
     */
    @PreAuthorize("@ss.hasPermi('system:map_edge_set:edit')")
    @Log(title = "地图边界配置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MapEdgeSet mapEdgeSet)
    {
        return toAjax(mapEdgeSetService.updateMapEdgeSet(mapEdgeSet));
    }

    /**
     * 删除地图边界配置
     */
    @PreAuthorize("@ss.hasPermi('system:map_edge_set:remove')")
    @Log(title = "地图边界配置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mapEdgeSetService.deleteMapEdgeSetByIds(ids));
    }
}
