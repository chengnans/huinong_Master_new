package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.FarmClassify1Mapper;
import com.cheng.system.domain.FarmClassify1;
import com.cheng.system.service.IFarmClassify1Service;

/**
 * 农事分类设置Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-11
 */
@Service
public class FarmClassify1ServiceImpl implements IFarmClassify1Service 
{
    @Autowired
    private FarmClassify1Mapper farmClassify1Mapper;

    /**
     * 查询农事分类设置
     * 
     * @param id 农事分类设置主键
     * @return 农事分类设置
     */
    @Override
    public FarmClassify1 selectFarmClassify1ById(Long id)
    {
        return farmClassify1Mapper.selectFarmClassify1ById(id);
    }

    /**
     * 查询农事分类设置列表
     * 
     * @param farmClassify1 农事分类设置
     * @return 农事分类设置
     */
    @Override
    public List<FarmClassify1> selectFarmClassify1List(FarmClassify1 farmClassify1)
    {
        return farmClassify1Mapper.selectFarmClassify1List(farmClassify1);
    }

    /**
     * 新增农事分类设置
     * 
     * @param farmClassify1 农事分类设置
     * @return 结果
     */
    @Override
    public int insertFarmClassify1(FarmClassify1 farmClassify1)
    {
        farmClassify1.setCreateTime(DateUtils.getNowDate());
        return farmClassify1Mapper.insertFarmClassify1(farmClassify1);
    }

    /**
     * 修改农事分类设置
     * 
     * @param farmClassify1 农事分类设置
     * @return 结果
     */
    @Override
    public int updateFarmClassify1(FarmClassify1 farmClassify1)
    {
        return farmClassify1Mapper.updateFarmClassify1(farmClassify1);
    }

    /**
     * 批量删除农事分类设置
     * 
     * @param ids 需要删除的农事分类设置主键
     * @return 结果
     */
    @Override
    public int deleteFarmClassify1ByIds(Long[] ids)
    {
        return farmClassify1Mapper.deleteFarmClassify1ByIds(ids);
    }

    /**
     * 删除农事分类设置信息
     * 
     * @param id 农事分类设置主键
     * @return 结果
     */
    @Override
    public int deleteFarmClassify1ById(Long id)
    {
        return farmClassify1Mapper.deleteFarmClassify1ById(id);
    }
}
