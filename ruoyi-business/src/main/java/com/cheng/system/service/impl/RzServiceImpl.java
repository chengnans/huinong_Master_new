package com.cheng.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.RzMapper;
import com.cheng.system.domain.Rz;
import com.cheng.system.service.IRzService;

/**
 * 软著Service业务层处理
 * 
 * @author cheng
 * @date 2024-09-18
 */
@Service
public class RzServiceImpl implements IRzService 
{
    @Autowired
    private RzMapper rzMapper;

    /**
     * 查询软著
     * 
     * @param id 软著主键
     * @return 软著
     */
    @Override
    public Rz selectRzById(Long id)
    {
        return rzMapper.selectRzById(id);
    }

    /**
     * 查询软著列表
     * 
     * @param rz 软著
     * @return 软著
     */
    @Override
    public List<Rz> selectRzList(Rz rz)
    {
        return rzMapper.selectRzList(rz);
    }

    /**
     * 新增软著
     * 
     * @param rz 软著
     * @return 结果
     */
    @Override
    public int insertRz(Rz rz)
    {
        return rzMapper.insertRz(rz);
    }

    /**
     * 修改软著
     * 
     * @param rz 软著
     * @return 结果
     */
    @Override
    public int updateRz(Rz rz)
    {
        return rzMapper.updateRz(rz);
    }

    /**
     * 批量删除软著
     * 
     * @param ids 需要删除的软著主键
     * @return 结果
     */
    @Override
    public int deleteRzByIds(Long[] ids)
    {
        return rzMapper.deleteRzByIds(ids);
    }

    /**
     * 删除软著信息
     * 
     * @param id 软著主键
     * @return 结果
     */
    @Override
    public int deleteRzById(Long id)
    {
        return rzMapper.deleteRzById(id);
    }
}
