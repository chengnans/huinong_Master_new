package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.FarmResource;

/**
 * 农资管理Mapper接口
 * 
 * @author cheng
 * @date 2024-10-09
 */
public interface FarmResourceMapper 
{
    /**
     * 查询农资管理
     * 
     * @param id 农资管理主键
     * @return 农资管理
     */
    public FarmResource selectFarmResourceById(Long id);

    /**
     * 查询农资管理列表
     * 
     * @param farmResource 农资管理
     * @return 农资管理集合
     */
    public List<FarmResource> selectFarmResourceList(FarmResource farmResource);

    /**
     * 新增农资管理
     * 
     * @param farmResource 农资管理
     * @return 结果
     */
    public int insertFarmResource(FarmResource farmResource);

    /**
     * 修改农资管理
     * 
     * @param farmResource 农资管理
     * @return 结果
     */
    public int updateFarmResource(FarmResource farmResource);

    /**
     * 删除农资管理
     * 
     * @param id 农资管理主键
     * @return 结果
     */
    public int deleteFarmResourceById(Long id);

    /**
     * 批量删除农资管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFarmResourceByIds(Long[] ids);
}
