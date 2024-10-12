package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.MapIconSet;

/**
 * 地图图标配置Service接口
 * 
 * @author cheng
 * @date 2024-10-12
 */
public interface IMapIconSetService 
{
    /**
     * 查询地图图标配置
     * 
     * @param id 地图图标配置主键
     * @return 地图图标配置
     */
    public MapIconSet selectMapIconSetById(Long id);

    /**
     * 查询地图图标配置列表
     * 
     * @param mapIconSet 地图图标配置
     * @return 地图图标配置集合
     */
    public List<MapIconSet> selectMapIconSetList(MapIconSet mapIconSet);

    /**
     * 新增地图图标配置
     * 
     * @param mapIconSet 地图图标配置
     * @return 结果
     */
    public int insertMapIconSet(MapIconSet mapIconSet);

    /**
     * 修改地图图标配置
     * 
     * @param mapIconSet 地图图标配置
     * @return 结果
     */
    public int updateMapIconSet(MapIconSet mapIconSet);

    /**
     * 批量删除地图图标配置
     * 
     * @param ids 需要删除的地图图标配置主键集合
     * @return 结果
     */
    public int deleteMapIconSetByIds(Long[] ids);

    /**
     * 删除地图图标配置信息
     * 
     * @param id 地图图标配置主键
     * @return 结果
     */
    public int deleteMapIconSetById(Long id);
}
