package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 农事计划对象 farm_plan
 * 
 * @author cheng
 * @date 2024-10-09
 */
public class FarmPlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 基地 */
    @Excel(name = "基地")
    private String baselandName;

    /** 作物名称 */
    @Excel(name = "作物名称")
    private String cropName;

    /** 生长周期 */
    @Excel(name = "生长周期")
    private String growCycle;

    /** 农事操作 */
    @Excel(name = "农事操作")
    private String farmOperation;

    /** 农事要求 */
    @Excel(name = "农事要求")
    private String farmRequire;

    /** 农事开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "农事开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date beginTime;

    /** 要求完成时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "要求完成时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 操作工时 */
    @Excel(name = "操作工时")
    private String operateTime;

    /** 参考图片 */
    @Excel(name = "参考图片")
    private String photos;

    /** 参考视频 */
    @Excel(name = "参考视频")
    private String videos;

    /** 投入品 */
    @Excel(name = "投入品")
    private String input;

    /** 投入量 */
    @Excel(name = "投入量")
    private String inputQuantity;

    /** 农事作业描述 */
    @Excel(name = "农事作业描述")
    private String description;

    /** 任务分配给 */
    @Excel(name = "任务分配给")
    private String operator;

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
    public void setCropName(String cropName) 
    {
        this.cropName = cropName;
    }

    public String getCropName() 
    {
        return cropName;
    }
    public void setGrowCycle(String growCycle) 
    {
        this.growCycle = growCycle;
    }

    public String getGrowCycle() 
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
    public void setFarmRequire(String farmRequire) 
    {
        this.farmRequire = farmRequire;
    }

    public String getFarmRequire() 
    {
        return farmRequire;
    }
    public void setBeginTime(Date beginTime) 
    {
        this.beginTime = beginTime;
    }

    public Date getBeginTime() 
    {
        return beginTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setOperateTime(String operateTime) 
    {
        this.operateTime = operateTime;
    }

    public String getOperateTime() 
    {
        return operateTime;
    }
    public void setPhotos(String photos) 
    {
        this.photos = photos;
    }

    public String getPhotos() 
    {
        return photos;
    }
    public void setVideos(String videos) 
    {
        this.videos = videos;
    }

    public String getVideos() 
    {
        return videos;
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
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setOperator(String operator) 
    {
        this.operator = operator;
    }

    public String getOperator() 
    {
        return operator;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("baselandName", getBaselandName())
            .append("cropName", getCropName())
            .append("growCycle", getGrowCycle())
            .append("farmOperation", getFarmOperation())
            .append("farmRequire", getFarmRequire())
            .append("beginTime", getBeginTime())
            .append("endTime", getEndTime())
            .append("operateTime", getOperateTime())
            .append("photos", getPhotos())
            .append("videos", getVideos())
            .append("input", getInput())
            .append("inputQuantity", getInputQuantity())
            .append("description", getDescription())
            .append("operator", getOperator())
            .toString();
    }
}
