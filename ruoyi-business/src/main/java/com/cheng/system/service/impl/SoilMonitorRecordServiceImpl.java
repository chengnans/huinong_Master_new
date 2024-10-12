package com.cheng.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.SoilMonitorRecordMapper;
import com.cheng.system.domain.SoilMonitorRecord;
import com.cheng.system.service.ISoilMonitorRecordService;

/**
 * 土壤检测记录Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-12
 */
@Service
public class SoilMonitorRecordServiceImpl implements ISoilMonitorRecordService 
{
    @Autowired
    private SoilMonitorRecordMapper soilMonitorRecordMapper;

    /**
     * 查询土壤检测记录
     * 
     * @param id 土壤检测记录主键
     * @return 土壤检测记录
     */
    @Override
    public SoilMonitorRecord selectSoilMonitorRecordById(Long id)
    {
        return soilMonitorRecordMapper.selectSoilMonitorRecordById(id);
    }

    /**
     * 查询土壤检测记录列表
     * 
     * @param soilMonitorRecord 土壤检测记录
     * @return 土壤检测记录
     */
    @Override
    public List<SoilMonitorRecord> selectSoilMonitorRecordList(SoilMonitorRecord soilMonitorRecord)
    {
        return soilMonitorRecordMapper.selectSoilMonitorRecordList(soilMonitorRecord);
    }

    /**
     * 新增土壤检测记录
     * 
     * @param soilMonitorRecord 土壤检测记录
     * @return 结果
     */
    @Override
    public int insertSoilMonitorRecord(SoilMonitorRecord soilMonitorRecord)
    {
        return soilMonitorRecordMapper.insertSoilMonitorRecord(soilMonitorRecord);
    }

    /**
     * 修改土壤检测记录
     * 
     * @param soilMonitorRecord 土壤检测记录
     * @return 结果
     */
    @Override
    public int updateSoilMonitorRecord(SoilMonitorRecord soilMonitorRecord)
    {
        return soilMonitorRecordMapper.updateSoilMonitorRecord(soilMonitorRecord);
    }

    /**
     * 批量删除土壤检测记录
     * 
     * @param ids 需要删除的土壤检测记录主键
     * @return 结果
     */
    @Override
    public int deleteSoilMonitorRecordByIds(Long[] ids)
    {
        return soilMonitorRecordMapper.deleteSoilMonitorRecordByIds(ids);
    }

    /**
     * 删除土壤检测记录信息
     * 
     * @param id 土壤检测记录主键
     * @return 结果
     */
    @Override
    public int deleteSoilMonitorRecordById(Long id)
    {
        return soilMonitorRecordMapper.deleteSoilMonitorRecordById(id);
    }
}
