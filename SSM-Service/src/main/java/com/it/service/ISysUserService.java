package com.it.service;


import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.it.entity.SysUser;

/**
 * <p>
 * 系统用户表 服务类
 * </p>
 *
 * @author lihl
 * @since 2018-06-26
 */
public interface ISysUserService extends IService<SysUser> {

    Page<SysUser> selectUserPage(Page<SysUser> pu);
}
