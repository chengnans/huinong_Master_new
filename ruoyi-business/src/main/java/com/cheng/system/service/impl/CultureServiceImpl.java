package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.CultureMapper;
import com.cheng.system.domain.Culture;
import com.cheng.system.service.ICultureService;

/**
 * 文化融合Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-12
 */
@Service
public class CultureServiceImpl implements ICultureService 
{
    @Autowired
    private CultureMapper cultureMapper;

    /**
     * 查询文化融合
     * 
     * @param id 文化融合主键
     * @return 文化融合
     */
    @Override
    public Culture selectCultureById(Long id)
    {
        return cultureMapper.selectCultureById(id);
    }

    /**
     * 查询文化融合列表
     * 
     * @param culture 文化融合
     * @return 文化融合
     */
    @Override
    public List<Culture> selectCultureList(Culture culture)
    {
        return cultureMapper.selectCultureList(culture);
    }

    /**
     * 新增文化融合
     * 
     * @param culture 文化融合
     * @return 结果
     */
    @Override
    public int insertCulture(Culture culture)
    {
        culture.setCreateTime(DateUtils.getNowDate());
        return cultureMapper.insertCulture(culture);
    }

    /**
     * 修改文化融合
     * 
     * @param culture 文化融合
     * @return 结果
     */
    @Override
    public int updateCulture(Culture culture)
    {
        culture.setUpdateTime(DateUtils.getNowDate());
        return cultureMapper.updateCulture(culture);
    }

    /**
     * 批量删除文化融合
     * 
     * @param ids 需要删除的文化融合主键
     * @return 结果
     */
    @Override
    public int deleteCultureByIds(Long[] ids)
    {
        return cultureMapper.deleteCultureByIds(ids);
    }

    /**
     * 删除文化融合信息
     * 
     * @param id 文化融合主键
     * @return 结果
     */
    @Override
    public int deleteCultureById(Long id)
    {
        return cultureMapper.deleteCultureById(id);
    }
}
