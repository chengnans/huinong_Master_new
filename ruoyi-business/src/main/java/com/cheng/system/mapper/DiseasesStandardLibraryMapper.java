package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.DiseasesStandardLibrary;

/**
 * 病虫害标准库Mapper接口
 * 
 * @author cheng
 * @date 2024-10-09
 */
public interface DiseasesStandardLibraryMapper 
{
    /**
     * 查询病虫害标准库
     * 
     * @param id 病虫害标准库主键
     * @return 病虫害标准库
     */
    public DiseasesStandardLibrary selectDiseasesStandardLibraryById(Long id);

    /**
     * 查询病虫害标准库列表
     * 
     * @param diseasesStandardLibrary 病虫害标准库
     * @return 病虫害标准库集合
     */
    public List<DiseasesStandardLibrary> selectDiseasesStandardLibraryList(DiseasesStandardLibrary diseasesStandardLibrary);

    /**
     * 新增病虫害标准库
     * 
     * @param diseasesStandardLibrary 病虫害标准库
     * @return 结果
     */
    public int insertDiseasesStandardLibrary(DiseasesStandardLibrary diseasesStandardLibrary);

    /**
     * 修改病虫害标准库
     * 
     * @param diseasesStandardLibrary 病虫害标准库
     * @return 结果
     */
    public int updateDiseasesStandardLibrary(DiseasesStandardLibrary diseasesStandardLibrary);

    /**
     * 删除病虫害标准库
     * 
     * @param id 病虫害标准库主键
     * @return 结果
     */
    public int deleteDiseasesStandardLibraryById(Long id);

    /**
     * 批量删除病虫害标准库
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDiseasesStandardLibraryByIds(Long[] ids);
}
