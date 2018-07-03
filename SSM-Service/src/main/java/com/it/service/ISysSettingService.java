package com.it.service;


import com.baomidou.mybatisplus.service.IService;
import com.it.entity.sys.SysSetting;

import java.util.List;

/**
 * <p>
 * 系统设置表 服务类
 * </p>
 *
 * @author lihl
 * @since 2018-07-03
 */
public interface ISysSettingService extends IService<SysSetting> {

    List<SysSetting> findAll();
}
