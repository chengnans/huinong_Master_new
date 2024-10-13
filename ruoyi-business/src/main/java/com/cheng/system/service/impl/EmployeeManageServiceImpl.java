package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.EmployeeManageMapper;
import com.cheng.system.domain.EmployeeManage;
import com.cheng.system.service.IEmployeeManageService;

/**
 * 员工管理Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-13
 */
@Service
public class EmployeeManageServiceImpl implements IEmployeeManageService 
{
    @Autowired
    private EmployeeManageMapper employeeManageMapper;

    /**
     * 查询员工管理
     * 
     * @param id 员工管理主键
     * @return 员工管理
     */
    @Override
    public EmployeeManage selectEmployeeManageById(Long id)
    {
        return employeeManageMapper.selectEmployeeManageById(id);
    }

    /**
     * 查询员工管理列表
     * 
     * @param employeeManage 员工管理
     * @return 员工管理
     */
    @Override
    public List<EmployeeManage> selectEmployeeManageList(EmployeeManage employeeManage)
    {
        return employeeManageMapper.selectEmployeeManageList(employeeManage);
    }

    /**
     * 新增员工管理
     * 
     * @param employeeManage 员工管理
     * @return 结果
     */
    @Override
    public int insertEmployeeManage(EmployeeManage employeeManage)
    {
        employeeManage.setCreateTime(DateUtils.getNowDate());
        return employeeManageMapper.insertEmployeeManage(employeeManage);
    }

    /**
     * 修改员工管理
     * 
     * @param employeeManage 员工管理
     * @return 结果
     */
    @Override
    public int updateEmployeeManage(EmployeeManage employeeManage)
    {
        return employeeManageMapper.updateEmployeeManage(employeeManage);
    }

    /**
     * 批量删除员工管理
     * 
     * @param ids 需要删除的员工管理主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeManageByIds(Long[] ids)
    {
        return employeeManageMapper.deleteEmployeeManageByIds(ids);
    }

    /**
     * 删除员工管理信息
     * 
     * @param id 员工管理主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeManageById(Long id)
    {
        return employeeManageMapper.deleteEmployeeManageById(id);
    }
}
