package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.BaselandDatabaseMapper;
import com.cheng.system.domain.BaselandDatabase;
import com.cheng.system.service.IBaselandDatabaseService;

/**
 * 基地数据库Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-11
 */
@Service
public class BaselandDatabaseServiceImpl implements IBaselandDatabaseService 
{
    @Autowired
    private BaselandDatabaseMapper baselandDatabaseMapper;

    /**
     * 查询基地数据库
     * 
     * @param id 基地数据库主键
     * @return 基地数据库
     */
    @Override
    public BaselandDatabase selectBaselandDatabaseById(Long id)
    {
        return baselandDatabaseMapper.selectBaselandDatabaseById(id);
    }

    /**
     * 查询基地数据库列表
     * 
     * @param baselandDatabase 基地数据库
     * @return 基地数据库
     */
    @Override
    public List<BaselandDatabase> selectBaselandDatabaseList(BaselandDatabase baselandDatabase)
    {
        return baselandDatabaseMapper.selectBaselandDatabaseList(baselandDatabase);
    }

    /**
     * 新增基地数据库
     * 
     * @param baselandDatabase 基地数据库
     * @return 结果
     */
    @Override
    public int insertBaselandDatabase(BaselandDatabase baselandDatabase)
    {
        baselandDatabase.setCreateTime(DateUtils.getNowDate());
        return baselandDatabaseMapper.insertBaselandDatabase(baselandDatabase);
    }

    /**
     * 修改基地数据库
     * 
     * @param baselandDatabase 基地数据库
     * @return 结果
     */
    @Override
    public int updateBaselandDatabase(BaselandDatabase baselandDatabase)
    {
        return baselandDatabaseMapper.updateBaselandDatabase(baselandDatabase);
    }

    /**
     * 批量删除基地数据库
     * 
     * @param ids 需要删除的基地数据库主键
     * @return 结果
     */
    @Override
    public int deleteBaselandDatabaseByIds(Long[] ids)
    {
        return baselandDatabaseMapper.deleteBaselandDatabaseByIds(ids);
    }

    /**
     * 删除基地数据库信息
     * 
     * @param id 基地数据库主键
     * @return 结果
     */
    @Override
    public int deleteBaselandDatabaseById(Long id)
    {
        return baselandDatabaseMapper.deleteBaselandDatabaseById(id);
    }
}
