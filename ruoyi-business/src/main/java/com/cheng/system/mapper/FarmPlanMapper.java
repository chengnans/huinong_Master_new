package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.FarmPlan;

/**
 * 农事计划Mapper接口
 * 
 * @author cheng
 * @date 2024-10-09
 */
public interface FarmPlanMapper 
{
    /**
     * 查询农事计划
     * 
     * @param id 农事计划主键
     * @return 农事计划
     */
    public FarmPlan selectFarmPlanById(Long id);

    /**
     * 查询农事计划列表
     * 
     * @param farmPlan 农事计划
     * @return 农事计划集合
     */
    public List<FarmPlan> selectFarmPlanList(FarmPlan farmPlan);

    /**
     * 新增农事计划
     * 
     * @param farmPlan 农事计划
     * @return 结果
     */
    public int insertFarmPlan(FarmPlan farmPlan);

    /**
     * 修改农事计划
     * 
     * @param farmPlan 农事计划
     * @return 结果
     */
    public int updateFarmPlan(FarmPlan farmPlan);

    /**
     * 删除农事计划
     * 
     * @param id 农事计划主键
     * @return 结果
     */
    public int deleteFarmPlanById(Long id);

    /**
     * 批量删除农事计划
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFarmPlanByIds(Long[] ids);
}
