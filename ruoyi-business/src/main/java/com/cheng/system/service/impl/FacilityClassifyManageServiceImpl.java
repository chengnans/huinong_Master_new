package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.FacilityClassifyManageMapper;
import com.cheng.system.domain.FacilityClassifyManage;
import com.cheng.system.service.IFacilityClassifyManageService;

/**
 * 设施分类管理Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-12
 */
@Service
public class FacilityClassifyManageServiceImpl implements IFacilityClassifyManageService 
{
    @Autowired
    private FacilityClassifyManageMapper facilityClassifyManageMapper;

    /**
     * 查询设施分类管理
     * 
     * @param id 设施分类管理主键
     * @return 设施分类管理
     */
    @Override
    public FacilityClassifyManage selectFacilityClassifyManageById(Long id)
    {
        return facilityClassifyManageMapper.selectFacilityClassifyManageById(id);
    }

    /**
     * 查询设施分类管理列表
     * 
     * @param facilityClassifyManage 设施分类管理
     * @return 设施分类管理
     */
    @Override
    public List<FacilityClassifyManage> selectFacilityClassifyManageList(FacilityClassifyManage facilityClassifyManage)
    {
        return facilityClassifyManageMapper.selectFacilityClassifyManageList(facilityClassifyManage);
    }

    /**
     * 新增设施分类管理
     * 
     * @param facilityClassifyManage 设施分类管理
     * @return 结果
     */
    @Override
    public int insertFacilityClassifyManage(FacilityClassifyManage facilityClassifyManage)
    {
        facilityClassifyManage.setCreateTime(DateUtils.getNowDate());
        return facilityClassifyManageMapper.insertFacilityClassifyManage(facilityClassifyManage);
    }

    /**
     * 修改设施分类管理
     * 
     * @param facilityClassifyManage 设施分类管理
     * @return 结果
     */
    @Override
    public int updateFacilityClassifyManage(FacilityClassifyManage facilityClassifyManage)
    {
        return facilityClassifyManageMapper.updateFacilityClassifyManage(facilityClassifyManage);
    }

    /**
     * 批量删除设施分类管理
     * 
     * @param ids 需要删除的设施分类管理主键
     * @return 结果
     */
    @Override
    public int deleteFacilityClassifyManageByIds(Long[] ids)
    {
        return facilityClassifyManageMapper.deleteFacilityClassifyManageByIds(ids);
    }

    /**
     * 删除设施分类管理信息
     * 
     * @param id 设施分类管理主键
     * @return 结果
     */
    @Override
    public int deleteFacilityClassifyManageById(Long id)
    {
        return facilityClassifyManageMapper.deleteFacilityClassifyManageById(id);
    }
}
