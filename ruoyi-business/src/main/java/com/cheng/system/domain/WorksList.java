package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 作品列表对象 works_list
 * 
 * @author cheng
 * @date 2024-10-13
 */
public class WorksList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 作品编号 */
    @Excel(name = "作品编号")
    private String worksId;

    /** 作品名称 */
    @Excel(name = "作品名称")
    private String worksName;

    /** 封面 */
    @Excel(name = "封面")
    private String worksCover;

    /** 发布人 */
    @Excel(name = "发布人")
    private String publisher;

    /** 发布时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date publishTime;

    /** 所属企业 */
    @Excel(name = "所属企业")
    private String affiliatedEnterprise;

    /** 所属机构 */
    @Excel(name = "所属机构")
    private String affiliatedOrganization;

    /** 当前状态 */
    @Excel(name = "当前状态")
    private String zhuang;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setWorksId(String worksId) 
    {
        this.worksId = worksId;
    }

    public String getWorksId() 
    {
        return worksId;
    }
    public void setWorksName(String worksName) 
    {
        this.worksName = worksName;
    }

    public String getWorksName() 
    {
        return worksName;
    }
    public void setWorksCover(String worksCover) 
    {
        this.worksCover = worksCover;
    }

    public String getWorksCover() 
    {
        return worksCover;
    }
    public void setPublisher(String publisher) 
    {
        this.publisher = publisher;
    }

    public String getPublisher() 
    {
        return publisher;
    }
    public void setPublishTime(Date publishTime) 
    {
        this.publishTime = publishTime;
    }

    public Date getPublishTime() 
    {
        return publishTime;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("worksId", getWorksId())
            .append("worksName", getWorksName())
            .append("worksCover", getWorksCover())
            .append("publisher", getPublisher())
            .append("publishTime", getPublishTime())
            .append("affiliatedEnterprise", getAffiliatedEnterprise())
            .append("affiliatedOrganization", getAffiliatedOrganization())
            .append("zhuang", getZhuang())
            .append("createTime", getCreateTime())
            .toString();
    }
}
