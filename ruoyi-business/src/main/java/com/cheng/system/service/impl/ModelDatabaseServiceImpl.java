package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.ModelDatabaseMapper;
import com.cheng.system.domain.ModelDatabase;
import com.cheng.system.service.IModelDatabaseService;

/**
 * 模型数据库Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-09
 */
@Service
public class ModelDatabaseServiceImpl implements IModelDatabaseService 
{
    @Autowired
    private ModelDatabaseMapper modelDatabaseMapper;

    /**
     * 查询模型数据库
     * 
     * @param id 模型数据库主键
     * @return 模型数据库
     */
    @Override
    public ModelDatabase selectModelDatabaseById(Long id)
    {
        return modelDatabaseMapper.selectModelDatabaseById(id);
    }

    /**
     * 查询模型数据库列表
     * 
     * @param modelDatabase 模型数据库
     * @return 模型数据库
     */
    @Override
    public List<ModelDatabase> selectModelDatabaseList(ModelDatabase modelDatabase)
    {
        return modelDatabaseMapper.selectModelDatabaseList(modelDatabase);
    }

    /**
     * 新增模型数据库
     * 
     * @param modelDatabase 模型数据库
     * @return 结果
     */
    @Override
    public int insertModelDatabase(ModelDatabase modelDatabase)
    {
        modelDatabase.setCreateTime(DateUtils.getNowDate());
        return modelDatabaseMapper.insertModelDatabase(modelDatabase);
    }

    /**
     * 修改模型数据库
     * 
     * @param modelDatabase 模型数据库
     * @return 结果
     */
    @Override
    public int updateModelDatabase(ModelDatabase modelDatabase)
    {
        return modelDatabaseMapper.updateModelDatabase(modelDatabase);
    }

    /**
     * 批量删除模型数据库
     * 
     * @param ids 需要删除的模型数据库主键
     * @return 结果
     */
    @Override
    public int deleteModelDatabaseByIds(Long[] ids)
    {
        return modelDatabaseMapper.deleteModelDatabaseByIds(ids);
    }

    /**
     * 删除模型数据库信息
     * 
     * @param id 模型数据库主键
     * @return 结果
     */
    @Override
    public int deleteModelDatabaseById(Long id)
    {
        return modelDatabaseMapper.deleteModelDatabaseById(id);
    }
}
