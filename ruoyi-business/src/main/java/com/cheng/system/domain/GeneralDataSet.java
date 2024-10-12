package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 通用数据配置对象 general_data_set
 * 
 * @author cheng
 * @date 2024-10-12
 */
public class GeneralDataSet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 所属机构 */
    @Excel(name = "所属机构")
    private String organization;

    /** 所属年份 */
    @Excel(name = "所属年份")
    private String dataYear;

    /** 所属月份 */
    @Excel(name = "所属月份")
    private String dataMonth;

    /** 发布选项 */
    @Excel(name = "发布选项")
    private String releaseOption;

    /** 状态 */
    @Excel(name = "状态")
    private String condition;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setOrganization(String organization) 
    {
        this.organization = organization;
    }

    public String getOrganization() 
    {
        return organization;
    }
    public void setDataYear(String dataYear) 
    {
        this.dataYear = dataYear;
    }

    public String getDataYear() 
    {
        return dataYear;
    }
    public void setDataMonth(String dataMonth) 
    {
        this.dataMonth = dataMonth;
    }

    public String getDataMonth() 
    {
        return dataMonth;
    }
    public void setReleaseOption(String releaseOption) 
    {
        this.releaseOption = releaseOption;
    }

    public String getReleaseOption() 
    {
        return releaseOption;
    }
    public void setCondition(String condition) 
    {
        this.condition = condition;
    }

    public String getCondition() 
    {
        return condition;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("organization", getOrganization())
            .append("dataYear", getDataYear())
            .append("dataMonth", getDataMonth())
            .append("releaseOption", getReleaseOption())
            .append("condition", getCondition())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .toString();
    }
}
