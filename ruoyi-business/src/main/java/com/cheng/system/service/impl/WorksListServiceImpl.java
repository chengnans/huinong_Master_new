package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.WorksListMapper;
import com.cheng.system.domain.WorksList;
import com.cheng.system.service.IWorksListService;

/**
 * 作品列表Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-13
 */
@Service
public class WorksListServiceImpl implements IWorksListService 
{
    @Autowired
    private WorksListMapper worksListMapper;

    /**
     * 查询作品列表
     * 
     * @param id 作品列表主键
     * @return 作品列表
     */
    @Override
    public WorksList selectWorksListById(Long id)
    {
        return worksListMapper.selectWorksListById(id);
    }

    /**
     * 查询作品列表列表
     * 
     * @param worksList 作品列表
     * @return 作品列表
     */
    @Override
    public List<WorksList> selectWorksListList(WorksList worksList)
    {
        return worksListMapper.selectWorksListList(worksList);
    }

    /**
     * 新增作品列表
     * 
     * @param worksList 作品列表
     * @return 结果
     */
    @Override
    public int insertWorksList(WorksList worksList)
    {
        worksList.setCreateTime(DateUtils.getNowDate());
        return worksListMapper.insertWorksList(worksList);
    }

    /**
     * 修改作品列表
     * 
     * @param worksList 作品列表
     * @return 结果
     */
    @Override
    public int updateWorksList(WorksList worksList)
    {
        return worksListMapper.updateWorksList(worksList);
    }

    /**
     * 批量删除作品列表
     * 
     * @param ids 需要删除的作品列表主键
     * @return 结果
     */
    @Override
    public int deleteWorksListByIds(Long[] ids)
    {
        return worksListMapper.deleteWorksListByIds(ids);
    }

    /**
     * 删除作品列表信息
     * 
     * @param id 作品列表主键
     * @return 结果
     */
    @Override
    public int deleteWorksListById(Long id)
    {
        return worksListMapper.deleteWorksListById(id);
    }
}
