package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.IrrigateDatabase;

/**
 * 灌区数据库Mapper接口
 * 
 * @author cheng
 * @date 2024-10-11
 */
public interface IrrigateDatabaseMapper 
{
    /**
     * 查询灌区数据库
     * 
     * @param id 灌区数据库主键
     * @return 灌区数据库
     */
    public IrrigateDatabase selectIrrigateDatabaseById(Long id);

    /**
     * 查询灌区数据库列表
     * 
     * @param irrigateDatabase 灌区数据库
     * @return 灌区数据库集合
     */
    public List<IrrigateDatabase> selectIrrigateDatabaseList(IrrigateDatabase irrigateDatabase);

    /**
     * 新增灌区数据库
     * 
     * @param irrigateDatabase 灌区数据库
     * @return 结果
     */
    public int insertIrrigateDatabase(IrrigateDatabase irrigateDatabase);

    /**
     * 修改灌区数据库
     * 
     * @param irrigateDatabase 灌区数据库
     * @return 结果
     */
    public int updateIrrigateDatabase(IrrigateDatabase irrigateDatabase);

    /**
     * 删除灌区数据库
     * 
     * @param id 灌区数据库主键
     * @return 结果
     */
    public int deleteIrrigateDatabaseById(Long id);

    /**
     * 批量删除灌区数据库
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteIrrigateDatabaseByIds(Long[] ids);
}
