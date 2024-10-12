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
import com.cheng.system.domain.ProductionList;
import com.cheng.system.service.IProductionListService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 产品列表Controller
 * 
 * @author cheng
 * @date 2024-10-13
 */
@RestController
@RequestMapping("/system/production_list")
public class ProductionListController extends BaseController
{
    @Autowired
    private IProductionListService productionListService;

    /**
     * 查询产品列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:production_list:list')")
    @GetMapping("/list")
    public TableDataInfo list(ProductionList productionList)
    {
        startPage();
        List<ProductionList> list = productionListService.selectProductionListList(productionList);
        return getDataTable(list);
    }

    /**
     * 导出产品列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:production_list:export')")
    @Log(title = "产品列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ProductionList productionList)
    {
        List<ProductionList> list = productionListService.selectProductionListList(productionList);
        ExcelUtil<ProductionList> util = new ExcelUtil<ProductionList>(ProductionList.class);
        util.exportExcel(response, list, "产品列表数据");
    }

    /**
     * 获取产品列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:production_list:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(productionListService.selectProductionListById(id));
    }

    /**
     * 新增产品列表
     */
    @PreAuthorize("@ss.hasPermi('system:production_list:add')")
    @Log(title = "产品列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ProductionList productionList)
    {
        return toAjax(productionListService.insertProductionList(productionList));
    }

    /**
     * 修改产品列表
     */
    @PreAuthorize("@ss.hasPermi('system:production_list:edit')")
    @Log(title = "产品列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ProductionList productionList)
    {
        return toAjax(productionListService.updateProductionList(productionList));
    }

    /**
     * 删除产品列表
     */
    @PreAuthorize("@ss.hasPermi('system:production_list:remove')")
    @Log(title = "产品列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(productionListService.deleteProductionListByIds(ids));
    }
}
