package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.EnterpriseMapper;
import com.cheng.system.domain.Enterprise;
import com.cheng.system.service.IEnterpriseService;

/**
 * 产业企业Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-12
 */
@Service
public class EnterpriseServiceImpl implements IEnterpriseService 
{
    @Autowired
    private EnterpriseMapper enterpriseMapper;

    /**
     * 查询产业企业
     * 
     * @param id 产业企业主键
     * @return 产业企业
     */
    @Override
    public Enterprise selectEnterpriseById(Long id)
    {
        return enterpriseMapper.selectEnterpriseById(id);
    }

    /**
     * 查询产业企业列表
     * 
     * @param enterprise 产业企业
     * @return 产业企业
     */
    @Override
    public List<Enterprise> selectEnterpriseList(Enterprise enterprise)
    {
        return enterpriseMapper.selectEnterpriseList(enterprise);
    }

    /**
     * 新增产业企业
     * 
     * @param enterprise 产业企业
     * @return 结果
     */
    @Override
    public int insertEnterprise(Enterprise enterprise)
    {
        enterprise.setCreateTime(DateUtils.getNowDate());
        return enterpriseMapper.insertEnterprise(enterprise);
    }

    /**
     * 修改产业企业
     * 
     * @param enterprise 产业企业
     * @return 结果
     */
    @Override
    public int updateEnterprise(Enterprise enterprise)
    {
        enterprise.setUpdateTime(DateUtils.getNowDate());
        return enterpriseMapper.updateEnterprise(enterprise);
    }

    /**
     * 批量删除产业企业
     * 
     * @param ids 需要删除的产业企业主键
     * @return 结果
     */
    @Override
    public int deleteEnterpriseByIds(Long[] ids)
    {
        return enterpriseMapper.deleteEnterpriseByIds(ids);
    }

    /**
     * 删除产业企业信息
     * 
     * @param id 产业企业主键
     * @return 结果
     */
    @Override
    public int deleteEnterpriseById(Long id)
    {
        return enterpriseMapper.deleteEnterpriseById(id);
    }
}
