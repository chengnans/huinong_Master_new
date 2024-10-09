package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 古树管理对象 old_tree
 * 
 * @author cheng
 * @date 2024-10-09
 */
public class OldTree extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 古树编号 */
    @Excel(name = "古树编号")
    private String bid;

    /** 古树年龄 */
    @Excel(name = "古树年龄")
    private Long year;

    /** 古树名称 */
    @Excel(name = "古树名称")
    private String treeName;

    /** 古树类别 */
    @Excel(name = "古树类别")
    private String treeType;

    /** 管理人员 */
    @Excel(name = "管理人员")
    private String manager;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private Long phone;

    /** 所属基地 */
    @Excel(name = "所属基地")
    private String treeBaseland;

    /** 古树地址 */
    @Excel(name = "古树地址")
    private String treeAddress;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 图片 */
    @Excel(name = "图片")
    private String photo;

    /** 视频 */
    @Excel(name = "视频")
    private String video;

    /** 二维码 */
    @Excel(name = "二维码")
    private String qr;

    /** 古树简介 */
    @Excel(name = "古树简介")
    private String detail;

    /** 创建日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creatTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBid(String bid) 
    {
        this.bid = bid;
    }

    public String getBid() 
    {
        return bid;
    }
    public void setYear(Long year) 
    {
        this.year = year;
    }

    public Long getYear() 
    {
        return year;
    }
    public void setTreeName(String treeName) 
    {
        this.treeName = treeName;
    }

    public String getTreeName() 
    {
        return treeName;
    }
    public void setTreeType(String treeType) 
    {
        this.treeType = treeType;
    }

    public String getTreeType() 
    {
        return treeType;
    }
    public void setManager(String manager) 
    {
        this.manager = manager;
    }

    public String getManager() 
    {
        return manager;
    }
    public void setPhone(Long phone) 
    {
        this.phone = phone;
    }

    public Long getPhone() 
    {
        return phone;
    }
    public void setTreeBaseland(String treeBaseland) 
    {
        this.treeBaseland = treeBaseland;
    }

    public String getTreeBaseland() 
    {
        return treeBaseland;
    }
    public void setTreeAddress(String treeAddress) 
    {
        this.treeAddress = treeAddress;
    }

    public String getTreeAddress() 
    {
        return treeAddress;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setPhoto(String photo) 
    {
        this.photo = photo;
    }

    public String getPhoto() 
    {
        return photo;
    }
    public void setVideo(String video) 
    {
        this.video = video;
    }

    public String getVideo() 
    {
        return video;
    }
    public void setQr(String qr) 
    {
        this.qr = qr;
    }

    public String getQr() 
    {
        return qr;
    }
    public void setDetail(String detail) 
    {
        this.detail = detail;
    }

    public String getDetail() 
    {
        return detail;
    }
    public void setCreatTime(Date creatTime) 
    {
        this.creatTime = creatTime;
    }

    public Date getCreatTime() 
    {
        return creatTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("bid", getBid())
            .append("year", getYear())
            .append("treeName", getTreeName())
            .append("treeType", getTreeType())
            .append("manager", getManager())
            .append("phone", getPhone())
            .append("treeBaseland", getTreeBaseland())
            .append("treeAddress", getTreeAddress())
            .append("status", getStatus())
            .append("photo", getPhoto())
            .append("video", getVideo())
            .append("qr", getQr())
            .append("detail", getDetail())
            .append("creatTime", getCreatTime())
            .toString();
    }
}
