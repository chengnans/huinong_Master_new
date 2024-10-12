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
import com.cheng.system.domain.DataClassifyManage;
import com.cheng.system.service.IDataClassifyManageService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 数据分类管理Controller
 * 
 * @author cheng
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/system/data_classify_manage")
public class DataClassifyManageController extends BaseController
{
    @Autowired
    private IDataClassifyManageService dataClassifyManageService;

    /**
     * 查询数据分类管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:data_classify_manage:list')")
    @GetMapping("/list")
    public TableDataInfo list(DataClassifyManage dataClassifyManage)
    {
        startPage();
        List<DataClassifyManage> list = dataClassifyManageService.selectDataClassifyManageList(dataClassifyManage);
        return getDataTable(list);
    }

    /**
     * 导出数据分类管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:data_classify_manage:export')")
    @Log(title = "数据分类管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataClassifyManage dataClassifyManage)
    {
        List<DataClassifyManage> list = dataClassifyManageService.selectDataClassifyManageList(dataClassifyManage);
        ExcelUtil<DataClassifyManage> util = new ExcelUtil<DataClassifyManage>(DataClassifyManage.class);
        util.exportExcel(response, list, "数据分类管理数据");
    }

    /**
     * 获取数据分类管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:data_classify_manage:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(dataClassifyManageService.selectDataClassifyManageById(id));
    }

    /**
     * 新增数据分类管理
     */
    @PreAuthorize("@ss.hasPermi('system:data_classify_manage:add')")
    @Log(title = "数据分类管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataClassifyManage dataClassifyManage)
    {
        return toAjax(dataClassifyManageService.insertDataClassifyManage(dataClassifyManage));
    }

    /**
     * 修改数据分类管理
     */
    @PreAuthorize("@ss.hasPermi('system:data_classify_manage:edit')")
    @Log(title = "数据分类管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataClassifyManage dataClassifyManage)
    {
        return toAjax(dataClassifyManageService.updateDataClassifyManage(dataClassifyManage));
    }

    /**
     * 删除数据分类管理
     */
    @PreAuthorize("@ss.hasPermi('system:data_classify_manage:remove')")
    @Log(title = "数据分类管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dataClassifyManageService.deleteDataClassifyManageByIds(ids));
    }
}
