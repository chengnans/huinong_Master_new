package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 病虫害标准库对象 diseases_standard_library
 * 
 * @author cheng
 * @date 2024-10-09
 */
public class DiseasesStandardLibrary extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 病虫害名称 */
    @Excel(name = "病虫害名称")
    private String diseasesName;

    /** 病虫害类型 */
    @Excel(name = "病虫害类型")
    private String diseasesType;

    /** 数据来源 */
    @Excel(name = "数据来源")
    private String resource;

    /** 易发作物名称 */
    @Excel(name = "易发作物名称")
    private String cropName;

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
    public void setDiseasesName(String diseasesName) 
    {
        this.diseasesName = diseasesName;
    }

    public String getDiseasesName() 
    {
        return diseasesName;
    }
    public void setDiseasesType(String diseasesType) 
    {
        this.diseasesType = diseasesType;
    }

    public String getDiseasesType() 
    {
        return diseasesType;
    }
    public void setResource(String resource) 
    {
        this.resource = resource;
    }

    public String getResource() 
    {
        return resource;
    }
    public void setCropName(String cropName) 
    {
        this.cropName = cropName;
    }

    public String getCropName() 
    {
        return cropName;
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
            .append("diseasesName", getDiseasesName())
            .append("diseasesType", getDiseasesType())
            .append("resource", getResource())
            .append("cropName", getCropName())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .toString();
    }
}
