package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.ModelDatabase;

/**
 * 模型数据库Service接口
 * 
 * @author cheng
 * @date 2024-10-09
 */
public interface IModelDatabaseService 
{
    /**
     * 查询模型数据库
     * 
     * @param id 模型数据库主键
     * @return 模型数据库
     */
    public ModelDatabase selectModelDatabaseById(Long id);

    /**
     * 查询模型数据库列表
     * 
     * @param modelDatabase 模型数据库
     * @return 模型数据库集合
     */
    public List<ModelDatabase> selectModelDatabaseList(ModelDatabase modelDatabase);

    /**
     * 新增模型数据库
     * 
     * @param modelDatabase 模型数据库
     * @return 结果
     */
    public int insertModelDatabase(ModelDatabase modelDatabase);

    /**
     * 修改模型数据库
     * 
     * @param modelDatabase 模型数据库
     * @return 结果
     */
    public int updateModelDatabase(ModelDatabase modelDatabase);

    /**
     * 批量删除模型数据库
     * 
     * @param ids 需要删除的模型数据库主键集合
     * @return 结果
     */
    public int deleteModelDatabaseByIds(Long[] ids);

    /**
     * 删除模型数据库信息
     * 
     * @param id 模型数据库主键
     * @return 结果
     */
    public int deleteModelDatabaseById(Long id);
}
