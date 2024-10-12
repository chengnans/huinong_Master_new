package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 企业列表对象 enterprise_list
 * 
 * @author cheng
 * @date 2024-10-13
 */
public class EnterpriseList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 企业编号 */
    @Excel(name = "企业编号")
    private String enterpriseId;

    /** 企业名称 */
    @Excel(name = "企业名称")
    private String enterpriseName;

    /** 企业简称 */
    @Excel(name = "企业简称")
    private String enterpriseShortName;

    /** 企业法人 */
    @Excel(name = "企业法人")
    private String enterpriseLegal;

    /** 电话 */
    @Excel(name = "电话")
    private String phone;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 直播主体名称 */
    @Excel(name = "直播主体名称")
    private String liveName;

    /** 企业分组 */
    @Excel(name = "企业分组")
    private String enterpriseClassify;

    /** 所属机构 */
    @Excel(name = "所属机构")
    private String organization;

    /** 当前状态 */
    @Excel(name = "当前状态")
    private String zhuang;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setEnterpriseId(String enterpriseId) 
    {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseId() 
    {
        return enterpriseId;
    }
    public void setEnterpriseName(String enterpriseName) 
    {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterpriseName() 
    {
        return enterpriseName;
    }
    public void setEnterpriseShortName(String enterpriseShortName) 
    {
        this.enterpriseShortName = enterpriseShortName;
    }

    public String getEnterpriseShortName() 
    {
        return enterpriseShortName;
    }
    public void setEnterpriseLegal(String enterpriseLegal) 
    {
        this.enterpriseLegal = enterpriseLegal;
    }

    public String getEnterpriseLegal() 
    {
        return enterpriseLegal;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setLiveName(String liveName) 
    {
        this.liveName = liveName;
    }

    public String getLiveName() 
    {
        return liveName;
    }
    public void setEnterpriseClassify(String enterpriseClassify) 
    {
        this.enterpriseClassify = enterpriseClassify;
    }

    public String getEnterpriseClassify() 
    {
        return enterpriseClassify;
    }
    public void setOrganization(String organization) 
    {
        this.organization = organization;
    }

    public String getOrganization() 
    {
        return organization;
    }
    public void setZhuang(String zhuang) 
    {
        this.zhuang = zhuang;
    }

    public String getZhuang() 
    {
        return zhuang;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("enterpriseId", getEnterpriseId())
            .append("enterpriseName", getEnterpriseName())
            .append("enterpriseShortName", getEnterpriseShortName())
            .append("enterpriseLegal", getEnterpriseLegal())
            .append("phone", getPhone())
            .append("address", getAddress())
            .append("liveName", getLiveName())
            .append("enterpriseClassify", getEnterpriseClassify())
            .append("organization", getOrganization())
            .append("zhuang", getZhuang())
            .append("createTime", getCreateTime())
            .toString();
    }
}
