package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.RemoteSetMapper;
import com.cheng.system.domain.RemoteSet;
import com.cheng.system.service.IRemoteSetService;

/**
 * 遥感服务配置Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-13
 */
@Service
public class RemoteSetServiceImpl implements IRemoteSetService 
{
    @Autowired
    private RemoteSetMapper remoteSetMapper;

    /**
     * 查询遥感服务配置
     * 
     * @param id 遥感服务配置主键
     * @return 遥感服务配置
     */
    @Override
    public RemoteSet selectRemoteSetById(Long id)
    {
        return remoteSetMapper.selectRemoteSetById(id);
    }

    /**
     * 查询遥感服务配置列表
     * 
     * @param remoteSet 遥感服务配置
     * @return 遥感服务配置
     */
    @Override
    public List<RemoteSet> selectRemoteSetList(RemoteSet remoteSet)
    {
        return remoteSetMapper.selectRemoteSetList(remoteSet);
    }

    /**
     * 新增遥感服务配置
     * 
     * @param remoteSet 遥感服务配置
     * @return 结果
     */
    @Override
    public int insertRemoteSet(RemoteSet remoteSet)
    {
        remoteSet.setCreateTime(DateUtils.getNowDate());
        return remoteSetMapper.insertRemoteSet(remoteSet);
    }

    /**
     * 修改遥感服务配置
     * 
     * @param remoteSet 遥感服务配置
     * @return 结果
     */
    @Override
    public int updateRemoteSet(RemoteSet remoteSet)
    {
        return remoteSetMapper.updateRemoteSet(remoteSet);
    }

    /**
     * 批量删除遥感服务配置
     * 
     * @param ids 需要删除的遥感服务配置主键
     * @return 结果
     */
    @Override
    public int deleteRemoteSetByIds(Long[] ids)
    {
        return remoteSetMapper.deleteRemoteSetByIds(ids);
    }

    /**
     * 删除遥感服务配置信息
     * 
     * @param id 遥感服务配置主键
     * @return 结果
     */
    @Override
    public int deleteRemoteSetById(Long id)
    {
        return remoteSetMapper.deleteRemoteSetById(id);
    }
}
