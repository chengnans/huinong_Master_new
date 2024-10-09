package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 生长周期识别对象 grow_cycle
 * 
 * @author cheng
 * @date 2024-10-09
 */
public class GrowCycle extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 作物名称 */
    @Excel(name = "作物名称")
    private String cropName;

    /** 周期序号 */
    @Excel(name = "周期序号")
    private String cycleNum;

    /** 周期名称 */
    @Excel(name = "周期名称")
    private String cycleName;

    /** 周期天数 */
    @Excel(name = "周期天数")
    private String cycleTime;

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
    public void setCycleNum(String cycleNum) 
    {
        this.cycleNum = cycleNum;
    }

    public String getCycleNum() 
    {
        return cycleNum;
    }
    public void setCycleName(String cycleName) 
    {
        this.cycleName = cycleName;
    }

    public String getCycleName() 
    {
        return cycleName;
    }
    public void setCycleTime(String cycleTime) 
    {
        this.cycleTime = cycleTime;
    }

    public String getCycleTime() 
    {
        return cycleTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("cropName", getCropName())
            .append("cycleNum", getCycleNum())
            .append("cycleName", getCycleName())
            .append("cycleTime", getCycleTime())
            .append("createTime", getCreateTime())
            .toString();
    }
}
