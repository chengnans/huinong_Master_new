package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.InstitutionalInformation;

/**
 * 机构信息Service接口
 * 
 * @author cheng
 * @date 2024-10-13
 */
public interface IInstitutionalInformationService 
{
    /**
     * 查询机构信息
     * 
     * @param id 机构信息主键
     * @return 机构信息
     */
    public InstitutionalInformation selectInstitutionalInformationById(Long id);

    /**
     * 查询机构信息列表
     * 
     * @param institutionalInformation 机构信息
     * @return 机构信息集合
     */
    public List<InstitutionalInformation> selectInstitutionalInformationList(InstitutionalInformation institutionalInformation);

    /**
     * 新增机构信息
     * 
     * @param institutionalInformation 机构信息
     * @return 结果
     */
    public int insertInstitutionalInformation(InstitutionalInformation institutionalInformation);

    /**
     * 修改机构信息
     * 
     * @param institutionalInformation 机构信息
     * @return 结果
     */
    public int updateInstitutionalInformation(InstitutionalInformation institutionalInformation);

    /**
     * 批量删除机构信息
     * 
     * @param ids 需要删除的机构信息主键集合
     * @return 结果
     */
    public int deleteInstitutionalInformationByIds(Long[] ids);

    /**
     * 删除机构信息信息
     * 
     * @param id 机构信息主键
     * @return 结果
     */
    public int deleteInstitutionalInformationById(Long id);
}
