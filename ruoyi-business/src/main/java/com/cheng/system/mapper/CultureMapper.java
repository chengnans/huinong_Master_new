package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.Culture;

/**
 * 文化融合Mapper接口
 * 
 * @author cheng
 * @date 2024-10-12
 */
public interface CultureMapper 
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
     * 删除文化融合
     * 
     * @param id 文化融合主键
     * @return 结果
     */
    public int deleteCultureById(Long id);

    /**
     * 批量删除文化融合
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCultureByIds(Long[] ids);
}
