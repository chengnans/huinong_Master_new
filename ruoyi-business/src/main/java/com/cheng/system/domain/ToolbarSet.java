package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工具栏配置对象 toolbar_set
 * 
 * @author cheng
 * @date 2024-10-12
 */
public class ToolbarSet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 关联系统 */
    @Excel(name = "关联系统")
    private String relevantSystem;

    /** 发布菜单 */
    @Excel(name = "发布菜单")
    private String releaseMenu;

    /** 关联机构 */
    @Excel(name = "关联机构")
    private String relevantOrganization;

    /** 状态 */
    @Excel(name = "状态")
    private String zhuang;

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
    public void setRelevantSystem(String relevantSystem) 
    {
        this.relevantSystem = relevantSystem;
    }

    public String getRelevantSystem() 
    {
        return relevantSystem;
    }
    public void setReleaseMenu(String releaseMenu) 
    {
        this.releaseMenu = releaseMenu;
    }

    public String getReleaseMenu() 
    {
        return releaseMenu;
    }
    public void setRelevantOrganization(String relevantOrganization) 
    {
        this.relevantOrganization = relevantOrganization;
    }

    public String getRelevantOrganization() 
    {
        return relevantOrganization;
    }
    public void setZhuang(String zhuang) 
    {
        this.zhuang = zhuang;
    }

    public String getZhuang() 
    {
        return zhuang;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("relevantSystem", getRelevantSystem())
            .append("releaseMenu", getReleaseMenu())
            .append("relevantOrganization", getRelevantOrganization())
            .append("zhuang", getZhuang())
            .append("createTime", getCreateTime())
            .toString();
    }
}
