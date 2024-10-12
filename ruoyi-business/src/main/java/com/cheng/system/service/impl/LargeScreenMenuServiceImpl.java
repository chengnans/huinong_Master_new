package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.LargeScreenMenuMapper;
import com.cheng.system.domain.LargeScreenMenu;
import com.cheng.system.service.ILargeScreenMenuService;

/**
 * 大屏菜单管理Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-12
 */
@Service
public class LargeScreenMenuServiceImpl implements ILargeScreenMenuService 
{
    @Autowired
    private LargeScreenMenuMapper largeScreenMenuMapper;

    /**
     * 查询大屏菜单管理
     * 
     * @param id 大屏菜单管理主键
     * @return 大屏菜单管理
     */
    @Override
    public LargeScreenMenu selectLargeScreenMenuById(Long id)
    {
        return largeScreenMenuMapper.selectLargeScreenMenuById(id);
    }

    /**
     * 查询大屏菜单管理列表
     * 
     * @param largeScreenMenu 大屏菜单管理
     * @return 大屏菜单管理
     */
    @Override
    public List<LargeScreenMenu> selectLargeScreenMenuList(LargeScreenMenu largeScreenMenu)
    {
        return largeScreenMenuMapper.selectLargeScreenMenuList(largeScreenMenu);
    }

    /**
     * 新增大屏菜单管理
     * 
     * @param largeScreenMenu 大屏菜单管理
     * @return 结果
     */
    @Override
    public int insertLargeScreenMenu(LargeScreenMenu largeScreenMenu)
    {
        largeScreenMenu.setCreateTime(DateUtils.getNowDate());
        return largeScreenMenuMapper.insertLargeScreenMenu(largeScreenMenu);
    }

    /**
     * 修改大屏菜单管理
     * 
     * @param largeScreenMenu 大屏菜单管理
     * @return 结果
     */
    @Override
    public int updateLargeScreenMenu(LargeScreenMenu largeScreenMenu)
    {
        return largeScreenMenuMapper.updateLargeScreenMenu(largeScreenMenu);
    }

    /**
     * 批量删除大屏菜单管理
     * 
     * @param ids 需要删除的大屏菜单管理主键
     * @return 结果
     */
    @Override
    public int deleteLargeScreenMenuByIds(Long[] ids)
    {
        return largeScreenMenuMapper.deleteLargeScreenMenuByIds(ids);
    }

    /**
     * 删除大屏菜单管理信息
     * 
     * @param id 大屏菜单管理主键
     * @return 结果
     */
    @Override
    public int deleteLargeScreenMenuById(Long id)
    {
        return largeScreenMenuMapper.deleteLargeScreenMenuById(id);
    }
}
