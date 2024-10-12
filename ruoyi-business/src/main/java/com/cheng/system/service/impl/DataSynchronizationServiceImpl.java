package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.DataSynchronizationMapper;
import com.cheng.system.domain.DataSynchronization;
import com.cheng.system.service.IDataSynchronizationService;

/**
 * 数据同步任务Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-12
 */
@Service
public class DataSynchronizationServiceImpl implements IDataSynchronizationService 
{
    @Autowired
    private DataSynchronizationMapper dataSynchronizationMapper;

    /**
     * 查询数据同步任务
     * 
     * @param id 数据同步任务主键
     * @return 数据同步任务
     */
    @Override
    public DataSynchronization selectDataSynchronizationById(Long id)
    {
        return dataSynchronizationMapper.selectDataSynchronizationById(id);
    }

    /**
     * 查询数据同步任务列表
     * 
     * @param dataSynchronization 数据同步任务
     * @return 数据同步任务
     */
    @Override
    public List<DataSynchronization> selectDataSynchronizationList(DataSynchronization dataSynchronization)
    {
        return dataSynchronizationMapper.selectDataSynchronizationList(dataSynchronization);
    }

    /**
     * 新增数据同步任务
     * 
     * @param dataSynchronization 数据同步任务
     * @return 结果
     */
    @Override
    public int insertDataSynchronization(DataSynchronization dataSynchronization)
    {
        dataSynchronization.setCreateTime(DateUtils.getNowDate());
        return dataSynchronizationMapper.insertDataSynchronization(dataSynchronization);
    }

    /**
     * 修改数据同步任务
     * 
     * @param dataSynchronization 数据同步任务
     * @return 结果
     */
    @Override
    public int updateDataSynchronization(DataSynchronization dataSynchronization)
    {
        return dataSynchronizationMapper.updateDataSynchronization(dataSynchronization);
    }

    /**
     * 批量删除数据同步任务
     * 
     * @param ids 需要删除的数据同步任务主键
     * @return 结果
     */
    @Override
    public int deleteDataSynchronizationByIds(Long[] ids)
    {
        return dataSynchronizationMapper.deleteDataSynchronizationByIds(ids);
    }

    /**
     * 删除数据同步任务信息
     * 
     * @param id 数据同步任务主键
     * @return 结果
     */
    @Override
    public int deleteDataSynchronizationById(Long id)
    {
        return dataSynchronizationMapper.deleteDataSynchronizationById(id);
    }
}
