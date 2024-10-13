package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.FarmMachineMapper;
import com.cheng.system.domain.FarmMachine;
import com.cheng.system.service.IFarmMachineService;

/**
 * 农机站点Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-13
 */
@Service
public class FarmMachineServiceImpl implements IFarmMachineService 
{
    @Autowired
    private FarmMachineMapper farmMachineMapper;

    /**
     * 查询农机站点
     * 
     * @param id 农机站点主键
     * @return 农机站点
     */
    @Override
    public FarmMachine selectFarmMachineById(Long id)
    {
        return farmMachineMapper.selectFarmMachineById(id);
    }

    /**
     * 查询农机站点列表
     * 
     * @param farmMachine 农机站点
     * @return 农机站点
     */
    @Override
    public List<FarmMachine> selectFarmMachineList(FarmMachine farmMachine)
    {
        return farmMachineMapper.selectFarmMachineList(farmMachine);
    }

    /**
     * 新增农机站点
     * 
     * @param farmMachine 农机站点
     * @return 结果
     */
    @Override
    public int insertFarmMachine(FarmMachine farmMachine)
    {
        farmMachine.setCreateTime(DateUtils.getNowDate());
        return farmMachineMapper.insertFarmMachine(farmMachine);
    }

    /**
     * 修改农机站点
     * 
     * @param farmMachine 农机站点
     * @return 结果
     */
    @Override
    public int updateFarmMachine(FarmMachine farmMachine)
    {
        return farmMachineMapper.updateFarmMachine(farmMachine);
    }

    /**
     * 批量删除农机站点
     * 
     * @param ids 需要删除的农机站点主键
     * @return 结果
     */
    @Override
    public int deleteFarmMachineByIds(Long[] ids)
    {
        return farmMachineMapper.deleteFarmMachineByIds(ids);
    }

    /**
     * 删除农机站点信息
     * 
     * @param id 农机站点主键
     * @return 结果
     */
    @Override
    public int deleteFarmMachineById(Long id)
    {
        return farmMachineMapper.deleteFarmMachineById(id);
    }
}
