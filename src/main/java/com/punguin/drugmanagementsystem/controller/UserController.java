package com.punguin.drugmanagementsystem.controller;

import com.punguin.drugmanagementsystem.controller.common.BaseController;
import com.punguin.drugmanagementsystem.entity.User;
import com.punguin.drugmanagementsystem.entity.common.ResponseResult;
import com.punguin.drugmanagementsystem.service.UserService;
import io.lettuce.core.dynamic.annotation.Param;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ASUS
 * 用户的账号管理（注册、锁定、注销、审批）
 */
@Api("user类")
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @ApiOperation("登录接口")
    @RequestMapping("/login")
    public ResponseResult<User> login(@Param("username") String username,@Param("password") String password){

        System.out.println("username:"+username);
        System.out.println("password:"+password);
        User user = userService.findByUserName(username);
        return Success(user);
    }

    @ApiOperation("修改密码接口")
    @RequestMapping("/changePassword")
    public ResponseResult<String> changePassword(){

        return null;
    }


    @ApiOperation("登出接口")
    @RequestMapping("/logout")
    public ResponseResult<String> logout(){

        return null;
    }

}
