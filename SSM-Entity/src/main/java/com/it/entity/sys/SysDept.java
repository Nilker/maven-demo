package com.it.entity.sys;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 部门表
 * </p>
 *
 * @author lihl
 * @since 2018-07-03
 */
@TableName("sys_dept")
public class SysDept extends Model<SysDept> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 描述
     */
    private String deptDesc;


    public String getId() {
        return id;
    }

    public SysDept setId(String id) {
        this.id = id;
        return this;
    }

    public String getDeptName() {
        return deptName;
    }

    public SysDept setDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    public String getDeptDesc() {
        return deptDesc;
    }

    public SysDept setDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysDept{" +
        ", id=" + id +
        ", deptName=" + deptName +
        ", deptDesc=" + deptDesc +
        "}";
    }
}
