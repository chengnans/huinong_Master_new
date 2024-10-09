package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.BirthCycle;

/**
 * 生育周期设置Service接口
 * 
 * @author cheng
 * @date 2024-10-09
 */
public interface IBirthCycleService 
{
    /**
     * 查询生育周期设置
     * 
     * @param id 生育周期设置主键
     * @return 生育周期设置
     */
    public BirthCycle selectBirthCycleById(Long id);

    /**
     * 查询生育周期设置列表
     * 
     * @param birthCycle 生育周期设置
     * @return 生育周期设置集合
     */
    public List<BirthCycle> selectBirthCycleList(BirthCycle birthCycle);

    /**
     * 新增生育周期设置
     * 
     * @param birthCycle 生育周期设置
     * @return 结果
     */
    public int insertBirthCycle(BirthCycle birthCycle);

    /**
     * 修改生育周期设置
     * 
     * @param birthCycle 生育周期设置
     * @return 结果
     */
    public int updateBirthCycle(BirthCycle birthCycle);

    /**
     * 批量删除生育周期设置
     * 
     * @param ids 需要删除的生育周期设置主键集合
     * @return 结果
     */
    public int deleteBirthCycleByIds(Long[] ids);

    /**
     * 删除生育周期设置信息
     * 
     * @param id 生育周期设置主键
     * @return 结果
     */
    public int deleteBirthCycleById(Long id);
}
