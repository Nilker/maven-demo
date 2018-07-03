package com.it.service;


import com.baomidou.mybatisplus.service.IService;
import com.it.entity.sys.SysLog;

/**
 * <p>
 * 日志表 服务类
 * </p>
 *
 * @author lihl
 * @since 2018-07-03
 */
public interface ISysLogService extends IService<SysLog> {
    /**
     * 记录日志
     * @param title
     * @param uname
     * @param url
     * @param parms
     */
    void insertLog(String title,String uname,String url,String parms);

}
