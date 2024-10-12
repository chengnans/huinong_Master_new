package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * VR库对象 vr_library
 * 
 * @author cheng
 * @date 2024-10-13
 */
public class VrLibrary extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** VR编号 */
    @Excel(name = "VR编号")
    private String vrId;

    /** VR名称 */
    @Excel(name = "VR名称")
    private String vrName;

    /** VR地址 */
    @Excel(name = "VR地址")
    private String vrAddress;

    /** 关联VR */
    @Excel(name = "关联VR")
    private String vrRelevant;

    /** 所属机构 */
    @Excel(name = "所属机构")
    private String affiliatedOrganization;

    /** 备注 */
    @Excel(name = "备注")
    private String detail;

    /** 当前状态 */
    @Excel(name = "当前状态")
    private String zhuang;

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
    public void setVrId(String vrId) 
    {
        this.vrId = vrId;
    }

    public String getVrId() 
    {
        return vrId;
    }
    public void setVrName(String vrName) 
    {
        this.vrName = vrName;
    }

    public String getVrName() 
    {
        return vrName;
    }
    public void setVrAddress(String vrAddress) 
    {
        this.vrAddress = vrAddress;
    }

    public String getVrAddress() 
    {
        return vrAddress;
    }
    public void setVrRelevant(String vrRelevant) 
    {
        this.vrRelevant = vrRelevant;
    }

    public String getVrRelevant() 
    {
        return vrRelevant;
    }
    public void setAffiliatedOrganization(String affiliatedOrganization) 
    {
        this.affiliatedOrganization = affiliatedOrganization;
    }

    public String getAffiliatedOrganization() 
    {
        return affiliatedOrganization;
    }
    public void setDetail(String detail) 
    {
        this.detail = detail;
    }

    public String getDetail() 
    {
        return detail;
    }
    public void setZhuang(String zhuang) 
    {
        this.zhuang = zhuang;
    }

    public String getZhuang() 
    {
        return zhuang;
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
            .append("vrId", getVrId())
            .append("vrName", getVrName())
            .append("vrAddress", getVrAddress())
            .append("vrRelevant", getVrRelevant())
            .append("affiliatedOrganization", getAffiliatedOrganization())
            .append("detail", getDetail())
            .append("zhuang", getZhuang())
            .append("createTime", getCreateTime())
            .append("operator", getOperator())
            .append("operatingTime", getOperatingTime())
            .toString();
    }
}
