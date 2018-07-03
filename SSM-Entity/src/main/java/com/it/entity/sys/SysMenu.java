package com.it.entity.sys;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 菜单表
 * </p>
 *
 * @author lihl
 * @since 2018-07-03
 */
@TableName("sys_menu")
public class SysMenu extends Model<SysMenu> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    /**
     * 菜单名称
     */
    private String menuName;
    /**
     * 父级菜单ID
     */
    private String pid;
    /**
     * 连接地址
     */
    private String url;
    /**
     * 图标
     */
    private String icon;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 深度
     */
    private Integer deep;
    /**
     * 编码
     */
    private String code;
    /**
     * 资源名称
     */
    private String resource;


    public String getId() {
        return id;
    }

    public SysMenu setId(String id) {
        this.id = id;
        return this;
    }

    public String getMenuName() {
        return menuName;
    }

    public SysMenu setMenuName(String menuName) {
        this.menuName = menuName;
        return this;
    }

    public String getPid() {
        return pid;
    }

    public SysMenu setPid(String pid) {
        this.pid = pid;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public SysMenu setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public SysMenu setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public Integer getSort() {
        return sort;
    }

    public SysMenu setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public Integer getDeep() {
        return deep;
    }

    public SysMenu setDeep(Integer deep) {
        this.deep = deep;
        return this;
    }

    public String getCode() {
        return code;
    }

    public SysMenu setCode(String code) {
        this.code = code;
        return this;
    }

    public String getResource() {
        return resource;
    }

    public SysMenu setResource(String resource) {
        this.resource = resource;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysMenu{" +
        ", id=" + id +
        ", menuName=" + menuName +
        ", pid=" + pid +
        ", url=" + url +
        ", icon=" + icon +
        ", sort=" + sort +
        ", deep=" + deep +
        ", code=" + code +
        ", resource=" + resource +
        "}";
    }
}
