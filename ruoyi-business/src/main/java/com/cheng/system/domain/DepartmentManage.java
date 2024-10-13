package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 部门管理对象 department_manage
 * 
 * @author cheng
 * @date 2024-10-13
 */
public class DepartmentManage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 所属机构 */
    @Excel(name = "所属机构")
    private String affiliation;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String departmentName;

    /** 部门描述 */
    @Excel(name = "部门描述")
    private String departmentDescription;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creationTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAffiliation(String affiliation) 
    {
        this.affiliation = affiliation;
    }

    public String getAffiliation() 
    {
        return affiliation;
    }
    public void setDepartmentName(String departmentName) 
    {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() 
    {
        return departmentName;
    }
    public void setDepartmentDescription(String departmentDescription) 
    {
        this.departmentDescription = departmentDescription;
    }

    public String getDepartmentDescription() 
    {
        return departmentDescription;
    }
    public void setCreationTime(Date creationTime) 
    {
        this.creationTime = creationTime;
    }

    public Date getCreationTime() 
    {
        return creationTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("affiliation", getAffiliation())
            .append("departmentName", getDepartmentName())
            .append("departmentDescription", getDepartmentDescription())
            .append("creationTime", getCreationTime())
            .toString();
    }
}
