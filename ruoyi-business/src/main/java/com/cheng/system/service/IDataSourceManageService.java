package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.DataSourceManage;

/**
 * 数据源管理Service接口
 * 
 * @author cheng
 * @date 2024-10-12
 */
public interface IDataSourceManageService 
{
    /**
     * 查询数据源管理
     * 
     * @param id 数据源管理主键
     * @return 数据源管理
     */
    public DataSourceManage selectDataSourceManageById(Long id);

    /**
     * 查询数据源管理列表
     * 
     * @param dataSourceManage 数据源管理
     * @return 数据源管理集合
     */
    public List<DataSourceManage> selectDataSourceManageList(DataSourceManage dataSourceManage);

    /**
     * 新增数据源管理
     * 
     * @param dataSourceManage 数据源管理
     * @return 结果
     */
    public int insertDataSourceManage(DataSourceManage dataSourceManage);

    /**
     * 修改数据源管理
     * 
     * @param dataSourceManage 数据源管理
     * @return 结果
     */
    public int updateDataSourceManage(DataSourceManage dataSourceManage);

    /**
     * 批量删除数据源管理
     * 
     * @param ids 需要删除的数据源管理主键集合
     * @return 结果
     */
    public int deleteDataSourceManageByIds(Long[] ids);

    /**
     * 删除数据源管理信息
     * 
     * @param id 数据源管理主键
     * @return 结果
     */
    public int deleteDataSourceManageById(Long id);
}
