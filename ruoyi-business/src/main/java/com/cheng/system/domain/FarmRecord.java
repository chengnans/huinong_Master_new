package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 农事记录对象 farm_record
 * 
 * @author cheng
 * @date 2024-10-09
 */
public class FarmRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 基地 */
    @Excel(name = "基地")
    private String baselandName;

    /** 作物名称 */
    @Excel(name = "作物名称")
    private String gropName;

    /** 生长周期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生长周期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date growCycle;

    /** 农事操作 */
    @Excel(name = "农事操作")
    private String farmOperation;

    /** 农事要求 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "农事要求", width = 30, dateFormat = "yyyy-MM-dd")
    private Date farmRequirement;

    /** 操作日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date operationTime;

    /** 实际工时 */
    @Excel(name = "实际工时")
    private String workingHours;

    /** 作业图片 */
    @Excel(name = "作业图片")
    private String photos;

    /** 投入品 */
    @Excel(name = "投入品")
    private String input;

    /** 投入数量 */
    @Excel(name = "投入数量")
    private String inputQuantity;

    /** 详细操作描述 */
    @Excel(name = "详细操作描述")
    private String detail;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBaselandName(String baselandName) 
    {
        this.baselandName = baselandName;
    }

    public String getBaselandName() 
    {
        return baselandName;
    }
    public void setGropName(String gropName) 
    {
        this.gropName = gropName;
    }

    public String getGropName() 
    {
        return gropName;
    }
    public void setGrowCycle(Date growCycle) 
    {
        this.growCycle = growCycle;
    }

    public Date getGrowCycle() 
    {
        return growCycle;
    }
    public void setFarmOperation(String farmOperation) 
    {
        this.farmOperation = farmOperation;
    }

    public String getFarmOperation() 
    {
        return farmOperation;
    }
    public void setFarmRequirement(Date farmRequirement) 
    {
        this.farmRequirement = farmRequirement;
    }

    public Date getFarmRequirement() 
    {
        return farmRequirement;
    }
    public void setOperationTime(Date operationTime) 
    {
        this.operationTime = operationTime;
    }

    public Date getOperationTime() 
    {
        return operationTime;
    }
    public void setWorkingHours(String workingHours) 
    {
        this.workingHours = workingHours;
    }

    public String getWorkingHours() 
    {
        return workingHours;
    }
    public void setPhotos(String photos) 
    {
        this.photos = photos;
    }

    public String getPhotos() 
    {
        return photos;
    }
    public void setInput(String input) 
    {
        this.input = input;
    }

    public String getInput() 
    {
        return input;
    }
    public void setInputQuantity(String inputQuantity) 
    {
        this.inputQuantity = inputQuantity;
    }

    public String getInputQuantity() 
    {
        return inputQuantity;
    }
    public void setDetail(String detail) 
    {
        this.detail = detail;
    }

    public String getDetail() 
    {
        return detail;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("baselandName", getBaselandName())
            .append("gropName", getGropName())
            .append("growCycle", getGrowCycle())
            .append("farmOperation", getFarmOperation())
            .append("farmRequirement", getFarmRequirement())
            .append("operationTime", getOperationTime())
            .append("workingHours", getWorkingHours())
            .append("photos", getPhotos())
            .append("input", getInput())
            .append("inputQuantity", getInputQuantity())
            .append("detail", getDetail())
            .toString();
    }
}
