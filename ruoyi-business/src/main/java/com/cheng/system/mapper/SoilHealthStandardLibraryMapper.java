package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.SoilHealthStandardLibrary;

/**
 * 土壤健康标准库Mapper接口
 * 
 * @author cheng
 * @date 2024-10-12
 */
public interface SoilHealthStandardLibraryMapper 
{
    /**
     * 查询土壤健康标准库
     * 
     * @param id 土壤健康标准库主键
     * @return 土壤健康标准库
     */
    public SoilHealthStandardLibrary selectSoilHealthStandardLibraryById(Long id);

    /**
     * 查询土壤健康标准库列表
     * 
     * @param soilHealthStandardLibrary 土壤健康标准库
     * @return 土壤健康标准库集合
     */
    public List<SoilHealthStandardLibrary> selectSoilHealthStandardLibraryList(SoilHealthStandardLibrary soilHealthStandardLibrary);

    /**
     * 新增土壤健康标准库
     * 
     * @param soilHealthStandardLibrary 土壤健康标准库
     * @return 结果
     */
    public int insertSoilHealthStandardLibrary(SoilHealthStandardLibrary soilHealthStandardLibrary);

    /**
     * 修改土壤健康标准库
     * 
     * @param soilHealthStandardLibrary 土壤健康标准库
     * @return 结果
     */
    public int updateSoilHealthStandardLibrary(SoilHealthStandardLibrary soilHealthStandardLibrary);

    /**
     * 删除土壤健康标准库
     * 
     * @param id 土壤健康标准库主键
     * @return 结果
     */
    public int deleteSoilHealthStandardLibraryById(Long id);

    /**
     * 批量删除土壤健康标准库
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSoilHealthStandardLibraryByIds(Long[] ids);
}
