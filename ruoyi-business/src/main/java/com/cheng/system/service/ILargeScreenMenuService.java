package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.LargeScreenMenu;

/**
 * 大屏菜单管理Service接口
 * 
 * @author cheng
 * @date 2024-10-12
 */
public interface ILargeScreenMenuService 
{
    /**
     * 查询大屏菜单管理
     * 
     * @param id 大屏菜单管理主键
     * @return 大屏菜单管理
     */
    public LargeScreenMenu selectLargeScreenMenuById(Long id);

    /**
     * 查询大屏菜单管理列表
     * 
     * @param largeScreenMenu 大屏菜单管理
     * @return 大屏菜单管理集合
     */
    public List<LargeScreenMenu> selectLargeScreenMenuList(LargeScreenMenu largeScreenMenu);

    /**
     * 新增大屏菜单管理
     * 
     * @param largeScreenMenu 大屏菜单管理
     * @return 结果
     */
    public int insertLargeScreenMenu(LargeScreenMenu largeScreenMenu);

    /**
     * 修改大屏菜单管理
     * 
     * @param largeScreenMenu 大屏菜单管理
     * @return 结果
     */
    public int updateLargeScreenMenu(LargeScreenMenu largeScreenMenu);

    /**
     * 批量删除大屏菜单管理
     * 
     * @param ids 需要删除的大屏菜单管理主键集合
     * @return 结果
     */
    public int deleteLargeScreenMenuByIds(Long[] ids);

    /**
     * 删除大屏菜单管理信息
     * 
     * @param id 大屏菜单管理主键
     * @return 结果
     */
    public int deleteLargeScreenMenuById(Long id);
}
