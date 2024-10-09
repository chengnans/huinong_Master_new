package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.BirthCycleMapper;
import com.cheng.system.domain.BirthCycle;
import com.cheng.system.service.IBirthCycleService;

/**
 * 生育周期设置Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-09
 */
@Service
public class BirthCycleServiceImpl implements IBirthCycleService 
{
    @Autowired
    private BirthCycleMapper birthCycleMapper;

    /**
     * 查询生育周期设置
     * 
     * @param id 生育周期设置主键
     * @return 生育周期设置
     */
    @Override
    public BirthCycle selectBirthCycleById(Long id)
    {
        return birthCycleMapper.selectBirthCycleById(id);
    }

    /**
     * 查询生育周期设置列表
     * 
     * @param birthCycle 生育周期设置
     * @return 生育周期设置
     */
    @Override
    public List<BirthCycle> selectBirthCycleList(BirthCycle birthCycle)
    {
        return birthCycleMapper.selectBirthCycleList(birthCycle);
    }

    /**
     * 新增生育周期设置
     * 
     * @param birthCycle 生育周期设置
     * @return 结果
     */
    @Override
    public int insertBirthCycle(BirthCycle birthCycle)
    {
        birthCycle.setCreateTime(DateUtils.getNowDate());
        return birthCycleMapper.insertBirthCycle(birthCycle);
    }

    /**
     * 修改生育周期设置
     * 
     * @param birthCycle 生育周期设置
     * @return 结果
     */
    @Override
    public int updateBirthCycle(BirthCycle birthCycle)
    {
        return birthCycleMapper.updateBirthCycle(birthCycle);
    }

    /**
     * 批量删除生育周期设置
     * 
     * @param ids 需要删除的生育周期设置主键
     * @return 结果
     */
    @Override
    public int deleteBirthCycleByIds(Long[] ids)
    {
        return birthCycleMapper.deleteBirthCycleByIds(ids);
    }

    /**
     * 删除生育周期设置信息
     * 
     * @param id 生育周期设置主键
     * @return 结果
     */
    @Override
    public int deleteBirthCycleById(Long id)
    {
        return birthCycleMapper.deleteBirthCycleById(id);
    }
}
