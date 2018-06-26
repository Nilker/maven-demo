package com.it.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.it.dao.mapper.SysUserMapper;
import com.it.entity.SysUser;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.it.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private SysUserMapper userMapper;

    public Page<SysUser> selectUserPage(Page<SysUser> page) {
        // 不进行 count sql 优化，解决 MP 无法自动优化 SQL 问题
        // page.setOptimizeCountSql(false);
        // 不查询总记录数
        // page.setSearchCount(false);
        // 注意！！ 分页 total 是经过插件自动 回写 到传入 page 对象
        return page.setRecords(userMapper.selectUserList(page));
    }
}
