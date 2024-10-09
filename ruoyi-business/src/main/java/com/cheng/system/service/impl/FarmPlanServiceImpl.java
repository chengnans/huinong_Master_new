package com.cheng.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.FarmPlanMapper;
import com.cheng.system.domain.FarmPlan;
import com.cheng.system.service.IFarmPlanService;

/**
 * 农事计划Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-09
 */
@Service
public class FarmPlanServiceImpl implements IFarmPlanService 
{
    @Autowired
    private FarmPlanMapper farmPlanMapper;

    /**
     * 查询农事计划
     * 
     * @param id 农事计划主键
     * @return 农事计划
     */
    @Override
    public FarmPlan selectFarmPlanById(Long id)
    {
        return farmPlanMapper.selectFarmPlanById(id);
    }

    /**
     * 查询农事计划列表
     * 
     * @param farmPlan 农事计划
     * @return 农事计划
     */
    @Override
    public List<FarmPlan> selectFarmPlanList(FarmPlan farmPlan)
    {
        return farmPlanMapper.selectFarmPlanList(farmPlan);
    }

    /**
     * 新增农事计划
     * 
     * @param farmPlan 农事计划
     * @return 结果
     */
    @Override
    public int insertFarmPlan(FarmPlan farmPlan)
    {
        return farmPlanMapper.insertFarmPlan(farmPlan);
    }

    /**
     * 修改农事计划
     * 
     * @param farmPlan 农事计划
     * @return 结果
     */
    @Override
    public int updateFarmPlan(FarmPlan farmPlan)
    {
        return farmPlanMapper.updateFarmPlan(farmPlan);
    }

    /**
     * 批量删除农事计划
     * 
     * @param ids 需要删除的农事计划主键
     * @return 结果
     */
    @Override
    public int deleteFarmPlanByIds(Long[] ids)
    {
        return farmPlanMapper.deleteFarmPlanByIds(ids);
    }

    /**
     * 删除农事计划信息
     * 
     * @param id 农事计划主键
     * @return 结果
     */
    @Override
    public int deleteFarmPlanById(Long id)
    {
        return farmPlanMapper.deleteFarmPlanById(id);
    }
}
