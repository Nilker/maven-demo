package com.it.entity.sys;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 系统设置表
 * </p>
 *
 * @author lihl
 * @since 2018-07-03
 */
@TableName("sys_setting")
public class SysSetting extends Model<SysSetting> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "Id", type = IdType.UUID)
    private String Id;
    /**
     * KEY
     */
    private String sysKey;
    /**
     * 名称
     */
    private String sysName;
    /**
     * 值
     */
    private String sysValue;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 说明
     */
    private String sysDesc;


    public String getId() {
        return Id;
    }

    public SysSetting setId(String Id) {
        this.Id = Id;
        return this;
    }

    public String getSysKey() {
        return sysKey;
    }

    public SysSetting setSysKey(String sysKey) {
        this.sysKey = sysKey;
        return this;
    }

    public String getSysName() {
        return sysName;
    }

    public SysSetting setSysName(String sysName) {
        this.sysName = sysName;
        return this;
    }

    public String getSysValue() {
        return sysValue;
    }

    public SysSetting setSysValue(String sysValue) {
        this.sysValue = sysValue;
        return this;
    }

    public Integer getSort() {
        return sort;
    }

    public SysSetting setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String getSysDesc() {
        return sysDesc;
    }

    public SysSetting setSysDesc(String sysDesc) {
        this.sysDesc = sysDesc;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "SysSetting{" +
        ", Id=" + Id +
        ", sysKey=" + sysKey +
        ", sysName=" + sysName +
        ", sysValue=" + sysValue +
        ", sort=" + sort +
        ", sysDesc=" + sysDesc +
        "}";
    }
}
