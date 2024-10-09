package com.cheng.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 种植户管理对象 growers
 * 
 * @author cheng
 * @date 2024-10-08
 */
public class Growers extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 种植户分类 */
    @Excel(name = "种植户分类")
    private String classify;

    /** 种植户名称 */
    @Excel(name = "种植户名称")
    private String name;

    /** 种植户头像 */
    @Excel(name = "种植户头像")
    private String photo;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;

    /** 所在地区 */
    @Excel(name = "所在地区")
    private String location;

    /** 详细地址 */
    @Excel(name = "详细地址")
    private String address;

    /** 农业补贴 */
    @Excel(name = "农业补贴")
    private BigDecimal subsidy;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 种植地块 */
    @Excel(name = "种植地块")
    private String planting;

    /** 是否产权所有人 */
    @Excel(name = "是否产权所有人")
    private String own;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setClassify(String classify) 
    {
        this.classify = classify;
    }

    public String getClassify() 
    {
        return classify;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPhoto(String photo) 
    {
        this.photo = photo;
    }

    public String getPhoto() 
    {
        return photo;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setLocation(String location) 
    {
        this.location = location;
    }

    public String getLocation() 
    {
        return location;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setSubsidy(BigDecimal subsidy) 
    {
        this.subsidy = subsidy;
    }

    public BigDecimal getSubsidy() 
    {
        return subsidy;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setPlanting(String planting) 
    {
        this.planting = planting;
    }

    public String getPlanting() 
    {
        return planting;
    }
    public void setOwn(String own) 
    {
        this.own = own;
    }

    public String getOwn() 
    {
        return own;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("classify", getClassify())
            .append("name", getName())
            .append("photo", getPhoto())
            .append("phone", getPhone())
            .append("location", getLocation())
            .append("address", getAddress())
            .append("subsidy", getSubsidy())
            .append("remark", getRemark())
            .append("status", getStatus())
            .append("planting", getPlanting())
            .append("own", getOwn())
            .toString();
    }
}
