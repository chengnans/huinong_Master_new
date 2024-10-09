package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.GrowCycle;

/**
 * 生长周期识别Mapper接口
 * 
 * @author cheng
 * @date 2024-10-09
 */
public interface GrowCycleMapper 
{
    /**
     * 查询生长周期识别
     * 
     * @param id 生长周期识别主键
     * @return 生长周期识别
     */
    public GrowCycle selectGrowCycleById(Long id);

    /**
     * 查询生长周期识别列表
     * 
     * @param growCycle 生长周期识别
     * @return 生长周期识别集合
     */
    public List<GrowCycle> selectGrowCycleList(GrowCycle growCycle);

    /**
     * 新增生长周期识别
     * 
     * @param growCycle 生长周期识别
     * @return 结果
     */
    public int insertGrowCycle(GrowCycle growCycle);

    /**
     * 修改生长周期识别
     * 
     * @param growCycle 生长周期识别
     * @return 结果
     */
    public int updateGrowCycle(GrowCycle growCycle);

    /**
     * 删除生长周期识别
     * 
     * @param id 生长周期识别主键
     * @return 结果
     */
    public int deleteGrowCycleById(Long id);

    /**
     * 批量删除生长周期识别
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGrowCycleByIds(Long[] ids);
}
