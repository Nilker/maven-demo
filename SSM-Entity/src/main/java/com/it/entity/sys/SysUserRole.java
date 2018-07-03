package com.it.entity.sys;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户角色关联表
 * </p>
 *
 * @author lihl
 * @since 2018-07-03
 */
@TableName("sys_user_role")
public class SysUserRole extends Model<SysUserRole> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "Id", type = IdType.UUID)
    private String Id;
    /**
     * 用户主键
     */
    private String userId;
    /**
     * 角色主键
     */
    private String roleId;


    public String getId() {
        return Id;
    }

    public SysUserRole setId(String Id) {
        this.Id = Id;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public SysUserRole setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getRoleId() {
        return roleId;
    }

    public SysUserRole setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "SysUserRole{" +
        ", Id=" + Id +
        ", userId=" + userId +
        ", roleId=" + roleId +
        "}";
    }
}
