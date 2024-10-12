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
import com.cheng.system.domain.EnterpriseList;
import com.cheng.system.service.IEnterpriseListService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 企业列表Controller
 * 
 * @author cheng
 * @date 2024-10-13
 */
@RestController
@RequestMapping("/system/enterprise_list")
public class EnterpriseListController extends BaseController
{
    @Autowired
    private IEnterpriseListService enterpriseListService;

    /**
     * 查询企业列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:enterprise_list:list')")
    @GetMapping("/list")
    public TableDataInfo list(EnterpriseList enterpriseList)
    {
        startPage();
        List<EnterpriseList> list = enterpriseListService.selectEnterpriseListList(enterpriseList);
        return getDataTable(list);
    }

    /**
     * 导出企业列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:enterprise_list:export')")
    @Log(title = "企业列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EnterpriseList enterpriseList)
    {
        List<EnterpriseList> list = enterpriseListService.selectEnterpriseListList(enterpriseList);
        ExcelUtil<EnterpriseList> util = new ExcelUtil<EnterpriseList>(EnterpriseList.class);
        util.exportExcel(response, list, "企业列表数据");
    }

    /**
     * 获取企业列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:enterprise_list:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(enterpriseListService.selectEnterpriseListById(id));
    }

    /**
     * 新增企业列表
     */
    @PreAuthorize("@ss.hasPermi('system:enterprise_list:add')")
    @Log(title = "企业列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EnterpriseList enterpriseList)
    {
        return toAjax(enterpriseListService.insertEnterpriseList(enterpriseList));
    }

    /**
     * 修改企业列表
     */
    @PreAuthorize("@ss.hasPermi('system:enterprise_list:edit')")
    @Log(title = "企业列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EnterpriseList enterpriseList)
    {
        return toAjax(enterpriseListService.updateEnterpriseList(enterpriseList));
    }

    /**
     * 删除企业列表
     */
    @PreAuthorize("@ss.hasPermi('system:enterprise_list:remove')")
    @Log(title = "企业列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(enterpriseListService.deleteEnterpriseListByIds(ids));
    }
}
