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
import com.cheng.system.domain.DigitalBase;
import com.cheng.system.service.IDigitalBaseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 基地信息Controller
 * 
 * @author cheng
 * @date 2024-10-08
 */
@RestController
@RequestMapping("/system/digital_base")
public class DigitalBaseController extends BaseController
{
    @Autowired
    private IDigitalBaseService digitalBaseService;

    /**
     * 查询基地信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:digital_base:list')")
    @GetMapping("/list")
    public TableDataInfo list(DigitalBase digitalBase)
    {
        startPage();
        List<DigitalBase> list = digitalBaseService.selectDigitalBaseList(digitalBase);
        return getDataTable(list);
    }

    /**
     * 导出基地信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:digital_base:export')")
    @Log(title = "基地信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DigitalBase digitalBase)
    {
        List<DigitalBase> list = digitalBaseService.selectDigitalBaseList(digitalBase);
        ExcelUtil<DigitalBase> util = new ExcelUtil<DigitalBase>(DigitalBase.class);
        util.exportExcel(response, list, "基地信息数据");
    }

    /**
     * 获取基地信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:digital_base:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(digitalBaseService.selectDigitalBaseById(id));
    }

    /**
     * 新增基地信息
     */
    @PreAuthorize("@ss.hasPermi('system:digital_base:add')")
    @Log(title = "基地信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DigitalBase digitalBase)
    {
        return toAjax(digitalBaseService.insertDigitalBase(digitalBase));
    }

    /**
     * 修改基地信息
     */
    @PreAuthorize("@ss.hasPermi('system:digital_base:edit')")
    @Log(title = "基地信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DigitalBase digitalBase)
    {
        return toAjax(digitalBaseService.updateDigitalBase(digitalBase));
    }

    /**
     * 删除基地信息
     */
    @PreAuthorize("@ss.hasPermi('system:digital_base:remove')")
    @Log(title = "基地信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(digitalBaseService.deleteDigitalBaseByIds(ids));
    }
}
