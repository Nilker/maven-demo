package com.it.service.impl;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.it.dao.mapper.SysSettingMapper;
import com.it.entity.sys.SysSetting;
import com.it.service.ISysSettingService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 系统设置表 服务实现类
 * </p>
 *
 * @author lihl
 * @since 2018-07-03
 */
@Service
public class SysSettingServiceImpl extends ServiceImpl<SysSettingMapper, SysSetting> implements ISysSettingService {
    @Cacheable(value = "settingCache")
    @Override
    public List<SysSetting> findAll() {
        // TODO Auto-generated method stub
        return this.selectList(new EntityWrapper<SysSetting>().orderBy("sort",true));
    }


}
