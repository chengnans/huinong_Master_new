package com.cheng.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.SoilReportMapper;
import com.cheng.system.domain.SoilReport;
import com.cheng.system.service.ISoilReportService;

/**
 * 土壤分级报表Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-09
 */
@Service
public class SoilReportServiceImpl implements ISoilReportService 
{
    @Autowired
    private SoilReportMapper soilReportMapper;

    /**
     * 查询土壤分级报表
     * 
     * @param id 土壤分级报表主键
     * @return 土壤分级报表
     */
    @Override
    public SoilReport selectSoilReportById(Long id)
    {
        return soilReportMapper.selectSoilReportById(id);
    }

    /**
     * 查询土壤分级报表列表
     * 
     * @param soilReport 土壤分级报表
     * @return 土壤分级报表
     */
    @Override
    public List<SoilReport> selectSoilReportList(SoilReport soilReport)
    {
        return soilReportMapper.selectSoilReportList(soilReport);
    }

    /**
     * 新增土壤分级报表
     * 
     * @param soilReport 土壤分级报表
     * @return 结果
     */
    @Override
    public int insertSoilReport(SoilReport soilReport)
    {
        return soilReportMapper.insertSoilReport(soilReport);
    }

    /**
     * 修改土壤分级报表
     * 
     * @param soilReport 土壤分级报表
     * @return 结果
     */
    @Override
    public int updateSoilReport(SoilReport soilReport)
    {
        return soilReportMapper.updateSoilReport(soilReport);
    }

    /**
     * 批量删除土壤分级报表
     * 
     * @param ids 需要删除的土壤分级报表主键
     * @return 结果
     */
    @Override
    public int deleteSoilReportByIds(Long[] ids)
    {
        return soilReportMapper.deleteSoilReportByIds(ids);
    }

    /**
     * 删除土壤分级报表信息
     * 
     * @param id 土壤分级报表主键
     * @return 结果
     */
    @Override
    public int deleteSoilReportById(Long id)
    {
        return soilReportMapper.deleteSoilReportById(id);
    }
}
