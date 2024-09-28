package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.Rz;

/**
 * 软著Service接口
 * 
 * @author cheng
 * @date 2024-09-18
 */
public interface IRzService 
{
    /**
     * 查询软著
     * 
     * @param id 软著主键
     * @return 软著
     */
    public Rz selectRzById(Long id);

    /**
     * 查询软著列表
     * 
     * @param rz 软著
     * @return 软著集合
     */
    public List<Rz> selectRzList(Rz rz);

    /**
     * 新增软著
     * 
     * @param rz 软著
     * @return 结果
     */
    public int insertRz(Rz rz);

    /**
     * 修改软著
     * 
     * @param rz 软著
     * @return 结果
     */
    public int updateRz(Rz rz);

    /**
     * 批量删除软著
     * 
     * @param ids 需要删除的软著主键集合
     * @return 结果
     */
    public int deleteRzByIds(Long[] ids);

    /**
     * 删除软著信息
     * 
     * @param id 软著主键
     * @return 结果
     */
    public int deleteRzById(Long id);
}
