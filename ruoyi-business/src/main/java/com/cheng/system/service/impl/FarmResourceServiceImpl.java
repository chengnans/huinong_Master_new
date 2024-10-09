package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.FarmResourceMapper;
import com.cheng.system.domain.FarmResource;
import com.cheng.system.service.IFarmResourceService;

/**
 * 农资管理Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-09
 */
@Service
public class FarmResourceServiceImpl implements IFarmResourceService 
{
    @Autowired
    private FarmResourceMapper farmResourceMapper;

    /**
     * 查询农资管理
     * 
     * @param id 农资管理主键
     * @return 农资管理
     */
    @Override
    public FarmResource selectFarmResourceById(Long id)
    {
        return farmResourceMapper.selectFarmResourceById(id);
    }

    /**
     * 查询农资管理列表
     * 
     * @param farmResource 农资管理
     * @return 农资管理
     */
    @Override
    public List<FarmResource> selectFarmResourceList(FarmResource farmResource)
    {
        return farmResourceMapper.selectFarmResourceList(farmResource);
    }

    /**
     * 新增农资管理
     * 
     * @param farmResource 农资管理
     * @return 结果
     */
    @Override
    public int insertFarmResource(FarmResource farmResource)
    {
        farmResource.setCreateTime(DateUtils.getNowDate());
        return farmResourceMapper.insertFarmResource(farmResource);
    }

    /**
     * 修改农资管理
     * 
     * @param farmResource 农资管理
     * @return 结果
     */
    @Override
    public int updateFarmResource(FarmResource farmResource)
    {
        return farmResourceMapper.updateFarmResource(farmResource);
    }

    /**
     * 批量删除农资管理
     * 
     * @param ids 需要删除的农资管理主键
     * @return 结果
     */
    @Override
    public int deleteFarmResourceByIds(Long[] ids)
    {
        return farmResourceMapper.deleteFarmResourceByIds(ids);
    }

    /**
     * 删除农资管理信息
     * 
     * @param id 农资管理主键
     * @return 结果
     */
    @Override
    public int deleteFarmResourceById(Long id)
    {
        return farmResourceMapper.deleteFarmResourceById(id);
    }
}
