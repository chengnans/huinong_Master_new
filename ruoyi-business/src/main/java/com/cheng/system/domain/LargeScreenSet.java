package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 大屏基础设置对象 large_screen_set
 * 
 * @author cheng
 * @date 2024-10-12
 */
public class LargeScreenSet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 大屏编号 */
    @Excel(name = "大屏编号")
    private String bigScreenId;

    /** 大屏分组 */
    @Excel(name = "大屏分组")
    private String bigScreenClassify;

    /** 大屏名称 */
    @Excel(name = "大屏名称")
    private String bigScreenName;

    /** 自定义标题 */
    @Excel(name = "自定义标题")
    private String title;

    /** 显示级别 */
    @Excel(name = "显示级别")
    private String displayLevel;

    /** 区域级别 */
    @Excel(name = "区域级别")
    private String areaLevel;

    /** 所属机构 */
    @Excel(name = "所属机构")
    private String organization;

    /** 当前状态 */
    @Excel(name = "当前状态")
    private String status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBigScreenId(String bigScreenId) 
    {
        this.bigScreenId = bigScreenId;
    }

    public String getBigScreenId() 
    {
        return bigScreenId;
    }
    public void setBigScreenClassify(String bigScreenClassify) 
    {
        this.bigScreenClassify = bigScreenClassify;
    }

    public String getBigScreenClassify() 
    {
        return bigScreenClassify;
    }
    public void setBigScreenName(String bigScreenName) 
    {
        this.bigScreenName = bigScreenName;
    }

    public String getBigScreenName() 
    {
        return bigScreenName;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setDisplayLevel(String displayLevel) 
    {
        this.displayLevel = displayLevel;
    }

    public String getDisplayLevel() 
    {
        return displayLevel;
    }
    public void setAreaLevel(String areaLevel) 
    {
        this.areaLevel = areaLevel;
    }

    public String getAreaLevel() 
    {
        return areaLevel;
    }
    public void setOrganization(String organization) 
    {
        this.organization = organization;
    }

    public String getOrganization() 
    {
        return organization;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("bigScreenId", getBigScreenId())
            .append("bigScreenClassify", getBigScreenClassify())
            .append("bigScreenName", getBigScreenName())
            .append("title", getTitle())
            .append("displayLevel", getDisplayLevel())
            .append("areaLevel", getAreaLevel())
            .append("organization", getOrganization())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .toString();
    }
}
