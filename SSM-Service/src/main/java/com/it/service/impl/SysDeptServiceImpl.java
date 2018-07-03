package com.it.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.it.dao.mapper.SysDeptMapper;
import com.it.entity.sys.SysDept;
import com.it.service.ISysDeptService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author lihl
 * @since 2018-07-03
 */
@Service
public class SysDeptServiceImpl extends ServiceImpl<SysDeptMapper, SysDept> implements ISysDeptService {

}
