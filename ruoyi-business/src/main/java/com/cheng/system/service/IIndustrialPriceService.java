package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.IndustrialPrice;

/**
 * 产业价格管理Service接口
 * 
 * @author cheng
 * @date 2024-10-12
 */
public interface IIndustrialPriceService 
{
    /**
     * 查询产业价格管理
     * 
     * @param id 产业价格管理主键
     * @return 产业价格管理
     */
    public IndustrialPrice selectIndustrialPriceById(Long id);

    /**
     * 查询产业价格管理列表
     * 
     * @param industrialPrice 产业价格管理
     * @return 产业价格管理集合
     */
    public List<IndustrialPrice> selectIndustrialPriceList(IndustrialPrice industrialPrice);

    /**
     * 新增产业价格管理
     * 
     * @param industrialPrice 产业价格管理
     * @return 结果
     */
    public int insertIndustrialPrice(IndustrialPrice industrialPrice);

    /**
     * 修改产业价格管理
     * 
     * @param industrialPrice 产业价格管理
     * @return 结果
     */
    public int updateIndustrialPrice(IndustrialPrice industrialPrice);

    /**
     * 批量删除产业价格管理
     * 
     * @param ids 需要删除的产业价格管理主键集合
     * @return 结果
     */
    public int deleteIndustrialPriceByIds(Long[] ids);

    /**
     * 删除产业价格管理信息
     * 
     * @param id 产业价格管理主键
     * @return 结果
     */
    public int deleteIndustrialPriceById(Long id);
}
