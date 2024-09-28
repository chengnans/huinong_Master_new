package com.cheng.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 软著对象 rz
 * 
 * @author cheng
 * @date 2024-09-18
 */
public class Rz extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 温度 */
    @Excel(name = "温度")
    private Long tempo;

    /** 空气湿度 */
    @Excel(name = "空气湿度")
    private Long hum;

    /** 土壤湿度 */
    @Excel(name = "土壤湿度")
    private Long tr;

    /** 光照强度 */
    @Excel(name = "光照强度")
    private Long lx;

    /** 二氧化碳 */
    @Excel(name = "二氧化碳")
    private Long eyht;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }
    public void setTempo(Long tempo) 
    {
        this.tempo = tempo;
    }

    public Long getTempo() 
    {
        return tempo;
    }
    public void setHum(Long hum) 
    {
        this.hum = hum;
    }

    public Long getHum() 
    {
        return hum;
    }
    public void setTr(Long tr) 
    {
        this.tr = tr;
    }

    public Long getTr() 
    {
        return tr;
    }
    public void setLx(Long lx) 
    {
        this.lx = lx;
    }

    public Long getLx() 
    {
        return lx;
    }
    public void setEyht(Long eyht) 
    {
        this.eyht = eyht;
    }

    public Long getEyht() 
    {
        return eyht;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("time", getTime())
            .append("tempo", getTempo())
            .append("hum", getHum())
            .append("tr", getTr())
            .append("lx", getLx())
            .append("eyht", getEyht())
            .toString();
    }
}
