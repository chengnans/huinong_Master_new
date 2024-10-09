package com.cheng.system.service;

import java.util.List;
import com.cheng.system.domain.DisasterModel;

/**
 * 灾害模型Service接口
 * 
 * @author cheng
 * @date 2024-10-09
 */
public interface IDisasterModelService 
{
    /**
     * 查询灾害模型
     * 
     * @param id 灾害模型主键
     * @return 灾害模型
     */
    public DisasterModel selectDisasterModelById(Long id);

    /**
     * 查询灾害模型列表
     * 
     * @param disasterModel 灾害模型
     * @return 灾害模型集合
     */
    public List<DisasterModel> selectDisasterModelList(DisasterModel disasterModel);

    /**
     * 新增灾害模型
     * 
     * @param disasterModel 灾害模型
     * @return 结果
     */
    public int insertDisasterModel(DisasterModel disasterModel);

    /**
     * 修改灾害模型
     * 
     * @param disasterModel 灾害模型
     * @return 结果
     */
    public int updateDisasterModel(DisasterModel disasterModel);

    /**
     * 批量删除灾害模型
     * 
     * @param ids 需要删除的灾害模型主键集合
     * @return 结果
     */
    public int deleteDisasterModelByIds(Long[] ids);

    /**
     * 删除灾害模型信息
     * 
     * @param id 灾害模型主键
     * @return 结果
     */
    public int deleteDisasterModelById(Long id);
}
