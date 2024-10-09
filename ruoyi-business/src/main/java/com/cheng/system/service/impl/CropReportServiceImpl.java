package com.cheng.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.CropReportMapper;
import com.cheng.system.domain.CropReport;
import com.cheng.system.service.ICropReportService;

/**
 * 农作物监测报表Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-09
 */
@Service
public class CropReportServiceImpl implements ICropReportService 
{
    @Autowired
    private CropReportMapper cropReportMapper;

    /**
     * 查询农作物监测报表
     * 
     * @param id 农作物监测报表主键
     * @return 农作物监测报表
     */
    @Override
    public CropReport selectCropReportById(Long id)
    {
        return cropReportMapper.selectCropReportById(id);
    }

    /**
     * 查询农作物监测报表列表
     * 
     * @param cropReport 农作物监测报表
     * @return 农作物监测报表
     */
    @Override
    public List<CropReport> selectCropReportList(CropReport cropReport)
    {
        return cropReportMapper.selectCropReportList(cropReport);
    }

    /**
     * 新增农作物监测报表
     * 
     * @param cropReport 农作物监测报表
     * @return 结果
     */
    @Override
    public int insertCropReport(CropReport cropReport)
    {
        return cropReportMapper.insertCropReport(cropReport);
    }

    /**
     * 修改农作物监测报表
     * 
     * @param cropReport 农作物监测报表
     * @return 结果
     */
    @Override
    public int updateCropReport(CropReport cropReport)
    {
        return cropReportMapper.updateCropReport(cropReport);
    }

    /**
     * 批量删除农作物监测报表
     * 
     * @param ids 需要删除的农作物监测报表主键
     * @return 结果
     */
    @Override
    public int deleteCropReportByIds(Long[] ids)
    {
        return cropReportMapper.deleteCropReportByIds(ids);
    }

    /**
     * 删除农作物监测报表信息
     * 
     * @param id 农作物监测报表主键
     * @return 结果
     */
    @Override
    public int deleteCropReportById(Long id)
    {
        return cropReportMapper.deleteCropReportById(id);
    }
}
