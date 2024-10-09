package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 农事分类对象 farm_classify
 * 
 * @author cheng
 * @date 2024-10-09
 */
public class FarmClassify extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 农事分类 */
    @Excel(name = "农事分类")
    private Long farmClassify;

    /** 农事操作 */
    @Excel(name = "农事操作")
    private String farmOperation;

    /** 操作要求 */
    @Excel(name = "操作要求")
    private String operateRequire;

    /** 所属机构 */
    @Excel(name = "所属机构")
    private String organization;

    /** 数据状态 */
    @Excel(name = "数据状态")
    private String status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setFarmClassify(Long farmClassify) 
    {
        this.farmClassify = farmClassify;
    }

    public Long getFarmClassify() 
    {
        return farmClassify;
    }
    public void setFarmOperation(String farmOperation) 
    {
        this.farmOperation = farmOperation;
    }

    public String getFarmOperation() 
    {
        return farmOperation;
    }
    public void setOperateRequire(String operateRequire) 
    {
        this.operateRequire = operateRequire;
    }

    public String getOperateRequire() 
    {
        return operateRequire;
    }
    public void setOrganization(String organization) 
    {
        this.organization = organization;
    }

    public String getOrganization() 
    {
        return organization;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("farmClassify", getFarmClassify())
            .append("farmOperation", getFarmOperation())
            .append("operateRequire", getOperateRequire())
            .append("organization", getOrganization())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .toString();
    }
}
