package com.cheng.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.SoilHealthStandardLibraryMapper;
import com.cheng.system.domain.SoilHealthStandardLibrary;
import com.cheng.system.service.ISoilHealthStandardLibraryService;

/**
 * 土壤健康标准库Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-12
 */
@Service
public class SoilHealthStandardLibraryServiceImpl implements ISoilHealthStandardLibraryService 
{
    @Autowired
    private SoilHealthStandardLibraryMapper soilHealthStandardLibraryMapper;

    /**
     * 查询土壤健康标准库
     * 
     * @param id 土壤健康标准库主键
     * @return 土壤健康标准库
     */
    @Override
    public SoilHealthStandardLibrary selectSoilHealthStandardLibraryById(Long id)
    {
        return soilHealthStandardLibraryMapper.selectSoilHealthStandardLibraryById(id);
    }

    /**
     * 查询土壤健康标准库列表
     * 
     * @param soilHealthStandardLibrary 土壤健康标准库
     * @return 土壤健康标准库
     */
    @Override
    public List<SoilHealthStandardLibrary> selectSoilHealthStandardLibraryList(SoilHealthStandardLibrary soilHealthStandardLibrary)
    {
        return soilHealthStandardLibraryMapper.selectSoilHealthStandardLibraryList(soilHealthStandardLibrary);
    }

    /**
     * 新增土壤健康标准库
     * 
     * @param soilHealthStandardLibrary 土壤健康标准库
     * @return 结果
     */
    @Override
    public int insertSoilHealthStandardLibrary(SoilHealthStandardLibrary soilHealthStandardLibrary)
    {
        return soilHealthStandardLibraryMapper.insertSoilHealthStandardLibrary(soilHealthStandardLibrary);
    }

    /**
     * 修改土壤健康标准库
     * 
     * @param soilHealthStandardLibrary 土壤健康标准库
     * @return 结果
     */
    @Override
    public int updateSoilHealthStandardLibrary(SoilHealthStandardLibrary soilHealthStandardLibrary)
    {
        return soilHealthStandardLibraryMapper.updateSoilHealthStandardLibrary(soilHealthStandardLibrary);
    }

    /**
     * 批量删除土壤健康标准库
     * 
     * @param ids 需要删除的土壤健康标准库主键
     * @return 结果
     */
    @Override
    public int deleteSoilHealthStandardLibraryByIds(Long[] ids)
    {
        return soilHealthStandardLibraryMapper.deleteSoilHealthStandardLibraryByIds(ids);
    }

    /**
     * 删除土壤健康标准库信息
     * 
     * @param id 土壤健康标准库主键
     * @return 结果
     */
    @Override
    public int deleteSoilHealthStandardLibraryById(Long id)
    {
        return soilHealthStandardLibraryMapper.deleteSoilHealthStandardLibraryById(id);
    }
}
