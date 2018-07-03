package com.it.entity.sys;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 角色菜单关联表
 * </p>
 *
 * @author lihl
 * @since 2018-07-03
 */
@TableName("sys_role_menu")
public class SysRoleMenu extends Model<SysRoleMenu> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    /**
     * 角色主键
     */
    private String roleId;
    /**
     * 菜单主键
     */
    private String menuId;


    public String getId() {
        return id;
    }

    public SysRoleMenu setId(String id) {
        this.id = id;
        return this;
    }

    public String getRoleId() {
        return roleId;
    }

    public SysRoleMenu setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    public String getMenuId() {
        return menuId;
    }

    public SysRoleMenu setMenuId(String menuId) {
        this.menuId = menuId;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysRoleMenu{" +
        ", id=" + id +
        ", roleId=" + roleId +
        ", menuId=" + menuId +
        "}";
    }
}
