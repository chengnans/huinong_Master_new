package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.DataSynchronization;

/**
 * 数据同步任务Service接口
 * 
 * @author cheng
 * @date 2024-10-12
 */
public interface IDataSynchronizationService 
{
    /**
     * 查询数据同步任务
     * 
     * @param id 数据同步任务主键
     * @return 数据同步任务
     */
    public DataSynchronization selectDataSynchronizationById(Long id);

    /**
     * 查询数据同步任务列表
     * 
     * @param dataSynchronization 数据同步任务
     * @return 数据同步任务集合
     */
    public List<DataSynchronization> selectDataSynchronizationList(DataSynchronization dataSynchronization);

    /**
     * 新增数据同步任务
     * 
     * @param dataSynchronization 数据同步任务
     * @return 结果
     */
    public int insertDataSynchronization(DataSynchronization dataSynchronization);

    /**
     * 修改数据同步任务
     * 
     * @param dataSynchronization 数据同步任务
     * @return 结果
     */
    public int updateDataSynchronization(DataSynchronization dataSynchronization);

    /**
     * 批量删除数据同步任务
     * 
     * @param ids 需要删除的数据同步任务主键集合
     * @return 结果
     */
    public int deleteDataSynchronizationByIds(Long[] ids);

    /**
     * 删除数据同步任务信息
     * 
     * @param id 数据同步任务主键
     * @return 结果
     */
    public int deleteDataSynchronizationById(Long id);
}
