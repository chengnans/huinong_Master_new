package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.VideoLibrary;

/**
 * 音视频库Service接口
 * 
 * @author cheng
 * @date 2024-10-13
 */
public interface IVideoLibraryService 
{
    /**
     * 查询音视频库
     * 
     * @param id 音视频库主键
     * @return 音视频库
     */
    public VideoLibrary selectVideoLibraryById(Long id);

    /**
     * 查询音视频库列表
     * 
     * @param videoLibrary 音视频库
     * @return 音视频库集合
     */
    public List<VideoLibrary> selectVideoLibraryList(VideoLibrary videoLibrary);

    /**
     * 新增音视频库
     * 
     * @param videoLibrary 音视频库
     * @return 结果
     */
    public int insertVideoLibrary(VideoLibrary videoLibrary);

    /**
     * 修改音视频库
     * 
     * @param videoLibrary 音视频库
     * @return 结果
     */
    public int updateVideoLibrary(VideoLibrary videoLibrary);

    /**
     * 批量删除音视频库
     * 
     * @param ids 需要删除的音视频库主键集合
     * @return 结果
     */
    public int deleteVideoLibraryByIds(Long[] ids);

    /**
     * 删除音视频库信息
     * 
     * @param id 音视频库主键
     * @return 结果
     */
    public int deleteVideoLibraryById(Long id);
}
