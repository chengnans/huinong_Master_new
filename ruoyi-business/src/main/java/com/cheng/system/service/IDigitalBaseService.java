package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.DigitalBase;

/**
 * 基地信息Service接口
 * 
 * @author cheng
 * @date 2024-10-08
 */
public interface IDigitalBaseService 
{
    /**
     * 查询基地信息
     * 
     * @param id 基地信息主键
     * @return 基地信息
     */
    public DigitalBase selectDigitalBaseById(Long id);

    /**
     * 查询基地信息列表
     * 
     * @param digitalBase 基地信息
     * @return 基地信息集合
     */
    public List<DigitalBase> selectDigitalBaseList(DigitalBase digitalBase);

    /**
     * 新增基地信息
     * 
     * @param digitalBase 基地信息
     * @return 结果
     */
    public int insertDigitalBase(DigitalBase digitalBase);

    /**
     * 修改基地信息
     * 
     * @param digitalBase 基地信息
     * @return 结果
     */
    public int updateDigitalBase(DigitalBase digitalBase);

    /**
     * 批量删除基地信息
     * 
     * @param ids 需要删除的基地信息主键集合
     * @return 结果
     */
    public int deleteDigitalBaseByIds(Long[] ids);

    /**
     * 删除基地信息信息
     * 
     * @param id 基地信息主键
     * @return 结果
     */
    public int deleteDigitalBaseById(Long id);
}
