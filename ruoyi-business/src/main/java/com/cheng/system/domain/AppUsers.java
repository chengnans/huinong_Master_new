package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * APP用户对象 app_users
 * 
 * @author cheng
 * @date 2024-10-13
 */
public class AppUsers extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String phone;

    /** 用户昵称 */
    @Excel(name = "用户昵称")
    private String userName;

    /** 用户状态 */
    @Excel(name = "用户状态")
    private String userCondition;

    /** 绑定设备数 */
    @Excel(name = "绑定设备数")
    private String deviceNumber;

    /** 所属机构 */
    @Excel(name = "所属机构")
    private String apartment;

    /** 所在城市 */
    @Excel(name = "所在城市")
    private String city;

    /** 注册时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "注册时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date registerTime;

    /** 上次登录时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上次登录时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastLoginTime;

    /** 用户来源 */
    @Excel(name = "用户来源")
    private String userOrigin;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setUserCondition(String userCondition) 
    {
        this.userCondition = userCondition;
    }

    public String getUserCondition() 
    {
        return userCondition;
    }
    public void setDeviceNumber(String deviceNumber) 
    {
        this.deviceNumber = deviceNumber;
    }

    public String getDeviceNumber() 
    {
        return deviceNumber;
    }
    public void setApartment(String apartment) 
    {
        this.apartment = apartment;
    }

    public String getApartment() 
    {
        return apartment;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }
    public void setRegisterTime(Date registerTime) 
    {
        this.registerTime = registerTime;
    }

    public Date getRegisterTime() 
    {
        return registerTime;
    }
    public void setLastLoginTime(Date lastLoginTime) 
    {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getLastLoginTime() 
    {
        return lastLoginTime;
    }
    public void setUserOrigin(String userOrigin) 
    {
        this.userOrigin = userOrigin;
    }

    public String getUserOrigin() 
    {
        return userOrigin;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("phone", getPhone())
            .append("userName", getUserName())
            .append("userCondition", getUserCondition())
            .append("deviceNumber", getDeviceNumber())
            .append("apartment", getApartment())
            .append("city", getCity())
            .append("registerTime", getRegisterTime())
            .append("lastLoginTime", getLastLoginTime())
            .append("userOrigin", getUserOrigin())
            .toString();
    }
}
