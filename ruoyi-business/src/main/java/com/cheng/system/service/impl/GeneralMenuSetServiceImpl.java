package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.GeneralMenuSetMapper;
import com.cheng.system.domain.GeneralMenuSet;
import com.cheng.system.service.IGeneralMenuSetService;

/**
 * 通用菜单配置Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-12
 */
@Service
public class GeneralMenuSetServiceImpl implements IGeneralMenuSetService 
{
    @Autowired
    private GeneralMenuSetMapper generalMenuSetMapper;

    /**
     * 查询通用菜单配置
     * 
     * @param id 通用菜单配置主键
     * @return 通用菜单配置
     */
    @Override
    public GeneralMenuSet selectGeneralMenuSetById(Long id)
    {
        return generalMenuSetMapper.selectGeneralMenuSetById(id);
    }

    /**
     * 查询通用菜单配置列表
     * 
     * @param generalMenuSet 通用菜单配置
     * @return 通用菜单配置
     */
    @Override
    public List<GeneralMenuSet> selectGeneralMenuSetList(GeneralMenuSet generalMenuSet)
    {
        return generalMenuSetMapper.selectGeneralMenuSetList(generalMenuSet);
    }

    /**
     * 新增通用菜单配置
     * 
     * @param generalMenuSet 通用菜单配置
     * @return 结果
     */
    @Override
    public int insertGeneralMenuSet(GeneralMenuSet generalMenuSet)
    {
        generalMenuSet.setCreateTime(DateUtils.getNowDate());
        return generalMenuSetMapper.insertGeneralMenuSet(generalMenuSet);
    }

    /**
     * 修改通用菜单配置
     * 
     * @param generalMenuSet 通用菜单配置
     * @return 结果
     */
    @Override
    public int updateGeneralMenuSet(GeneralMenuSet generalMenuSet)
    {
        generalMenuSet.setUpdateTime(DateUtils.getNowDate());
        return generalMenuSetMapper.updateGeneralMenuSet(generalMenuSet);
    }

    /**
     * 批量删除通用菜单配置
     * 
     * @param ids 需要删除的通用菜单配置主键
     * @return 结果
     */
    @Override
    public int deleteGeneralMenuSetByIds(Long[] ids)
    {
        return generalMenuSetMapper.deleteGeneralMenuSetByIds(ids);
    }

    /**
     * 删除通用菜单配置信息
     * 
     * @param id 通用菜单配置主键
     * @return 结果
     */
    @Override
    public int deleteGeneralMenuSetById(Long id)
    {
        return generalMenuSetMapper.deleteGeneralMenuSetById(id);
    }
}
