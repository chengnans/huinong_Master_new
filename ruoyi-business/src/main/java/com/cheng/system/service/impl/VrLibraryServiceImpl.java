package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.VrLibraryMapper;
import com.cheng.system.domain.VrLibrary;
import com.cheng.system.service.IVrLibraryService;

/**
 * VR库Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-13
 */
@Service
public class VrLibraryServiceImpl implements IVrLibraryService 
{
    @Autowired
    private VrLibraryMapper vrLibraryMapper;

    /**
     * 查询VR库
     * 
     * @param id VR库主键
     * @return VR库
     */
    @Override
    public VrLibrary selectVrLibraryById(Long id)
    {
        return vrLibraryMapper.selectVrLibraryById(id);
    }

    /**
     * 查询VR库列表
     * 
     * @param vrLibrary VR库
     * @return VR库
     */
    @Override
    public List<VrLibrary> selectVrLibraryList(VrLibrary vrLibrary)
    {
        return vrLibraryMapper.selectVrLibraryList(vrLibrary);
    }

    /**
     * 新增VR库
     * 
     * @param vrLibrary VR库
     * @return 结果
     */
    @Override
    public int insertVrLibrary(VrLibrary vrLibrary)
    {
        vrLibrary.setCreateTime(DateUtils.getNowDate());
        return vrLibraryMapper.insertVrLibrary(vrLibrary);
    }

    /**
     * 修改VR库
     * 
     * @param vrLibrary VR库
     * @return 结果
     */
    @Override
    public int updateVrLibrary(VrLibrary vrLibrary)
    {
        return vrLibraryMapper.updateVrLibrary(vrLibrary);
    }

    /**
     * 批量删除VR库
     * 
     * @param ids 需要删除的VR库主键
     * @return 结果
     */
    @Override
    public int deleteVrLibraryByIds(Long[] ids)
    {
        return vrLibraryMapper.deleteVrLibraryByIds(ids);
    }

    /**
     * 删除VR库信息
     * 
     * @param id VR库主键
     * @return 结果
     */
    @Override
    public int deleteVrLibraryById(Long id)
    {
        return vrLibraryMapper.deleteVrLibraryById(id);
    }
}
