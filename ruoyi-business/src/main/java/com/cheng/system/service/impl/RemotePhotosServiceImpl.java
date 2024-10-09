package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.RemotePhotosMapper;
import com.cheng.system.domain.RemotePhotos;
import com.cheng.system.service.IRemotePhotosService;

/**
 * 遥感图片Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-08
 */
@Service
public class RemotePhotosServiceImpl implements IRemotePhotosService 
{
    @Autowired
    private RemotePhotosMapper remotePhotosMapper;

    /**
     * 查询遥感图片
     * 
     * @param id 遥感图片主键
     * @return 遥感图片
     */
    @Override
    public RemotePhotos selectRemotePhotosById(Long id)
    {
        return remotePhotosMapper.selectRemotePhotosById(id);
    }

    /**
     * 查询遥感图片列表
     * 
     * @param remotePhotos 遥感图片
     * @return 遥感图片
     */
    @Override
    public List<RemotePhotos> selectRemotePhotosList(RemotePhotos remotePhotos)
    {
        return remotePhotosMapper.selectRemotePhotosList(remotePhotos);
    }

    /**
     * 新增遥感图片
     * 
     * @param remotePhotos 遥感图片
     * @return 结果
     */
    @Override
    public int insertRemotePhotos(RemotePhotos remotePhotos)
    {
        remotePhotos.setCreateTime(DateUtils.getNowDate());
        return remotePhotosMapper.insertRemotePhotos(remotePhotos);
    }

    /**
     * 修改遥感图片
     * 
     * @param remotePhotos 遥感图片
     * @return 结果
     */
    @Override
    public int updateRemotePhotos(RemotePhotos remotePhotos)
    {
        return remotePhotosMapper.updateRemotePhotos(remotePhotos);
    }

    /**
     * 批量删除遥感图片
     * 
     * @param ids 需要删除的遥感图片主键
     * @return 结果
     */
    @Override
    public int deleteRemotePhotosByIds(Long[] ids)
    {
        return remotePhotosMapper.deleteRemotePhotosByIds(ids);
    }

    /**
     * 删除遥感图片信息
     * 
     * @param id 遥感图片主键
     * @return 结果
     */
    @Override
    public int deleteRemotePhotosById(Long id)
    {
        return remotePhotosMapper.deleteRemotePhotosById(id);
    }
}
