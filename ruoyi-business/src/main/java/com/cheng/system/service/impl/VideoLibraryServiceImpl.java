package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.VideoLibraryMapper;
import com.cheng.system.domain.VideoLibrary;
import com.cheng.system.service.IVideoLibraryService;

/**
 * 音视频库Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-13
 */
@Service
public class VideoLibraryServiceImpl implements IVideoLibraryService 
{
    @Autowired
    private VideoLibraryMapper videoLibraryMapper;

    /**
     * 查询音视频库
     * 
     * @param id 音视频库主键
     * @return 音视频库
     */
    @Override
    public VideoLibrary selectVideoLibraryById(Long id)
    {
        return videoLibraryMapper.selectVideoLibraryById(id);
    }

    /**
     * 查询音视频库列表
     * 
     * @param videoLibrary 音视频库
     * @return 音视频库
     */
    @Override
    public List<VideoLibrary> selectVideoLibraryList(VideoLibrary videoLibrary)
    {
        return videoLibraryMapper.selectVideoLibraryList(videoLibrary);
    }

    /**
     * 新增音视频库
     * 
     * @param videoLibrary 音视频库
     * @return 结果
     */
    @Override
    public int insertVideoLibrary(VideoLibrary videoLibrary)
    {
        videoLibrary.setCreateTime(DateUtils.getNowDate());
        return videoLibraryMapper.insertVideoLibrary(videoLibrary);
    }

    /**
     * 修改音视频库
     * 
     * @param videoLibrary 音视频库
     * @return 结果
     */
    @Override
    public int updateVideoLibrary(VideoLibrary videoLibrary)
    {
        return videoLibraryMapper.updateVideoLibrary(videoLibrary);
    }

    /**
     * 批量删除音视频库
     * 
     * @param ids 需要删除的音视频库主键
     * @return 结果
     */
    @Override
    public int deleteVideoLibraryByIds(Long[] ids)
    {
        return videoLibraryMapper.deleteVideoLibraryByIds(ids);
    }

    /**
     * 删除音视频库信息
     * 
     * @param id 音视频库主键
     * @return 结果
     */
    @Override
    public int deleteVideoLibraryById(Long id)
    {
        return videoLibraryMapper.deleteVideoLibraryById(id);
    }
}
