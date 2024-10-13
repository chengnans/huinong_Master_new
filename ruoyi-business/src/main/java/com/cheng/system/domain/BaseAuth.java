package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 基地授权对象 base_auth
 * 
 * @author cheng
 * @date 2024-10-13
 */
public class BaseAuth extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 状态 */
    @Excel(name = "状态")
    private String authCondition;

    /** AI农授权 */
    @Excel(name = "AI农授权")
    private String authAi;

    /** 授权机构 */
    @Excel(name = "授权机构")
    private String authDepartment;

    /** 授权时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "授权时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date authTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAuthCondition(String authCondition) 
    {
        this.authCondition = authCondition;
    }

    public String getAuthCondition() 
    {
        return authCondition;
    }
    public void setAuthAi(String authAi) 
    {
        this.authAi = authAi;
    }

    public String getAuthAi() 
    {
        return authAi;
    }
    public void setAuthDepartment(String authDepartment) 
    {
        this.authDepartment = authDepartment;
    }

    public String getAuthDepartment() 
    {
        return authDepartment;
    }
    public void setAuthTime(Date authTime) 
    {
        this.authTime = authTime;
    }

    public Date getAuthTime() 
    {
        return authTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("authCondition", getAuthCondition())
            .append("authAi", getAuthAi())
            .append("authDepartment", getAuthDepartment())
            .append("authTime", getAuthTime())
            .append("createTime", getCreateTime())
            .toString();
    }
}
