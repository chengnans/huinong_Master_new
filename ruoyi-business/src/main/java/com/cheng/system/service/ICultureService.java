package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.Culture;

/**
 * 文化融合Service接口
 * 
 * @author cheng
 * @date 2024-10-12
 */
public interface ICultureService 
{
    /**
     * 查询文化融合
     * 
     * @param id 文化融合主键
     * @return 文化融合
     */
    public Culture selectCultureById(Long id);

    /**
     * 查询文化融合列表
     * 
     * @param culture 文化融合
     * @return 文化融合集合
     */
    public List<Culture> selectCultureList(Culture culture);

    /**
     * 新增文化融合
     * 
     * @param culture 文化融合
     * @return 结果
     */
    public int insertCulture(Culture culture);

    /**
     * 修改文化融合
     * 
     * @param culture 文化融合
     * @return 结果
     */
    public int updateCulture(Culture culture);

    /**
     * 批量删除文化融合
     * 
     * @param ids 需要删除的文化融合主键集合
     * @return 结果
     */
    public int deleteCultureByIds(Long[] ids);

    /**
     * 删除文化融合信息
     * 
     * @param id 文化融合主键
     * @return 结果
     */
    public int deleteCultureById(Long id);
}
