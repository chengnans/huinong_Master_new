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
import com.cheng.system.domain.WorksList;
import com.cheng.system.service.IWorksListService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 作品列表Controller
 * 
 * @author cheng
 * @date 2024-10-13
 */
@RestController
@RequestMapping("/system/works_list")
public class WorksListController extends BaseController
{
    @Autowired
    private IWorksListService worksListService;

    /**
     * 查询作品列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:works_list:list')")
    @GetMapping("/list")
    public TableDataInfo list(WorksList worksList)
    {
        startPage();
        List<WorksList> list = worksListService.selectWorksListList(worksList);
        return getDataTable(list);
    }

    /**
     * 导出作品列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:works_list:export')")
    @Log(title = "作品列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WorksList worksList)
    {
        List<WorksList> list = worksListService.selectWorksListList(worksList);
        ExcelUtil<WorksList> util = new ExcelUtil<WorksList>(WorksList.class);
        util.exportExcel(response, list, "作品列表数据");
    }

    /**
     * 获取作品列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:works_list:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(worksListService.selectWorksListById(id));
    }

    /**
     * 新增作品列表
     */
    @PreAuthorize("@ss.hasPermi('system:works_list:add')")
    @Log(title = "作品列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WorksList worksList)
    {
        return toAjax(worksListService.insertWorksList(worksList));
    }

    /**
     * 修改作品列表
     */
    @PreAuthorize("@ss.hasPermi('system:works_list:edit')")
    @Log(title = "作品列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WorksList worksList)
    {
        return toAjax(worksListService.updateWorksList(worksList));
    }

    /**
     * 删除作品列表
     */
    @PreAuthorize("@ss.hasPermi('system:works_list:remove')")
    @Log(title = "作品列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(worksListService.deleteWorksListByIds(ids));
    }
}
