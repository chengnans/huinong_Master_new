package com.cheng.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheng.system.mapper.DisasterModelMapper;
import com.cheng.system.domain.DisasterModel;
import com.cheng.system.service.IDisasterModelService;

/**
 * 灾害模型Service业务层处理
 * 
 * @author cheng
 * @date 2024-10-09
 */
@Service
public class DisasterModelServiceImpl implements IDisasterModelService 
{
    @Autowired
    private DisasterModelMapper disasterModelMapper;

    /**
     * 查询灾害模型
     * 
     * @param id 灾害模型主键
     * @return 灾害模型
     */
    @Override
    public DisasterModel selectDisasterModelById(Long id)
    {
        return disasterModelMapper.selectDisasterModelById(id);
    }

    /**
     * 查询灾害模型列表
     * 
     * @param disasterModel 灾害模型
     * @return 灾害模型
     */
    @Override
    public List<DisasterModel> selectDisasterModelList(DisasterModel disasterModel)
    {
        return disasterModelMapper.selectDisasterModelList(disasterModel);
    }

    /**
     * 新增灾害模型
     * 
     * @param disasterModel 灾害模型
     * @return 结果
     */
    @Override
    public int insertDisasterModel(DisasterModel disasterModel)
    {
        disasterModel.setCreateTime(DateUtils.getNowDate());
        return disasterModelMapper.insertDisasterModel(disasterModel);
    }

    /**
     * 修改灾害模型
     * 
     * @param disasterModel 灾害模型
     * @return 结果
     */
    @Override
    public int updateDisasterModel(DisasterModel disasterModel)
    {
        return disasterModelMapper.updateDisasterModel(disasterModel);
    }

    /**
     * 批量删除灾害模型
     * 
     * @param ids 需要删除的灾害模型主键
     * @return 结果
     */
    @Override
    public int deleteDisasterModelByIds(Long[] ids)
    {
        return disasterModelMapper.deleteDisasterModelByIds(ids);
    }

    /**
     * 删除灾害模型信息
     * 
     * @param id 灾害模型主键
     * @return 结果
     */
    @Override
    public int deleteDisasterModelById(Long id)
    {
        return disasterModelMapper.deleteDisasterModelById(id);
    }
}
