package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.RemotePhotos;

/**
 * 遥感图片Service接口
 * 
 * @author cheng
 * @date 2024-10-08
 */
public interface IRemotePhotosService 
{
    /**
     * 查询遥感图片
     * 
     * @param id 遥感图片主键
     * @return 遥感图片
     */
    public RemotePhotos selectRemotePhotosById(Long id);

    /**
     * 查询遥感图片列表
     * 
     * @param remotePhotos 遥感图片
     * @return 遥感图片集合
     */
    public List<RemotePhotos> selectRemotePhotosList(RemotePhotos remotePhotos);

    /**
     * 新增遥感图片
     * 
     * @param remotePhotos 遥感图片
     * @return 结果
     */
    public int insertRemotePhotos(RemotePhotos remotePhotos);

    /**
     * 修改遥感图片
     * 
     * @param remotePhotos 遥感图片
     * @return 结果
     */
    public int updateRemotePhotos(RemotePhotos remotePhotos);

    /**
     * 批量删除遥感图片
     * 
     * @param ids 需要删除的遥感图片主键集合
     * @return 结果
     */
    public int deleteRemotePhotosByIds(Long[] ids);

    /**
     * 删除遥感图片信息
     * 
     * @param id 遥感图片主键
     * @return 结果
     */
    public int deleteRemotePhotosById(Long id);
}
