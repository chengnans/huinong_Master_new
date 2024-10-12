package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.WorksList;

/**
 * 作品列表Service接口
 * 
 * @author cheng
 * @date 2024-10-13
 */
public interface IWorksListService 
{
    /**
     * 查询作品列表
     * 
     * @param id 作品列表主键
     * @return 作品列表
     */
    public WorksList selectWorksListById(Long id);

    /**
     * 查询作品列表列表
     * 
     * @param worksList 作品列表
     * @return 作品列表集合
     */
    public List<WorksList> selectWorksListList(WorksList worksList);

    /**
     * 新增作品列表
     * 
     * @param worksList 作品列表
     * @return 结果
     */
    public int insertWorksList(WorksList worksList);

    /**
     * 修改作品列表
     * 
     * @param worksList 作品列表
     * @return 结果
     */
    public int updateWorksList(WorksList worksList);

    /**
     * 批量删除作品列表
     * 
     * @param ids 需要删除的作品列表主键集合
     * @return 结果
     */
    public int deleteWorksListByIds(Long[] ids);

    /**
     * 删除作品列表信息
     * 
     * @param id 作品列表主键
     * @return 结果
     */
    public int deleteWorksListById(Long id);
}
