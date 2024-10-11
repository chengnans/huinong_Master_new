package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 农事分类设置对象 farm_classify1
 * 
 * @author cheng
 * @date 2024-10-11
 */
public class FarmClassify1 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 农事分类 */
    @Excel(name = "农事分类")
    private String farmClassify;

    /** 农事名称 */
    @Excel(name = "农事名称")
    private String farmName;

    /** 农事要点 */
    @Excel(name = "农事要点")
    private String farmKey;

    /** 是否常用 */
    @Excel(name = "是否常用")
    private String used;

    /** 所属机构 */
    @Excel(name = "所属机构")
    private String organization;

    /** 数据来源 */
    @Excel(name = "数据来源")
    private String resource;

    /** 数据状态 */
    @Excel(name = "数据状态")
    private String status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setFarmClassify(String farmClassify) 
    {
        this.farmClassify = farmClassify;
    }

    public String getFarmClassify() 
    {
        return farmClassify;
    }
    public void setFarmName(String farmName) 
    {
        this.farmName = farmName;
    }

    public String getFarmName() 
    {
        return farmName;
    }
    public void setFarmKey(String farmKey) 
    {
        this.farmKey = farmKey;
    }

    public String getFarmKey() 
    {
        return farmKey;
    }
    public void setUsed(String used) 
    {
        this.used = used;
    }

    public String getUsed() 
    {
        return used;
    }
    public void setOrganization(String organization) 
    {
        this.organization = organization;
    }

    public String getOrganization() 
    {
        return organization;
    }
    public void setResource(String resource) 
    {
        this.resource = resource;
    }

    public String getResource() 
    {
        return resource;
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
            .append("farmClassify", getFarmClassify())
            .append("farmName", getFarmName())
            .append("farmKey", getFarmKey())
            .append("used", getUsed())
            .append("organization", getOrganization())
            .append("resource", getResource())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .toString();
    }
}
