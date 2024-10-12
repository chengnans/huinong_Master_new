package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 产地管理对象 origin_management
 * 
 * @author cheng
 * @date 2024-10-12
 */
public class OriginManagement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 产地名称 */
    @Excel(name = "产地名称")
    private String producingArea;

    /** 创建人 */
    @Excel(name = "创建人")
    private String creator;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setProducingArea(String producingArea) 
    {
        this.producingArea = producingArea;
    }

    public String getProducingArea() 
    {
        return producingArea;
    }
    public void setCreator(String creator) 
    {
        this.creator = creator;
    }

    public String getCreator() 
    {
        return creator;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("producingArea", getProducingArea())
            .append("creator", getCreator())
            .append("createTime", getCreateTime())
            .toString();
    }
}
