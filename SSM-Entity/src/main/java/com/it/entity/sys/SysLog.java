package com.it.entity.sys;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 日志表
 * </p>
 *
 * @author lihl
 * @since 2018-07-03
 */
@TableName("sys_log")
public class SysLog extends Model<SysLog> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    /**
     * 用户
     */
    private String userName;
    /**
     * 日志
     */
    private String title;
    /**
     * 地址
     */
    private String url;
    /**
     * 参数
     */
    private String params;
    /**
     * 日志时间
     */
    private Date createTime;


    public String getId() {
        return id;
    }

    public SysLog setId(String id) {
        this.id = id;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public SysLog setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public SysLog setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public SysLog setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getParams() {
        return params;
    }

    public SysLog setParams(String params) {
        this.params = params;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public SysLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysLog{" +
        ", id=" + id +
        ", userName=" + userName +
        ", title=" + title +
        ", url=" + url +
        ", params=" + params +
        ", createTime=" + createTime +
        "}";
    }
}
