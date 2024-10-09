package com.cheng.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.OldTreeMapper;
import com.cheng.system.domain.OldTree;
import com.cheng.system.service.IOldTreeService;

/**
 * 古树管理Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-09
 */
@Service
public class OldTreeServiceImpl implements IOldTreeService 
{
    @Autowired
    private OldTreeMapper oldTreeMapper;

    /**
     * 查询古树管理
     * 
     * @param id 古树管理主键
     * @return 古树管理
     */
    @Override
    public OldTree selectOldTreeById(Long id)
    {
        return oldTreeMapper.selectOldTreeById(id);
    }

    /**
     * 查询古树管理列表
     * 
     * @param oldTree 古树管理
     * @return 古树管理
     */
    @Override
    public List<OldTree> selectOldTreeList(OldTree oldTree)
    {
        return oldTreeMapper.selectOldTreeList(oldTree);
    }

    /**
     * 新增古树管理
     * 
     * @param oldTree 古树管理
     * @return 结果
     */
    @Override
    public int insertOldTree(OldTree oldTree)
    {
        return oldTreeMapper.insertOldTree(oldTree);
    }

    /**
     * 修改古树管理
     * 
     * @param oldTree 古树管理
     * @return 结果
     */
    @Override
    public int updateOldTree(OldTree oldTree)
    {
        return oldTreeMapper.updateOldTree(oldTree);
    }

    /**
     * 批量删除古树管理
     * 
     * @param ids 需要删除的古树管理主键
     * @return 结果
     */
    @Override
    public int deleteOldTreeByIds(Long[] ids)
    {
        return oldTreeMapper.deleteOldTreeByIds(ids);
    }

    /**
     * 删除古树管理信息
     * 
     * @param id 古树管理主键
     * @return 结果
     */
    @Override
    public int deleteOldTreeById(Long id)
    {
        return oldTreeMapper.deleteOldTreeById(id);
    }
}
