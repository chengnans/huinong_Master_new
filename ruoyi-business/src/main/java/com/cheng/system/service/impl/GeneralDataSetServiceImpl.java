package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.GeneralDataSetMapper;
import com.cheng.system.domain.GeneralDataSet;
import com.cheng.system.service.IGeneralDataSetService;

/**
 * 通用数据配置Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-12
 */
@Service
public class GeneralDataSetServiceImpl implements IGeneralDataSetService 
{
    @Autowired
    private GeneralDataSetMapper generalDataSetMapper;

    /**
     * 查询通用数据配置
     * 
     * @param id 通用数据配置主键
     * @return 通用数据配置
     */
    @Override
    public GeneralDataSet selectGeneralDataSetById(Long id)
    {
        return generalDataSetMapper.selectGeneralDataSetById(id);
    }

    /**
     * 查询通用数据配置列表
     * 
     * @param generalDataSet 通用数据配置
     * @return 通用数据配置
     */
    @Override
    public List<GeneralDataSet> selectGeneralDataSetList(GeneralDataSet generalDataSet)
    {
        return generalDataSetMapper.selectGeneralDataSetList(generalDataSet);
    }

    /**
     * 新增通用数据配置
     * 
     * @param generalDataSet 通用数据配置
     * @return 结果
     */
    @Override
    public int insertGeneralDataSet(GeneralDataSet generalDataSet)
    {
        generalDataSet.setCreateTime(DateUtils.getNowDate());
        return generalDataSetMapper.insertGeneralDataSet(generalDataSet);
    }

    /**
     * 修改通用数据配置
     * 
     * @param generalDataSet 通用数据配置
     * @return 结果
     */
    @Override
    public int updateGeneralDataSet(GeneralDataSet generalDataSet)
    {
        generalDataSet.setUpdateTime(DateUtils.getNowDate());
        return generalDataSetMapper.updateGeneralDataSet(generalDataSet);
    }

    /**
     * 批量删除通用数据配置
     * 
     * @param ids 需要删除的通用数据配置主键
     * @return 结果
     */
    @Override
    public int deleteGeneralDataSetByIds(Long[] ids)
    {
        return generalDataSetMapper.deleteGeneralDataSetByIds(ids);
    }

    /**
     * 删除通用数据配置信息
     * 
     * @param id 通用数据配置主键
     * @return 结果
     */
    @Override
    public int deleteGeneralDataSetById(Long id)
    {
        return generalDataSetMapper.deleteGeneralDataSetById(id);
    }
}
