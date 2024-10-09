package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.DeviceCenter;

/**
 * 设备中心Mapper接口
 * 
 * @author cheng
 * @date 2024-10-09
 */
public interface DeviceCenterMapper 
{
    /**
     * 查询设备中心
     * 
     * @param IMEI 设备中心主键
     * @return 设备中心
     */
    public DeviceCenter selectDeviceCenterByIMEI(String IMEI);

    /**
     * 查询设备中心列表
     * 
     * @param deviceCenter 设备中心
     * @return 设备中心集合
     */
    public List<DeviceCenter> selectDeviceCenterList(DeviceCenter deviceCenter);

    /**
     * 新增设备中心
     * 
     * @param deviceCenter 设备中心
     * @return 结果
     */
    public int insertDeviceCenter(DeviceCenter deviceCenter);

    /**
     * 修改设备中心
     * 
     * @param deviceCenter 设备中心
     * @return 结果
     */
    public int updateDeviceCenter(DeviceCenter deviceCenter);

    /**
     * 删除设备中心
     * 
     * @param IMEI 设备中心主键
     * @return 结果
     */
    public int deleteDeviceCenterByIMEI(String IMEI);

    /**
     * 批量删除设备中心
     * 
     * @param IMEIs 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDeviceCenterByIMEIs(String[] IMEIs);
}
