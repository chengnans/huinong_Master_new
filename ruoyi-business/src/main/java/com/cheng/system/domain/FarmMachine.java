package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 农机站点对象 farm_machine
 * 
 * @author cheng
 * @date 2024-10-13
 */
public class FarmMachine extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 站点名称 */
    @Excel(name = "站点名称")
    private String stationName;

    /** 联系人 */
    @Excel(name = "联系人")
    private String contact;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;

    /** 站点地址 */
    @Excel(name = "站点地址")
    private String stationAddr;

    /** 所属机构 */
    @Excel(name = "所属机构")
    private String apartment;

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
    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationName() 
    {
        return stationName;
    }
    public void setContact(String contact) 
    {
        this.contact = contact;
    }

    public String getContact() 
    {
        return contact;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setStationAddr(String stationAddr) 
    {
        this.stationAddr = stationAddr;
    }

    public String getStationAddr() 
    {
        return stationAddr;
    }
    public void setApartment(String apartment) 
    {
        this.apartment = apartment;
    }

    public String getApartment() 
    {
        return apartment;
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
            .append("stationName", getStationName())
            .append("contact", getContact())
            .append("phone", getPhone())
            .append("stationAddr", getStationAddr())
            .append("apartment", getApartment())
            .append("operator", getOperator())
            .append("createTime", getCreateTime())
            .toString();
    }
}
