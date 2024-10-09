package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.SoilReport;

/**
 * 土壤分级报表Mapper接口
 * 
 * @author cheng
 * @date 2024-10-09
 */
public interface SoilReportMapper 
{
    /**
     * 查询土壤分级报表
     * 
     * @param id 土壤分级报表主键
     * @return 土壤分级报表
     */
    public SoilReport selectSoilReportById(Long id);

    /**
     * 查询土壤分级报表列表
     * 
     * @param soilReport 土壤分级报表
     * @return 土壤分级报表集合
     */
    public List<SoilReport> selectSoilReportList(SoilReport soilReport);

    /**
     * 新增土壤分级报表
     * 
     * @param soilReport 土壤分级报表
     * @return 结果
     */
    public int insertSoilReport(SoilReport soilReport);

    /**
     * 修改土壤分级报表
     * 
     * @param soilReport 土壤分级报表
     * @return 结果
     */
    public int updateSoilReport(SoilReport soilReport);

    /**
     * 删除土壤分级报表
     * 
     * @param id 土壤分级报表主键
     * @return 结果
     */
    public int deleteSoilReportById(Long id);

    /**
     * 批量删除土壤分级报表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSoilReportByIds(Long[] ids);
}
