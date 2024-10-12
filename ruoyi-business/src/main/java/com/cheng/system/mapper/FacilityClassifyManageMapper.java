package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.FacilityClassifyManage;

/**
 * 设施分类管理Mapper接口
 * 
 * @author cheng
 * @date 2024-10-12
 */
public interface FacilityClassifyManageMapper 
{
    /**
     * 查询设施分类管理
     * 
     * @param id 设施分类管理主键
     * @return 设施分类管理
     */
    public FacilityClassifyManage selectFacilityClassifyManageById(Long id);

    /**
     * 查询设施分类管理列表
     * 
     * @param facilityClassifyManage 设施分类管理
     * @return 设施分类管理集合
     */
    public List<FacilityClassifyManage> selectFacilityClassifyManageList(FacilityClassifyManage facilityClassifyManage);

    /**
     * 新增设施分类管理
     * 
     * @param facilityClassifyManage 设施分类管理
     * @return 结果
     */
    public int insertFacilityClassifyManage(FacilityClassifyManage facilityClassifyManage);

    /**
     * 修改设施分类管理
     * 
     * @param facilityClassifyManage 设施分类管理
     * @return 结果
     */
    public int updateFacilityClassifyManage(FacilityClassifyManage facilityClassifyManage);

    /**
     * 删除设施分类管理
     * 
     * @param id 设施分类管理主键
     * @return 结果
     */
    public int deleteFacilityClassifyManageById(Long id);

    /**
     * 批量删除设施分类管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFacilityClassifyManageByIds(Long[] ids);
}
