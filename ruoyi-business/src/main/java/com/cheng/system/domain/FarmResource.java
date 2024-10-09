package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 农资管理对象 farm_resource
 * 
 * @author cheng
 * @date 2024-10-09
 */
public class FarmResource extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 农资编号 */
    private Long id;

    /** 所属类别 */
    @Excel(name = "所属类别")
    private String type;

    /** 农资名称 */
    @Excel(name = "农资名称")
    private String name;

    /** 别名 */
    @Excel(name = "别名")
    private String anotherName;

    /** 计量单位 */
    @Excel(name = "计量单位")
    private String measuringUnit;

    /** 规格 */
    @Excel(name = "规格")
    private String specification;

    /** 备注 */
    @Excel(name = "备注")
    private String description;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setAnotherName(String anotherName) 
    {
        this.anotherName = anotherName;
    }

    public String getAnotherName() 
    {
        return anotherName;
    }
    public void setMeasuringUnit(String measuringUnit) 
    {
        this.measuringUnit = measuringUnit;
    }

    public String getMeasuringUnit() 
    {
        return measuringUnit;
    }
    public void setSpecification(String specification) 
    {
        this.specification = specification;
    }

    public String getSpecification() 
    {
        return specification;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
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
            .append("type", getType())
            .append("name", getName())
            .append("anotherName", getAnotherName())
            .append("measuringUnit", getMeasuringUnit())
            .append("specification", getSpecification())
            .append("description", getDescription())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .toString();
    }
}
