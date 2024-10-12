package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 产品列表对象 production_list
 * 
 * @author cheng
 * @date 2024-10-13
 */
public class ProductionList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 产品编号 */
    @Excel(name = "产品编号")
    private String productionId;

    /** 产品名称 */
    @Excel(name = "产品名称")
    private String productionName;

    /** 所属企业 */
    @Excel(name = "所属企业")
    private String affiliatedEnterprise;

    /** 所属机构 */
    @Excel(name = "所属机构")
    private String affiliatedOrganization;

    /** 当前状态 */
    @Excel(name = "当前状态")
    private String zhuang;

    /** 操作人 */
    @Excel(name = "操作人")
    private String operator;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date operatingTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setProductionId(String productionId) 
    {
        this.productionId = productionId;
    }

    public String getProductionId() 
    {
        return productionId;
    }
    public void setProductionName(String productionName) 
    {
        this.productionName = productionName;
    }

    public String getProductionName() 
    {
        return productionName;
    }
    public void setAffiliatedEnterprise(String affiliatedEnterprise) 
    {
        this.affiliatedEnterprise = affiliatedEnterprise;
    }

    public String getAffiliatedEnterprise() 
    {
        return affiliatedEnterprise;
    }
    public void setAffiliatedOrganization(String affiliatedOrganization) 
    {
        this.affiliatedOrganization = affiliatedOrganization;
    }

    public String getAffiliatedOrganization() 
    {
        return affiliatedOrganization;
    }
    public void setZhuang(String zhuang) 
    {
        this.zhuang = zhuang;
    }

    public String getZhuang() 
    {
        return zhuang;
    }
    public void setOperator(String operator) 
    {
        this.operator = operator;
    }

    public String getOperator() 
    {
        return operator;
    }
    public void setOperatingTime(Date operatingTime) 
    {
        this.operatingTime = operatingTime;
    }

    public Date getOperatingTime() 
    {
        return operatingTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("productionId", getProductionId())
            .append("productionName", getProductionName())
            .append("affiliatedEnterprise", getAffiliatedEnterprise())
            .append("affiliatedOrganization", getAffiliatedOrganization())
            .append("zhuang", getZhuang())
            .append("createTime", getCreateTime())
            .append("operator", getOperator())
            .append("operatingTime", getOperatingTime())
            .toString();
    }
}
