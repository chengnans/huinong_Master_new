package com.cheng.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 基地信息对象 digital_base
 * 
 * @author cheng
 * @date 2024-10-08
 */
public class DigitalBase extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 基地名称 */
    @Excel(name = "基地名称")
    private String name;

    /** 基地简称 */
    @Excel(name = "基地简称")
    private String shortName;

    /** 基地面积 */
    @Excel(name = "基地面积")
    private BigDecimal area;

    /** 农业板块 */
    @Excel(name = "农业板块")
    private String classify;

    /** 种植/养殖类型 */
    @Excel(name = "种植/养殖类型")
    private String type;

    /** 所属机构 */
    @Excel(name = "所属机构")
    private String institution;

    /** 所在城市 */
    @Excel(name = "所在城市")
    private String city;

    /** 镇 */
    @Excel(name = "镇")
    private String town;

    /** 村 */
    @Excel(name = "村")
    private String village;

    /** 登记时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "登记时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 联系人 */
    @Excel(name = "联系人")
    private String contacts;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setShortName(String shortName) 
    {
        this.shortName = shortName;
    }

    public String getShortName() 
    {
        return shortName;
    }
    public void setArea(BigDecimal area) 
    {
        this.area = area;
    }

    public BigDecimal getArea() 
    {
        return area;
    }
    public void setClassify(String classify) 
    {
        this.classify = classify;
    }

    public String getClassify() 
    {
        return classify;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setInstitution(String institution) 
    {
        this.institution = institution;
    }

    public String getInstitution() 
    {
        return institution;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }
    public void setTown(String town) 
    {
        this.town = town;
    }

    public String getTown() 
    {
        return town;
    }
    public void setVillage(String village) 
    {
        this.village = village;
    }

    public String getVillage() 
    {
        return village;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }
    public void setContacts(String contacts) 
    {
        this.contacts = contacts;
    }

    public String getContacts() 
    {
        return contacts;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("shortName", getShortName())
            .append("area", getArea())
            .append("classify", getClassify())
            .append("type", getType())
            .append("institution", getInstitution())
            .append("city", getCity())
            .append("town", getTown())
            .append("village", getVillage())
            .append("time", getTime())
            .append("contacts", getContacts())
            .append("phone", getPhone())
            .toString();
    }
}
