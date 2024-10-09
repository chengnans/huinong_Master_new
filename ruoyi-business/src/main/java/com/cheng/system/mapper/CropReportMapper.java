package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.CropReport;

/**
 * 农作物监测报表Mapper接口
 * 
 * @author cheng
 * @date 2024-10-09
 */
public interface CropReportMapper 
{
    /**
     * 查询农作物监测报表
     * 
     * @param id 农作物监测报表主键
     * @return 农作物监测报表
     */
    public CropReport selectCropReportById(Long id);

    /**
     * 查询农作物监测报表列表
     * 
     * @param cropReport 农作物监测报表
     * @return 农作物监测报表集合
     */
    public List<CropReport> selectCropReportList(CropReport cropReport);

    /**
     * 新增农作物监测报表
     * 
     * @param cropReport 农作物监测报表
     * @return 结果
     */
    public int insertCropReport(CropReport cropReport);

    /**
     * 修改农作物监测报表
     * 
     * @param cropReport 农作物监测报表
     * @return 结果
     */
    public int updateCropReport(CropReport cropReport);

    /**
     * 删除农作物监测报表
     * 
     * @param id 农作物监测报表主键
     * @return 结果
     */
    public int deleteCropReportById(Long id);

    /**
     * 批量删除农作物监测报表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCropReportByIds(Long[] ids);
}
