package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.FertilizerDatabase;

/**
 * 肥料数据库Mapper接口
 * 
 * @author cheng
 * @date 2024-10-09
 */
public interface FertilizerDatabaseMapper 
{
    /**
     * 查询肥料数据库
     * 
     * @param id 肥料数据库主键
     * @return 肥料数据库
     */
    public FertilizerDatabase selectFertilizerDatabaseById(Long id);

    /**
     * 查询肥料数据库列表
     * 
     * @param fertilizerDatabase 肥料数据库
     * @return 肥料数据库集合
     */
    public List<FertilizerDatabase> selectFertilizerDatabaseList(FertilizerDatabase fertilizerDatabase);

    /**
     * 新增肥料数据库
     * 
     * @param fertilizerDatabase 肥料数据库
     * @return 结果
     */
    public int insertFertilizerDatabase(FertilizerDatabase fertilizerDatabase);

    /**
     * 修改肥料数据库
     * 
     * @param fertilizerDatabase 肥料数据库
     * @return 结果
     */
    public int updateFertilizerDatabase(FertilizerDatabase fertilizerDatabase);

    /**
     * 删除肥料数据库
     * 
     * @param id 肥料数据库主键
     * @return 结果
     */
    public int deleteFertilizerDatabaseById(Long id);

    /**
     * 批量删除肥料数据库
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFertilizerDatabaseByIds(Long[] ids);
}
