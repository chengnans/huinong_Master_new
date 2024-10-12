package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.MapIconSetMapper;
import com.cheng.system.domain.MapIconSet;
import com.cheng.system.service.IMapIconSetService;

/**
 * 地图图标配置Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-12
 */
@Service
public class MapIconSetServiceImpl implements IMapIconSetService 
{
    @Autowired
    private MapIconSetMapper mapIconSetMapper;

    /**
     * 查询地图图标配置
     * 
     * @param id 地图图标配置主键
     * @return 地图图标配置
     */
    @Override
    public MapIconSet selectMapIconSetById(Long id)
    {
        return mapIconSetMapper.selectMapIconSetById(id);
    }

    /**
     * 查询地图图标配置列表
     * 
     * @param mapIconSet 地图图标配置
     * @return 地图图标配置
     */
    @Override
    public List<MapIconSet> selectMapIconSetList(MapIconSet mapIconSet)
    {
        return mapIconSetMapper.selectMapIconSetList(mapIconSet);
    }

    /**
     * 新增地图图标配置
     * 
     * @param mapIconSet 地图图标配置
     * @return 结果
     */
    @Override
    public int insertMapIconSet(MapIconSet mapIconSet)
    {
        mapIconSet.setCreateTime(DateUtils.getNowDate());
        return mapIconSetMapper.insertMapIconSet(mapIconSet);
    }

    /**
     * 修改地图图标配置
     * 
     * @param mapIconSet 地图图标配置
     * @return 结果
     */
    @Override
    public int updateMapIconSet(MapIconSet mapIconSet)
    {
        mapIconSet.setUpdateTime(DateUtils.getNowDate());
        return mapIconSetMapper.updateMapIconSet(mapIconSet);
    }

    /**
     * 批量删除地图图标配置
     * 
     * @param ids 需要删除的地图图标配置主键
     * @return 结果
     */
    @Override
    public int deleteMapIconSetByIds(Long[] ids)
    {
        return mapIconSetMapper.deleteMapIconSetByIds(ids);
    }

    /**
     * 删除地图图标配置信息
     * 
     * @param id 地图图标配置主键
     * @return 结果
     */
    @Override
    public int deleteMapIconSetById(Long id)
    {
        return mapIconSetMapper.deleteMapIconSetById(id);
    }
}
