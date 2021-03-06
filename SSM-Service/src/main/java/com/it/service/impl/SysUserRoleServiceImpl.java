package com.it.service.impl;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.it.dao.mapper.SysUserRoleMapper;
import com.it.entity.sys.SysUserRole;
import com.it.service.ISysUserRoleService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * 用户角色关联表 服务实现类
 * </p>
 *
 * @author lihl
 * @since 2018-07-03
 */
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements ISysUserRoleService {
    @Override
    public Set<String> findRolesByUid(String uid) {
        // TODO Auto-generated method stub
        List<SysUserRole> list = this.selectList(new EntityWrapper<SysUserRole>().eq("userId", uid));

        Set<String> set = new HashSet<String>();
        for (SysUserRole ur : list) {
            set.add(ur.getRoleId());
        }
        return set;
    }
}
