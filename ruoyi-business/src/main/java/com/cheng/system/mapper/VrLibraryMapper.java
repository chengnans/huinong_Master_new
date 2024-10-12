package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.VrLibrary;

/**
 * VR库Mapper接口
 * 
 * @author cheng
 * @date 2024-10-13
 */
public interface VrLibraryMapper 
{
    /**
     * 查询VR库
     * 
     * @param id VR库主键
     * @return VR库
     */
    public VrLibrary selectVrLibraryById(Long id);

    /**
     * 查询VR库列表
     * 
     * @param vrLibrary VR库
     * @return VR库集合
     */
    public List<VrLibrary> selectVrLibraryList(VrLibrary vrLibrary);

    /**
     * 新增VR库
     * 
     * @param vrLibrary VR库
     * @return 结果
     */
    public int insertVrLibrary(VrLibrary vrLibrary);

    /**
     * 修改VR库
     * 
     * @param vrLibrary VR库
     * @return 结果
     */
    public int updateVrLibrary(VrLibrary vrLibrary);

    /**
     * 删除VR库
     * 
     * @param id VR库主键
     * @return 结果
     */
    public int deleteVrLibraryById(Long id);

    /**
     * 批量删除VR库
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVrLibraryByIds(Long[] ids);
}
