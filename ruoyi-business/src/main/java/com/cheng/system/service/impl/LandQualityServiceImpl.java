package com.cheng.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.LandQualityMapper;
import com.cheng.system.domain.LandQuality;
import com.cheng.system.service.ILandQualityService;

/**
 * 耕地质量Service业务层处理
 * 
 * @author cheng
 * @date 2024-09-16
 */
@Service
public class LandQualityServiceImpl implements ILandQualityService 
{
    @Autowired
    private LandQualityMapper landQualityMapper;

    /**
     * 查询耕地质量
     * 
     * @param id 耕地质量主键
     * @return 耕地质量
     */
    @Override
    public LandQuality selectLandQualityById(Long id)
    {
        return landQualityMapper.selectLandQualityById(id);
    }

    /**
     * 查询耕地质量列表
     * 
     * @param landQuality 耕地质量
     * @return 耕地质量
     */
    @Override
    public List<LandQuality> selectLandQualityList(LandQuality landQuality)
    {
        return landQualityMapper.selectLandQualityList(landQuality);
    }

    /**
     * 新增耕地质量
     * 
     * @param landQuality 耕地质量
     * @return 结果
     */
    @Override
    public int insertLandQuality(LandQuality landQuality)
    {
        return landQualityMapper.insertLandQuality(landQuality);
    }

    /**
     * 修改耕地质量
     * 
     * @param landQuality 耕地质量
     * @return 结果
     */
    @Override
    public int updateLandQuality(LandQuality landQuality)
    {
        return landQualityMapper.updateLandQuality(landQuality);
    }

    /**
     * 批量删除耕地质量
     * 
     * @param ids 需要删除的耕地质量主键
     * @return 结果
     */
    @Override
    public int deleteLandQualityByIds(Long[] ids)
    {
        return landQualityMapper.deleteLandQualityByIds(ids);
    }

    /**
     * 删除耕地质量信息
     * 
     * @param id 耕地质量主键
     * @return 结果
     */
    @Override
    public int deleteLandQualityById(Long id)
    {
        return landQualityMapper.deleteLandQualityById(id);
    }
}
