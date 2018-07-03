package com.it.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.it.dao.mapper.SysLogMapper;
import com.it.entity.sys.SysLog;
import com.it.service.ISysLogService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 * 日志表 服务实现类
 * </p>
 *
 * @author lihl
 * @since 2018-07-03
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements ISysLogService {
    public static final Logger logger = Logger.getLogger(SysLogServiceImpl.class);

    @Override
    public void insertLog(String title, String uname, String url, String parms) {
        // TODO Auto-generated method stub
        SysLog sysLog  =new SysLog();
        sysLog.setCreateTime(new Date());
        sysLog.setTitle(title);
        sysLog.setUserName(uname);
        sysLog.setUrl(url);
        sysLog.setParams(parms);
        super.insert(sysLog);
        logger.debug("记录日志:"+sysLog.toString());
    }


}
