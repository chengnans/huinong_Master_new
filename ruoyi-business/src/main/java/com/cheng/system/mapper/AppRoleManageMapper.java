package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.AppRoleManage;

/**
 * APP角色管理Mapper接口
 * 
 * @author cheng
 * @date 2024-10-13
 */
public interface AppRoleManageMapper 
{
    /**
     * 查询APP角色管理
     * 
     * @param id APP角色管理主键
     * @return APP角色管理
     */
    public AppRoleManage selectAppRoleManageById(Long id);

    /**
     * 查询APP角色管理列表
     * 
     * @param appRoleManage APP角色管理
     * @return APP角色管理集合
     */
    public List<AppRoleManage> selectAppRoleManageList(AppRoleManage appRoleManage);

    /**
     * 新增APP角色管理
     * 
     * @param appRoleManage APP角色管理
     * @return 结果
     */
    public int insertAppRoleManage(AppRoleManage appRoleManage);

    /**
     * 修改APP角色管理
     * 
     * @param appRoleManage APP角色管理
     * @return 结果
     */
    public int updateAppRoleManage(AppRoleManage appRoleManage);

    /**
     * 删除APP角色管理
     * 
     * @param id APP角色管理主键
     * @return 结果
     */
    public int deleteAppRoleManageById(Long id);

    /**
     * 批量删除APP角色管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAppRoleManageByIds(Long[] ids);
}
