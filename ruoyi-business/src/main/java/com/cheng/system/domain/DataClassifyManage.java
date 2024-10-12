package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 数据分类管理对象 data_classify_manage
 * 
 * @author cheng
 * @date 2024-10-12
 */
public class DataClassifyManage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 分类名称 */
    @Excel(name = "分类名称")
    private String classificationName;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setClassificationName(String classificationName) 
    {
        this.classificationName = classificationName;
    }

    public String getClassificationName() 
    {
        return classificationName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("classificationName", getClassificationName())
            .append("createTime", getCreateTime())
            .toString();
    }
}
