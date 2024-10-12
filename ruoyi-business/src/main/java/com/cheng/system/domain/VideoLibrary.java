package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 音视频库对象 video_library
 * 
 * @author cheng
 * @date 2024-10-13
 */
public class VideoLibrary extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 音视频编号 */
    @Excel(name = "音视频编号")
    private String videoId;

    /** 音视频名称 */
    @Excel(name = "音视频名称")
    private String videoName;

    /** 音视频地址 */
    @Excel(name = "音视频地址")
    private String videoAddress;

    /** 音视频大小 */
    @Excel(name = "音视频大小")
    private String videoSize;

    /** 音视频长度 */
    @Excel(name = "音视频长度")
    private String videoLength;

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
    public void setVideoId(String videoId) 
    {
        this.videoId = videoId;
    }

    public String getVideoId() 
    {
        return videoId;
    }
    public void setVideoName(String videoName) 
    {
        this.videoName = videoName;
    }

    public String getVideoName() 
    {
        return videoName;
    }
    public void setVideoAddress(String videoAddress) 
    {
        this.videoAddress = videoAddress;
    }

    public String getVideoAddress() 
    {
        return videoAddress;
    }
    public void setVideoSize(String videoSize) 
    {
        this.videoSize = videoSize;
    }

    public String getVideoSize() 
    {
        return videoSize;
    }
    public void setVideoLength(String videoLength) 
    {
        this.videoLength = videoLength;
    }

    public String getVideoLength() 
    {
        return videoLength;
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
            .append("videoId", getVideoId())
            .append("videoName", getVideoName())
            .append("videoAddress", getVideoAddress())
            .append("videoSize", getVideoSize())
            .append("videoLength", getVideoLength())
            .append("affiliatedOrganization", getAffiliatedOrganization())
            .append("detail", getDetail())
            .append("zhuang", getZhuang())
            .append("createTime", getCreateTime())
            .append("operator", getOperator())
            .append("operatingTime", getOperatingTime())
            .toString();
    }
}
