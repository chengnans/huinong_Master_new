package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.FarmClassifyMapper;
import com.cheng.system.domain.FarmClassify;
import com.cheng.system.service.IFarmClassifyService;

/**
 * 农事分类Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-09
 */
@Service
public class FarmClassifyServiceImpl implements IFarmClassifyService 
{
    @Autowired
    private FarmClassifyMapper farmClassifyMapper;

    /**
     * 查询农事分类
     * 
     * @param id 农事分类主键
     * @return 农事分类
     */
    @Override
    public FarmClassify selectFarmClassifyById(Long id)
    {
        return farmClassifyMapper.selectFarmClassifyById(id);
    }

    /**
     * 查询农事分类列表
     * 
     * @param farmClassify 农事分类
     * @return 农事分类
     */
    @Override
    public List<FarmClassify> selectFarmClassifyList(FarmClassify farmClassify)
    {
        return farmClassifyMapper.selectFarmClassifyList(farmClassify);
    }

    /**
     * 新增农事分类
     * 
     * @param farmClassify 农事分类
     * @return 结果
     */
    @Override
    public int insertFarmClassify(FarmClassify farmClassify)
    {
        farmClassify.setCreateTime(DateUtils.getNowDate());
        return farmClassifyMapper.insertFarmClassify(farmClassify);
    }

    /**
     * 修改农事分类
     * 
     * @param farmClassify 农事分类
     * @return 结果
     */
    @Override
    public int updateFarmClassify(FarmClassify farmClassify)
    {
        return farmClassifyMapper.updateFarmClassify(farmClassify);
    }

    /**
     * 批量删除农事分类
     * 
     * @param ids 需要删除的农事分类主键
     * @return 结果
     */
    @Override
    public int deleteFarmClassifyByIds(Long[] ids)
    {
        return farmClassifyMapper.deleteFarmClassifyByIds(ids);
    }

    /**
     * 删除农事分类信息
     * 
     * @param id 农事分类主键
     * @return 结果
     */
    @Override
    public int deleteFarmClassifyById(Long id)
    {
        return farmClassifyMapper.deleteFarmClassifyById(id);
    }
}
