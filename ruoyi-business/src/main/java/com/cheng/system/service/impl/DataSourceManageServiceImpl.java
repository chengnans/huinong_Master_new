package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.DataSourceManageMapper;
import com.cheng.system.domain.DataSourceManage;
import com.cheng.system.service.IDataSourceManageService;

/**
 * 数据源管理Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-12
 */
@Service
public class DataSourceManageServiceImpl implements IDataSourceManageService 
{
    @Autowired
    private DataSourceManageMapper dataSourceManageMapper;

    /**
     * 查询数据源管理
     * 
     * @param id 数据源管理主键
     * @return 数据源管理
     */
    @Override
    public DataSourceManage selectDataSourceManageById(Long id)
    {
        return dataSourceManageMapper.selectDataSourceManageById(id);
    }

    /**
     * 查询数据源管理列表
     * 
     * @param dataSourceManage 数据源管理
     * @return 数据源管理
     */
    @Override
    public List<DataSourceManage> selectDataSourceManageList(DataSourceManage dataSourceManage)
    {
        return dataSourceManageMapper.selectDataSourceManageList(dataSourceManage);
    }

    /**
     * 新增数据源管理
     * 
     * @param dataSourceManage 数据源管理
     * @return 结果
     */
    @Override
    public int insertDataSourceManage(DataSourceManage dataSourceManage)
    {
        dataSourceManage.setCreateTime(DateUtils.getNowDate());
        return dataSourceManageMapper.insertDataSourceManage(dataSourceManage);
    }

    /**
     * 修改数据源管理
     * 
     * @param dataSourceManage 数据源管理
     * @return 结果
     */
    @Override
    public int updateDataSourceManage(DataSourceManage dataSourceManage)
    {
        return dataSourceManageMapper.updateDataSourceManage(dataSourceManage);
    }

    /**
     * 批量删除数据源管理
     * 
     * @param ids 需要删除的数据源管理主键
     * @return 结果
     */
    @Override
    public int deleteDataSourceManageByIds(Long[] ids)
    {
        return dataSourceManageMapper.deleteDataSourceManageByIds(ids);
    }

    /**
     * 删除数据源管理信息
     * 
     * @param id 数据源管理主键
     * @return 结果
     */
    @Override
    public int deleteDataSourceManageById(Long id)
    {
        return dataSourceManageMapper.deleteDataSourceManageById(id);
    }
}
