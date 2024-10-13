package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.RemoteSet;

/**
 * 遥感服务配置Mapper接口
 * 
 * @author cheng
 * @date 2024-10-13
 */
public interface RemoteSetMapper 
{
    /**
     * 查询遥感服务配置
     * 
     * @param id 遥感服务配置主键
     * @return 遥感服务配置
     */
    public RemoteSet selectRemoteSetById(Long id);

    /**
     * 查询遥感服务配置列表
     * 
     * @param remoteSet 遥感服务配置
     * @return 遥感服务配置集合
     */
    public List<RemoteSet> selectRemoteSetList(RemoteSet remoteSet);

    /**
     * 新增遥感服务配置
     * 
     * @param remoteSet 遥感服务配置
     * @return 结果
     */
    public int insertRemoteSet(RemoteSet remoteSet);

    /**
     * 修改遥感服务配置
     * 
     * @param remoteSet 遥感服务配置
     * @return 结果
     */
    public int updateRemoteSet(RemoteSet remoteSet);

    /**
     * 删除遥感服务配置
     * 
     * @param id 遥感服务配置主键
     * @return 结果
     */
    public int deleteRemoteSetById(Long id);

    /**
     * 批量删除遥感服务配置
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRemoteSetByIds(Long[] ids);
}
