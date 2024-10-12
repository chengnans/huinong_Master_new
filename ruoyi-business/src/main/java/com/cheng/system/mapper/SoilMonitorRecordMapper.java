package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.SoilMonitorRecord;

/**
 * 土壤检测记录Mapper接口
 * 
 * @author cheng
 * @date 2024-10-12
 */
public interface SoilMonitorRecordMapper 
{
    /**
     * 查询土壤检测记录
     * 
     * @param id 土壤检测记录主键
     * @return 土壤检测记录
     */
    public SoilMonitorRecord selectSoilMonitorRecordById(Long id);

    /**
     * 查询土壤检测记录列表
     * 
     * @param soilMonitorRecord 土壤检测记录
     * @return 土壤检测记录集合
     */
    public List<SoilMonitorRecord> selectSoilMonitorRecordList(SoilMonitorRecord soilMonitorRecord);

    /**
     * 新增土壤检测记录
     * 
     * @param soilMonitorRecord 土壤检测记录
     * @return 结果
     */
    public int insertSoilMonitorRecord(SoilMonitorRecord soilMonitorRecord);

    /**
     * 修改土壤检测记录
     * 
     * @param soilMonitorRecord 土壤检测记录
     * @return 结果
     */
    public int updateSoilMonitorRecord(SoilMonitorRecord soilMonitorRecord);

    /**
     * 删除土壤检测记录
     * 
     * @param id 土壤检测记录主键
     * @return 结果
     */
    public int deleteSoilMonitorRecordById(Long id);

    /**
     * 批量删除土壤检测记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSoilMonitorRecordByIds(Long[] ids);
}
