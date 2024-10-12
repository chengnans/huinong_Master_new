package com.cheng.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设施列表对象 facility_list
 * 
 * @author cheng
 * @date 2024-10-12
 */
public class FacilityList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 系统编号 */
    @Excel(name = "系统编号")
    private String systemId;

    /** 设施编号 */
    @Excel(name = "设施编号")
    private String facilityId;

    /** 设施名称 */
    @Excel(name = "设施名称")
    private String facilityName;

    /** 设施类型 */
    @Excel(name = "设施类型")
    private String facilityType;

    /** 长 */
    @Excel(name = "长")
    private BigDecimal facilityLong;

    /** 宽 */
    @Excel(name = "宽")
    private BigDecimal facilityWidth;

    /** 高 */
    @Excel(name = "高")
    private BigDecimal facilityTall;

    /** 备注 */
    @Excel(name = "备注")
    private String detail;

    /** 机构名称 */
    @Excel(name = "机构名称")
    private String organizationName;

    /** 监管单位 */
    @Excel(name = "监管单位")
    private String monitor;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;

    /** 联系人 */
    @Excel(name = "联系人")
    private String contact;

    /** 操作人 */
    @Excel(name = "操作人")
    private String operator;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date operatingTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSystemId(String systemId) 
    {
        this.systemId = systemId;
    }

    public String getSystemId() 
    {
        return systemId;
    }
    public void setFacilityId(String facilityId) 
    {
        this.facilityId = facilityId;
    }

    public String getFacilityId() 
    {
        return facilityId;
    }
    public void setFacilityName(String facilityName) 
    {
        this.facilityName = facilityName;
    }

    public String getFacilityName() 
    {
        return facilityName;
    }
    public void setFacilityType(String facilityType) 
    {
        this.facilityType = facilityType;
    }

    public String getFacilityType() 
    {
        return facilityType;
    }
    public void setFacilityLong(BigDecimal facilityLong) 
    {
        this.facilityLong = facilityLong;
    }

    public BigDecimal getFacilityLong() 
    {
        return facilityLong;
    }
    public void setFacilityWidth(BigDecimal facilityWidth) 
    {
        this.facilityWidth = facilityWidth;
    }

    public BigDecimal getFacilityWidth() 
    {
        return facilityWidth;
    }
    public void setFacilityTall(BigDecimal facilityTall) 
    {
        this.facilityTall = facilityTall;
    }

    public BigDecimal getFacilityTall() 
    {
        return facilityTall;
    }
    public void setDetail(String detail) 
    {
        this.detail = detail;
    }

    public String getDetail() 
    {
        return detail;
    }
    public void setOrganizationName(String organizationName) 
    {
        this.organizationName = organizationName;
    }

    public String getOrganizationName() 
    {
        return organizationName;
    }
    public void setMonitor(String monitor) 
    {
        this.monitor = monitor;
    }

    public String getMonitor() 
    {
        return monitor;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setContact(String contact) 
    {
        this.contact = contact;
    }

    public String getContact() 
    {
        return contact;
    }
    public void setOperator(String operator) 
    {
        this.operator = operator;
    }

    public String getOperator() 
    {
        return operator;
    }
    public void setOperatingTime(Date operatingTime) 
    {
        this.operatingTime = operatingTime;
    }

    public Date getOperatingTime() 
    {
        return operatingTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("systemId", getSystemId())
            .append("facilityId", getFacilityId())
            .append("facilityName", getFacilityName())
            .append("facilityType", getFacilityType())
            .append("facilityLong", getFacilityLong())
            .append("facilityWidth", getFacilityWidth())
            .append("facilityTall", getFacilityTall())
            .append("detail", getDetail())
            .append("organizationName", getOrganizationName())
            .append("monitor", getMonitor())
            .append("phone", getPhone())
            .append("contact", getContact())
            .append("operator", getOperator())
            .append("operatingTime", getOperatingTime())
            .toString();
    }
}
