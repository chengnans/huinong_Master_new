package com.cheng.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.OverviewStatisticsMapper;
import com.cheng.system.domain.OverviewStatistics;
import com.cheng.system.service.IOverviewStatisticsService;

/**
 * 概览统计Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-09
 */
@Service
public class OverviewStatisticsServiceImpl implements IOverviewStatisticsService 
{
    @Autowired
    private OverviewStatisticsMapper overviewStatisticsMapper;

    /**
     * 查询概览统计
     * 
     * @param id 概览统计主键
     * @return 概览统计
     */
    @Override
    public OverviewStatistics selectOverviewStatisticsById(Long id)
    {
        return overviewStatisticsMapper.selectOverviewStatisticsById(id);
    }

    /**
     * 查询概览统计列表
     * 
     * @param overviewStatistics 概览统计
     * @return 概览统计
     */
    @Override
    public List<OverviewStatistics> selectOverviewStatisticsList(OverviewStatistics overviewStatistics)
    {
        return overviewStatisticsMapper.selectOverviewStatisticsList(overviewStatistics);
    }

    /**
     * 新增概览统计
     * 
     * @param overviewStatistics 概览统计
     * @return 结果
     */
    @Override
    public int insertOverviewStatistics(OverviewStatistics overviewStatistics)
    {
        return overviewStatisticsMapper.insertOverviewStatistics(overviewStatistics);
    }

    /**
     * 修改概览统计
     * 
     * @param overviewStatistics 概览统计
     * @return 结果
     */
    @Override
    public int updateOverviewStatistics(OverviewStatistics overviewStatistics)
    {
        return overviewStatisticsMapper.updateOverviewStatistics(overviewStatistics);
    }

    /**
     * 批量删除概览统计
     * 
     * @param ids 需要删除的概览统计主键
     * @return 结果
     */
    @Override
    public int deleteOverviewStatisticsByIds(Long[] ids)
    {
        return overviewStatisticsMapper.deleteOverviewStatisticsByIds(ids);
    }

    /**
     * 删除概览统计信息
     * 
     * @param id 概览统计主键
     * @return 结果
     */
    @Override
    public int deleteOverviewStatisticsById(Long id)
    {
        return overviewStatisticsMapper.deleteOverviewStatisticsById(id);
    }
}
