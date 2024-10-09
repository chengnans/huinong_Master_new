package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.OldTree;

/**
 * 古树管理Mapper接口
 * 
 * @author cheng
 * @date 2024-10-09
 */
public interface OldTreeMapper 
{
    /**
     * 查询古树管理
     * 
     * @param id 古树管理主键
     * @return 古树管理
     */
    public OldTree selectOldTreeById(Long id);

    /**
     * 查询古树管理列表
     * 
     * @param oldTree 古树管理
     * @return 古树管理集合
     */
    public List<OldTree> selectOldTreeList(OldTree oldTree);

    /**
     * 新增古树管理
     * 
     * @param oldTree 古树管理
     * @return 结果
     */
    public int insertOldTree(OldTree oldTree);

    /**
     * 修改古树管理
     * 
     * @param oldTree 古树管理
     * @return 结果
     */
    public int updateOldTree(OldTree oldTree);

    /**
     * 删除古树管理
     * 
     * @param id 古树管理主键
     * @return 结果
     */
    public int deleteOldTreeById(Long id);

    /**
     * 批量删除古树管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOldTreeByIds(Long[] ids);
}
