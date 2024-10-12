package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.PhotoLibraryMapper;
import com.cheng.system.domain.PhotoLibrary;
import com.cheng.system.service.IPhotoLibraryService;

/**
 * 图片库Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-13
 */
@Service
public class PhotoLibraryServiceImpl implements IPhotoLibraryService 
{
    @Autowired
    private PhotoLibraryMapper photoLibraryMapper;

    /**
     * 查询图片库
     * 
     * @param id 图片库主键
     * @return 图片库
     */
    @Override
    public PhotoLibrary selectPhotoLibraryById(Long id)
    {
        return photoLibraryMapper.selectPhotoLibraryById(id);
    }

    /**
     * 查询图片库列表
     * 
     * @param photoLibrary 图片库
     * @return 图片库
     */
    @Override
    public List<PhotoLibrary> selectPhotoLibraryList(PhotoLibrary photoLibrary)
    {
        return photoLibraryMapper.selectPhotoLibraryList(photoLibrary);
    }

    /**
     * 新增图片库
     * 
     * @param photoLibrary 图片库
     * @return 结果
     */
    @Override
    public int insertPhotoLibrary(PhotoLibrary photoLibrary)
    {
        photoLibrary.setCreateTime(DateUtils.getNowDate());
        return photoLibraryMapper.insertPhotoLibrary(photoLibrary);
    }

    /**
     * 修改图片库
     * 
     * @param photoLibrary 图片库
     * @return 结果
     */
    @Override
    public int updatePhotoLibrary(PhotoLibrary photoLibrary)
    {
        return photoLibraryMapper.updatePhotoLibrary(photoLibrary);
    }

    /**
     * 批量删除图片库
     * 
     * @param ids 需要删除的图片库主键
     * @return 结果
     */
    @Override
    public int deletePhotoLibraryByIds(Long[] ids)
    {
        return photoLibraryMapper.deletePhotoLibraryByIds(ids);
    }

    /**
     * 删除图片库信息
     * 
     * @param id 图片库主键
     * @return 结果
     */
    @Override
    public int deletePhotoLibraryById(Long id)
    {
        return photoLibraryMapper.deletePhotoLibraryById(id);
    }
}
