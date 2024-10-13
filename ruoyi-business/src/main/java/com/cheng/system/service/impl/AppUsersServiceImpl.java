package com.cheng.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.AppUsersMapper;
import com.cheng.system.domain.AppUsers;
import com.cheng.system.service.IAppUsersService;

/**
 * APP用户Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-13
 */
@Service
public class AppUsersServiceImpl implements IAppUsersService 
{
    @Autowired
    private AppUsersMapper appUsersMapper;

    /**
     * 查询APP用户
     * 
     * @param id APP用户主键
     * @return APP用户
     */
    @Override
    public AppUsers selectAppUsersById(Long id)
    {
        return appUsersMapper.selectAppUsersById(id);
    }

    /**
     * 查询APP用户列表
     * 
     * @param appUsers APP用户
     * @return APP用户
     */
    @Override
    public List<AppUsers> selectAppUsersList(AppUsers appUsers)
    {
        return appUsersMapper.selectAppUsersList(appUsers);
    }

    /**
     * 新增APP用户
     * 
     * @param appUsers APP用户
     * @return 结果
     */
    @Override
    public int insertAppUsers(AppUsers appUsers)
    {
        return appUsersMapper.insertAppUsers(appUsers);
    }

    /**
     * 修改APP用户
     * 
     * @param appUsers APP用户
     * @return 结果
     */
    @Override
    public int updateAppUsers(AppUsers appUsers)
    {
        return appUsersMapper.updateAppUsers(appUsers);
    }

    /**
     * 批量删除APP用户
     * 
     * @param ids 需要删除的APP用户主键
     * @return 结果
     */
    @Override
    public int deleteAppUsersByIds(Long[] ids)
    {
        return appUsersMapper.deleteAppUsersByIds(ids);
    }

    /**
     * 删除APP用户信息
     * 
     * @param id APP用户主键
     * @return 结果
     */
    @Override
    public int deleteAppUsersById(Long id)
    {
        return appUsersMapper.deleteAppUsersById(id);
    }
}
