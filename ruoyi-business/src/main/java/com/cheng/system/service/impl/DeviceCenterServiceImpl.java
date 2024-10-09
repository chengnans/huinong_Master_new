package com.cheng.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.DeviceCenterMapper;
import com.cheng.system.domain.DeviceCenter;
import com.cheng.system.service.IDeviceCenterService;

/**
 * 设备中心Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-09
 */
@Service
public class DeviceCenterServiceImpl implements IDeviceCenterService 
{
    @Autowired
    private DeviceCenterMapper deviceCenterMapper;

    /**
     * 查询设备中心
     * 
     * @param IMEI 设备中心主键
     * @return 设备中心
     */
    @Override
    public DeviceCenter selectDeviceCenterByIMEI(String IMEI)
    {
        return deviceCenterMapper.selectDeviceCenterByIMEI(IMEI);
    }

    /**
     * 查询设备中心列表
     * 
     * @param deviceCenter 设备中心
     * @return 设备中心
     */
    @Override
    public List<DeviceCenter> selectDeviceCenterList(DeviceCenter deviceCenter)
    {
        return deviceCenterMapper.selectDeviceCenterList(deviceCenter);
    }

    /**
     * 新增设备中心
     * 
     * @param deviceCenter 设备中心
     * @return 结果
     */
    @Override
    public int insertDeviceCenter(DeviceCenter deviceCenter)
    {
        return deviceCenterMapper.insertDeviceCenter(deviceCenter);
    }

    /**
     * 修改设备中心
     * 
     * @param deviceCenter 设备中心
     * @return 结果
     */
    @Override
    public int updateDeviceCenter(DeviceCenter deviceCenter)
    {
        return deviceCenterMapper.updateDeviceCenter(deviceCenter);
    }

    /**
     * 批量删除设备中心
     * 
     * @param IMEIs 需要删除的设备中心主键
     * @return 结果
     */
    @Override
    public int deleteDeviceCenterByIMEIs(String[] IMEIs)
    {
        return deviceCenterMapper.deleteDeviceCenterByIMEIs(IMEIs);
    }

    /**
     * 删除设备中心信息
     * 
     * @param IMEI 设备中心主键
     * @return 结果
     */
    @Override
    public int deleteDeviceCenterByIMEI(String IMEI)
    {
        return deviceCenterMapper.deleteDeviceCenterByIMEI(IMEI);
    }
}
