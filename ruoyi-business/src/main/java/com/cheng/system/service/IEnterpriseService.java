package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.Enterprise;

/**
 * 产业企业Service接口
 * 
 * @author cheng
 * @date 2024-10-11
 */
public interface IEnterpriseService 
{
    /**
     * 查询产业企业
     * 
     * @param id 产业企业主键
     * @return 产业企业
     */
    public Enterprise selectEnterpriseById(Long id);

    /**
     * 查询产业企业列表
     * 
     * @param enterprise 产业企业
     * @return 产业企业集合
     */
    public List<Enterprise> selectEnterpriseList(Enterprise enterprise);

    /**
     * 新增产业企业
     * 
     * @param enterprise 产业企业
     * @return 结果
     */
    public int insertEnterprise(Enterprise enterprise);

    /**
     * 修改产业企业
     * 
     * @param enterprise 产业企业
     * @return 结果
     */
    public int updateEnterprise(Enterprise enterprise);

    /**
     * 批量删除产业企业
     * 
     * @param ids 需要删除的产业企业主键集合
     * @return 结果
     */
    public int deleteEnterpriseByIds(Long[] ids);

    /**
     * 删除产业企业信息
     * 
     * @param id 产业企业主键
     * @return 结果
     */
    public int deleteEnterpriseById(Long id);
}
