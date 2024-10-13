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
import com.cheng.system.domain.InstitutionalInformation;
import com.cheng.system.service.IInstitutionalInformationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 机构信息Controller
 * 
 * @author cheng
 * @date 2024-10-13
 */
@RestController
@RequestMapping("/system/institutional_information")
public class InstitutionalInformationController extends BaseController
{
    @Autowired
    private IInstitutionalInformationService institutionalInformationService;

    /**
     * 查询机构信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:institutional_information:list')")
    @GetMapping("/list")
    public TableDataInfo list(InstitutionalInformation institutionalInformation)
    {
        startPage();
        List<InstitutionalInformation> list = institutionalInformationService.selectInstitutionalInformationList(institutionalInformation);
        return getDataTable(list);
    }

    /**
     * 导出机构信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:institutional_information:export')")
    @Log(title = "机构信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, InstitutionalInformation institutionalInformation)
    {
        List<InstitutionalInformation> list = institutionalInformationService.selectInstitutionalInformationList(institutionalInformation);
        ExcelUtil<InstitutionalInformation> util = new ExcelUtil<InstitutionalInformation>(InstitutionalInformation.class);
        util.exportExcel(response, list, "机构信息数据");
    }

    /**
     * 获取机构信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:institutional_information:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(institutionalInformationService.selectInstitutionalInformationById(id));
    }

    /**
     * 新增机构信息
     */
    @PreAuthorize("@ss.hasPermi('system:institutional_information:add')")
    @Log(title = "机构信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody InstitutionalInformation institutionalInformation)
    {
        return toAjax(institutionalInformationService.insertInstitutionalInformation(institutionalInformation));
    }

    /**
     * 修改机构信息
     */
    @PreAuthorize("@ss.hasPermi('system:institutional_information:edit')")
    @Log(title = "机构信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody InstitutionalInformation institutionalInformation)
    {
        return toAjax(institutionalInformationService.updateInstitutionalInformation(institutionalInformation));
    }

    /**
     * 删除机构信息
     */
    @PreAuthorize("@ss.hasPermi('system:institutional_information:remove')")
    @Log(title = "机构信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(institutionalInformationService.deleteInstitutionalInformationByIds(ids));
    }
}
