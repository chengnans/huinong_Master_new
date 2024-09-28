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
import com.cheng.system.domain.Rz;
import com.cheng.system.service.IRzService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 软著Controller
 * 
 * @author cheng
 * @date 2024-09-18
 */
@RestController
@RequestMapping("/system/rz")
public class RzController extends BaseController
{
    @Autowired
    private IRzService rzService;

    /**
     * 查询软著列表
     */
    @PreAuthorize("@ss.hasPermi('system:rz:list')")
    @GetMapping("/list")
    public TableDataInfo list(Rz rz)
    {
        startPage();
        List<Rz> list = rzService.selectRzList(rz);
        return getDataTable(list);
    }

    /**
     * 导出软著列表
     */
    @PreAuthorize("@ss.hasPermi('system:rz:export')")
    @Log(title = "软著", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Rz rz)
    {
        List<Rz> list = rzService.selectRzList(rz);
        ExcelUtil<Rz> util = new ExcelUtil<Rz>(Rz.class);
        util.exportExcel(response, list, "软著数据");
    }

    /**
     * 获取软著详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:rz:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(rzService.selectRzById(id));
    }

    /**
     * 新增软著
     */
    @PreAuthorize("@ss.hasPermi('system:rz:add')")
    @Log(title = "软著", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Rz rz)
    {
        return toAjax(rzService.insertRz(rz));
    }

    /**
     * 修改软著
     */
    @PreAuthorize("@ss.hasPermi('system:rz:edit')")
    @Log(title = "软著", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Rz rz)
    {
        return toAjax(rzService.updateRz(rz));
    }

    /**
     * 删除软著
     */
    @PreAuthorize("@ss.hasPermi('system:rz:remove')")
    @Log(title = "软著", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(rzService.deleteRzByIds(ids));
    }
}
