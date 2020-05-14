package cn.boot.cloud.service;


import cn.boot.cloud.vo.User;

import java.util.List;

/**
 * Create by LiXiaoTian 2020/5/12 20:23
 */
public interface IUserService {

    List<User> findAll();
}
