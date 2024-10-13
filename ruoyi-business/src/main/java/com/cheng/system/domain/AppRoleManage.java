package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * APP角色管理对象 app_role_manage
 * 
 * @author cheng
 * @date 2024-10-13
 */
public class AppRoleManage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 角色名称 */
    @Excel(name = "角色名称")
    private String roleName;

    /** 角色描述 */
    @Excel(name = "角色描述")
    private String roleDetail;

    /** 角色类型 */
    @Excel(name = "角色类型")
    private String roleType;

    /** 所属机构 */
    @Excel(name = "所属机构")
    private String apartment;

    /** 当前状态 */
    @Excel(name = "当前状态")
    private String roleCondition;

    /** 排序 */
    @Excel(name = "排序")
    private String roleSorts;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date operateTime;

    /** 操作人 */
    @Excel(name = "操作人")
    private String operator;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setRoleName(String roleName) 
    {
        this.roleName = roleName;
    }

    public String getRoleName() 
    {
        return roleName;
    }
    public void setRoleDetail(String roleDetail) 
    {
        this.roleDetail = roleDetail;
    }

    public String getRoleDetail() 
    {
        return roleDetail;
    }
    public void setRoleType(String roleType) 
    {
        this.roleType = roleType;
    }

    public String getRoleType() 
    {
        return roleType;
    }
    public void setApartment(String apartment) 
    {
        this.apartment = apartment;
    }

    public String getApartment() 
    {
        return apartment;
    }
    public void setRoleCondition(String roleCondition) 
    {
        this.roleCondition = roleCondition;
    }

    public String getRoleCondition() 
    {
        return roleCondition;
    }
    public void setRoleSorts(String roleSorts) 
    {
        this.roleSorts = roleSorts;
    }

    public String getRoleSorts() 
    {
        return roleSorts;
    }
    public void setOperateTime(Date operateTime) 
    {
        this.operateTime = operateTime;
    }

    public Date getOperateTime() 
    {
        return operateTime;
    }
    public void setOperator(String operator) 
    {
        this.operator = operator;
    }

    public String getOperator() 
    {
        return operator;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("roleName", getRoleName())
            .append("roleDetail", getRoleDetail())
            .append("roleType", getRoleType())
            .append("apartment", getApartment())
            .append("roleCondition", getRoleCondition())
            .append("roleSorts", getRoleSorts())
            .append("operateTime", getOperateTime())
            .append("operator", getOperator())
            .toString();
    }
}
