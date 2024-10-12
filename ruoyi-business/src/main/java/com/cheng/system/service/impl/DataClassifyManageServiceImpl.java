package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.DataClassifyManageMapper;
import com.cheng.system.domain.DataClassifyManage;
import com.cheng.system.service.IDataClassifyManageService;

/**
 * 数据分类管理Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-12
 */
@Service
public class DataClassifyManageServiceImpl implements IDataClassifyManageService 
{
    @Autowired
    private DataClassifyManageMapper dataClassifyManageMapper;

    /**
     * 查询数据分类管理
     * 
     * @param id 数据分类管理主键
     * @return 数据分类管理
     */
    @Override
    public DataClassifyManage selectDataClassifyManageById(Long id)
    {
        return dataClassifyManageMapper.selectDataClassifyManageById(id);
    }

    /**
     * 查询数据分类管理列表
     * 
     * @param dataClassifyManage 数据分类管理
     * @return 数据分类管理
     */
    @Override
    public List<DataClassifyManage> selectDataClassifyManageList(DataClassifyManage dataClassifyManage)
    {
        return dataClassifyManageMapper.selectDataClassifyManageList(dataClassifyManage);
    }

    /**
     * 新增数据分类管理
     * 
     * @param dataClassifyManage 数据分类管理
     * @return 结果
     */
    @Override
    public int insertDataClassifyManage(DataClassifyManage dataClassifyManage)
    {
        dataClassifyManage.setCreateTime(DateUtils.getNowDate());
        return dataClassifyManageMapper.insertDataClassifyManage(dataClassifyManage);
    }

    /**
     * 修改数据分类管理
     * 
     * @param dataClassifyManage 数据分类管理
     * @return 结果
     */
    @Override
    public int updateDataClassifyManage(DataClassifyManage dataClassifyManage)
    {
        return dataClassifyManageMapper.updateDataClassifyManage(dataClassifyManage);
    }

    /**
     * 批量删除数据分类管理
     * 
     * @param ids 需要删除的数据分类管理主键
     * @return 结果
     */
    @Override
    public int deleteDataClassifyManageByIds(Long[] ids)
    {
        return dataClassifyManageMapper.deleteDataClassifyManageByIds(ids);
    }

    /**
     * 删除数据分类管理信息
     * 
     * @param id 数据分类管理主键
     * @return 结果
     */
    @Override
    public int deleteDataClassifyManageById(Long id)
    {
        return dataClassifyManageMapper.deleteDataClassifyManageById(id);
    }
}
