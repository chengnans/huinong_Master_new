package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.OriginManagementMapper;
import com.cheng.system.domain.OriginManagement;
import com.cheng.system.service.IOriginManagementService;

/**
 * 产地管理Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-12
 */
@Service
public class OriginManagementServiceImpl implements IOriginManagementService 
{
    @Autowired
    private OriginManagementMapper originManagementMapper;

    /**
     * 查询产地管理
     * 
     * @param id 产地管理主键
     * @return 产地管理
     */
    @Override
    public OriginManagement selectOriginManagementById(Long id)
    {
        return originManagementMapper.selectOriginManagementById(id);
    }

    /**
     * 查询产地管理列表
     * 
     * @param originManagement 产地管理
     * @return 产地管理
     */
    @Override
    public List<OriginManagement> selectOriginManagementList(OriginManagement originManagement)
    {
        return originManagementMapper.selectOriginManagementList(originManagement);
    }

    /**
     * 新增产地管理
     * 
     * @param originManagement 产地管理
     * @return 结果
     */
    @Override
    public int insertOriginManagement(OriginManagement originManagement)
    {
        originManagement.setCreateTime(DateUtils.getNowDate());
        return originManagementMapper.insertOriginManagement(originManagement);
    }

    /**
     * 修改产地管理
     * 
     * @param originManagement 产地管理
     * @return 结果
     */
    @Override
    public int updateOriginManagement(OriginManagement originManagement)
    {
        return originManagementMapper.updateOriginManagement(originManagement);
    }

    /**
     * 批量删除产地管理
     * 
     * @param ids 需要删除的产地管理主键
     * @return 结果
     */
    @Override
    public int deleteOriginManagementByIds(Long[] ids)
    {
        return originManagementMapper.deleteOriginManagementByIds(ids);
    }

    /**
     * 删除产地管理信息
     * 
     * @param id 产地管理主键
     * @return 结果
     */
    @Override
    public int deleteOriginManagementById(Long id)
    {
        return originManagementMapper.deleteOriginManagementById(id);
    }
}
