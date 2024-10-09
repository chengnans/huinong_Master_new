package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 种植业标准库对象 crop_standard_library
 * 
 * @author cheng
 * @date 2024-10-09
 */
public class CropStandardLibrary extends BaseEntity
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
    private String type;

    /** 分类级别 */
    @Excel(name = "分类级别")
    private String classificationLevel;

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
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setClassificationLevel(String classificationLevel) 
    {
        this.classificationLevel = classificationLevel;
    }

    public String getClassificationLevel() 
    {
        return classificationLevel;
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
            .append("type", getType())
            .append("classificationLevel", getClassificationLevel())
            .append("status", getStatus())
            .append("operator", getOperator())
            .append("operatingTime", getOperatingTime())
            .toString();
    }
}
