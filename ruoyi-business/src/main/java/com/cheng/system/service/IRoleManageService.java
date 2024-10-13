package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.RoleManage;

/**
 * 角色管理Service接口
 * 
 * @author cheng
 * @date 2024-10-13
 */
public interface IRoleManageService 
{
    /**
     * 查询角色管理
     * 
     * @param id 角色管理主键
     * @return 角色管理
     */
    public RoleManage selectRoleManageById(Long id);

    /**
     * 查询角色管理列表
     * 
     * @param roleManage 角色管理
     * @return 角色管理集合
     */
    public List<RoleManage> selectRoleManageList(RoleManage roleManage);

    /**
     * 新增角色管理
     * 
     * @param roleManage 角色管理
     * @return 结果
     */
    public int insertRoleManage(RoleManage roleManage);

    /**
     * 修改角色管理
     * 
     * @param roleManage 角色管理
     * @return 结果
     */
    public int updateRoleManage(RoleManage roleManage);

    /**
     * 批量删除角色管理
     * 
     * @param ids 需要删除的角色管理主键集合
     * @return 结果
     */
    public int deleteRoleManageByIds(Long[] ids);

    /**
     * 删除角色管理信息
     * 
     * @param id 角色管理主键
     * @return 结果
     */
    public int deleteRoleManageById(Long id);
}
