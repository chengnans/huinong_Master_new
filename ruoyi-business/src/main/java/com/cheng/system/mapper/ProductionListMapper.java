package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.ProductionList;

/**
 * 产品列表Mapper接口
 * 
 * @author cheng
 * @date 2024-10-13
 */
public interface ProductionListMapper 
{
    /**
     * 查询产品列表
     * 
     * @param id 产品列表主键
     * @return 产品列表
     */
    public ProductionList selectProductionListById(Long id);

    /**
     * 查询产品列表列表
     * 
     * @param productionList 产品列表
     * @return 产品列表集合
     */
    public List<ProductionList> selectProductionListList(ProductionList productionList);

    /**
     * 新增产品列表
     * 
     * @param productionList 产品列表
     * @return 结果
     */
    public int insertProductionList(ProductionList productionList);

    /**
     * 修改产品列表
     * 
     * @param productionList 产品列表
     * @return 结果
     */
    public int updateProductionList(ProductionList productionList);

    /**
     * 删除产品列表
     * 
     * @param id 产品列表主键
     * @return 结果
     */
    public int deleteProductionListById(Long id);

    /**
     * 批量删除产品列表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteProductionListByIds(Long[] ids);
}
