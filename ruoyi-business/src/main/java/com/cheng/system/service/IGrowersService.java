package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.Growers;

/**
 * 种植户管理Service接口
 * 
 * @author cheng
 * @date 2024-10-08
 */
public interface IGrowersService 
{
    /**
     * 查询种植户管理
     * 
     * @param id 种植户管理主键
     * @return 种植户管理
     */
    public Growers selectGrowersById(Long id);

    /**
     * 查询种植户管理列表
     * 
     * @param growers 种植户管理
     * @return 种植户管理集合
     */
    public List<Growers> selectGrowersList(Growers growers);

    /**
     * 新增种植户管理
     * 
     * @param growers 种植户管理
     * @return 结果
     */
    public int insertGrowers(Growers growers);

    /**
     * 修改种植户管理
     * 
     * @param growers 种植户管理
     * @return 结果
     */
    public int updateGrowers(Growers growers);

    /**
     * 批量删除种植户管理
     * 
     * @param ids 需要删除的种植户管理主键集合
     * @return 结果
     */
    public int deleteGrowersByIds(Long[] ids);

    /**
     * 删除种植户管理信息
     * 
     * @param id 种植户管理主键
     * @return 结果
     */
    public int deleteGrowersById(Long id);
}
