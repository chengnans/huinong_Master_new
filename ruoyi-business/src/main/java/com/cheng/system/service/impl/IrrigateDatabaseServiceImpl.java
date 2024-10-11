package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.IrrigateDatabaseMapper;
import com.cheng.system.domain.IrrigateDatabase;
import com.cheng.system.service.IIrrigateDatabaseService;

/**
 * 灌区数据库Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-11
 */
@Service
public class IrrigateDatabaseServiceImpl implements IIrrigateDatabaseService 
{
    @Autowired
    private IrrigateDatabaseMapper irrigateDatabaseMapper;

    /**
     * 查询灌区数据库
     * 
     * @param id 灌区数据库主键
     * @return 灌区数据库
     */
    @Override
    public IrrigateDatabase selectIrrigateDatabaseById(Long id)
    {
        return irrigateDatabaseMapper.selectIrrigateDatabaseById(id);
    }

    /**
     * 查询灌区数据库列表
     * 
     * @param irrigateDatabase 灌区数据库
     * @return 灌区数据库
     */
    @Override
    public List<IrrigateDatabase> selectIrrigateDatabaseList(IrrigateDatabase irrigateDatabase)
    {
        return irrigateDatabaseMapper.selectIrrigateDatabaseList(irrigateDatabase);
    }

    /**
     * 新增灌区数据库
     * 
     * @param irrigateDatabase 灌区数据库
     * @return 结果
     */
    @Override
    public int insertIrrigateDatabase(IrrigateDatabase irrigateDatabase)
    {
        irrigateDatabase.setCreateTime(DateUtils.getNowDate());
        return irrigateDatabaseMapper.insertIrrigateDatabase(irrigateDatabase);
    }

    /**
     * 修改灌区数据库
     * 
     * @param irrigateDatabase 灌区数据库
     * @return 结果
     */
    @Override
    public int updateIrrigateDatabase(IrrigateDatabase irrigateDatabase)
    {
        return irrigateDatabaseMapper.updateIrrigateDatabase(irrigateDatabase);
    }

    /**
     * 批量删除灌区数据库
     * 
     * @param ids 需要删除的灌区数据库主键
     * @return 结果
     */
    @Override
    public int deleteIrrigateDatabaseByIds(Long[] ids)
    {
        return irrigateDatabaseMapper.deleteIrrigateDatabaseByIds(ids);
    }

    /**
     * 删除灌区数据库信息
     * 
     * @param id 灌区数据库主键
     * @return 结果
     */
    @Override
    public int deleteIrrigateDatabaseById(Long id)
    {
        return irrigateDatabaseMapper.deleteIrrigateDatabaseById(id);
    }
}
