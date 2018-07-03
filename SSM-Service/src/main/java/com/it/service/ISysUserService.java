package com.it.service;


import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.it.entity.sys.SysUser;

import java.util.Map;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author lihl
 * @since 2018-07-03
 */
public interface ISysUserService extends IService<SysUser> {

    /**
     * 分页查询用户
     */
    Page<Map<Object, Object>> selectUserPage(Page<Map<Object, Object>> page, String search);

    /**
     * 保存用户
     */
    void insertUser(SysUser user, String[] roleId);
    /**
     * 更新用户
     */
    void updateUser(SysUser sysUser, String[] roleId);
    /**
     * 删除用户
     */
    void delete(String id);
}
