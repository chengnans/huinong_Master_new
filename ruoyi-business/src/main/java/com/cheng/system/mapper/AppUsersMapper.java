package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.AppUsers;

/**
 * APP用户Mapper接口
 * 
 * @author cheng
 * @date 2024-10-13
 */
public interface AppUsersMapper 
{
    /**
     * 查询APP用户
     * 
     * @param id APP用户主键
     * @return APP用户
     */
    public AppUsers selectAppUsersById(Long id);

    /**
     * 查询APP用户列表
     * 
     * @param appUsers APP用户
     * @return APP用户集合
     */
    public List<AppUsers> selectAppUsersList(AppUsers appUsers);

    /**
     * 新增APP用户
     * 
     * @param appUsers APP用户
     * @return 结果
     */
    public int insertAppUsers(AppUsers appUsers);

    /**
     * 修改APP用户
     * 
     * @param appUsers APP用户
     * @return 结果
     */
    public int updateAppUsers(AppUsers appUsers);

    /**
     * 删除APP用户
     * 
     * @param id APP用户主键
     * @return 结果
     */
    public int deleteAppUsersById(Long id);

    /**
     * 批量删除APP用户
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAppUsersByIds(Long[] ids);
}
