package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 机构信息对象 institutional_information
 * 
 * @author cheng
 * @date 2024-10-13
 */
public class InstitutionalInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 机构名称 */
    @Excel(name = "机构名称")
    private String institutionName;

    /** 机构简介 */
    @Excel(name = "机构简介")
    private String insitutionAbbreviation;

    /** 联系人 */
    @Excel(name = "联系人")
    private String contact;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String contactNumber;

    /** 机构类型 */
    @Excel(name = "机构类型")
    private String institutionType;

    /** 机构规模 */
    @Excel(name = "机构规模")
    private String institutionScale;

    /** 所属区域 */
    @Excel(name = "所属区域")
    private String region;

    /** 详细地址 */
    @Excel(name = "详细地址")
    private String fullAddress;

    /** 经度 */
    @Excel(name = "经度")
    private String longitude;

    /** 维度 */
    @Excel(name = "维度")
    private String dimension;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String remarksinFormation;

    /** 营业执照号 */
    @Excel(name = "营业执照号")
    private String businessLicenseNumber;

    /** 经营许可证编号 */
    @Excel(name = "经营许可证编号")
    private String licenseNumber;

    /** 商标名称 */
    @Excel(name = "商标名称")
    private String tradeName;

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
    public void setInstitutionName(String institutionName) 
    {
        this.institutionName = institutionName;
    }

    public String getInstitutionName() 
    {
        return institutionName;
    }
    public void setInsitutionAbbreviation(String insitutionAbbreviation) 
    {
        this.insitutionAbbreviation = insitutionAbbreviation;
    }

    public String getInsitutionAbbreviation() 
    {
        return insitutionAbbreviation;
    }
    public void setContact(String contact) 
    {
        this.contact = contact;
    }

    public String getContact() 
    {
        return contact;
    }
    public void setContactNumber(String contactNumber) 
    {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber() 
    {
        return contactNumber;
    }
    public void setInstitutionType(String institutionType) 
    {
        this.institutionType = institutionType;
    }

    public String getInstitutionType() 
    {
        return institutionType;
    }
    public void setInstitutionScale(String institutionScale) 
    {
        this.institutionScale = institutionScale;
    }

    public String getInstitutionScale() 
    {
        return institutionScale;
    }
    public void setRegion(String region) 
    {
        this.region = region;
    }

    public String getRegion() 
    {
        return region;
    }
    public void setFullAddress(String fullAddress) 
    {
        this.fullAddress = fullAddress;
    }

    public String getFullAddress() 
    {
        return fullAddress;
    }
    public void setLongitude(String longitude) 
    {
        this.longitude = longitude;
    }

    public String getLongitude() 
    {
        return longitude;
    }
    public void setDimension(String dimension) 
    {
        this.dimension = dimension;
    }

    public String getDimension() 
    {
        return dimension;
    }
    public void setRemarksinFormation(String remarksinFormation) 
    {
        this.remarksinFormation = remarksinFormation;
    }

    public String getRemarksinFormation() 
    {
        return remarksinFormation;
    }
    public void setBusinessLicenseNumber(String businessLicenseNumber) 
    {
        this.businessLicenseNumber = businessLicenseNumber;
    }

    public String getBusinessLicenseNumber() 
    {
        return businessLicenseNumber;
    }
    public void setLicenseNumber(String licenseNumber) 
    {
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() 
    {
        return licenseNumber;
    }
    public void setTradeName(String tradeName) 
    {
        this.tradeName = tradeName;
    }

    public String getTradeName() 
    {
        return tradeName;
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
            .append("institutionName", getInstitutionName())
            .append("insitutionAbbreviation", getInsitutionAbbreviation())
            .append("contact", getContact())
            .append("contactNumber", getContactNumber())
            .append("institutionType", getInstitutionType())
            .append("institutionScale", getInstitutionScale())
            .append("region", getRegion())
            .append("fullAddress", getFullAddress())
            .append("longitude", getLongitude())
            .append("dimension", getDimension())
            .append("remarksinFormation", getRemarksinFormation())
            .append("businessLicenseNumber", getBusinessLicenseNumber())
            .append("licenseNumber", getLicenseNumber())
            .append("tradeName", getTradeName())
            .append("creationTime", getCreationTime())
            .toString();
    }
}
