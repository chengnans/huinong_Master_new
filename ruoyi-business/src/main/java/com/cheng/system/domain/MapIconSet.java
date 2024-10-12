package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 地图图标配置对象 map_icon_set
 * 
 * @author cheng
 * @date 2024-10-12
 */
public class MapIconSet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 图标种类 */
    @Excel(name = "图标种类")
    private String iconStyle;

    /** 选项卡种类 */
    @Excel(name = "选项卡种类")
    private String optionStyle;

    /** 关联系统 */
    @Excel(name = "关联系统")
    private String relevantSystem;

    /** 关联机构 */
    @Excel(name = "关联机构")
    private String relevantOrganization;

    /** 备注 */
    @Excel(name = "备注")
    private String detail;

    /** 发布菜单 */
    @Excel(name = "发布菜单")
    private String releaseMenu;

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
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setIconStyle(String iconStyle) 
    {
        this.iconStyle = iconStyle;
    }

    public String getIconStyle() 
    {
        return iconStyle;
    }
    public void setOptionStyle(String optionStyle) 
    {
        this.optionStyle = optionStyle;
    }

    public String getOptionStyle() 
    {
        return optionStyle;
    }
    public void setRelevantSystem(String relevantSystem) 
    {
        this.relevantSystem = relevantSystem;
    }

    public String getRelevantSystem() 
    {
        return relevantSystem;
    }
    public void setRelevantOrganization(String relevantOrganization) 
    {
        this.relevantOrganization = relevantOrganization;
    }

    public String getRelevantOrganization() 
    {
        return relevantOrganization;
    }
    public void setDetail(String detail) 
    {
        this.detail = detail;
    }

    public String getDetail() 
    {
        return detail;
    }
    public void setReleaseMenu(String releaseMenu) 
    {
        this.releaseMenu = releaseMenu;
    }

    public String getReleaseMenu() 
    {
        return releaseMenu;
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
            .append("name", getName())
            .append("iconStyle", getIconStyle())
            .append("optionStyle", getOptionStyle())
            .append("relevantSystem", getRelevantSystem())
            .append("relevantOrganization", getRelevantOrganization())
            .append("detail", getDetail())
            .append("releaseMenu", getReleaseMenu())
            .append("condition", getCondition())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
