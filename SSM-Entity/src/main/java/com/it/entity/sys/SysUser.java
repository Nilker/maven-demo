package com.it.entity.sys;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author lihl
 * @since 2018-07-03
 */
@TableName("sys_user")
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;
    public static final int _0 = 0;
    public static final int _1 = 1;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户状态,1-启用,-1禁用
     */
    private Integer userState;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 描述
     */
    private String userDesc;
    /**
     * 头像
     */
    private String userImg;
    /**
     * 部门主键
     */
    private String deptId;


    public String getId() {
        return id;
    }

    public SysUser setId(String id) {
        this.id = id;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public SysUser setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public SysUser setPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getUserState() {
        return userState;
    }

    public SysUser setUserState(Integer userState) {
        this.userState = userState;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public SysUser setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public SysUser setUserDesc(String userDesc) {
        this.userDesc = userDesc;
        return this;
    }

    public String getUserImg() {
        return userImg;
    }

    public SysUser setUserImg(String userImg) {
        this.userImg = userImg;
        return this;
    }

    public String getDeptId() {
        return deptId;
    }

    public SysUser setDeptId(String deptId) {
        this.deptId = deptId;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysUser{" +
        ", id=" + id +
        ", userName=" + userName +
        ", password=" + password +
        ", userState=" + userState +
        ", createTime=" + createTime +
        ", userDesc=" + userDesc +
        ", userImg=" + userImg +
        ", deptId=" + deptId +
        "}";
    }
}
