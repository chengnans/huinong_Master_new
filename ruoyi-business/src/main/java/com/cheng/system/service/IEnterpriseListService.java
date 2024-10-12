package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.EnterpriseList;

/**
 * 企业列表Service接口
 * 
 * @author cheng
 * @date 2024-10-13
 */
public interface IEnterpriseListService 
{
    /**
     * 查询企业列表
     * 
     * @param id 企业列表主键
     * @return 企业列表
     */
    public EnterpriseList selectEnterpriseListById(Long id);

    /**
     * 查询企业列表列表
     * 
     * @param enterpriseList 企业列表
     * @return 企业列表集合
     */
    public List<EnterpriseList> selectEnterpriseListList(EnterpriseList enterpriseList);

    /**
     * 新增企业列表
     * 
     * @param enterpriseList 企业列表
     * @return 结果
     */
    public int insertEnterpriseList(EnterpriseList enterpriseList);

    /**
     * 修改企业列表
     * 
     * @param enterpriseList 企业列表
     * @return 结果
     */
    public int updateEnterpriseList(EnterpriseList enterpriseList);

    /**
     * 批量删除企业列表
     * 
     * @param ids 需要删除的企业列表主键集合
     * @return 结果
     */
    public int deleteEnterpriseListByIds(Long[] ids);

    /**
     * 删除企业列表信息
     * 
     * @param id 企业列表主键
     * @return 结果
     */
    public int deleteEnterpriseListById(Long id);
}
