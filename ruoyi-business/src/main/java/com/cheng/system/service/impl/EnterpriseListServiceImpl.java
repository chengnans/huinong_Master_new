package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.EnterpriseListMapper;
import com.cheng.system.domain.EnterpriseList;
import com.cheng.system.service.IEnterpriseListService;

/**
 * 企业列表Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-13
 */
@Service
public class EnterpriseListServiceImpl implements IEnterpriseListService 
{
    @Autowired
    private EnterpriseListMapper enterpriseListMapper;

    /**
     * 查询企业列表
     * 
     * @param id 企业列表主键
     * @return 企业列表
     */
    @Override
    public EnterpriseList selectEnterpriseListById(Long id)
    {
        return enterpriseListMapper.selectEnterpriseListById(id);
    }

    /**
     * 查询企业列表列表
     * 
     * @param enterpriseList 企业列表
     * @return 企业列表
     */
    @Override
    public List<EnterpriseList> selectEnterpriseListList(EnterpriseList enterpriseList)
    {
        return enterpriseListMapper.selectEnterpriseListList(enterpriseList);
    }

    /**
     * 新增企业列表
     * 
     * @param enterpriseList 企业列表
     * @return 结果
     */
    @Override
    public int insertEnterpriseList(EnterpriseList enterpriseList)
    {
        enterpriseList.setCreateTime(DateUtils.getNowDate());
        return enterpriseListMapper.insertEnterpriseList(enterpriseList);
    }

    /**
     * 修改企业列表
     * 
     * @param enterpriseList 企业列表
     * @return 结果
     */
    @Override
    public int updateEnterpriseList(EnterpriseList enterpriseList)
    {
        return enterpriseListMapper.updateEnterpriseList(enterpriseList);
    }

    /**
     * 批量删除企业列表
     * 
     * @param ids 需要删除的企业列表主键
     * @return 结果
     */
    @Override
    public int deleteEnterpriseListByIds(Long[] ids)
    {
        return enterpriseListMapper.deleteEnterpriseListByIds(ids);
    }

    /**
     * 删除企业列表信息
     * 
     * @param id 企业列表主键
     * @return 结果
     */
    @Override
    public int deleteEnterpriseListById(Long id)
    {
        return enterpriseListMapper.deleteEnterpriseListById(id);
    }
}
