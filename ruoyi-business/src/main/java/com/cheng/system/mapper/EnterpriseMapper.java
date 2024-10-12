package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.Enterprise;

/**
 * 产业企业Mapper接口
 * 
 * @author cheng
 * @date 2024-10-12
 */
public interface EnterpriseMapper 
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
     * 删除产业企业
     * 
     * @param id 产业企业主键
     * @return 结果
     */
    public int deleteEnterpriseById(Long id);

    /**
     * 批量删除产业企业
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEnterpriseByIds(Long[] ids);
}
