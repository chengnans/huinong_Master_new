package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.LargeScreenSet;

/**
 * 大屏基础设置Service接口
 * 
 * @author cheng
 * @date 2024-10-12
 */
public interface ILargeScreenSetService 
{
    /**
     * 查询大屏基础设置
     * 
     * @param id 大屏基础设置主键
     * @return 大屏基础设置
     */
    public LargeScreenSet selectLargeScreenSetById(Long id);

    /**
     * 查询大屏基础设置列表
     * 
     * @param largeScreenSet 大屏基础设置
     * @return 大屏基础设置集合
     */
    public List<LargeScreenSet> selectLargeScreenSetList(LargeScreenSet largeScreenSet);

    /**
     * 新增大屏基础设置
     * 
     * @param largeScreenSet 大屏基础设置
     * @return 结果
     */
    public int insertLargeScreenSet(LargeScreenSet largeScreenSet);

    /**
     * 修改大屏基础设置
     * 
     * @param largeScreenSet 大屏基础设置
     * @return 结果
     */
    public int updateLargeScreenSet(LargeScreenSet largeScreenSet);

    /**
     * 批量删除大屏基础设置
     * 
     * @param ids 需要删除的大屏基础设置主键集合
     * @return 结果
     */
    public int deleteLargeScreenSetByIds(Long[] ids);

    /**
     * 删除大屏基础设置信息
     * 
     * @param id 大屏基础设置主键
     * @return 结果
     */
    public int deleteLargeScreenSetById(Long id);
}
