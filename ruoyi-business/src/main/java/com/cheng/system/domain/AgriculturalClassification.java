package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 农业分类设置对象 agricultural_classification
 * 
 * @author cheng
 * @date 2024-10-09
 */
public class AgriculturalClassification extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 分类名称 */
    @Excel(name = "分类名称")
    private String classifyName;

    /** 上级分类 */
    @Excel(name = "上级分类")
    private String classify;

    /** APP首页图片 */
    @Excel(name = "APP首页图片")
    private String photoApp;

    /** 农作物详情图片 */
    @Excel(name = "农作物详情图片")
    private String photoCrop;

    /** 默认分类图片 */
    @Excel(name = "默认分类图片")
    private String photoDefault;

    /** 灌区背景图 */
    @Excel(name = "灌区背景图")
    private String photoBackground;

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
    public void setClassifyName(String classifyName) 
    {
        this.classifyName = classifyName;
    }

    public String getClassifyName() 
    {
        return classifyName;
    }
    public void setClassify(String classify) 
    {
        this.classify = classify;
    }

    public String getClassify() 
    {
        return classify;
    }
    public void setPhotoApp(String photoApp) 
    {
        this.photoApp = photoApp;
    }

    public String getPhotoApp() 
    {
        return photoApp;
    }
    public void setPhotoCrop(String photoCrop) 
    {
        this.photoCrop = photoCrop;
    }

    public String getPhotoCrop() 
    {
        return photoCrop;
    }
    public void setPhotoDefault(String photoDefault) 
    {
        this.photoDefault = photoDefault;
    }

    public String getPhotoDefault() 
    {
        return photoDefault;
    }
    public void setPhotoBackground(String photoBackground) 
    {
        this.photoBackground = photoBackground;
    }

    public String getPhotoBackground() 
    {
        return photoBackground;
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
            .append("classifyName", getClassifyName())
            .append("classify", getClassify())
            .append("photoApp", getPhotoApp())
            .append("photoCrop", getPhotoCrop())
            .append("photoDefault", getPhotoDefault())
            .append("photoBackground", getPhotoBackground())
            .append("status", getStatus())
            .append("operator", getOperator())
            .append("operatingTime", getOperatingTime())
            .toString();
    }
}
