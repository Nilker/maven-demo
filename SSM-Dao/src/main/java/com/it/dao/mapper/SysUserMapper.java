package com.it.dao.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.it.entity.SysUser;

import java.util.List;

/**
 * <p>
 * 系统用户表 Mapper 接口
 * </p>
 *
 * @author lihl
 * @since 2018-06-26
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<SysUser> selectUserList(Page<SysUser> page);
}
