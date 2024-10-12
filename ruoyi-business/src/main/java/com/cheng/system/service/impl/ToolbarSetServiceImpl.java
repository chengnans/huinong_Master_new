package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.ToolbarSetMapper;
import com.cheng.system.domain.ToolbarSet;
import com.cheng.system.service.IToolbarSetService;

/**
 * 工具栏配置Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-12
 */
@Service
public class ToolbarSetServiceImpl implements IToolbarSetService 
{
    @Autowired
    private ToolbarSetMapper toolbarSetMapper;

    /**
     * 查询工具栏配置
     * 
     * @param id 工具栏配置主键
     * @return 工具栏配置
     */
    @Override
    public ToolbarSet selectToolbarSetById(Long id)
    {
        return toolbarSetMapper.selectToolbarSetById(id);
    }

    /**
     * 查询工具栏配置列表
     * 
     * @param toolbarSet 工具栏配置
     * @return 工具栏配置
     */
    @Override
    public List<ToolbarSet> selectToolbarSetList(ToolbarSet toolbarSet)
    {
        return toolbarSetMapper.selectToolbarSetList(toolbarSet);
    }

    /**
     * 新增工具栏配置
     * 
     * @param toolbarSet 工具栏配置
     * @return 结果
     */
    @Override
    public int insertToolbarSet(ToolbarSet toolbarSet)
    {
        toolbarSet.setCreateTime(DateUtils.getNowDate());
        return toolbarSetMapper.insertToolbarSet(toolbarSet);
    }

    /**
     * 修改工具栏配置
     * 
     * @param toolbarSet 工具栏配置
     * @return 结果
     */
    @Override
    public int updateToolbarSet(ToolbarSet toolbarSet)
    {
        return toolbarSetMapper.updateToolbarSet(toolbarSet);
    }

    /**
     * 批量删除工具栏配置
     * 
     * @param ids 需要删除的工具栏配置主键
     * @return 结果
     */
    @Override
    public int deleteToolbarSetByIds(Long[] ids)
    {
        return toolbarSetMapper.deleteToolbarSetByIds(ids);
    }

    /**
     * 删除工具栏配置信息
     * 
     * @param id 工具栏配置主键
     * @return 结果
     */
    @Override
    public int deleteToolbarSetById(Long id)
    {
        return toolbarSetMapper.deleteToolbarSetById(id);
    }
}
