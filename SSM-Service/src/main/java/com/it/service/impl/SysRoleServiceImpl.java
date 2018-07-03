package com.it.service.impl;

import com.it.dao.mapper.SysRoleMapper;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.it.entity.sys.SysRole;
import com.it.service.ISysRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author lihl
 * @since 2018-07-03
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements ISysRoleService {

}
