package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 遥感服务配置对象 remote_set
 * 
 * @author cheng
 * @date 2024-10-13
 */
public class RemoteSet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 机构编号 */
    @Excel(name = "机构编号")
    private String apartmentId;

    /** 机构名称 */
    @Excel(name = "机构名称")
    private String apartmentName;

    /** 开通服务 */
    @Excel(name = "开通服务")
    private String openService;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setApartmentId(String apartmentId) 
    {
        this.apartmentId = apartmentId;
    }

    public String getApartmentId() 
    {
        return apartmentId;
    }
    public void setApartmentName(String apartmentName) 
    {
        this.apartmentName = apartmentName;
    }

    public String getApartmentName() 
    {
        return apartmentName;
    }
    public void setOpenService(String openService) 
    {
        this.openService = openService;
    }

    public String getOpenService() 
    {
        return openService;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("apartmentId", getApartmentId())
            .append("apartmentName", getApartmentName())
            .append("openService", getOpenService())
            .append("createTime", getCreateTime())
            .toString();
    }
}
