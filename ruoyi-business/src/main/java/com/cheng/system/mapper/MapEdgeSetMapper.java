package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.MapEdgeSet;

/**
 * 地图边界配置Mapper接口
 * 
 * @author cheng
 * @date 2024-10-12
 */
public interface MapEdgeSetMapper 
{
    /**
     * 查询地图边界配置
     * 
     * @param id 地图边界配置主键
     * @return 地图边界配置
     */
    public MapEdgeSet selectMapEdgeSetById(Long id);

    /**
     * 查询地图边界配置列表
     * 
     * @param mapEdgeSet 地图边界配置
     * @return 地图边界配置集合
     */
    public List<MapEdgeSet> selectMapEdgeSetList(MapEdgeSet mapEdgeSet);

    /**
     * 新增地图边界配置
     * 
     * @param mapEdgeSet 地图边界配置
     * @return 结果
     */
    public int insertMapEdgeSet(MapEdgeSet mapEdgeSet);

    /**
     * 修改地图边界配置
     * 
     * @param mapEdgeSet 地图边界配置
     * @return 结果
     */
    public int updateMapEdgeSet(MapEdgeSet mapEdgeSet);

    /**
     * 删除地图边界配置
     * 
     * @param id 地图边界配置主键
     * @return 结果
     */
    public int deleteMapEdgeSetById(Long id);

    /**
     * 批量删除地图边界配置
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMapEdgeSetByIds(Long[] ids);
}
