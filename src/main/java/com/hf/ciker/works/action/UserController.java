package com.hf.ciker.works.action;


import com.hf.ciker.works.consts.ServerResponse;
import com.hf.ciker.works.po.User;
import com.hf.ciker.works.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author ciker
 * @since 2021-01-01
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public ServerResponse getUser(){
        return ServerResponse.createBySuccess(userService.list());
    }
    @RequestMapping("/update")
    public ServerResponse updateUser(@RequestBody User user){
        return ServerResponse.createBySuccess(userService.saveOrUpdate(user));
    }
}

