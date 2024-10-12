package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.GeneralDataSet;

/**
 * 通用数据配置Service接口
 * 
 * @author cheng
 * @date 2024-10-12
 */
public interface IGeneralDataSetService 
{
    /**
     * 查询通用数据配置
     * 
     * @param id 通用数据配置主键
     * @return 通用数据配置
     */
    public GeneralDataSet selectGeneralDataSetById(Long id);

    /**
     * 查询通用数据配置列表
     * 
     * @param generalDataSet 通用数据配置
     * @return 通用数据配置集合
     */
    public List<GeneralDataSet> selectGeneralDataSetList(GeneralDataSet generalDataSet);

    /**
     * 新增通用数据配置
     * 
     * @param generalDataSet 通用数据配置
     * @return 结果
     */
    public int insertGeneralDataSet(GeneralDataSet generalDataSet);

    /**
     * 修改通用数据配置
     * 
     * @param generalDataSet 通用数据配置
     * @return 结果
     */
    public int updateGeneralDataSet(GeneralDataSet generalDataSet);

    /**
     * 批量删除通用数据配置
     * 
     * @param ids 需要删除的通用数据配置主键集合
     * @return 结果
     */
    public int deleteGeneralDataSetByIds(Long[] ids);

    /**
     * 删除通用数据配置信息
     * 
     * @param id 通用数据配置主键
     * @return 结果
     */
    public int deleteGeneralDataSetById(Long id);
}
