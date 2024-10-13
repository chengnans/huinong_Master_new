package com.cheng.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.DepartmentManageMapper;
import com.cheng.system.domain.DepartmentManage;
import com.cheng.system.service.IDepartmentManageService;

/**
 * 部门管理Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-13
 */
@Service
public class DepartmentManageServiceImpl implements IDepartmentManageService 
{
    @Autowired
    private DepartmentManageMapper departmentManageMapper;

    /**
     * 查询部门管理
     * 
     * @param id 部门管理主键
     * @return 部门管理
     */
    @Override
    public DepartmentManage selectDepartmentManageById(Long id)
    {
        return departmentManageMapper.selectDepartmentManageById(id);
    }

    /**
     * 查询部门管理列表
     * 
     * @param departmentManage 部门管理
     * @return 部门管理
     */
    @Override
    public List<DepartmentManage> selectDepartmentManageList(DepartmentManage departmentManage)
    {
        return departmentManageMapper.selectDepartmentManageList(departmentManage);
    }

    /**
     * 新增部门管理
     * 
     * @param departmentManage 部门管理
     * @return 结果
     */
    @Override
    public int insertDepartmentManage(DepartmentManage departmentManage)
    {
        return departmentManageMapper.insertDepartmentManage(departmentManage);
    }

    /**
     * 修改部门管理
     * 
     * @param departmentManage 部门管理
     * @return 结果
     */
    @Override
    public int updateDepartmentManage(DepartmentManage departmentManage)
    {
        return departmentManageMapper.updateDepartmentManage(departmentManage);
    }

    /**
     * 批量删除部门管理
     * 
     * @param ids 需要删除的部门管理主键
     * @return 结果
     */
    @Override
    public int deleteDepartmentManageByIds(Long[] ids)
    {
        return departmentManageMapper.deleteDepartmentManageByIds(ids);
    }

    /**
     * 删除部门管理信息
     * 
     * @param id 部门管理主键
     * @return 结果
     */
    @Override
    public int deleteDepartmentManageById(Long id)
    {
        return departmentManageMapper.deleteDepartmentManageById(id);
    }
}
