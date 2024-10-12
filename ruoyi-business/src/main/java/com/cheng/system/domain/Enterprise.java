package com.cheng.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 产业企业对象 enterprise
 *
 * @author cheng
 * @date 2024-10-12
 */
public class Enterprise extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 所属机构 */
    @Excel(name = "所属机构")
    private String organization;

    /** 一级分类 */
    @Excel(name = "一级分类")
    private String primaryClassify;

    /** 简称 */
    @Excel(name = "简称")
    private String shortName;

    /** 简介 */
    @Excel(name = "简介")
    private String intro;

    /** 是否显示 */
    @Excel(name = "是否显示")
    private String isShow;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setOrganization(String organization)
    {
        this.organization = organization;
    }

    public String getOrganization()
    {
        return organization;
    }
    public void setPrimaryClassify(String primaryClassify)
    {
        this.primaryClassify = primaryClassify;
    }

    public String getPrimaryClassify()
    {
        return primaryClassify;
    }
    public void setShortName(String shortName)
    {
        this.shortName = shortName;
    }

    public String getShortName()
    {
        return shortName;
    }
    public void setIntro(String intro)
    {
        this.intro = intro;
    }

    public String getIntro()
    {
        return intro;
    }
    public void setIsShow(String isShow)
    {
        this.isShow = isShow;
    }

    public String getIsShow()
    {
        return isShow;
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public Date getUpdateTime()
    {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("organization", getOrganization())
            .append("primaryClassify", getPrimaryClassify())
            .append("shortName", getShortName())
            .append("intro", getIntro())
            .append("isShow", getIsShow())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
