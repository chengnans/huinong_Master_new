package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.StoryLibrary;

/**
 * 故事库Service接口
 * 
 * @author cheng
 * @date 2024-10-13
 */
public interface IStoryLibraryService 
{
    /**
     * 查询故事库
     * 
     * @param id 故事库主键
     * @return 故事库
     */
    public StoryLibrary selectStoryLibraryById(Long id);

    /**
     * 查询故事库列表
     * 
     * @param storyLibrary 故事库
     * @return 故事库集合
     */
    public List<StoryLibrary> selectStoryLibraryList(StoryLibrary storyLibrary);

    /**
     * 新增故事库
     * 
     * @param storyLibrary 故事库
     * @return 结果
     */
    public int insertStoryLibrary(StoryLibrary storyLibrary);

    /**
     * 修改故事库
     * 
     * @param storyLibrary 故事库
     * @return 结果
     */
    public int updateStoryLibrary(StoryLibrary storyLibrary);

    /**
     * 批量删除故事库
     * 
     * @param ids 需要删除的故事库主键集合
     * @return 结果
     */
    public int deleteStoryLibraryByIds(Long[] ids);

    /**
     * 删除故事库信息
     * 
     * @param id 故事库主键
     * @return 结果
     */
    public int deleteStoryLibraryById(Long id);
}
