package com.it.service.impl;

import com.it.dao.mapper.SysUserMapper;
import com.it.entity.SysUser;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.it.service.ISysUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户表 服务实现类
 * </p>
 *
 * @author lihl
 * @since 2018-06-26
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
