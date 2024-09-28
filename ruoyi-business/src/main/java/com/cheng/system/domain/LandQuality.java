package com.cheng.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 耕地质量对象 landquality
 * 
 * @author cheng
 * @date 2024-09-16
 */
public class LandQuality extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 基地名称 */
    @Excel(name = "基地名称")
    private String name;

    /** 划分区域 */
    @Excel(name = "划分区域")
    private String area;

    /** 评定结果 */
    @Excel(name = "评定结果")
    private String result;

    /** 评定时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "评定时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date rateTime;

    /** 评定单位 */
    @Excel(name = "评定单位")
    private String rateUnit;

    /** 操作人 */
    @Excel(name = "操作人")
    private String operator;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date operatingTime;

    /** 地形部位 */
    @Excel(name = "地形部位")
    private String landPosition;

    /** 有效土层厚度 */
    @Excel(name = "有效土层厚度")
    private BigDecimal soilThickness;

    /** 耕层质地 */
    @Excel(name = "耕层质地")
    private String texture;

    /** 土壤容重 */
    @Excel(name = "土壤容重")
    private String soilWeight;

    /** 质地构型 */
    @Excel(name = "质地构型")
    private String soilStructure;

    /** 土壤养分状况 */
    @Excel(name = "土壤养分状况")
    private String nutrientStatus;

    /** 生物多样性 */
    @Excel(name = "生物多样性")
    private String biodiversity;

    /** 清洁程度 */
    @Excel(name = "清洁程度")
    private String cleanliness;

    /** 阻碍因素 */
    @Excel(name = "阻碍因素")
    private String hinder;

    /** 灌溉能力 */
    @Excel(name = "灌溉能力")
    private String irrigation;

    /** 排水能力 */
    @Excel(name = "排水能力")
    private String drainWater;

    /** 农田林网化程度 */
    @Excel(name = "农田林网化程度")
    private String forestNetwork;

    /** 酸碱度 */
    @Excel(name = "酸碱度")
    private BigDecimal pH;

    /** 耕层厚度 */
    @Excel(name = "耕层厚度")
    private BigDecimal surfaceThickness;

    /** 盐渍化程度 */
    @Excel(name = "盐渍化程度")
    private String salinization;

    /** 地下水埋深 */
    @Excel(name = "地下水埋深")
    private BigDecimal groundwaterDepth;

    /** 田面坡度 */
    @Excel(name = "田面坡度")
    private String slope;

    /** 海拔高度 */
    @Excel(name = "海拔高度")
    private BigDecimal height;

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
    public void setArea(String area) 
    {
        this.area = area;
    }

    public String getArea() 
    {
        return area;
    }
    public void setResult(String result) 
    {
        this.result = result;
    }

    public String getResult() 
    {
        return result;
    }
    public void setRateTime(Date rateTime) 
    {
        this.rateTime = rateTime;
    }

    public Date getRateTime() 
    {
        return rateTime;
    }
    public void setRateUnit(String rateUnit) 
    {
        this.rateUnit = rateUnit;
    }

    public String getRateUnit() 
    {
        return rateUnit;
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
    public void setLandPosition(String landPosition) 
    {
        this.landPosition = landPosition;
    }

    public String getLandPosition() 
    {
        return landPosition;
    }
    public void setSoilThickness(BigDecimal soilThickness) 
    {
        this.soilThickness = soilThickness;
    }

    public BigDecimal getSoilThickness() 
    {
        return soilThickness;
    }
    public void setTexture(String texture) 
    {
        this.texture = texture;
    }

    public String getTexture() 
    {
        return texture;
    }
    public void setSoilWeight(String soilWeight) 
    {
        this.soilWeight = soilWeight;
    }

    public String getSoilWeight() 
    {
        return soilWeight;
    }
    public void setSoilStructure(String soilStructure) 
    {
        this.soilStructure = soilStructure;
    }

    public String getSoilStructure() 
    {
        return soilStructure;
    }
    public void setNutrientStatus(String nutrientStatus) 
    {
        this.nutrientStatus = nutrientStatus;
    }

    public String getNutrientStatus() 
    {
        return nutrientStatus;
    }
    public void setBiodiversity(String biodiversity) 
    {
        this.biodiversity = biodiversity;
    }

    public String getBiodiversity() 
    {
        return biodiversity;
    }
    public void setCleanliness(String cleanliness) 
    {
        this.cleanliness = cleanliness;
    }

    public String getCleanliness() 
    {
        return cleanliness;
    }
    public void setHinder(String hinder) 
    {
        this.hinder = hinder;
    }

    public String getHinder() 
    {
        return hinder;
    }
    public void setIrrigation(String irrigation) 
    {
        this.irrigation = irrigation;
    }

    public String getIrrigation() 
    {
        return irrigation;
    }
    public void setDrainWater(String drainWater) 
    {
        this.drainWater = drainWater;
    }

    public String getDrainWater() 
    {
        return drainWater;
    }
    public void setForestNetwork(String forestNetwork) 
    {
        this.forestNetwork = forestNetwork;
    }

    public String getForestNetwork() 
    {
        return forestNetwork;
    }
    public void setPH(BigDecimal pH) 
    {
        this.pH = pH;
    }

    public BigDecimal getPH() 
    {
        return pH;
    }
    public void setSurfaceThickness(BigDecimal surfaceThickness) 
    {
        this.surfaceThickness = surfaceThickness;
    }

    public BigDecimal getSurfaceThickness() 
    {
        return surfaceThickness;
    }
    public void setSalinization(String salinization) 
    {
        this.salinization = salinization;
    }

    public String getSalinization() 
    {
        return salinization;
    }
    public void setGroundwaterDepth(BigDecimal groundwaterDepth) 
    {
        this.groundwaterDepth = groundwaterDepth;
    }

    public BigDecimal getGroundwaterDepth() 
    {
        return groundwaterDepth;
    }
    public void setSlope(String slope) 
    {
        this.slope = slope;
    }

    public String getSlope() 
    {
        return slope;
    }
    public void setHeight(BigDecimal height) 
    {
        this.height = height;
    }

    public BigDecimal getHeight() 
    {
        return height;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("area", getArea())
            .append("result", getResult())
            .append("rateTime", getRateTime())
            .append("rateUnit", getRateUnit())
            .append("operator", getOperator())
            .append("operatingTime", getOperatingTime())
            .append("landPosition", getLandPosition())
            .append("soilThickness", getSoilThickness())
            .append("texture", getTexture())
            .append("soilWeight", getSoilWeight())
            .append("soilStructure", getSoilStructure())
            .append("nutrientStatus", getNutrientStatus())
            .append("biodiversity", getBiodiversity())
            .append("cleanliness", getCleanliness())
            .append("hinder", getHinder())
            .append("irrigation", getIrrigation())
            .append("drainWater", getDrainWater())
            .append("forestNetwork", getForestNetwork())
            .append("pH", getPH())
            .append("surfaceThickness", getSurfaceThickness())
            .append("salinization", getSalinization())
            .append("groundwaterDepth", getGroundwaterDepth())
            .append("slope", getSlope())
            .append("height", getHeight())
            .toString();
    }
}
