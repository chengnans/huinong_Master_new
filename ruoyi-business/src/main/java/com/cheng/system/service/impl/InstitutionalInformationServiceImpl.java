package com.cheng.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.InstitutionalInformationMapper;
import com.cheng.system.domain.InstitutionalInformation;
import com.cheng.system.service.IInstitutionalInformationService;

/**
 * 机构信息Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-13
 */
@Service
public class InstitutionalInformationServiceImpl implements IInstitutionalInformationService 
{
    @Autowired
    private InstitutionalInformationMapper institutionalInformationMapper;

    /**
     * 查询机构信息
     * 
     * @param id 机构信息主键
     * @return 机构信息
     */
    @Override
    public InstitutionalInformation selectInstitutionalInformationById(Long id)
    {
        return institutionalInformationMapper.selectInstitutionalInformationById(id);
    }

    /**
     * 查询机构信息列表
     * 
     * @param institutionalInformation 机构信息
     * @return 机构信息
     */
    @Override
    public List<InstitutionalInformation> selectInstitutionalInformationList(InstitutionalInformation institutionalInformation)
    {
        return institutionalInformationMapper.selectInstitutionalInformationList(institutionalInformation);
    }

    /**
     * 新增机构信息
     * 
     * @param institutionalInformation 机构信息
     * @return 结果
     */
    @Override
    public int insertInstitutionalInformation(InstitutionalInformation institutionalInformation)
    {
        return institutionalInformationMapper.insertInstitutionalInformation(institutionalInformation);
    }

    /**
     * 修改机构信息
     * 
     * @param institutionalInformation 机构信息
     * @return 结果
     */
    @Override
    public int updateInstitutionalInformation(InstitutionalInformation institutionalInformation)
    {
        return institutionalInformationMapper.updateInstitutionalInformation(institutionalInformation);
    }

    /**
     * 批量删除机构信息
     * 
     * @param ids 需要删除的机构信息主键
     * @return 结果
     */
    @Override
    public int deleteInstitutionalInformationByIds(Long[] ids)
    {
        return institutionalInformationMapper.deleteInstitutionalInformationByIds(ids);
    }

    /**
     * 删除机构信息信息
     * 
     * @param id 机构信息主键
     * @return 结果
     */
    @Override
    public int deleteInstitutionalInformationById(Long id)
    {
        return institutionalInformationMapper.deleteInstitutionalInformationById(id);
    }
}
