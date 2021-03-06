package com.it.dao.mapper;

import com.it.entity.sys.SysMenu;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 菜单表 Mapper 接口
 * </p>
 *
 * @author lihl
 * @since 2018-07-03
 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    List<String> selectMenuIdsByuserId(String uid);

    List<String> selectResourceByUid(@Param("uid") String uid);
}
