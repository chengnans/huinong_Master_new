package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.GrowCycleMapper;
import com.cheng.system.domain.GrowCycle;
import com.cheng.system.service.IGrowCycleService;

/**
 * 生长周期识别Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-09
 */
@Service
public class GrowCycleServiceImpl implements IGrowCycleService 
{
    @Autowired
    private GrowCycleMapper growCycleMapper;

    /**
     * 查询生长周期识别
     * 
     * @param id 生长周期识别主键
     * @return 生长周期识别
     */
    @Override
    public GrowCycle selectGrowCycleById(Long id)
    {
        return growCycleMapper.selectGrowCycleById(id);
    }

    /**
     * 查询生长周期识别列表
     * 
     * @param growCycle 生长周期识别
     * @return 生长周期识别
     */
    @Override
    public List<GrowCycle> selectGrowCycleList(GrowCycle growCycle)
    {
        return growCycleMapper.selectGrowCycleList(growCycle);
    }

    /**
     * 新增生长周期识别
     * 
     * @param growCycle 生长周期识别
     * @return 结果
     */
    @Override
    public int insertGrowCycle(GrowCycle growCycle)
    {
        growCycle.setCreateTime(DateUtils.getNowDate());
        return growCycleMapper.insertGrowCycle(growCycle);
    }

    /**
     * 修改生长周期识别
     * 
     * @param growCycle 生长周期识别
     * @return 结果
     */
    @Override
    public int updateGrowCycle(GrowCycle growCycle)
    {
        return growCycleMapper.updateGrowCycle(growCycle);
    }

    /**
     * 批量删除生长周期识别
     * 
     * @param ids 需要删除的生长周期识别主键
     * @return 结果
     */
    @Override
    public int deleteGrowCycleByIds(Long[] ids)
    {
        return growCycleMapper.deleteGrowCycleByIds(ids);
    }

    /**
     * 删除生长周期识别信息
     * 
     * @param id 生长周期识别主键
     * @return 结果
     */
    @Override
    public int deleteGrowCycleById(Long id)
    {
        return growCycleMapper.deleteGrowCycleById(id);
    }
}
