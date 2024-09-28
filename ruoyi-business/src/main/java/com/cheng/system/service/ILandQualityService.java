package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.LandQuality;

/**
 * 耕地质量Service接口
 * 
 * @author cheng
 * @date 2024-09-16
 */
public interface ILandQualityService 
{
    /**
     * 查询耕地质量
     * 
     * @param id 耕地质量主键
     * @return 耕地质量
     */
    public LandQuality selectLandQualityById(Long id);

    /**
     * 查询耕地质量列表
     * 
     * @param landQuality 耕地质量
     * @return 耕地质量集合
     */
    public List<LandQuality> selectLandQualityList(LandQuality landQuality);

    /**
     * 新增耕地质量
     * 
     * @param landQuality 耕地质量
     * @return 结果
     */
    public int insertLandQuality(LandQuality landQuality);

    /**
     * 修改耕地质量
     * 
     * @param landQuality 耕地质量
     * @return 结果
     */
    public int updateLandQuality(LandQuality landQuality);

    /**
     * 批量删除耕地质量
     * 
     * @param ids 需要删除的耕地质量主键集合
     * @return 结果
     */
    public int deleteLandQualityByIds(Long[] ids);

    /**
     * 删除耕地质量信息
     * 
     * @param id 耕地质量主键
     * @return 结果
     */
    public int deleteLandQualityById(Long id);
}
