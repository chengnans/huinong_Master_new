package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.BaseAuthMapper;
import com.cheng.system.domain.BaseAuth;
import com.cheng.system.service.IBaseAuthService;

/**
 * 基地授权Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-13
 */
@Service
public class BaseAuthServiceImpl implements IBaseAuthService 
{
    @Autowired
    private BaseAuthMapper baseAuthMapper;

    /**
     * 查询基地授权
     * 
     * @param id 基地授权主键
     * @return 基地授权
     */
    @Override
    public BaseAuth selectBaseAuthById(Long id)
    {
        return baseAuthMapper.selectBaseAuthById(id);
    }

    /**
     * 查询基地授权列表
     * 
     * @param baseAuth 基地授权
     * @return 基地授权
     */
    @Override
    public List<BaseAuth> selectBaseAuthList(BaseAuth baseAuth)
    {
        return baseAuthMapper.selectBaseAuthList(baseAuth);
    }

    /**
     * 新增基地授权
     * 
     * @param baseAuth 基地授权
     * @return 结果
     */
    @Override
    public int insertBaseAuth(BaseAuth baseAuth)
    {
        baseAuth.setCreateTime(DateUtils.getNowDate());
        return baseAuthMapper.insertBaseAuth(baseAuth);
    }

    /**
     * 修改基地授权
     * 
     * @param baseAuth 基地授权
     * @return 结果
     */
    @Override
    public int updateBaseAuth(BaseAuth baseAuth)
    {
        return baseAuthMapper.updateBaseAuth(baseAuth);
    }

    /**
     * 批量删除基地授权
     * 
     * @param ids 需要删除的基地授权主键
     * @return 结果
     */
    @Override
    public int deleteBaseAuthByIds(Long[] ids)
    {
        return baseAuthMapper.deleteBaseAuthByIds(ids);
    }

    /**
     * 删除基地授权信息
     * 
     * @param id 基地授权主键
     * @return 结果
     */
    @Override
    public int deleteBaseAuthById(Long id)
    {
        return baseAuthMapper.deleteBaseAuthById(id);
    }
}
