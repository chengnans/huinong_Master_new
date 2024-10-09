package com.cheng.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.cheng.system.domain.DeviceCenter;
import com.cheng.system.service.IDeviceCenterService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设备中心Controller
 * 
 * @author cheng
 * @date 2024-10-09
 */
@RestController
@RequestMapping("/system/device_center")
public class DeviceCenterController extends BaseController
{
    @Autowired
    private IDeviceCenterService deviceCenterService;

    /**
     * 查询设备中心列表
     */
    @PreAuthorize("@ss.hasPermi('system:device_center:list')")
    @GetMapping("/list")
    public TableDataInfo list(DeviceCenter deviceCenter)
    {
        startPage();
        List<DeviceCenter> list = deviceCenterService.selectDeviceCenterList(deviceCenter);
        return getDataTable(list);
    }

    /**
     * 导出设备中心列表
     */
    @PreAuthorize("@ss.hasPermi('system:device_center:export')")
    @Log(title = "设备中心", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DeviceCenter deviceCenter)
    {
        List<DeviceCenter> list = deviceCenterService.selectDeviceCenterList(deviceCenter);
        ExcelUtil<DeviceCenter> util = new ExcelUtil<DeviceCenter>(DeviceCenter.class);
        util.exportExcel(response, list, "设备中心数据");
    }

    /**
     * 获取设备中心详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:device_center:query')")
    @GetMapping(value = "/{IMEI}")
    public AjaxResult getInfo(@PathVariable("IMEI") String IMEI)
    {
        return success(deviceCenterService.selectDeviceCenterByIMEI(IMEI));
    }

    /**
     * 新增设备中心
     */
    @PreAuthorize("@ss.hasPermi('system:device_center:add')")
    @Log(title = "设备中心", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DeviceCenter deviceCenter)
    {
        return toAjax(deviceCenterService.insertDeviceCenter(deviceCenter));
    }

    /**
     * 修改设备中心
     */
    @PreAuthorize("@ss.hasPermi('system:device_center:edit')")
    @Log(title = "设备中心", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DeviceCenter deviceCenter)
    {
        return toAjax(deviceCenterService.updateDeviceCenter(deviceCenter));
    }

    /**
     * 删除设备中心
     */
    @PreAuthorize("@ss.hasPermi('system:device_center:remove')")
    @Log(title = "设备中心", businessType = BusinessType.DELETE)
	@DeleteMapping("/{IMEIs}")
    public AjaxResult remove(@PathVariable String[] IMEIs)
    {
        return toAjax(deviceCenterService.deleteDeviceCenterByIMEIs(IMEIs));
    }
}
