package com.cheng.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 土壤分级报表对象 soil_report
 * 
 * @author cheng
 * @date 2024-10-09
 */
public class SoilReport extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 地块名称 */
    @Excel(name = "地块名称")
    private String soilName;

    /** 作物名称 */
    @Excel(name = "作物名称")
    private String cropName;

    /** 土壤等级 */
    @Excel(name = "土壤等级")
    private String soilLevel;

    /** 面积 */
    @Excel(name = "面积")
    private BigDecimal area;

    /** 所属基地 */
    @Excel(name = "所属基地")
    private String soilBaseland;

    /** 统计日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "统计日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date soilDate;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSoilName(String soilName) 
    {
        this.soilName = soilName;
    }

    public String getSoilName() 
    {
        return soilName;
    }
    public void setCropName(String cropName) 
    {
        this.cropName = cropName;
    }

    public String getCropName() 
    {
        return cropName;
    }
    public void setSoilLevel(String soilLevel) 
    {
        this.soilLevel = soilLevel;
    }

    public String getSoilLevel() 
    {
        return soilLevel;
    }
    public void setArea(BigDecimal area) 
    {
        this.area = area;
    }

    public BigDecimal getArea() 
    {
        return area;
    }
    public void setSoilBaseland(String soilBaseland) 
    {
        this.soilBaseland = soilBaseland;
    }

    public String getSoilBaseland() 
    {
        return soilBaseland;
    }
    public void setSoilDate(Date soilDate) 
    {
        this.soilDate = soilDate;
    }

    public Date getSoilDate() 
    {
        return soilDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("soilName", getSoilName())
            .append("cropName", getCropName())
            .append("soilLevel", getSoilLevel())
            .append("area", getArea())
            .append("soilBaseland", getSoilBaseland())
            .append("soilDate", getSoilDate())
            .toString();
    }
}
