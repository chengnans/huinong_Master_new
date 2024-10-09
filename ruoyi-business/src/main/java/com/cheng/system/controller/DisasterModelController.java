package com.cheng.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.cheng.system.domain.DisasterModel;
import com.cheng.system.service.IDisasterModelService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 灾害模型Controller
 * 
 * @author cheng
 * @date 2024-10-09
 */
@RestController
@RequestMapping("/system/disaster_model")
public class DisasterModelController extends BaseController
{
    @Autowired
    private IDisasterModelService disasterModelService;

    /**
     * 查询灾害模型列表
     */
    @PreAuthorize("@ss.hasPermi('system:disaster_model:list')")
    @GetMapping("/list")
    public TableDataInfo list(DisasterModel disasterModel)
    {
        startPage();
        List<DisasterModel> list = disasterModelService.selectDisasterModelList(disasterModel);
        return getDataTable(list);
    }

    /**
     * 导出灾害模型列表
     */
    @PreAuthorize("@ss.hasPermi('system:disaster_model:export')")
    @Log(title = "灾害模型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DisasterModel disasterModel)
    {
        List<DisasterModel> list = disasterModelService.selectDisasterModelList(disasterModel);
        ExcelUtil<DisasterModel> util = new ExcelUtil<DisasterModel>(DisasterModel.class);
        util.exportExcel(response, list, "灾害模型数据");
    }

    /**
     * 获取灾害模型详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:disaster_model:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(disasterModelService.selectDisasterModelById(id));
    }

    /**
     * 新增灾害模型
     */
    @PreAuthorize("@ss.hasPermi('system:disaster_model:add')")
    @Log(title = "灾害模型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DisasterModel disasterModel)
    {
        return toAjax(disasterModelService.insertDisasterModel(disasterModel));
    }

    /**
     * 修改灾害模型
     */
    @PreAuthorize("@ss.hasPermi('system:disaster_model:edit')")
    @Log(title = "灾害模型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DisasterModel disasterModel)
    {
        return toAjax(disasterModelService.updateDisasterModel(disasterModel));
    }

    /**
     * 删除灾害模型
     */
    @PreAuthorize("@ss.hasPermi('system:disaster_model:remove')")
    @Log(title = "灾害模型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(disasterModelService.deleteDisasterModelByIds(ids));
    }
}
