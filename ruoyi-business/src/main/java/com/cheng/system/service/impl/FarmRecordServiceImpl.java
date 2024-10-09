package com.cheng.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.FarmRecordMapper;
import com.cheng.system.domain.FarmRecord;
import com.cheng.system.service.IFarmRecordService;

/**
 * 农事记录Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-09
 */
@Service
public class FarmRecordServiceImpl implements IFarmRecordService 
{
    @Autowired
    private FarmRecordMapper farmRecordMapper;

    /**
     * 查询农事记录
     * 
     * @param id 农事记录主键
     * @return 农事记录
     */
    @Override
    public FarmRecord selectFarmRecordById(Long id)
    {
        return farmRecordMapper.selectFarmRecordById(id);
    }

    /**
     * 查询农事记录列表
     * 
     * @param farmRecord 农事记录
     * @return 农事记录
     */
    @Override
    public List<FarmRecord> selectFarmRecordList(FarmRecord farmRecord)
    {
        return farmRecordMapper.selectFarmRecordList(farmRecord);
    }

    /**
     * 新增农事记录
     * 
     * @param farmRecord 农事记录
     * @return 结果
     */
    @Override
    public int insertFarmRecord(FarmRecord farmRecord)
    {
        return farmRecordMapper.insertFarmRecord(farmRecord);
    }

    /**
     * 修改农事记录
     * 
     * @param farmRecord 农事记录
     * @return 结果
     */
    @Override
    public int updateFarmRecord(FarmRecord farmRecord)
    {
        return farmRecordMapper.updateFarmRecord(farmRecord);
    }

    /**
     * 批量删除农事记录
     * 
     * @param ids 需要删除的农事记录主键
     * @return 结果
     */
    @Override
    public int deleteFarmRecordByIds(Long[] ids)
    {
        return farmRecordMapper.deleteFarmRecordByIds(ids);
    }

    /**
     * 删除农事记录信息
     * 
     * @param id 农事记录主键
     * @return 结果
     */
    @Override
    public int deleteFarmRecordById(Long id)
    {
        return farmRecordMapper.deleteFarmRecordById(id);
    }
}
