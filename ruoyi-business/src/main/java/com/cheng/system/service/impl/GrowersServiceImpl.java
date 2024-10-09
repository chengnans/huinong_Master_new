package com.cheng.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.GrowersMapper;
import com.cheng.system.domain.Growers;
import com.cheng.system.service.IGrowersService;

/**
 * 种植户管理Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-08
 */
@Service
public class GrowersServiceImpl implements IGrowersService 
{
    @Autowired
    private GrowersMapper growersMapper;

    /**
     * 查询种植户管理
     * 
     * @param id 种植户管理主键
     * @return 种植户管理
     */
    @Override
    public Growers selectGrowersById(Long id)
    {
        return growersMapper.selectGrowersById(id);
    }

    /**
     * 查询种植户管理列表
     * 
     * @param growers 种植户管理
     * @return 种植户管理
     */
    @Override
    public List<Growers> selectGrowersList(Growers growers)
    {
        return growersMapper.selectGrowersList(growers);
    }

    /**
     * 新增种植户管理
     * 
     * @param growers 种植户管理
     * @return 结果
     */
    @Override
    public int insertGrowers(Growers growers)
    {
        return growersMapper.insertGrowers(growers);
    }

    /**
     * 修改种植户管理
     * 
     * @param growers 种植户管理
     * @return 结果
     */
    @Override
    public int updateGrowers(Growers growers)
    {
        return growersMapper.updateGrowers(growers);
    }

    /**
     * 批量删除种植户管理
     * 
     * @param ids 需要删除的种植户管理主键
     * @return 结果
     */
    @Override
    public int deleteGrowersByIds(Long[] ids)
    {
        return growersMapper.deleteGrowersByIds(ids);
    }

    /**
     * 删除种植户管理信息
     * 
     * @param id 种植户管理主键
     * @return 结果
     */
    @Override
    public int deleteGrowersById(Long id)
    {
        return growersMapper.deleteGrowersById(id);
    }
}
