package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.BaseAuth;

/**
 * 基地授权Mapper接口
 * 
 * @author cheng
 * @date 2024-10-13
 */
public interface BaseAuthMapper 
{
    /**
     * 查询基地授权
     * 
     * @param id 基地授权主键
     * @return 基地授权
     */
    public BaseAuth selectBaseAuthById(Long id);

    /**
     * 查询基地授权列表
     * 
     * @param baseAuth 基地授权
     * @return 基地授权集合
     */
    public List<BaseAuth> selectBaseAuthList(BaseAuth baseAuth);

    /**
     * 新增基地授权
     * 
     * @param baseAuth 基地授权
     * @return 结果
     */
    public int insertBaseAuth(BaseAuth baseAuth);

    /**
     * 修改基地授权
     * 
     * @param baseAuth 基地授权
     * @return 结果
     */
    public int updateBaseAuth(BaseAuth baseAuth);

    /**
     * 删除基地授权
     * 
     * @param id 基地授权主键
     * @return 结果
     */
    public int deleteBaseAuthById(Long id);

    /**
     * 批量删除基地授权
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseAuthByIds(Long[] ids);
}
