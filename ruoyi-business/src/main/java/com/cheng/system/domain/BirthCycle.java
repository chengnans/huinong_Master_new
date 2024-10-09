package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 生育周期设置对象 birth_cycle
 * 
 * @author cheng
 * @date 2024-10-09
 */
public class BirthCycle extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 农作物名称 */
    @Excel(name = "农作物名称")
    private String cropName;

    /** 所属类别 */
    @Excel(name = "所属类别")
    private String type;

    /** 批次名称 */
    @Excel(name = "批次名称")
    private String periodName;

    /** 生育周期类型 */
    @Excel(name = "生育周期类型")
    private String birthType;

    /** 生育时期 */
    @Excel(name = "生育时期")
    private String birthTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCropName(String cropName) 
    {
        this.cropName = cropName;
    }

    public String getCropName() 
    {
        return cropName;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setPeriodName(String periodName) 
    {
        this.periodName = periodName;
    }

    public String getPeriodName() 
    {
        return periodName;
    }
    public void setBirthType(String birthType) 
    {
        this.birthType = birthType;
    }

    public String getBirthType() 
    {
        return birthType;
    }
    public void setBirthTime(String birthTime) 
    {
        this.birthTime = birthTime;
    }

    public String getBirthTime() 
    {
        return birthTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("cropName", getCropName())
            .append("type", getType())
            .append("periodName", getPeriodName())
            .append("birthType", getBirthType())
            .append("birthTime", getBirthTime())
            .append("createTime", getCreateTime())
            .toString();
    }
}
