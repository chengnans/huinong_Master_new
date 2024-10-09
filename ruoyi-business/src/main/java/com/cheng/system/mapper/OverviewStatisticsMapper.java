package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.OverviewStatistics;

/**
 * 概览统计Mapper接口
 * 
 * @author cheng
 * @date 2024-10-09
 */
public interface OverviewStatisticsMapper 
{
    /**
     * 查询概览统计
     * 
     * @param id 概览统计主键
     * @return 概览统计
     */
    public OverviewStatistics selectOverviewStatisticsById(Long id);

    /**
     * 查询概览统计列表
     * 
     * @param overviewStatistics 概览统计
     * @return 概览统计集合
     */
    public List<OverviewStatistics> selectOverviewStatisticsList(OverviewStatistics overviewStatistics);

    /**
     * 新增概览统计
     * 
     * @param overviewStatistics 概览统计
     * @return 结果
     */
    public int insertOverviewStatistics(OverviewStatistics overviewStatistics);

    /**
     * 修改概览统计
     * 
     * @param overviewStatistics 概览统计
     * @return 结果
     */
    public int updateOverviewStatistics(OverviewStatistics overviewStatistics);

    /**
     * 删除概览统计
     * 
     * @param id 概览统计主键
     * @return 结果
     */
    public int deleteOverviewStatisticsById(Long id);

    /**
     * 批量删除概览统计
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOverviewStatisticsByIds(Long[] ids);
}
