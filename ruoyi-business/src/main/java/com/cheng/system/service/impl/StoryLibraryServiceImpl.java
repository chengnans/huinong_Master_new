package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.StoryLibraryMapper;
import com.cheng.system.domain.StoryLibrary;
import com.cheng.system.service.IStoryLibraryService;

/**
 * 故事库Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-13
 */
@Service
public class StoryLibraryServiceImpl implements IStoryLibraryService 
{
    @Autowired
    private StoryLibraryMapper storyLibraryMapper;

    /**
     * 查询故事库
     * 
     * @param id 故事库主键
     * @return 故事库
     */
    @Override
    public StoryLibrary selectStoryLibraryById(Long id)
    {
        return storyLibraryMapper.selectStoryLibraryById(id);
    }

    /**
     * 查询故事库列表
     * 
     * @param storyLibrary 故事库
     * @return 故事库
     */
    @Override
    public List<StoryLibrary> selectStoryLibraryList(StoryLibrary storyLibrary)
    {
        return storyLibraryMapper.selectStoryLibraryList(storyLibrary);
    }

    /**
     * 新增故事库
     * 
     * @param storyLibrary 故事库
     * @return 结果
     */
    @Override
    public int insertStoryLibrary(StoryLibrary storyLibrary)
    {
        storyLibrary.setCreateTime(DateUtils.getNowDate());
        return storyLibraryMapper.insertStoryLibrary(storyLibrary);
    }

    /**
     * 修改故事库
     * 
     * @param storyLibrary 故事库
     * @return 结果
     */
    @Override
    public int updateStoryLibrary(StoryLibrary storyLibrary)
    {
        return storyLibraryMapper.updateStoryLibrary(storyLibrary);
    }

    /**
     * 批量删除故事库
     * 
     * @param ids 需要删除的故事库主键
     * @return 结果
     */
    @Override
    public int deleteStoryLibraryByIds(Long[] ids)
    {
        return storyLibraryMapper.deleteStoryLibraryByIds(ids);
    }

    /**
     * 删除故事库信息
     * 
     * @param id 故事库主键
     * @return 结果
     */
    @Override
    public int deleteStoryLibraryById(Long id)
    {
        return storyLibraryMapper.deleteStoryLibraryById(id);
    }
}
