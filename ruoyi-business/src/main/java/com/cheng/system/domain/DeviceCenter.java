package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设备中心对象 device_center
 * 
 * @author cheng
 * @date 2024-10-09
 */
public class DeviceCenter extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** IMEI/MAC */
    @Excel(name = "IMEI/MAC")
    private String IMEI;

    /** 设备分类 */
    @Excel(name = "设备分类")
    private Long deviceClassify;

    /** 产品名称 */
    @Excel(name = "产品名称")
    private String deviceName;

    /** 产品ID */
    @Excel(name = "产品ID")
    private String deviceId;

    /** 接入来源 */
    @Excel(name = "接入来源")
    private String resource;

    /** 所属机构 */
    @Excel(name = "所属机构")
    private String organization;

    public void setIMEI(String IMEI) 
    {
        this.IMEI = IMEI;
    }

    public String getIMEI() 
    {
        return IMEI;
    }
    public void setDeviceClassify(Long deviceClassify) 
    {
        this.deviceClassify = deviceClassify;
    }

    public Long getDeviceClassify() 
    {
        return deviceClassify;
    }
    public void setDeviceName(String deviceName) 
    {
        this.deviceName = deviceName;
    }

    public String getDeviceName() 
    {
        return deviceName;
    }
    public void setDeviceId(String deviceId) 
    {
        this.deviceId = deviceId;
    }

    public String getDeviceId() 
    {
        return deviceId;
    }
    public void setResource(String resource) 
    {
        this.resource = resource;
    }

    public String getResource() 
    {
        return resource;
    }
    public void setOrganization(String organization) 
    {
        this.organization = organization;
    }

    public String getOrganization() 
    {
        return organization;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("IMEI", getIMEI())
            .append("deviceClassify", getDeviceClassify())
            .append("deviceName", getDeviceName())
            .append("deviceId", getDeviceId())
            .append("resource", getResource())
            .append("organization", getOrganization())
            .toString();
    }
}
