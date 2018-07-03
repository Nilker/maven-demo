package com.it.service;


import com.baomidou.mybatisplus.service.IService;
import com.it.entity.sys.SysUserRole;

import java.util.Set;

/**
 * <p>
 * 用户角色关联表 服务类
 * </p>
 *
 * @author lihl
 * @since 2018-07-03
 */
public interface ISysUserRoleService extends IService<SysUserRole> {
    /**
     * 获取用户的角色
     * @param uid
     * @return
     */
    Set<String> findRolesByUid(String uid);
}
