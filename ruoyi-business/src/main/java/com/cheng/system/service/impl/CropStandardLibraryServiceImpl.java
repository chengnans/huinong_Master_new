package com.cheng.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.CropStandardLibraryMapper;
import com.cheng.system.domain.CropStandardLibrary;
import com.cheng.system.service.ICropStandardLibraryService;

/**
 * 种植业标准库Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-09
 */
@Service
public class CropStandardLibraryServiceImpl implements ICropStandardLibraryService 
{
    @Autowired
    private CropStandardLibraryMapper cropStandardLibraryMapper;

    /**
     * 查询种植业标准库
     * 
     * @param id 种植业标准库主键
     * @return 种植业标准库
     */
    @Override
    public CropStandardLibrary selectCropStandardLibraryById(Long id)
    {
        return cropStandardLibraryMapper.selectCropStandardLibraryById(id);
    }

    /**
     * 查询种植业标准库列表
     * 
     * @param cropStandardLibrary 种植业标准库
     * @return 种植业标准库
     */
    @Override
    public List<CropStandardLibrary> selectCropStandardLibraryList(CropStandardLibrary cropStandardLibrary)
    {
        return cropStandardLibraryMapper.selectCropStandardLibraryList(cropStandardLibrary);
    }

    /**
     * 新增种植业标准库
     * 
     * @param cropStandardLibrary 种植业标准库
     * @return 结果
     */
    @Override
    public int insertCropStandardLibrary(CropStandardLibrary cropStandardLibrary)
    {
        return cropStandardLibraryMapper.insertCropStandardLibrary(cropStandardLibrary);
    }

    /**
     * 修改种植业标准库
     * 
     * @param cropStandardLibrary 种植业标准库
     * @return 结果
     */
    @Override
    public int updateCropStandardLibrary(CropStandardLibrary cropStandardLibrary)
    {
        return cropStandardLibraryMapper.updateCropStandardLibrary(cropStandardLibrary);
    }

    /**
     * 批量删除种植业标准库
     * 
     * @param ids 需要删除的种植业标准库主键
     * @return 结果
     */
    @Override
    public int deleteCropStandardLibraryByIds(Long[] ids)
    {
        return cropStandardLibraryMapper.deleteCropStandardLibraryByIds(ids);
    }

    /**
     * 删除种植业标准库信息
     * 
     * @param id 种植业标准库主键
     * @return 结果
     */
    @Override
    public int deleteCropStandardLibraryById(Long id)
    {
        return cropStandardLibraryMapper.deleteCropStandardLibraryById(id);
    }
}
