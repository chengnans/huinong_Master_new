package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.FertilizerDatabaseMapper;
import com.cheng.system.domain.FertilizerDatabase;
import com.cheng.system.service.IFertilizerDatabaseService;

/**
 * 肥料数据库Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-09
 */
@Service
public class FertilizerDatabaseServiceImpl implements IFertilizerDatabaseService 
{
    @Autowired
    private FertilizerDatabaseMapper fertilizerDatabaseMapper;

    /**
     * 查询肥料数据库
     * 
     * @param id 肥料数据库主键
     * @return 肥料数据库
     */
    @Override
    public FertilizerDatabase selectFertilizerDatabaseById(Long id)
    {
        return fertilizerDatabaseMapper.selectFertilizerDatabaseById(id);
    }

    /**
     * 查询肥料数据库列表
     * 
     * @param fertilizerDatabase 肥料数据库
     * @return 肥料数据库
     */
    @Override
    public List<FertilizerDatabase> selectFertilizerDatabaseList(FertilizerDatabase fertilizerDatabase)
    {
        return fertilizerDatabaseMapper.selectFertilizerDatabaseList(fertilizerDatabase);
    }

    /**
     * 新增肥料数据库
     * 
     * @param fertilizerDatabase 肥料数据库
     * @return 结果
     */
    @Override
    public int insertFertilizerDatabase(FertilizerDatabase fertilizerDatabase)
    {
        fertilizerDatabase.setCreateTime(DateUtils.getNowDate());
        return fertilizerDatabaseMapper.insertFertilizerDatabase(fertilizerDatabase);
    }

    /**
     * 修改肥料数据库
     * 
     * @param fertilizerDatabase 肥料数据库
     * @return 结果
     */
    @Override
    public int updateFertilizerDatabase(FertilizerDatabase fertilizerDatabase)
    {
        return fertilizerDatabaseMapper.updateFertilizerDatabase(fertilizerDatabase);
    }

    /**
     * 批量删除肥料数据库
     * 
     * @param ids 需要删除的肥料数据库主键
     * @return 结果
     */
    @Override
    public int deleteFertilizerDatabaseByIds(Long[] ids)
    {
        return fertilizerDatabaseMapper.deleteFertilizerDatabaseByIds(ids);
    }

    /**
     * 删除肥料数据库信息
     * 
     * @param id 肥料数据库主键
     * @return 结果
     */
    @Override
    public int deleteFertilizerDatabaseById(Long id)
    {
        return fertilizerDatabaseMapper.deleteFertilizerDatabaseById(id);
    }
}
