package cn.boot.cloud.mapper;


import cn.boot.cloud.vo.User;

import java.util.List;

/**
 * Create by LiXiaoTian 2020/5/12 20:15
 */
public interface UserMapper {

    List<User> findAll();
}
