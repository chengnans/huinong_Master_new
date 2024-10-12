package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.ProductionListMapper;
import com.cheng.system.domain.ProductionList;
import com.cheng.system.service.IProductionListService;

/**
 * 产品列表Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-13
 */
@Service
public class ProductionListServiceImpl implements IProductionListService 
{
    @Autowired
    private ProductionListMapper productionListMapper;

    /**
     * 查询产品列表
     * 
     * @param id 产品列表主键
     * @return 产品列表
     */
    @Override
    public ProductionList selectProductionListById(Long id)
    {
        return productionListMapper.selectProductionListById(id);
    }

    /**
     * 查询产品列表列表
     * 
     * @param productionList 产品列表
     * @return 产品列表
     */
    @Override
    public List<ProductionList> selectProductionListList(ProductionList productionList)
    {
        return productionListMapper.selectProductionListList(productionList);
    }

    /**
     * 新增产品列表
     * 
     * @param productionList 产品列表
     * @return 结果
     */
    @Override
    public int insertProductionList(ProductionList productionList)
    {
        productionList.setCreateTime(DateUtils.getNowDate());
        return productionListMapper.insertProductionList(productionList);
    }

    /**
     * 修改产品列表
     * 
     * @param productionList 产品列表
     * @return 结果
     */
    @Override
    public int updateProductionList(ProductionList productionList)
    {
        return productionListMapper.updateProductionList(productionList);
    }

    /**
     * 批量删除产品列表
     * 
     * @param ids 需要删除的产品列表主键
     * @return 结果
     */
    @Override
    public int deleteProductionListByIds(Long[] ids)
    {
        return productionListMapper.deleteProductionListByIds(ids);
    }

    /**
     * 删除产品列表信息
     * 
     * @param id 产品列表主键
     * @return 结果
     */
    @Override
    public int deleteProductionListById(Long id)
    {
        return productionListMapper.deleteProductionListById(id);
    }
}
