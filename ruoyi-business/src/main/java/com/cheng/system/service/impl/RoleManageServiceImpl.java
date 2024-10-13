package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.RoleManageMapper;
import com.cheng.system.domain.RoleManage;
import com.cheng.system.service.IRoleManageService;

/**
 * 角色管理Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-13
 */
@Service
public class RoleManageServiceImpl implements IRoleManageService 
{
    @Autowired
    private RoleManageMapper roleManageMapper;

    /**
     * 查询角色管理
     * 
     * @param id 角色管理主键
     * @return 角色管理
     */
    @Override
    public RoleManage selectRoleManageById(Long id)
    {
        return roleManageMapper.selectRoleManageById(id);
    }

    /**
     * 查询角色管理列表
     * 
     * @param roleManage 角色管理
     * @return 角色管理
     */
    @Override
    public List<RoleManage> selectRoleManageList(RoleManage roleManage)
    {
        return roleManageMapper.selectRoleManageList(roleManage);
    }

    /**
     * 新增角色管理
     * 
     * @param roleManage 角色管理
     * @return 结果
     */
    @Override
    public int insertRoleManage(RoleManage roleManage)
    {
        roleManage.setCreateTime(DateUtils.getNowDate());
        return roleManageMapper.insertRoleManage(roleManage);
    }

    /**
     * 修改角色管理
     * 
     * @param roleManage 角色管理
     * @return 结果
     */
    @Override
    public int updateRoleManage(RoleManage roleManage)
    {
        return roleManageMapper.updateRoleManage(roleManage);
    }

    /**
     * 批量删除角色管理
     * 
     * @param ids 需要删除的角色管理主键
     * @return 结果
     */
    @Override
    public int deleteRoleManageByIds(Long[] ids)
    {
        return roleManageMapper.deleteRoleManageByIds(ids);
    }

    /**
     * 删除角色管理信息
     * 
     * @param id 角色管理主键
     * @return 结果
     */
    @Override
    public int deleteRoleManageById(Long id)
    {
        return roleManageMapper.deleteRoleManageById(id);
    }
}
