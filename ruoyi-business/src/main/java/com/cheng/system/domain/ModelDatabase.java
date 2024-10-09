package com.cheng.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 模型数据库对象 model_database
 * 
 * @author cheng
 * @date 2024-10-09
 */
public class ModelDatabase extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 基地名称 */
    @Excel(name = "基地名称")
    private Long baselandName;

    /** 作物名称 */
    @Excel(name = "作物名称")
    private String cropName;

    /** 生育周期类型 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生育周期类型", width = 30, dateFormat = "yyyy-MM-dd")
    private Date growCycleType;

    /** 历史平均亩产 */
    @Excel(name = "历史平均亩产")
    private String averageYield;

    /** 预测亩产 */
    @Excel(name = "预测亩产")
    private BigDecimal forecastYield;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBaselandName(Long baselandName) 
    {
        this.baselandName = baselandName;
    }

    public Long getBaselandName() 
    {
        return baselandName;
    }
    public void setCropName(String cropName) 
    {
        this.cropName = cropName;
    }

    public String getCropName() 
    {
        return cropName;
    }
    public void setGrowCycleType(Date growCycleType) 
    {
        this.growCycleType = growCycleType;
    }

    public Date getGrowCycleType() 
    {
        return growCycleType;
    }
    public void setAverageYield(String averageYield) 
    {
        this.averageYield = averageYield;
    }

    public String getAverageYield() 
    {
        return averageYield;
    }
    public void setForecastYield(BigDecimal forecastYield) 
    {
        this.forecastYield = forecastYield;
    }

    public BigDecimal getForecastYield() 
    {
        return forecastYield;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("baselandName", getBaselandName())
            .append("cropName", getCropName())
            .append("growCycleType", getGrowCycleType())
            .append("averageYield", getAverageYield())
            .append("forecastYield", getForecastYield())
            .append("createTime", getCreateTime())
            .toString();
    }
}
