package com.it.service.impl;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.it.dao.mapper.SysUserMapper;
import com.it.dao.mapper.SysUserRoleMapper;
import com.it.entity.sys.SysUser;
import com.it.entity.sys.SysUserRole;
import com.it.service.ISysUserService;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author lihl
 * @since 2018-07-03
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Autowired
    private SysUserMapper userMapper;

    @Autowired
    private SysUserRoleMapper userRoleMapper;

    @Override
    public void insertUser(SysUser user, String[] roleIds) {
        // TODO Auto-generated method stub
        user.setCreateTime(new Date());

        user.setPassword(md51024Pwd(user.getPassword(), user.getUserName()));
        //保存用户
        userMapper.insert(user);
        //绑定角色
        if (ArrayUtils.isNotEmpty(roleIds)) {
            for (String rid : roleIds) {
                SysUserRole sysUserRole = new SysUserRole();
                sysUserRole.setUserId(user.getId());
                sysUserRole.setRoleId(rid);
                userRoleMapper.insert(sysUserRole);
            }
        }

    }

    private String md51024Pwd(String password, Object salt) {
        return new SimpleHash("MD5", password, salt, 1024).toString();
    }

    @Override
    public void updateUser(SysUser sysUser, String[] roleIds) {
        // TODO Auto-generated method stub
        sysUser.setPassword(null);
        //更新用户
        userMapper.updateById(sysUser);
        //删除已有权限
        userRoleMapper.delete(new EntityWrapper<SysUserRole>().eq("userId", sysUser.getId()));
        //重新绑定角色
        if (ArrayUtils.isNotEmpty(roleIds)) {
            for (String rid : roleIds) {
                SysUserRole sysUserRole = new SysUserRole();
                sysUserRole.setUserId(sysUser.getId());
                sysUserRole.setRoleId(rid);
                userRoleMapper.insert(sysUserRole);
            }
        }
    }

    @Override
    public Page<Map<Object, Object>> selectUserPage(Page<Map<Object, Object>> page, String search) {
        // TODO Auto-generated method stub
        page.setRecords(baseMapper.selectUserList(page, search));
        return page;
    }

    @Override
    public void delete(String id) {
        // TODO Auto-generated method stub
        this.deleteById(id);
        userRoleMapper.delete(new EntityWrapper<SysUserRole>().addFilter("userId = {0}", id));
    }


}