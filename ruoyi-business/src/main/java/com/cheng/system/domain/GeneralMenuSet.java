package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 通用菜单配置对象 general_menu_set
 * 
 * @author cheng
 * @date 2024-10-12
 */
public class GeneralMenuSet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 菜单组标题 */
    @Excel(name = "菜单组标题")
    private String menuGroupName;

    /** 菜单项名称 */
    @Excel(name = "菜单项名称")
    private String menuChildName;

    /** 发布选项 */
    @Excel(name = "发布选项")
    private String releaseOption;

    /** 发布页面 */
    @Excel(name = "发布页面")
    private String releaseView;

    /** 所属机构 */
    @Excel(name = "所属机构")
    private String organization;

    /** 状态 */
    @Excel(name = "状态")
    private String condition;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMenuGroupName(String menuGroupName) 
    {
        this.menuGroupName = menuGroupName;
    }

    public String getMenuGroupName() 
    {
        return menuGroupName;
    }
    public void setMenuChildName(String menuChildName) 
    {
        this.menuChildName = menuChildName;
    }

    public String getMenuChildName() 
    {
        return menuChildName;
    }
    public void setReleaseOption(String releaseOption) 
    {
        this.releaseOption = releaseOption;
    }

    public String getReleaseOption() 
    {
        return releaseOption;
    }
    public void setReleaseView(String releaseView) 
    {
        this.releaseView = releaseView;
    }

    public String getReleaseView() 
    {
        return releaseView;
    }
    public void setOrganization(String organization) 
    {
        this.organization = organization;
    }

    public String getOrganization() 
    {
        return organization;
    }
    public void setCondition(String condition) 
    {
        this.condition = condition;
    }

    public String getCondition() 
    {
        return condition;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("menuGroupName", getMenuGroupName())
            .append("menuChildName", getMenuChildName())
            .append("releaseOption", getReleaseOption())
            .append("releaseView", getReleaseView())
            .append("organization", getOrganization())
            .append("condition", getCondition())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .toString();
    }
}
