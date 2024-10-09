package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 灾害模型对象 disaster_model
 * 
 * @author cheng
 * @date 2024-10-09
 */
public class DisasterModel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 灾害类型 */
    @Excel(name = "灾害类型")
    private String disasterType;

    /** 灾害名称 */
    @Excel(name = "灾害名称")
    private String disasterName;

    /** 发生时段 */
    @Excel(name = "发生时段")
    private String occurTime;

    /** 主要参数 */
    @Excel(name = "主要参数")
    private String mainParameter;

    /** 参数区间 */
    @Excel(name = "参数区间")
    private String parameterInterval;

    /** 灾害说明 */
    @Excel(name = "灾害说明")
    private String disasterDetail;

    /** 应对措施 */
    @Excel(name = "应对措施")
    private String measures;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDisasterType(String disasterType) 
    {
        this.disasterType = disasterType;
    }

    public String getDisasterType() 
    {
        return disasterType;
    }
    public void setDisasterName(String disasterName) 
    {
        this.disasterName = disasterName;
    }

    public String getDisasterName() 
    {
        return disasterName;
    }
    public void setOccurTime(String occurTime) 
    {
        this.occurTime = occurTime;
    }

    public String getOccurTime() 
    {
        return occurTime;
    }
    public void setMainParameter(String mainParameter) 
    {
        this.mainParameter = mainParameter;
    }

    public String getMainParameter() 
    {
        return mainParameter;
    }
    public void setParameterInterval(String parameterInterval) 
    {
        this.parameterInterval = parameterInterval;
    }

    public String getParameterInterval() 
    {
        return parameterInterval;
    }
    public void setDisasterDetail(String disasterDetail) 
    {
        this.disasterDetail = disasterDetail;
    }

    public String getDisasterDetail() 
    {
        return disasterDetail;
    }
    public void setMeasures(String measures) 
    {
        this.measures = measures;
    }

    public String getMeasures() 
    {
        return measures;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("disasterType", getDisasterType())
            .append("disasterName", getDisasterName())
            .append("occurTime", getOccurTime())
            .append("mainParameter", getMainParameter())
            .append("parameterInterval", getParameterInterval())
            .append("disasterDetail", getDisasterDetail())
            .append("measures", getMeasures())
            .append("createTime", getCreateTime())
            .toString();
    }
}
