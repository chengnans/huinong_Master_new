package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.PhotoLibrary;

/**
 * 图片库Service接口
 * 
 * @author cheng
 * @date 2024-10-13
 */
public interface IPhotoLibraryService 
{
    /**
     * 查询图片库
     * 
     * @param id 图片库主键
     * @return 图片库
     */
    public PhotoLibrary selectPhotoLibraryById(Long id);

    /**
     * 查询图片库列表
     * 
     * @param photoLibrary 图片库
     * @return 图片库集合
     */
    public List<PhotoLibrary> selectPhotoLibraryList(PhotoLibrary photoLibrary);

    /**
     * 新增图片库
     * 
     * @param photoLibrary 图片库
     * @return 结果
     */
    public int insertPhotoLibrary(PhotoLibrary photoLibrary);

    /**
     * 修改图片库
     * 
     * @param photoLibrary 图片库
     * @return 结果
     */
    public int updatePhotoLibrary(PhotoLibrary photoLibrary);

    /**
     * 批量删除图片库
     * 
     * @param ids 需要删除的图片库主键集合
     * @return 结果
     */
    public int deletePhotoLibraryByIds(Long[] ids);

    /**
     * 删除图片库信息
     * 
     * @param id 图片库主键
     * @return 结果
     */
    public int deletePhotoLibraryById(Long id);
}
