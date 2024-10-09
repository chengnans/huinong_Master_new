package com.cheng.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.AgriculturalClassificationMapper;
import com.cheng.system.domain.AgriculturalClassification;
import com.cheng.system.service.IAgriculturalClassificationService;

/**
 * 农业分类设置Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-09
 */
@Service
public class AgriculturalClassificationServiceImpl implements IAgriculturalClassificationService 
{
    @Autowired
    private AgriculturalClassificationMapper agriculturalClassificationMapper;

    /**
     * 查询农业分类设置
     * 
     * @param id 农业分类设置主键
     * @return 农业分类设置
     */
    @Override
    public AgriculturalClassification selectAgriculturalClassificationById(Long id)
    {
        return agriculturalClassificationMapper.selectAgriculturalClassificationById(id);
    }

    /**
     * 查询农业分类设置列表
     * 
     * @param agriculturalClassification 农业分类设置
     * @return 农业分类设置
     */
    @Override
    public List<AgriculturalClassification> selectAgriculturalClassificationList(AgriculturalClassification agriculturalClassification)
    {
        return agriculturalClassificationMapper.selectAgriculturalClassificationList(agriculturalClassification);
    }

    /**
     * 新增农业分类设置
     * 
     * @param agriculturalClassification 农业分类设置
     * @return 结果
     */
    @Override
    public int insertAgriculturalClassification(AgriculturalClassification agriculturalClassification)
    {
        return agriculturalClassificationMapper.insertAgriculturalClassification(agriculturalClassification);
    }

    /**
     * 修改农业分类设置
     * 
     * @param agriculturalClassification 农业分类设置
     * @return 结果
     */
    @Override
    public int updateAgriculturalClassification(AgriculturalClassification agriculturalClassification)
    {
        return agriculturalClassificationMapper.updateAgriculturalClassification(agriculturalClassification);
    }

    /**
     * 批量删除农业分类设置
     * 
     * @param ids 需要删除的农业分类设置主键
     * @return 结果
     */
    @Override
    public int deleteAgriculturalClassificationByIds(Long[] ids)
    {
        return agriculturalClassificationMapper.deleteAgriculturalClassificationByIds(ids);
    }

    /**
     * 删除农业分类设置信息
     * 
     * @param id 农业分类设置主键
     * @return 结果
     */
    @Override
    public int deleteAgriculturalClassificationById(Long id)
    {
        return agriculturalClassificationMapper.deleteAgriculturalClassificationById(id);
    }
}
