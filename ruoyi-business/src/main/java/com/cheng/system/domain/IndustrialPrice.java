package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 产业价格管理对象 industrial_price
 * 
 * @author cheng
 * @date 2024-10-12
 */
public class IndustrialPrice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 接口分类名称 */
    @Excel(name = "接口分类名称")
    private String interfaceClassName;

    /** 所在产地 */
    @Excel(name = "所在产地")
    private String producingArea;

    /** 价格 */
    @Excel(name = "价格")
    private String price;

    /** 调整价格 */
    @Excel(name = "调整价格")
    private String adjustPrice;

    /** 本地分类名称 */
    @Excel(name = "本地分类名称")
    private String localClassName;

    /** 数据源名称 */
    @Excel(name = "数据源名称")
    private String dataSourceName;

    /** 平台名称 */
    @Excel(name = "平台名称")
    private String platformName;

    /** 应用名称 */
    @Excel(name = "应用名称")
    private String applicationName;

    /** 创建人 */
    @Excel(name = "创建人")
    private String creator;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }
    public void setInterfaceClassName(String interfaceClassName) 
    {
        this.interfaceClassName = interfaceClassName;
    }

    public String getInterfaceClassName() 
    {
        return interfaceClassName;
    }
    public void setProducingArea(String producingArea) 
    {
        this.producingArea = producingArea;
    }

    public String getProducingArea() 
    {
        return producingArea;
    }
    public void setPrice(String price) 
    {
        this.price = price;
    }

    public String getPrice() 
    {
        return price;
    }
    public void setAdjustPrice(String adjustPrice) 
    {
        this.adjustPrice = adjustPrice;
    }

    public String getAdjustPrice() 
    {
        return adjustPrice;
    }
    public void setLocalClassName(String localClassName) 
    {
        this.localClassName = localClassName;
    }

    public String getLocalClassName() 
    {
        return localClassName;
    }
    public void setDataSourceName(String dataSourceName) 
    {
        this.dataSourceName = dataSourceName;
    }

    public String getDataSourceName() 
    {
        return dataSourceName;
    }
    public void setPlatformName(String platformName) 
    {
        this.platformName = platformName;
    }

    public String getPlatformName() 
    {
        return platformName;
    }
    public void setApplicationName(String applicationName) 
    {
        this.applicationName = applicationName;
    }

    public String getApplicationName() 
    {
        return applicationName;
    }
    public void setCreator(String creator) 
    {
        this.creator = creator;
    }

    public String getCreator() 
    {
        return creator;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("time", getTime())
            .append("interfaceClassName", getInterfaceClassName())
            .append("producingArea", getProducingArea())
            .append("price", getPrice())
            .append("adjustPrice", getAdjustPrice())
            .append("localClassName", getLocalClassName())
            .append("dataSourceName", getDataSourceName())
            .append("platformName", getPlatformName())
            .append("applicationName", getApplicationName())
            .append("creator", getCreator())
            .append("createTime", getCreateTime())
            .toString();
    }
}
