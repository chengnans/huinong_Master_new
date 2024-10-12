package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 大屏菜单管理对象 large_screen_menu
 * 
 * @author cheng
 * @date 2024-10-12
 */
public class LargeScreenMenu extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 菜单分组 */
    @Excel(name = "菜单分组")
    private String menuClassify;

    /** 菜单名称 */
    @Excel(name = "菜单名称")
    private String menuName;

    /** 菜单级别 */
    @Excel(name = "菜单级别")
    private String menuLevel;

    /** 跳转地址 */
    @Excel(name = "跳转地址")
    private String skipAddress;

    /** 上级菜单 */
    @Excel(name = "上级菜单")
    private String parentMenu;

    /** 所属机构 */
    @Excel(name = "所属机构")
    private String organization;

    /** 当前状态 */
    @Excel(name = "当前状态")
    private String menuStatus;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMenuClassify(String menuClassify) 
    {
        this.menuClassify = menuClassify;
    }

    public String getMenuClassify() 
    {
        return menuClassify;
    }
    public void setMenuName(String menuName) 
    {
        this.menuName = menuName;
    }

    public String getMenuName() 
    {
        return menuName;
    }
    public void setMenuLevel(String menuLevel) 
    {
        this.menuLevel = menuLevel;
    }

    public String getMenuLevel() 
    {
        return menuLevel;
    }
    public void setSkipAddress(String skipAddress) 
    {
        this.skipAddress = skipAddress;
    }

    public String getSkipAddress() 
    {
        return skipAddress;
    }
    public void setParentMenu(String parentMenu) 
    {
        this.parentMenu = parentMenu;
    }

    public String getParentMenu() 
    {
        return parentMenu;
    }
    public void setOrganization(String organization) 
    {
        this.organization = organization;
    }

    public String getOrganization() 
    {
        return organization;
    }
    public void setMenuStatus(String menuStatus) 
    {
        this.menuStatus = menuStatus;
    }

    public String getMenuStatus() 
    {
        return menuStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("menuClassify", getMenuClassify())
            .append("menuName", getMenuName())
            .append("menuLevel", getMenuLevel())
            .append("skipAddress", getSkipAddress())
            .append("parentMenu", getParentMenu())
            .append("organization", getOrganization())
            .append("menuStatus", getMenuStatus())
            .append("createTime", getCreateTime())
            .toString();
    }
}
