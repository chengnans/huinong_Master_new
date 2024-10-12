package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.GeneralMenuSet;

/**
 * 通用菜单配置Mapper接口
 * 
 * @author cheng
 * @date 2024-10-12
 */
public interface GeneralMenuSetMapper 
{
    /**
     * 查询通用菜单配置
     * 
     * @param id 通用菜单配置主键
     * @return 通用菜单配置
     */
    public GeneralMenuSet selectGeneralMenuSetById(Long id);

    /**
     * 查询通用菜单配置列表
     * 
     * @param generalMenuSet 通用菜单配置
     * @return 通用菜单配置集合
     */
    public List<GeneralMenuSet> selectGeneralMenuSetList(GeneralMenuSet generalMenuSet);

    /**
     * 新增通用菜单配置
     * 
     * @param generalMenuSet 通用菜单配置
     * @return 结果
     */
    public int insertGeneralMenuSet(GeneralMenuSet generalMenuSet);

    /**
     * 修改通用菜单配置
     * 
     * @param generalMenuSet 通用菜单配置
     * @return 结果
     */
    public int updateGeneralMenuSet(GeneralMenuSet generalMenuSet);

    /**
     * 删除通用菜单配置
     * 
     * @param id 通用菜单配置主键
     * @return 结果
     */
    public int deleteGeneralMenuSetById(Long id);

    /**
     * 批量删除通用菜单配置
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGeneralMenuSetByIds(Long[] ids);
}
