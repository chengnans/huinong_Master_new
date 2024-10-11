package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.FarmClassify1;

/**
 * 农事分类设置Service接口
 * 
 * @author cheng
 * @date 2024-10-11
 */
public interface IFarmClassify1Service 
{
    /**
     * 查询农事分类设置
     * 
     * @param id 农事分类设置主键
     * @return 农事分类设置
     */
    public FarmClassify1 selectFarmClassify1ById(Long id);

    /**
     * 查询农事分类设置列表
     * 
     * @param farmClassify1 农事分类设置
     * @return 农事分类设置集合
     */
    public List<FarmClassify1> selectFarmClassify1List(FarmClassify1 farmClassify1);

    /**
     * 新增农事分类设置
     * 
     * @param farmClassify1 农事分类设置
     * @return 结果
     */
    public int insertFarmClassify1(FarmClassify1 farmClassify1);

    /**
     * 修改农事分类设置
     * 
     * @param farmClassify1 农事分类设置
     * @return 结果
     */
    public int updateFarmClassify1(FarmClassify1 farmClassify1);

    /**
     * 批量删除农事分类设置
     * 
     * @param ids 需要删除的农事分类设置主键集合
     * @return 结果
     */
    public int deleteFarmClassify1ByIds(Long[] ids);

    /**
     * 删除农事分类设置信息
     * 
     * @param id 农事分类设置主键
     * @return 结果
     */
    public int deleteFarmClassify1ById(Long id);
}
