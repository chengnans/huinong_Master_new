package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.FacilityList;

/**
 * 设施列表Mapper接口
 * 
 * @author cheng
 * @date 2024-10-12
 */
public interface FacilityListMapper 
{
    /**
     * 查询设施列表
     * 
     * @param id 设施列表主键
     * @return 设施列表
     */
    public FacilityList selectFacilityListById(Long id);

    /**
     * 查询设施列表列表
     * 
     * @param facilityList 设施列表
     * @return 设施列表集合
     */
    public List<FacilityList> selectFacilityListList(FacilityList facilityList);

    /**
     * 新增设施列表
     * 
     * @param facilityList 设施列表
     * @return 结果
     */
    public int insertFacilityList(FacilityList facilityList);

    /**
     * 修改设施列表
     * 
     * @param facilityList 设施列表
     * @return 结果
     */
    public int updateFacilityList(FacilityList facilityList);

    /**
     * 删除设施列表
     * 
     * @param id 设施列表主键
     * @return 结果
     */
    public int deleteFacilityListById(Long id);

    /**
     * 批量删除设施列表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFacilityListByIds(Long[] ids);
}
