package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.DiseasesStandardLibraryMapper;
import com.cheng.system.domain.DiseasesStandardLibrary;
import com.cheng.system.service.IDiseasesStandardLibraryService;

/**
 * 病虫害标准库Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-09
 */
@Service
public class DiseasesStandardLibraryServiceImpl implements IDiseasesStandardLibraryService 
{
    @Autowired
    private DiseasesStandardLibraryMapper diseasesStandardLibraryMapper;

    /**
     * 查询病虫害标准库
     * 
     * @param id 病虫害标准库主键
     * @return 病虫害标准库
     */
    @Override
    public DiseasesStandardLibrary selectDiseasesStandardLibraryById(Long id)
    {
        return diseasesStandardLibraryMapper.selectDiseasesStandardLibraryById(id);
    }

    /**
     * 查询病虫害标准库列表
     * 
     * @param diseasesStandardLibrary 病虫害标准库
     * @return 病虫害标准库
     */
    @Override
    public List<DiseasesStandardLibrary> selectDiseasesStandardLibraryList(DiseasesStandardLibrary diseasesStandardLibrary)
    {
        return diseasesStandardLibraryMapper.selectDiseasesStandardLibraryList(diseasesStandardLibrary);
    }

    /**
     * 新增病虫害标准库
     * 
     * @param diseasesStandardLibrary 病虫害标准库
     * @return 结果
     */
    @Override
    public int insertDiseasesStandardLibrary(DiseasesStandardLibrary diseasesStandardLibrary)
    {
        diseasesStandardLibrary.setCreateTime(DateUtils.getNowDate());
        return diseasesStandardLibraryMapper.insertDiseasesStandardLibrary(diseasesStandardLibrary);
    }

    /**
     * 修改病虫害标准库
     * 
     * @param diseasesStandardLibrary 病虫害标准库
     * @return 结果
     */
    @Override
    public int updateDiseasesStandardLibrary(DiseasesStandardLibrary diseasesStandardLibrary)
    {
        return diseasesStandardLibraryMapper.updateDiseasesStandardLibrary(diseasesStandardLibrary);
    }

    /**
     * 批量删除病虫害标准库
     * 
     * @param ids 需要删除的病虫害标准库主键
     * @return 结果
     */
    @Override
    public int deleteDiseasesStandardLibraryByIds(Long[] ids)
    {
        return diseasesStandardLibraryMapper.deleteDiseasesStandardLibraryByIds(ids);
    }

    /**
     * 删除病虫害标准库信息
     * 
     * @param id 病虫害标准库主键
     * @return 结果
     */
    @Override
    public int deleteDiseasesStandardLibraryById(Long id)
    {
        return diseasesStandardLibraryMapper.deleteDiseasesStandardLibraryById(id);
    }
}
