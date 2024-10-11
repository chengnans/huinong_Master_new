package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.BaselandDatabase;

/**
 * 基地数据库Service接口
 * 
 * @author cheng
 * @date 2024-10-11
 */
public interface IBaselandDatabaseService 
{
    /**
     * 查询基地数据库
     * 
     * @param id 基地数据库主键
     * @return 基地数据库
     */
    public BaselandDatabase selectBaselandDatabaseById(Long id);

    /**
     * 查询基地数据库列表
     * 
     * @param baselandDatabase 基地数据库
     * @return 基地数据库集合
     */
    public List<BaselandDatabase> selectBaselandDatabaseList(BaselandDatabase baselandDatabase);

    /**
     * 新增基地数据库
     * 
     * @param baselandDatabase 基地数据库
     * @return 结果
     */
    public int insertBaselandDatabase(BaselandDatabase baselandDatabase);

    /**
     * 修改基地数据库
     * 
     * @param baselandDatabase 基地数据库
     * @return 结果
     */
    public int updateBaselandDatabase(BaselandDatabase baselandDatabase);

    /**
     * 批量删除基地数据库
     * 
     * @param ids 需要删除的基地数据库主键集合
     * @return 结果
     */
    public int deleteBaselandDatabaseByIds(Long[] ids);

    /**
     * 删除基地数据库信息
     * 
     * @param id 基地数据库主键
     * @return 结果
     */
    public int deleteBaselandDatabaseById(Long id);
}
