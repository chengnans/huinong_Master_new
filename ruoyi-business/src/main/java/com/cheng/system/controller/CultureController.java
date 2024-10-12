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
import com.cheng.system.domain.Culture;
import com.cheng.system.service.ICultureService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 文化融合Controller
 * 
 * @author cheng
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/system/culture")
public class CultureController extends BaseController
{
    @Autowired
    private ICultureService cultureService;

    /**
     * 查询文化融合列表
     */
    @PreAuthorize("@ss.hasPermi('system:culture:list')")
    @GetMapping("/list")
    public TableDataInfo list(Culture culture)
    {
        startPage();
        List<Culture> list = cultureService.selectCultureList(culture);
        return getDataTable(list);
    }

    /**
     * 导出文化融合列表
     */
    @PreAuthorize("@ss.hasPermi('system:culture:export')")
    @Log(title = "文化融合", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Culture culture)
    {
        List<Culture> list = cultureService.selectCultureList(culture);
        ExcelUtil<Culture> util = new ExcelUtil<Culture>(Culture.class);
        util.exportExcel(response, list, "文化融合数据");
    }

    /**
     * 获取文化融合详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:culture:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(cultureService.selectCultureById(id));
    }

    /**
     * 新增文化融合
     */
    @PreAuthorize("@ss.hasPermi('system:culture:add')")
    @Log(title = "文化融合", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Culture culture)
    {
        return toAjax(cultureService.insertCulture(culture));
    }

    /**
     * 修改文化融合
     */
    @PreAuthorize("@ss.hasPermi('system:culture:edit')")
    @Log(title = "文化融合", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Culture culture)
    {
        return toAjax(cultureService.updateCulture(culture));
    }

    /**
     * 删除文化融合
     */
    @PreAuthorize("@ss.hasPermi('system:culture:remove')")
    @Log(title = "文化融合", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(cultureService.deleteCultureByIds(ids));
    }
}
