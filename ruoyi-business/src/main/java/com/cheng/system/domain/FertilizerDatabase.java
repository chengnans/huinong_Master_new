package com.cheng.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 肥料数据库对象 fertilizer_database
 * 
 * @author cheng
 * @date 2024-10-09
 */
public class FertilizerDatabase extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 肥料名称 */
    @Excel(name = "肥料名称")
    private String fertilizerName;

    /** 肥料类型 */
    @Excel(name = "肥料类型")
    private String fertilizerType;

    /** 氮素含量 */
    @Excel(name = "氮素含量")
    private BigDecimal nitrogen;

    /** 磷素含量 */
    @Excel(name = "磷素含量")
    private BigDecimal phosphorus;

    /** 钾素含量 */
    @Excel(name = "钾素含量")
    private BigDecimal potassium;

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
    public void setFertilizerName(String fertilizerName) 
    {
        this.fertilizerName = fertilizerName;
    }

    public String getFertilizerName() 
    {
        return fertilizerName;
    }
    public void setFertilizerType(String fertilizerType) 
    {
        this.fertilizerType = fertilizerType;
    }

    public String getFertilizerType() 
    {
        return fertilizerType;
    }
    public void setNitrogen(BigDecimal nitrogen) 
    {
        this.nitrogen = nitrogen;
    }

    public BigDecimal getNitrogen() 
    {
        return nitrogen;
    }
    public void setPhosphorus(BigDecimal phosphorus) 
    {
        this.phosphorus = phosphorus;
    }

    public BigDecimal getPhosphorus() 
    {
        return phosphorus;
    }
    public void setPotassium(BigDecimal potassium) 
    {
        this.potassium = potassium;
    }

    public BigDecimal getPotassium() 
    {
        return potassium;
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
            .append("fertilizerName", getFertilizerName())
            .append("fertilizerType", getFertilizerType())
            .append("nitrogen", getNitrogen())
            .append("phosphorus", getPhosphorus())
            .append("potassium", getPotassium())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .toString();
    }
}
