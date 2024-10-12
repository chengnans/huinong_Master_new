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
import com.cheng.system.domain.IndustrialPrice;
import com.cheng.system.service.IIndustrialPriceService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 产业价格管理Controller
 * 
 * @author cheng
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/system/industrial_price")
public class IndustrialPriceController extends BaseController
{
    @Autowired
    private IIndustrialPriceService industrialPriceService;

    /**
     * 查询产业价格管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:industrial_price:list')")
    @GetMapping("/list")
    public TableDataInfo list(IndustrialPrice industrialPrice)
    {
        startPage();
        List<IndustrialPrice> list = industrialPriceService.selectIndustrialPriceList(industrialPrice);
        return getDataTable(list);
    }

    /**
     * 导出产业价格管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:industrial_price:export')")
    @Log(title = "产业价格管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, IndustrialPrice industrialPrice)
    {
        List<IndustrialPrice> list = industrialPriceService.selectIndustrialPriceList(industrialPrice);
        ExcelUtil<IndustrialPrice> util = new ExcelUtil<IndustrialPrice>(IndustrialPrice.class);
        util.exportExcel(response, list, "产业价格管理数据");
    }

    /**
     * 获取产业价格管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:industrial_price:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(industrialPriceService.selectIndustrialPriceById(id));
    }

    /**
     * 新增产业价格管理
     */
    @PreAuthorize("@ss.hasPermi('system:industrial_price:add')")
    @Log(title = "产业价格管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody IndustrialPrice industrialPrice)
    {
        return toAjax(industrialPriceService.insertIndustrialPrice(industrialPrice));
    }

    /**
     * 修改产业价格管理
     */
    @PreAuthorize("@ss.hasPermi('system:industrial_price:edit')")
    @Log(title = "产业价格管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody IndustrialPrice industrialPrice)
    {
        return toAjax(industrialPriceService.updateIndustrialPrice(industrialPrice));
    }

    /**
     * 删除产业价格管理
     */
    @PreAuthorize("@ss.hasPermi('system:industrial_price:remove')")
    @Log(title = "产业价格管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(industrialPriceService.deleteIndustrialPriceByIds(ids));
    }
}
