package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 农作物监测报表对象 crop_report
 * 
 * @author cheng
 * @date 2024-10-09
 */
public class CropReport extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 农作物图片 */
    @Excel(name = "农作物图片")
    private String cropPhoto;

    /** 农作物名称 */
    @Excel(name = "农作物名称")
    private String cropName;

    /** 所属类别 */
    @Excel(name = "所属类别")
    private String st;

    /** 分类级别 */
    @Excel(name = "分类级别")
    private String photoDefault;

    /** 数据状态 */
    @Excel(name = "数据状态")
    private String status;

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
    public void setCropPhoto(String cropPhoto) 
    {
        this.cropPhoto = cropPhoto;
    }

    public String getCropPhoto() 
    {
        return cropPhoto;
    }
    public void setCropName(String cropName) 
    {
        this.cropName = cropName;
    }

    public String getCropName() 
    {
        return cropName;
    }
    public void setSt(String st) 
    {
        this.st = st;
    }

    public String getSt() 
    {
        return st;
    }
    public void setPhotoDefault(String photoDefault) 
    {
        this.photoDefault = photoDefault;
    }

    public String getPhotoDefault() 
    {
        return photoDefault;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
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
            .append("cropPhoto", getCropPhoto())
            .append("cropName", getCropName())
            .append("st", getSt())
            .append("photoDefault", getPhotoDefault())
            .append("status", getStatus())
            .append("operator", getOperator())
            .append("operatingTime", getOperatingTime())
            .toString();
    }
}
