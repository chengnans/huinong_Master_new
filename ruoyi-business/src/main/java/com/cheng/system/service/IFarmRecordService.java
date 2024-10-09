package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.FarmRecord;

/**
 * 农事记录Service接口
 * 
 * @author cheng
 * @date 2024-10-09
 */
public interface IFarmRecordService 
{
    /**
     * 查询农事记录
     * 
     * @param id 农事记录主键
     * @return 农事记录
     */
    public FarmRecord selectFarmRecordById(Long id);

    /**
     * 查询农事记录列表
     * 
     * @param farmRecord 农事记录
     * @return 农事记录集合
     */
    public List<FarmRecord> selectFarmRecordList(FarmRecord farmRecord);

    /**
     * 新增农事记录
     * 
     * @param farmRecord 农事记录
     * @return 结果
     */
    public int insertFarmRecord(FarmRecord farmRecord);

    /**
     * 修改农事记录
     * 
     * @param farmRecord 农事记录
     * @return 结果
     */
    public int updateFarmRecord(FarmRecord farmRecord);

    /**
     * 批量删除农事记录
     * 
     * @param ids 需要删除的农事记录主键集合
     * @return 结果
     */
    public int deleteFarmRecordByIds(Long[] ids);

    /**
     * 删除农事记录信息
     * 
     * @param id 农事记录主键
     * @return 结果
     */
    public int deleteFarmRecordById(Long id);
}
