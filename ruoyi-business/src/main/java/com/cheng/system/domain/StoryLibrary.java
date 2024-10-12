package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 故事库对象 story_library
 * 
 * @author cheng
 * @date 2024-10-13
 */
public class StoryLibrary extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 故事编号 */
    @Excel(name = "故事编号")
    private String storyId;

    /** 故事名称 */
    @Excel(name = "故事名称")
    private String storyName;

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
    public void setStoryId(String storyId) 
    {
        this.storyId = storyId;
    }

    public String getStoryId() 
    {
        return storyId;
    }
    public void setStoryName(String storyName) 
    {
        this.storyName = storyName;
    }

    public String getStoryName() 
    {
        return storyName;
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
            .append("storyId", getStoryId())
            .append("storyName", getStoryName())
            .append("affiliatedOrganization", getAffiliatedOrganization())
            .append("detail", getDetail())
            .append("zhuang", getZhuang())
            .append("createTime", getCreateTime())
            .append("operator", getOperator())
            .append("operatingTime", getOperatingTime())
            .toString();
    }
}
