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
import com.cheng.system.domain.OldTree;
import com.cheng.system.service.IOldTreeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 古树管理Controller
 * 
 * @author cheng
 * @date 2024-10-09
 */
@RestController
@RequestMapping("/system/old_tree")
public class OldTreeController extends BaseController
{
    @Autowired
    private IOldTreeService oldTreeService;

    /**
     * 查询古树管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:old_tree:list')")
    @GetMapping("/list")
    public TableDataInfo list(OldTree oldTree)
    {
        startPage();
        List<OldTree> list = oldTreeService.selectOldTreeList(oldTree);
        return getDataTable(list);
    }

    /**
     * 导出古树管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:old_tree:export')")
    @Log(title = "古树管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OldTree oldTree)
    {
        List<OldTree> list = oldTreeService.selectOldTreeList(oldTree);
        ExcelUtil<OldTree> util = new ExcelUtil<OldTree>(OldTree.class);
        util.exportExcel(response, list, "古树管理数据");
    }

    /**
     * 获取古树管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:old_tree:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(oldTreeService.selectOldTreeById(id));
    }

    /**
     * 新增古树管理
     */
    @PreAuthorize("@ss.hasPermi('system:old_tree:add')")
    @Log(title = "古树管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OldTree oldTree)
    {
        return toAjax(oldTreeService.insertOldTree(oldTree));
    }

    /**
     * 修改古树管理
     */
    @PreAuthorize("@ss.hasPermi('system:old_tree:edit')")
    @Log(title = "古树管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OldTree oldTree)
    {
        return toAjax(oldTreeService.updateOldTree(oldTree));
    }

    /**
     * 删除古树管理
     */
    @PreAuthorize("@ss.hasPermi('system:old_tree:remove')")
    @Log(title = "古树管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(oldTreeService.deleteOldTreeByIds(ids));
    }
}
