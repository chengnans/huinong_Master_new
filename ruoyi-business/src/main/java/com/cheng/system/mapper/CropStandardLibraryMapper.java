package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.CropStandardLibrary;

/**
 * 种植业标准库Mapper接口
 * 
 * @author cheng
 * @date 2024-10-09
 */
public interface CropStandardLibraryMapper 
{
    /**
     * 查询种植业标准库
     * 
     * @param id 种植业标准库主键
     * @return 种植业标准库
     */
    public CropStandardLibrary selectCropStandardLibraryById(Long id);

    /**
     * 查询种植业标准库列表
     * 
     * @param cropStandardLibrary 种植业标准库
     * @return 种植业标准库集合
     */
    public List<CropStandardLibrary> selectCropStandardLibraryList(CropStandardLibrary cropStandardLibrary);

    /**
     * 新增种植业标准库
     * 
     * @param cropStandardLibrary 种植业标准库
     * @return 结果
     */
    public int insertCropStandardLibrary(CropStandardLibrary cropStandardLibrary);

    /**
     * 修改种植业标准库
     * 
     * @param cropStandardLibrary 种植业标准库
     * @return 结果
     */
    public int updateCropStandardLibrary(CropStandardLibrary cropStandardLibrary);

    /**
     * 删除种植业标准库
     * 
     * @param id 种植业标准库主键
     * @return 结果
     */
    public int deleteCropStandardLibraryById(Long id);

    /**
     * 批量删除种植业标准库
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCropStandardLibraryByIds(Long[] ids);
}
