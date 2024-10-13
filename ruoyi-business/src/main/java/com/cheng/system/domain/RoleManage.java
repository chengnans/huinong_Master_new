package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 角色管理对象 role_manage
 * 
 * @author cheng
 * @date 2024-10-13
 */
public class RoleManage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 选择机构 */
    @Excel(name = "选择机构")
    private String institution;

    /** 角色名称 */
    @Excel(name = "角色名称")
    private String roleName;

    /** 角色描述 */
    @Excel(name = "角色描述")
    private String roleDescription;

    /** 菜单操作权限 */
    @Excel(name = "菜单操作权限")
    private String operationPermission;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setInstitution(String institution) 
    {
        this.institution = institution;
    }

    public String getInstitution() 
    {
        return institution;
    }
    public void setRoleName(String roleName) 
    {
        this.roleName = roleName;
    }

    public String getRoleName() 
    {
        return roleName;
    }
    public void setRoleDescription(String roleDescription) 
    {
        this.roleDescription = roleDescription;
    }

    public String getRoleDescription() 
    {
        return roleDescription;
    }
    public void setOperationPermission(String operationPermission) 
    {
        this.operationPermission = operationPermission;
    }

    public String getOperationPermission() 
    {
        return operationPermission;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("institution", getInstitution())
            .append("roleName", getRoleName())
            .append("roleDescription", getRoleDescription())
            .append("operationPermission", getOperationPermission())
            .append("createTime", getCreateTime())
            .toString();
    }
}
