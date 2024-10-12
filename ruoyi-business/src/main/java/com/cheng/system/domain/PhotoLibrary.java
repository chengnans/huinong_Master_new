package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 图片库对象 photo_library
 * 
 * @author cheng
 * @date 2024-10-13
 */
public class PhotoLibrary extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 图片编号 */
    @Excel(name = "图片编号")
    private String photoId;

    /** 图片名称 */
    @Excel(name = "图片名称")
    private String photoName;

    /** 图片预览 */
    @Excel(name = "图片预览")
    private String photoPreview;

    /** 图片地址 */
    @Excel(name = "图片地址")
    private String photoAddress;

    /** 图片大小 */
    @Excel(name = "图片大小")
    private String photoSize;

    /** 图片尺寸 */
    @Excel(name = "图片尺寸")
    private String photoDimension;

    /** 图片格式 */
    @Excel(name = "图片格式")
    private String photoFormat;

    /** 备注 */
    @Excel(name = "备注")
    private String detail;

    /** 所属机构 */
    @Excel(name = "所属机构")
    private String affiliatedOrganization;

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
    public void setPhotoId(String photoId) 
    {
        this.photoId = photoId;
    }

    public String getPhotoId() 
    {
        return photoId;
    }
    public void setPhotoName(String photoName) 
    {
        this.photoName = photoName;
    }

    public String getPhotoName() 
    {
        return photoName;
    }
    public void setPhotoPreview(String photoPreview) 
    {
        this.photoPreview = photoPreview;
    }

    public String getPhotoPreview() 
    {
        return photoPreview;
    }
    public void setPhotoAddress(String photoAddress) 
    {
        this.photoAddress = photoAddress;
    }

    public String getPhotoAddress() 
    {
        return photoAddress;
    }
    public void setPhotoSize(String photoSize) 
    {
        this.photoSize = photoSize;
    }

    public String getPhotoSize() 
    {
        return photoSize;
    }
    public void setPhotoDimension(String photoDimension) 
    {
        this.photoDimension = photoDimension;
    }

    public String getPhotoDimension() 
    {
        return photoDimension;
    }
    public void setPhotoFormat(String photoFormat) 
    {
        this.photoFormat = photoFormat;
    }

    public String getPhotoFormat() 
    {
        return photoFormat;
    }
    public void setDetail(String detail) 
    {
        this.detail = detail;
    }

    public String getDetail() 
    {
        return detail;
    }
    public void setAffiliatedOrganization(String affiliatedOrganization) 
    {
        this.affiliatedOrganization = affiliatedOrganization;
    }

    public String getAffiliatedOrganization() 
    {
        return affiliatedOrganization;
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
            .append("photoId", getPhotoId())
            .append("photoName", getPhotoName())
            .append("photoPreview", getPhotoPreview())
            .append("photoAddress", getPhotoAddress())
            .append("photoSize", getPhotoSize())
            .append("photoDimension", getPhotoDimension())
            .append("photoFormat", getPhotoFormat())
            .append("detail", getDetail())
            .append("affiliatedOrganization", getAffiliatedOrganization())
            .append("zhuang", getZhuang())
            .append("createTime", getCreateTime())
            .append("operator", getOperator())
            .append("operatingTime", getOperatingTime())
            .toString();
    }
}
