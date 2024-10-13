package com.cheng.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.AppRoleManageMapper;
import com.cheng.system.domain.AppRoleManage;
import com.cheng.system.service.IAppRoleManageService;

/**
 * APP角色管理Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-13
 */
@Service
public class AppRoleManageServiceImpl implements IAppRoleManageService 
{
    @Autowired
    private AppRoleManageMapper appRoleManageMapper;

    /**
     * 查询APP角色管理
     * 
     * @param id APP角色管理主键
     * @return APP角色管理
     */
    @Override
    public AppRoleManage selectAppRoleManageById(Long id)
    {
        return appRoleManageMapper.selectAppRoleManageById(id);
    }

    /**
     * 查询APP角色管理列表
     * 
     * @param appRoleManage APP角色管理
     * @return APP角色管理
     */
    @Override
    public List<AppRoleManage> selectAppRoleManageList(AppRoleManage appRoleManage)
    {
        return appRoleManageMapper.selectAppRoleManageList(appRoleManage);
    }

    /**
     * 新增APP角色管理
     * 
     * @param appRoleManage APP角色管理
     * @return 结果
     */
    @Override
    public int insertAppRoleManage(AppRoleManage appRoleManage)
    {
        return appRoleManageMapper.insertAppRoleManage(appRoleManage);
    }

    /**
     * 修改APP角色管理
     * 
     * @param appRoleManage APP角色管理
     * @return 结果
     */
    @Override
    public int updateAppRoleManage(AppRoleManage appRoleManage)
    {
        return appRoleManageMapper.updateAppRoleManage(appRoleManage);
    }

    /**
     * 批量删除APP角色管理
     * 
     * @param ids 需要删除的APP角色管理主键
     * @return 结果
     */
    @Override
    public int deleteAppRoleManageByIds(Long[] ids)
    {
        return appRoleManageMapper.deleteAppRoleManageByIds(ids);
    }

    /**
     * 删除APP角色管理信息
     * 
     * @param id APP角色管理主键
     * @return 结果
     */
    @Override
    public int deleteAppRoleManageById(Long id)
    {
        return appRoleManageMapper.deleteAppRoleManageById(id);
    }
}
