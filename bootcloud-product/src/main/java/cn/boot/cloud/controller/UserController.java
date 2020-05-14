package cn.boot.cloud.controller;

import cn.boot.cloud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by LiXiaoTian 2020/5/13 6:19
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "/list")
    public Object list() {
        return iUserService.findAll();
    }

}
