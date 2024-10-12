package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.LargeScreenSetMapper;
import com.cheng.system.domain.LargeScreenSet;
import com.cheng.system.service.ILargeScreenSetService;

/**
 * 大屏基础设置Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-12
 */
@Service
public class LargeScreenSetServiceImpl implements ILargeScreenSetService 
{
    @Autowired
    private LargeScreenSetMapper largeScreenSetMapper;

    /**
     * 查询大屏基础设置
     * 
     * @param id 大屏基础设置主键
     * @return 大屏基础设置
     */
    @Override
    public LargeScreenSet selectLargeScreenSetById(Long id)
    {
        return largeScreenSetMapper.selectLargeScreenSetById(id);
    }

    /**
     * 查询大屏基础设置列表
     * 
     * @param largeScreenSet 大屏基础设置
     * @return 大屏基础设置
     */
    @Override
    public List<LargeScreenSet> selectLargeScreenSetList(LargeScreenSet largeScreenSet)
    {
        return largeScreenSetMapper.selectLargeScreenSetList(largeScreenSet);
    }

    /**
     * 新增大屏基础设置
     * 
     * @param largeScreenSet 大屏基础设置
     * @return 结果
     */
    @Override
    public int insertLargeScreenSet(LargeScreenSet largeScreenSet)
    {
        largeScreenSet.setCreateTime(DateUtils.getNowDate());
        return largeScreenSetMapper.insertLargeScreenSet(largeScreenSet);
    }

    /**
     * 修改大屏基础设置
     * 
     * @param largeScreenSet 大屏基础设置
     * @return 结果
     */
    @Override
    public int updateLargeScreenSet(LargeScreenSet largeScreenSet)
    {
        return largeScreenSetMapper.updateLargeScreenSet(largeScreenSet);
    }

    /**
     * 批量删除大屏基础设置
     * 
     * @param ids 需要删除的大屏基础设置主键
     * @return 结果
     */
    @Override
    public int deleteLargeScreenSetByIds(Long[] ids)
    {
        return largeScreenSetMapper.deleteLargeScreenSetByIds(ids);
    }

    /**
     * 删除大屏基础设置信息
     * 
     * @param id 大屏基础设置主键
     * @return 结果
     */
    @Override
    public int deleteLargeScreenSetById(Long id)
    {
        return largeScreenSetMapper.deleteLargeScreenSetById(id);
    }
}
