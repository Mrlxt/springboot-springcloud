package cn.boot.cloud.controller;

import cn.boot.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by LiXiaoTian 2020/5/13 17:48
 */
@RestController
@RequestMapping("/consumer")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/list")
    public Object listProduct() {
        return userService.findAll();
    }
}
