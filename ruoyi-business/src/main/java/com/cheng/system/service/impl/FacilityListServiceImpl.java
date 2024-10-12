package com.cheng.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.FacilityListMapper;
import com.cheng.system.domain.FacilityList;
import com.cheng.system.service.IFacilityListService;

/**
 * 设施列表Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-12
 */
@Service
public class FacilityListServiceImpl implements IFacilityListService 
{
    @Autowired
    private FacilityListMapper facilityListMapper;

    /**
     * 查询设施列表
     * 
     * @param id 设施列表主键
     * @return 设施列表
     */
    @Override
    public FacilityList selectFacilityListById(Long id)
    {
        return facilityListMapper.selectFacilityListById(id);
    }

    /**
     * 查询设施列表列表
     * 
     * @param facilityList 设施列表
     * @return 设施列表
     */
    @Override
    public List<FacilityList> selectFacilityListList(FacilityList facilityList)
    {
        return facilityListMapper.selectFacilityListList(facilityList);
    }

    /**
     * 新增设施列表
     * 
     * @param facilityList 设施列表
     * @return 结果
     */
    @Override
    public int insertFacilityList(FacilityList facilityList)
    {
        return facilityListMapper.insertFacilityList(facilityList);
    }

    /**
     * 修改设施列表
     * 
     * @param facilityList 设施列表
     * @return 结果
     */
    @Override
    public int updateFacilityList(FacilityList facilityList)
    {
        return facilityListMapper.updateFacilityList(facilityList);
    }

    /**
     * 批量删除设施列表
     * 
     * @param ids 需要删除的设施列表主键
     * @return 结果
     */
    @Override
    public int deleteFacilityListByIds(Long[] ids)
    {
        return facilityListMapper.deleteFacilityListByIds(ids);
    }

    /**
     * 删除设施列表信息
     * 
     * @param id 设施列表主键
     * @return 结果
     */
    @Override
    public int deleteFacilityListById(Long id)
    {
        return facilityListMapper.deleteFacilityListById(id);
    }
}
