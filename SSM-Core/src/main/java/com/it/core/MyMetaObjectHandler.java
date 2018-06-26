package com.it.core;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.log4j.Logger;

import java.util.Date;


/**
 *  注入公共字段自动填充,任选注入方式即可
 */
public class MyMetaObjectHandler extends MetaObjectHandler {

    protected final static Logger logger = Logger.getLogger(MyMetaObjectHandler.class);

    @Override
    public void insertFill(MetaObject metaObject) {
        logger.info("新增的时候干点不可描述的事情");
        // 测试下划线
        Object ctime = getFieldValByName("ctime", metaObject);//mybatis-plus版本2.0.9+
        System.out.println("ctime=" + ctime);
        if (ctime == null) {
            setFieldValByName("ctime", new Date(), metaObject);//mybatis-plus版本2.0.9+
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        logger.info("更新的时候干点不可描述的事情");
    }
}
