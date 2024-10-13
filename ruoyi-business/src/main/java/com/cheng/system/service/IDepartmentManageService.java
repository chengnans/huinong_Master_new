package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.DepartmentManage;

/**
 * 部门管理Service接口
 * 
 * @author cheng
 * @date 2024-10-13
 */
public interface IDepartmentManageService 
{
    /**
     * 查询部门管理
     * 
     * @param id 部门管理主键
     * @return 部门管理
     */
    public DepartmentManage selectDepartmentManageById(Long id);

    /**
     * 查询部门管理列表
     * 
     * @param departmentManage 部门管理
     * @return 部门管理集合
     */
    public List<DepartmentManage> selectDepartmentManageList(DepartmentManage departmentManage);

    /**
     * 新增部门管理
     * 
     * @param departmentManage 部门管理
     * @return 结果
     */
    public int insertDepartmentManage(DepartmentManage departmentManage);

    /**
     * 修改部门管理
     * 
     * @param departmentManage 部门管理
     * @return 结果
     */
    public int updateDepartmentManage(DepartmentManage departmentManage);

    /**
     * 批量删除部门管理
     * 
     * @param ids 需要删除的部门管理主键集合
     * @return 结果
     */
    public int deleteDepartmentManageByIds(Long[] ids);

    /**
     * 删除部门管理信息
     * 
     * @param id 部门管理主键
     * @return 结果
     */
    public int deleteDepartmentManageById(Long id);
}
