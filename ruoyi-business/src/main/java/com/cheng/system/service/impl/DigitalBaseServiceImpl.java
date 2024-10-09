package com.cheng.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.DigitalBaseMapper;
import com.cheng.system.domain.DigitalBase;
import com.cheng.system.service.IDigitalBaseService;

/**
 * 基地信息Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-08
 */
@Service
public class DigitalBaseServiceImpl implements IDigitalBaseService 
{
    @Autowired
    private DigitalBaseMapper digitalBaseMapper;

    /**
     * 查询基地信息
     * 
     * @param id 基地信息主键
     * @return 基地信息
     */
    @Override
    public DigitalBase selectDigitalBaseById(Long id)
    {
        return digitalBaseMapper.selectDigitalBaseById(id);
    }

    /**
     * 查询基地信息列表
     * 
     * @param digitalBase 基地信息
     * @return 基地信息
     */
    @Override
    public List<DigitalBase> selectDigitalBaseList(DigitalBase digitalBase)
    {
        return digitalBaseMapper.selectDigitalBaseList(digitalBase);
    }

    /**
     * 新增基地信息
     * 
     * @param digitalBase 基地信息
     * @return 结果
     */
    @Override
    public int insertDigitalBase(DigitalBase digitalBase)
    {
        return digitalBaseMapper.insertDigitalBase(digitalBase);
    }

    /**
     * 修改基地信息
     * 
     * @param digitalBase 基地信息
     * @return 结果
     */
    @Override
    public int updateDigitalBase(DigitalBase digitalBase)
    {
        return digitalBaseMapper.updateDigitalBase(digitalBase);
    }

    /**
     * 批量删除基地信息
     * 
     * @param ids 需要删除的基地信息主键
     * @return 结果
     */
    @Override
    public int deleteDigitalBaseByIds(Long[] ids)
    {
        return digitalBaseMapper.deleteDigitalBaseByIds(ids);
    }

    /**
     * 删除基地信息信息
     * 
     * @param id 基地信息主键
     * @return 结果
     */
    @Override
    public int deleteDigitalBaseById(Long id)
    {
        return digitalBaseMapper.deleteDigitalBaseById(id);
    }
}
