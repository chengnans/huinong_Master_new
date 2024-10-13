package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 员工管理对象 employee_manage
 * 
 * @author cheng
 * @date 2024-10-13
 */
public class EmployeeManage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 登录账号 */
    @Excel(name = "登录账号")
    private String loginAccount;

    /** 登录密码 */
    @Excel(name = "登录密码")
    private String loginPassword;

    /** 确认密码 */
    @Excel(name = "确认密码")
    private String confirmPassword;

    /** 昵称 */
    @Excel(name = "昵称")
    private String nickname;

    /** 所属机构 */
    @Excel(name = "所属机构")
    private String affiliation;

    /** 姓名 */
    @Excel(name = "姓名")
    private String employeeName;

    /** 性别 */
    @Excel(name = "性别")
    private String employeeSex;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String phoneNumber;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String employeeEmail;

    /** 身份证 */
    @Excel(name = "身份证")
    private String idCard;

    /** 所在部门 */
    @Excel(name = "所在部门")
    private String apartment;

    /** 职位 */
    @Excel(name = "职位")
    private String employeePosts;

    /** 区域级别 */
    @Excel(name = "区域级别")
    private String regionallevel;

    /** 所属区域 */
    @Excel(name = "所属区域")
    private String region;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String remarksinformation;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setLoginAccount(String loginAccount) 
    {
        this.loginAccount = loginAccount;
    }

    public String getLoginAccount() 
    {
        return loginAccount;
    }
    public void setLoginPassword(String loginPassword) 
    {
        this.loginPassword = loginPassword;
    }

    public String getLoginPassword() 
    {
        return loginPassword;
    }
    public void setConfirmPassword(String confirmPassword) 
    {
        this.confirmPassword = confirmPassword;
    }

    public String getConfirmPassword() 
    {
        return confirmPassword;
    }
    public void setNickname(String nickname) 
    {
        this.nickname = nickname;
    }

    public String getNickname() 
    {
        return nickname;
    }
    public void setAffiliation(String affiliation) 
    {
        this.affiliation = affiliation;
    }

    public String getAffiliation() 
    {
        return affiliation;
    }
    public void setEmployeeName(String employeeName) 
    {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() 
    {
        return employeeName;
    }
    public void setEmployeeSex(String employeeSex) 
    {
        this.employeeSex = employeeSex;
    }

    public String getEmployeeSex() 
    {
        return employeeSex;
    }
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }
    public void setEmployeeEmail(String employeeEmail) 
    {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeEmail() 
    {
        return employeeEmail;
    }
    public void setIdCard(String idCard) 
    {
        this.idCard = idCard;
    }

    public String getIdCard() 
    {
        return idCard;
    }
    public void setApartment(String apartment) 
    {
        this.apartment = apartment;
    }

    public String getApartment() 
    {
        return apartment;
    }
    public void setEmployeePosts(String employeePosts) 
    {
        this.employeePosts = employeePosts;
    }

    public String getEmployeePosts() 
    {
        return employeePosts;
    }
    public void setRegionallevel(String regionallevel) 
    {
        this.regionallevel = regionallevel;
    }

    public String getRegionallevel() 
    {
        return regionallevel;
    }
    public void setRegion(String region) 
    {
        this.region = region;
    }

    public String getRegion() 
    {
        return region;
    }
    public void setRemarksinformation(String remarksinformation) 
    {
        this.remarksinformation = remarksinformation;
    }

    public String getRemarksinformation() 
    {
        return remarksinformation;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("loginAccount", getLoginAccount())
            .append("loginPassword", getLoginPassword())
            .append("confirmPassword", getConfirmPassword())
            .append("nickname", getNickname())
            .append("affiliation", getAffiliation())
            .append("employeeName", getEmployeeName())
            .append("employeeSex", getEmployeeSex())
            .append("phoneNumber", getPhoneNumber())
            .append("employeeEmail", getEmployeeEmail())
            .append("idCard", getIdCard())
            .append("apartment", getApartment())
            .append("employeePosts", getEmployeePosts())
            .append("regionallevel", getRegionallevel())
            .append("region", getRegion())
            .append("remarksinformation", getRemarksinformation())
            .append("createTime", getCreateTime())
            .toString();
    }
}
