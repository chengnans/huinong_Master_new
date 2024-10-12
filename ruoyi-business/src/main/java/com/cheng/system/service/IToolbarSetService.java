package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.ToolbarSet;

/**
 * 工具栏配置Service接口
 * 
 * @author cheng
 * @date 2024-10-12
 */
public interface IToolbarSetService 
{
    /**
     * 查询工具栏配置
     * 
     * @param id 工具栏配置主键
     * @return 工具栏配置
     */
    public ToolbarSet selectToolbarSetById(Long id);

    /**
     * 查询工具栏配置列表
     * 
     * @param toolbarSet 工具栏配置
     * @return 工具栏配置集合
     */
    public List<ToolbarSet> selectToolbarSetList(ToolbarSet toolbarSet);

    /**
     * 新增工具栏配置
     * 
     * @param toolbarSet 工具栏配置
     * @return 结果
     */
    public int insertToolbarSet(ToolbarSet toolbarSet);

    /**
     * 修改工具栏配置
     * 
     * @param toolbarSet 工具栏配置
     * @return 结果
     */
    public int updateToolbarSet(ToolbarSet toolbarSet);

    /**
     * 批量删除工具栏配置
     * 
     * @param ids 需要删除的工具栏配置主键集合
     * @return 结果
     */
    public int deleteToolbarSetByIds(Long[] ids);

    /**
     * 删除工具栏配置信息
     * 
     * @param id 工具栏配置主键
     * @return 结果
     */
    public int deleteToolbarSetById(Long id);
}
