package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.AgriculturalClassification;

/**
 * 农业分类设置Mapper接口
 * 
 * @author cheng
 * @date 2024-10-09
 */
public interface AgriculturalClassificationMapper 
{
    /**
     * 查询农业分类设置
     * 
     * @param id 农业分类设置主键
     * @return 农业分类设置
     */
    public AgriculturalClassification selectAgriculturalClassificationById(Long id);

    /**
     * 查询农业分类设置列表
     * 
     * @param agriculturalClassification 农业分类设置
     * @return 农业分类设置集合
     */
    public List<AgriculturalClassification> selectAgriculturalClassificationList(AgriculturalClassification agriculturalClassification);

    /**
     * 新增农业分类设置
     * 
     * @param agriculturalClassification 农业分类设置
     * @return 结果
     */
    public int insertAgriculturalClassification(AgriculturalClassification agriculturalClassification);

    /**
     * 修改农业分类设置
     * 
     * @param agriculturalClassification 农业分类设置
     * @return 结果
     */
    public int updateAgriculturalClassification(AgriculturalClassification agriculturalClassification);

    /**
     * 删除农业分类设置
     * 
     * @param id 农业分类设置主键
     * @return 结果
     */
    public int deleteAgriculturalClassificationById(Long id);

    /**
     * 批量删除农业分类设置
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAgriculturalClassificationByIds(Long[] ids);
}
