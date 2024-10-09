package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 概览统计对象 overview_statistics
 * 
 * @author cheng
 * @date 2024-10-09
 */
public class OverviewStatistics extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 预警时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预警时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date alarmTime;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String deviceName;

    /** 预警类型 */
    @Excel(name = "预警类型")
    private String alarmType;

    /** 预警原因 */
    @Excel(name = "预警原因")
    private String alarmReason;

    /** 所属基地 */
    @Excel(name = "所属基地")
    private String alarmBaseland;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAlarmTime(Date alarmTime) 
    {
        this.alarmTime = alarmTime;
    }

    public Date getAlarmTime() 
    {
        return alarmTime;
    }
    public void setDeviceName(String deviceName) 
    {
        this.deviceName = deviceName;
    }

    public String getDeviceName() 
    {
        return deviceName;
    }
    public void setAlarmType(String alarmType) 
    {
        this.alarmType = alarmType;
    }

    public String getAlarmType() 
    {
        return alarmType;
    }
    public void setAlarmReason(String alarmReason) 
    {
        this.alarmReason = alarmReason;
    }

    public String getAlarmReason() 
    {
        return alarmReason;
    }
    public void setAlarmBaseland(String alarmBaseland) 
    {
        this.alarmBaseland = alarmBaseland;
    }

    public String getAlarmBaseland() 
    {
        return alarmBaseland;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("alarmTime", getAlarmTime())
            .append("deviceName", getDeviceName())
            .append("alarmType", getAlarmType())
            .append("alarmReason", getAlarmReason())
            .append("alarmBaseland", getAlarmBaseland())
            .toString();
    }
}
