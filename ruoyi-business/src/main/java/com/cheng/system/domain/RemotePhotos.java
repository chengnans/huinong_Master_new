package com.cheng.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 遥感图片对象 remote_photos
 * 
 * @author cheng
 * @date 2024-10-08
 */
public class RemotePhotos extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 图像类型 */
    @Excel(name = "图像类型")
    private Long imageType;

    /** 图像名称 */
    @Excel(name = "图像名称")
    private String imageName;

    /** 图像地址 */
    @Excel(name = "图像地址")
    private String imageAddress;

    /** 覆盖区域 */
    @Excel(name = "覆盖区域")
    private String area;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String deviceName;

    /** 是否失效 */
    @Excel(name = "是否失效")
    private String effect;

    /** 关联基地 */
    @Excel(name = "关联基地")
    private String baseland;

    /** 图像来源 */
    @Excel(name = "图像来源")
    private String resource;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setImageType(Long imageType) 
    {
        this.imageType = imageType;
    }

    public Long getImageType() 
    {
        return imageType;
    }
    public void setImageName(String imageName) 
    {
        this.imageName = imageName;
    }

    public String getImageName() 
    {
        return imageName;
    }
    public void setImageAddress(String imageAddress) 
    {
        this.imageAddress = imageAddress;
    }

    public String getImageAddress() 
    {
        return imageAddress;
    }
    public void setArea(String area) 
    {
        this.area = area;
    }

    public String getArea() 
    {
        return area;
    }
    public void setDeviceName(String deviceName) 
    {
        this.deviceName = deviceName;
    }

    public String getDeviceName() 
    {
        return deviceName;
    }
    public void setEffect(String effect) 
    {
        this.effect = effect;
    }

    public String getEffect() 
    {
        return effect;
    }
    public void setBaseland(String baseland) 
    {
        this.baseland = baseland;
    }

    public String getBaseland() 
    {
        return baseland;
    }
    public void setResource(String resource) 
    {
        this.resource = resource;
    }

    public String getResource() 
    {
        return resource;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("imageType", getImageType())
            .append("imageName", getImageName())
            .append("imageAddress", getImageAddress())
            .append("area", getArea())
            .append("deviceName", getDeviceName())
            .append("effect", getEffect())
            .append("baseland", getBaseland())
            .append("createTime", getCreateTime())
            .append("resource", getResource())
            .toString();
    }
}
