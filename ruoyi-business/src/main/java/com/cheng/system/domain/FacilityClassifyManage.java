package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设施分类管理对象 facility_classify_manage
 * 
 * @author cheng
 * @date 2024-10-12
 */
public class FacilityClassifyManage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 分类ID */
    @Excel(name = "分类ID")
    private Long classifyId;

    /** 分类名称 */
    @Excel(name = "分类名称")
    private String classifyName;

    /** 分类图标 */
    @Excel(name = "分类图标")
    private String classifyIcon;

    /** 分类图片 */
    @Excel(name = "分类图片")
    private String classifyPhoto;

    /** 排序 */
    @Excel(name = "排序")
    private String fSort;

    /** 设置 */
    @Excel(name = "设置")
    private String fSet;

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
    public void setClassifyId(Long classifyId) 
    {
        this.classifyId = classifyId;
    }

    public Long getClassifyId() 
    {
        return classifyId;
    }
    public void setClassifyName(String classifyName) 
    {
        this.classifyName = classifyName;
    }

    public String getClassifyName() 
    {
        return classifyName;
    }
    public void setClassifyIcon(String classifyIcon) 
    {
        this.classifyIcon = classifyIcon;
    }

    public String getClassifyIcon() 
    {
        return classifyIcon;
    }
    public void setClassifyPhoto(String classifyPhoto) 
    {
        this.classifyPhoto = classifyPhoto;
    }

    public String getClassifyPhoto() 
    {
        return classifyPhoto;
    }
    public void setfSort(String fSort) 
    {
        this.fSort = fSort;
    }

    public String getfSort() 
    {
        return fSort;
    }
    public void setfSet(String fSet) 
    {
        this.fSet = fSet;
    }

    public String getfSet() 
    {
        return fSet;
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
            .append("classifyId", getClassifyId())
            .append("classifyName", getClassifyName())
            .append("classifyIcon", getClassifyIcon())
            .append("classifyPhoto", getClassifyPhoto())
            .append("fSort", getfSort())
            .append("fSet", getfSet())
            .append("zhuang", getZhuang())
            .append("createTime", getCreateTime())
            .toString();
    }
}
