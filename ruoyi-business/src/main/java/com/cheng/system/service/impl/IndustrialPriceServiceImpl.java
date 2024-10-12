package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.IndustrialPriceMapper;
import com.cheng.system.domain.IndustrialPrice;
import com.cheng.system.service.IIndustrialPriceService;

/**
 * 产业价格管理Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-12
 */
@Service
public class IndustrialPriceServiceImpl implements IIndustrialPriceService 
{
    @Autowired
    private IndustrialPriceMapper industrialPriceMapper;

    /**
     * 查询产业价格管理
     * 
     * @param id 产业价格管理主键
     * @return 产业价格管理
     */
    @Override
    public IndustrialPrice selectIndustrialPriceById(Long id)
    {
        return industrialPriceMapper.selectIndustrialPriceById(id);
    }

    /**
     * 查询产业价格管理列表
     * 
     * @param industrialPrice 产业价格管理
     * @return 产业价格管理
     */
    @Override
    public List<IndustrialPrice> selectIndustrialPriceList(IndustrialPrice industrialPrice)
    {
        return industrialPriceMapper.selectIndustrialPriceList(industrialPrice);
    }

    /**
     * 新增产业价格管理
     * 
     * @param industrialPrice 产业价格管理
     * @return 结果
     */
    @Override
    public int insertIndustrialPrice(IndustrialPrice industrialPrice)
    {
        industrialPrice.setCreateTime(DateUtils.getNowDate());
        return industrialPriceMapper.insertIndustrialPrice(industrialPrice);
    }

    /**
     * 修改产业价格管理
     * 
     * @param industrialPrice 产业价格管理
     * @return 结果
     */
    @Override
    public int updateIndustrialPrice(IndustrialPrice industrialPrice)
    {
        return industrialPriceMapper.updateIndustrialPrice(industrialPrice);
    }

    /**
     * 批量删除产业价格管理
     * 
     * @param ids 需要删除的产业价格管理主键
     * @return 结果
     */
    @Override
    public int deleteIndustrialPriceByIds(Long[] ids)
    {
        return industrialPriceMapper.deleteIndustrialPriceByIds(ids);
    }

    /**
     * 删除产业价格管理信息
     * 
     * @param id 产业价格管理主键
     * @return 结果
     */
    @Override
    public int deleteIndustrialPriceById(Long id)
    {
        return industrialPriceMapper.deleteIndustrialPriceById(id);
    }
}
