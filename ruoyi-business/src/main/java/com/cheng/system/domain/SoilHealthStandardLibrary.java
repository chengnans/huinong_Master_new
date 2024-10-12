package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 土壤健康标准库对象 soil_health_standard_library
 * 
 * @author cheng
 * @date 2024-10-12
 */
public class SoilHealthStandardLibrary extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 编号 */
    @Excel(name = "编号")
    private String bid;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 发布日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发布日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date publishTime;

    /** 施行日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "施行日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date implementationTime;

    /** 土地类型 */
    @Excel(name = "土地类型")
    private String soilStyle;

    /** 土壤质地 */
    @Excel(name = "土壤质地")
    private String soilTexture;

    /** 备注 */
    @Excel(name = "备注")
    private String detail;

    /** 状态 */
    @Excel(name = "状态")
    private String soilStatus;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBid(String bid) 
    {
        this.bid = bid;
    }

    public String getBid() 
    {
        return bid;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPublishTime(Date publishTime) 
    {
        this.publishTime = publishTime;
    }

    public Date getPublishTime() 
    {
        return publishTime;
    }
    public void setImplementationTime(Date implementationTime) 
    {
        this.implementationTime = implementationTime;
    }

    public Date getImplementationTime() 
    {
        return implementationTime;
    }
    public void setSoilStyle(String soilStyle) 
    {
        this.soilStyle = soilStyle;
    }

    public String getSoilStyle() 
    {
        return soilStyle;
    }
    public void setSoilTexture(String soilTexture) 
    {
        this.soilTexture = soilTexture;
    }

    public String getSoilTexture() 
    {
        return soilTexture;
    }
    public void setDetail(String detail) 
    {
        this.detail = detail;
    }

    public String getDetail() 
    {
        return detail;
    }
    public void setSoilStatus(String soilStatus) 
    {
        this.soilStatus = soilStatus;
    }

    public String getSoilStatus() 
    {
        return soilStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("bid", getBid())
            .append("name", getName())
            .append("publishTime", getPublishTime())
            .append("implementationTime", getImplementationTime())
            .append("soilStyle", getSoilStyle())
            .append("soilTexture", getSoilTexture())
            .append("detail", getDetail())
            .append("soilStatus", getSoilStatus())
            .toString();
    }
}
