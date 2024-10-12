package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.OriginManagement;

/**
 * 产地管理Service接口
 * 
 * @author cheng
 * @date 2024-10-12
 */
public interface IOriginManagementService 
{
    /**
     * 查询产地管理
     * 
     * @param id 产地管理主键
     * @return 产地管理
     */
    public OriginManagement selectOriginManagementById(Long id);

    /**
     * 查询产地管理列表
     * 
     * @param originManagement 产地管理
     * @return 产地管理集合
     */
    public List<OriginManagement> selectOriginManagementList(OriginManagement originManagement);

    /**
     * 新增产地管理
     * 
     * @param originManagement 产地管理
     * @return 结果
     */
    public int insertOriginManagement(OriginManagement originManagement);

    /**
     * 修改产地管理
     * 
     * @param originManagement 产地管理
     * @return 结果
     */
    public int updateOriginManagement(OriginManagement originManagement);

    /**
     * 批量删除产地管理
     * 
     * @param ids 需要删除的产地管理主键集合
     * @return 结果
     */
    public int deleteOriginManagementByIds(Long[] ids);

    /**
     * 删除产地管理信息
     * 
     * @param id 产地管理主键
     * @return 结果
     */
    public int deleteOriginManagementById(Long id);
}
