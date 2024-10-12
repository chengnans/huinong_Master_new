package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 地图边界配置对象 map_edge_set
 * 
 * @author cheng
 * @date 2024-10-12
 */
public class MapEdgeSet extends BaseEntity
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

    /** 备注 */
    @Excel(name = "备注")
    private String detail;

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
    public void setDetail(String detail) 
    {
        this.detail = detail;
    }

    public String getDetail() 
    {
        return detail;
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
            .append("detail", getDetail())
            .append("zhuang", getZhuang())
            .append("createTime", getCreateTime())
            .toString();
    }
}
