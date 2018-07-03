package com.it.dao.mapper;

import com.baomidou.mybatisplus.plugins.Page;
import com.it.entity.sys.SysUser;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author lihl
 * @since 2018-07-03
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
    List<Map<Object, Object>> selectUserList(Page<Map<Object, Object>> page, @Param("search") String search);
}
