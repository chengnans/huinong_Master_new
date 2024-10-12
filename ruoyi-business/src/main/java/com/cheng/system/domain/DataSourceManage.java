package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 数据源管理对象 data_source_manage
 * 
 * @author cheng
 * @date 2024-10-12
 */
public class DataSourceManage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 数据源编号 */
    @Excel(name = "数据源编号")
    private String bid;

    /** 数据源名称 */
    @Excel(name = "数据源名称")
    private String dataSourceName;

    /** 平台名称 */
    @Excel(name = "平台名称")
    private String platformName;

    /** 应用名称 */
    @Excel(name = "应用名称")
    private String appName;

    /** 到期日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "到期日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dueDate;

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
    public void setBid(String bid) 
    {
        this.bid = bid;
    }

    public String getBid() 
    {
        return bid;
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
    public void setAppName(String appName) 
    {
        this.appName = appName;
    }

    public String getAppName() 
    {
        return appName;
    }
    public void setDueDate(Date dueDate) 
    {
        this.dueDate = dueDate;
    }

    public Date getDueDate() 
    {
        return dueDate;
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
            .append("bid", getBid())
            .append("dataSourceName", getDataSourceName())
            .append("platformName", getPlatformName())
            .append("appName", getAppName())
            .append("dueDate", getDueDate())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .toString();
    }
}
