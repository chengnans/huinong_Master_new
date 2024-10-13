package com.cheng.system.mapper;

import java.util.List;
import com.cheng.system.domain.FarmMachine;

/**
 * 农机站点Mapper接口
 * 
 * @author cheng
 * @date 2024-10-13
 */
public interface FarmMachineMapper 
{
    /**
     * 查询农机站点
     * 
     * @param id 农机站点主键
     * @return 农机站点
     */
    public FarmMachine selectFarmMachineById(Long id);

    /**
     * 查询农机站点列表
     * 
     * @param farmMachine 农机站点
     * @return 农机站点集合
     */
    public List<FarmMachine> selectFarmMachineList(FarmMachine farmMachine);

    /**
     * 新增农机站点
     * 
     * @param farmMachine 农机站点
     * @return 结果
     */
    public int insertFarmMachine(FarmMachine farmMachine);

    /**
     * 修改农机站点
     * 
     * @param farmMachine 农机站点
     * @return 结果
     */
    public int updateFarmMachine(FarmMachine farmMachine);

    /**
     * 删除农机站点
     * 
     * @param id 农机站点主键
     * @return 结果
     */
    public int deleteFarmMachineById(Long id);

    /**
     * 批量删除农机站点
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFarmMachineByIds(Long[] ids);
}
