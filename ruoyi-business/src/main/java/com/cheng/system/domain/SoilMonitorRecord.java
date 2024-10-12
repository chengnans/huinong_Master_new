package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 土壤检测记录对象 soil_monitor_record
 * 
 * @author cheng
 * @date 2024-10-12
 */
public class SoilMonitorRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 报告编号 */
    @Excel(name = "报告编号")
    private String reportId;

    /** 样品编号 */
    @Excel(name = "样品编号")
    private String sampleId;

    /** 采样日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "采样日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date samplingDate;

    /** 采样地址 */
    @Excel(name = "采样地址")
    private String samplingAddress;

    /** 分析日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "分析日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date analysisDate;

    /** 行政村 */
    @Excel(name = "行政村")
    private String village;

    /** 基地 */
    @Excel(name = "基地")
    private String baseland;

    /** 地块 */
    @Excel(name = "地块")
    private String plot;

    /** 酸碱度得分 */
    @Excel(name = "酸碱度得分")
    private String pH;

    /** 重金属得分 */
    @Excel(name = "重金属得分")
    private String heavyMetal;

    /** 农药污染得分 */
    @Excel(name = "农药污染得分")
    private String pesticidePollution;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setReportId(String reportId) 
    {
        this.reportId = reportId;
    }

    public String getReportId() 
    {
        return reportId;
    }
    public void setSampleId(String sampleId) 
    {
        this.sampleId = sampleId;
    }

    public String getSampleId() 
    {
        return sampleId;
    }
    public void setSamplingDate(Date samplingDate) 
    {
        this.samplingDate = samplingDate;
    }

    public Date getSamplingDate() 
    {
        return samplingDate;
    }
    public void setSamplingAddress(String samplingAddress) 
    {
        this.samplingAddress = samplingAddress;
    }

    public String getSamplingAddress() 
    {
        return samplingAddress;
    }
    public void setAnalysisDate(Date analysisDate) 
    {
        this.analysisDate = analysisDate;
    }

    public Date getAnalysisDate() 
    {
        return analysisDate;
    }
    public void setVillage(String village) 
    {
        this.village = village;
    }

    public String getVillage() 
    {
        return village;
    }
    public void setBaseland(String baseland) 
    {
        this.baseland = baseland;
    }

    public String getBaseland() 
    {
        return baseland;
    }
    public void setPlot(String plot) 
    {
        this.plot = plot;
    }

    public String getPlot() 
    {
        return plot;
    }
    public void setPH(String pH) 
    {
        this.pH = pH;
    }

    public String getPH() 
    {
        return pH;
    }
    public void setHeavyMetal(String heavyMetal) 
    {
        this.heavyMetal = heavyMetal;
    }

    public String getHeavyMetal() 
    {
        return heavyMetal;
    }
    public void setPesticidePollution(String pesticidePollution) 
    {
        this.pesticidePollution = pesticidePollution;
    }

    public String getPesticidePollution() 
    {
        return pesticidePollution;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("reportId", getReportId())
            .append("sampleId", getSampleId())
            .append("samplingDate", getSamplingDate())
            .append("samplingAddress", getSamplingAddress())
            .append("analysisDate", getAnalysisDate())
            .append("village", getVillage())
            .append("baseland", getBaseland())
            .append("plot", getPlot())
            .append("pH", getPH())
            .append("heavyMetal", getHeavyMetal())
            .append("pesticidePollution", getPesticidePollution())
            .toString();
    }
}
