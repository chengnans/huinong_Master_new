package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.EmployeeManage;

/**
 * 员工管理Mapper接口
 * 
 * @author cheng
 * @date 2024-10-13
 */
public interface EmployeeManageMapper 
{
    /**
     * 查询员工管理
     * 
     * @param id 员工管理主键
     * @return 员工管理
     */
    public EmployeeManage selectEmployeeManageById(Long id);

    /**
     * 查询员工管理列表
     * 
     * @param employeeManage 员工管理
     * @return 员工管理集合
     */
    public List<EmployeeManage> selectEmployeeManageList(EmployeeManage employeeManage);

    /**
     * 新增员工管理
     * 
     * @param employeeManage 员工管理
     * @return 结果
     */
    public int insertEmployeeManage(EmployeeManage employeeManage);

    /**
     * 修改员工管理
     * 
     * @param employeeManage 员工管理
     * @return 结果
     */
    public int updateEmployeeManage(EmployeeManage employeeManage);

    /**
     * 删除员工管理
     * 
     * @param id 员工管理主键
     * @return 结果
     */
    public int deleteEmployeeManageById(Long id);

    /**
     * 批量删除员工管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEmployeeManageByIds(Long[] ids);
}
