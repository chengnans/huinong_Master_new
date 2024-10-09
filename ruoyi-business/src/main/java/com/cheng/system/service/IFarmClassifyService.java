package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.FarmClassify;

/**
 * 农事分类Service接口
 * 
 * @author cheng
 * @date 2024-10-09
 */
public interface IFarmClassifyService 
{
    /**
     * 查询农事分类
     * 
     * @param id 农事分类主键
     * @return 农事分类
     */
    public FarmClassify selectFarmClassifyById(Long id);

    /**
     * 查询农事分类列表
     * 
     * @param farmClassify 农事分类
     * @return 农事分类集合
     */
    public List<FarmClassify> selectFarmClassifyList(FarmClassify farmClassify);

    /**
     * 新增农事分类
     * 
     * @param farmClassify 农事分类
     * @return 结果
     */
    public int insertFarmClassify(FarmClassify farmClassify);

    /**
     * 修改农事分类
     * 
     * @param farmClassify 农事分类
     * @return 结果
     */
    public int updateFarmClassify(FarmClassify farmClassify);

    /**
     * 批量删除农事分类
     * 
     * @param ids 需要删除的农事分类主键集合
     * @return 结果
     */
    public int deleteFarmClassifyByIds(Long[] ids);

    /**
     * 删除农事分类信息
     * 
     * @param id 农事分类主键
     * @return 结果
     */
    public int deleteFarmClassifyById(Long id);
}
