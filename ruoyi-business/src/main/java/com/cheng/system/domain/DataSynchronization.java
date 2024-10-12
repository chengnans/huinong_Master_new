package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 数据同步任务对象 data_synchronization
 * 
 * @author cheng
 * @date 2024-10-12
 */
public class DataSynchronization extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 编号 */
    @Excel(name = "编号")
    private String bid;

    /** 任务名称 */
    @Excel(name = "任务名称")
    private String taskName;

    /** 数据源名称 */
    @Excel(name = "数据源名称")
    private String dataSourceName;

    /** 接口分类名称 */
    @Excel(name = "接口分类名称")
    private String interfaceClassName;

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
    public void setTaskName(String taskName) 
    {
        this.taskName = taskName;
    }

    public String getTaskName() 
    {
        return taskName;
    }
    public void setDataSourceName(String dataSourceName) 
    {
        this.dataSourceName = dataSourceName;
    }

    public String getDataSourceName() 
    {
        return dataSourceName;
    }
    public void setInterfaceClassName(String interfaceClassName) 
    {
        this.interfaceClassName = interfaceClassName;
    }

    public String getInterfaceClassName() 
    {
        return interfaceClassName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("bid", getBid())
            .append("taskName", getTaskName())
            .append("dataSourceName", getDataSourceName())
            .append("interfaceClassName", getInterfaceClassName())
            .append("createTime", getCreateTime())
            .toString();
    }
}
