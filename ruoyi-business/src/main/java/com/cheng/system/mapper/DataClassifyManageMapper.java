package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.DataClassifyManage;

/**
 * 数据分类管理Mapper接口
 * 
 * @author cheng
 * @date 2024-10-12
 */
public interface DataClassifyManageMapper 
{
    /**
     * 查询数据分类管理
     * 
     * @param id 数据分类管理主键
     * @return 数据分类管理
     */
    public DataClassifyManage selectDataClassifyManageById(Long id);

    /**
     * 查询数据分类管理列表
     * 
     * @param dataClassifyManage 数据分类管理
     * @return 数据分类管理集合
     */
    public List<DataClassifyManage> selectDataClassifyManageList(DataClassifyManage dataClassifyManage);

    /**
     * 新增数据分类管理
     * 
     * @param dataClassifyManage 数据分类管理
     * @return 结果
     */
    public int insertDataClassifyManage(DataClassifyManage dataClassifyManage);

    /**
     * 修改数据分类管理
     * 
     * @param dataClassifyManage 数据分类管理
     * @return 结果
     */
    public int updateDataClassifyManage(DataClassifyManage dataClassifyManage);

    /**
     * 删除数据分类管理
     * 
     * @param id 数据分类管理主键
     * @return 结果
     */
    public int deleteDataClassifyManageById(Long id);

    /**
     * 批量删除数据分类管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDataClassifyManageByIds(Long[] ids);
}
