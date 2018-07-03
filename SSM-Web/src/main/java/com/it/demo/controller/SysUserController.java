//package com.it.demo.controller;
//
//
//import com.baomidou.mybatisplus.mapper.EntityWrapper;
//import com.baomidou.mybatisplus.plugins.Page;
//import com.it.entity.sys.SysUser;
//import com.it.service.ISysUserService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import org.springframework.stereotype.Controller;
//
//import java.util.*;
//
///**
// * <p>
// * 系统用户表 前端控制器
// * </p>
// *
// * @author lihl
// * @since 2018-06-26
// */
//@Controller
//@RequestMapping("/sysUser")
//@Api(tags = "sys用户接口")
//public class SysUserController {
//
//    @Autowired
//    private ISysUserService sysUserService;
//
//    @PostMapping()
//    @ResponseBody
//    @ApiOperation(httpMethod = "Post", value = "新增系统用户")
//    public SysUser addUser(@RequestBody SysUser model) {
//        model.setId(null).insert();
//            sysUserService.insert(model);
//        return model;
//    }
//
//
//    @GetMapping("user/{name}")
//    @ResponseBody
//    @ApiOperation(httpMethod = "Get", value = "根据用户名，获取用户信息")
//    public SysUser getUserByName(@PathVariable("name") String username) {
//        SysUser model = sysUserService.selectOne(new EntityWrapper<SysUser>().eq("name", username));
//        return model;
//    }
//
//    @GetMapping("user/{id}")
//    @ResponseBody
//    @ApiOperation(httpMethod = "Get", value = "根据用户Id，获取用户信息")
//    public SysUser getUserById(@PathVariable("id") Long id) {
//        SysUser model = sysUserService.selectById(id);
//        return model;
//    }
//
//    @GetMapping("user/{pageSize}/{pageNum}")
//    @ResponseBody
//    @ApiOperation(httpMethod = "Get", value = "分页，获取用户信息")
//    public Page<SysUser> getUserByPage(@PathVariable("pageSize") int size, @PathVariable("pageNum") int num) {
//        Page<SysUser> models = sysUserService.selectPage(new Page<>(num, size));
//        return models;
//    }
//
//    @PutMapping()
//    @ResponseBody
//    @ApiOperation(httpMethod = "Put", value = "更新用户信息")
//    public Boolean updateUser(@RequestBody SysUser model) {
//        Boolean b = model.updateById();
//        return b;
//    }
//
//
//    @RequestMapping(value = "/ff")
//    public void ff() {
//
//
////
////        SysUser sysUser = new SysUser();
////        sysUser.setAge(22);
////        sysUser.setName("张三");
////        sysUser.setType(1);
////        sysUser.insert();
////
////        EntityWrapper<SysUser> entityWrapper = new EntityWrapper<>(sysUser);
////        entityWrapper.setEntity(new SysUser().setName("李四"));
////
////        Page<SysUser> pu = new Page<>();
////        pu.setSize(5).setCurrent(1);
////        Page<SysUser> ses = sysUserService.selectUserPage(pu);
//
////        SysUser model = sysUserService.selectById(1010068941726294018L);
////        Page<SysUser> selectPages = sysUserService.selectPage(pu);
////        Object obj = sysUserService.selectObj(entityWrapper);
////
////        Page<SysUser> se = sysUserService.selectPage(
////                new Page<SysUser>(1, 10),
////                new EntityWrapper<SysUser>().eq("name", "张三")
////        );
////
////
////        List<Long> list = new ArrayList<>();
////        list.add(784972358981328902L);
////        list.add(784972358981328903L);
////        List<SysUser> llss = sysUserService.selectBatchIds(list);
////        List<SysUser> lls = sysUserService.selectBatchIds(new HashSet<>(list));
////
////        List<Map<String, Object>> ttt = sysUserService.selectMaps(new EntityWrapper<SysUser>().eq("name", "张三"));
////
////
////        Map<String, Object> ma = sysUserService.selectMap(entityWrapper);
//    }
//}
//
