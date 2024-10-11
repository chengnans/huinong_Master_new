package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 灌区数据库对象 irrigate_database
 * 
 * @author cheng
 * @date 2024-10-11
 */
public class IrrigateDatabase extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 基地名称 */
    @Excel(name = "基地名称")
    private String baselandName;

    /** 灌区名称 */
    @Excel(name = "灌区名称")
    private String irrigateName;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBaselandName(String baselandName) 
    {
        this.baselandName = baselandName;
    }

    public String getBaselandName() 
    {
        return baselandName;
    }
    public void setIrrigateName(String irrigateName) 
    {
        this.irrigateName = irrigateName;
    }

    public String getIrrigateName() 
    {
        return irrigateName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("baselandName", getBaselandName())
            .append("irrigateName", getIrrigateName())
            .append("createTime", getCreateTime())
            .toString();
    }
}
