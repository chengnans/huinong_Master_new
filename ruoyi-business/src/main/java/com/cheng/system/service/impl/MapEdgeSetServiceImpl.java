package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.MapEdgeSetMapper;
import com.cheng.system.domain.MapEdgeSet;
import com.cheng.system.service.IMapEdgeSetService;

/**
 * 地图边界配置Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-12
 */
@Service
public class MapEdgeSetServiceImpl implements IMapEdgeSetService 
{
    @Autowired
    private MapEdgeSetMapper mapEdgeSetMapper;

    /**
     * 查询地图边界配置
     * 
     * @param id 地图边界配置主键
     * @return 地图边界配置
     */
    @Override
    public MapEdgeSet selectMapEdgeSetById(Long id)
    {
        return mapEdgeSetMapper.selectMapEdgeSetById(id);
    }

    /**
     * 查询地图边界配置列表
     * 
     * @param mapEdgeSet 地图边界配置
     * @return 地图边界配置
     */
    @Override
    public List<MapEdgeSet> selectMapEdgeSetList(MapEdgeSet mapEdgeSet)
    {
        return mapEdgeSetMapper.selectMapEdgeSetList(mapEdgeSet);
    }

    /**
     * 新增地图边界配置
     * 
     * @param mapEdgeSet 地图边界配置
     * @return 结果
     */
    @Override
    public int insertMapEdgeSet(MapEdgeSet mapEdgeSet)
    {
        mapEdgeSet.setCreateTime(DateUtils.getNowDate());
        return mapEdgeSetMapper.insertMapEdgeSet(mapEdgeSet);
    }

    /**
     * 修改地图边界配置
     * 
     * @param mapEdgeSet 地图边界配置
     * @return 结果
     */
    @Override
    public int updateMapEdgeSet(MapEdgeSet mapEdgeSet)
    {
        return mapEdgeSetMapper.updateMapEdgeSet(mapEdgeSet);
    }

    /**
     * 批量删除地图边界配置
     * 
     * @param ids 需要删除的地图边界配置主键
     * @return 结果
     */
    @Override
    public int deleteMapEdgeSetByIds(Long[] ids)
    {
        return mapEdgeSetMapper.deleteMapEdgeSetByIds(ids);
    }

    /**
     * 删除地图边界配置信息
     * 
     * @param id 地图边界配置主键
     * @return 结果
     */
    @Override
    public int deleteMapEdgeSetById(Long id)
    {
        return mapEdgeSetMapper.deleteMapEdgeSetById(id);
    }
}
