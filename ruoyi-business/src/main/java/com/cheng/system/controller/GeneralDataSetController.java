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
import com.cheng.system.domain.GeneralDataSet;
import com.cheng.system.service.IGeneralDataSetService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 通用数据配置Controller
 * 
 * @author cheng
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/system/general_data_set")
public class GeneralDataSetController extends BaseController
{
    @Autowired
    private IGeneralDataSetService generalDataSetService;

    /**
     * 查询通用数据配置列表
     */
    @PreAuthorize("@ss.hasPermi('system:general_data_set:list')")
    @GetMapping("/list")
    public TableDataInfo list(GeneralDataSet generalDataSet)
    {
        startPage();
        List<GeneralDataSet> list = generalDataSetService.selectGeneralDataSetList(generalDataSet);
        return getDataTable(list);
    }

    /**
     * 导出通用数据配置列表
     */
    @PreAuthorize("@ss.hasPermi('system:general_data_set:export')")
    @Log(title = "通用数据配置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, GeneralDataSet generalDataSet)
    {
        List<GeneralDataSet> list = generalDataSetService.selectGeneralDataSetList(generalDataSet);
        ExcelUtil<GeneralDataSet> util = new ExcelUtil<GeneralDataSet>(GeneralDataSet.class);
        util.exportExcel(response, list, "通用数据配置数据");
    }

    /**
     * 获取通用数据配置详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:general_data_set:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(generalDataSetService.selectGeneralDataSetById(id));
    }

    /**
     * 新增通用数据配置
     */
    @PreAuthorize("@ss.hasPermi('system:general_data_set:add')")
    @Log(title = "通用数据配置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody GeneralDataSet generalDataSet)
    {
        return toAjax(generalDataSetService.insertGeneralDataSet(generalDataSet));
    }

    /**
     * 修改通用数据配置
     */
    @PreAuthorize("@ss.hasPermi('system:general_data_set:edit')")
    @Log(title = "通用数据配置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody GeneralDataSet generalDataSet)
    {
        return toAjax(generalDataSetService.updateGeneralDataSet(generalDataSet));
    }

    /**
     * 删除通用数据配置
     */
    @PreAuthorize("@ss.hasPermi('system:general_data_set:remove')")
    @Log(title = "通用数据配置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(generalDataSetService.deleteGeneralDataSetByIds(ids));
    }
}
