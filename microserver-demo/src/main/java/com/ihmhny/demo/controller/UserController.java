package com.ihmhny.demo.controller;

import com.ihmhny.demo.entity.User;
import com.ihmhny.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xiaobei
 * @createTime: 2018-02-02 7:35
 * @since: JDK 1.8
 * @description: 测试springboot
 */
@RestController
public class UserController {

    //记录日志
    private final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "hello world";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String saveUser(String username, String password) {
        userService.insertByParams(username,password);
        return "新增成功！";
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(String username){
        log.info("开始进入getUser方法......");
        return userService.selectByParams(username);
    }
}
