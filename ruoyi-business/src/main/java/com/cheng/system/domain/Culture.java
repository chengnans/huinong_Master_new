package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 文化融合对象 culture
 * 
 * @author cheng
 * @date 2024-10-12
 */
public class Culture extends BaseEntity
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

    /** 二级分类 */
    @Excel(name = "二级分类")
    private String secondaryClassify;

    /** 主标题 */
    @Excel(name = "主标题")
    private String mainTitle;

    /** 副标题 */
    @Excel(name = "副标题")
    private String secondaryTitle;

    /** 是否显示 */
    @Excel(name = "是否显示")
    private String isShow;

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
    public void setSecondaryClassify(String secondaryClassify) 
    {
        this.secondaryClassify = secondaryClassify;
    }

    public String getSecondaryClassify() 
    {
        return secondaryClassify;
    }
    public void setMainTitle(String mainTitle) 
    {
        this.mainTitle = mainTitle;
    }

    public String getMainTitle() 
    {
        return mainTitle;
    }
    public void setSecondaryTitle(String secondaryTitle) 
    {
        this.secondaryTitle = secondaryTitle;
    }

    public String getSecondaryTitle() 
    {
        return secondaryTitle;
    }
    public void setIsShow(String isShow) 
    {
        this.isShow = isShow;
    }

    public String getIsShow() 
    {
        return isShow;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("organization", getOrganization())
            .append("primaryClassify", getPrimaryClassify())
            .append("secondaryClassify", getSecondaryClassify())
            .append("mainTitle", getMainTitle())
            .append("secondaryTitle", getSecondaryTitle())
            .append("isShow", getIsShow())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
