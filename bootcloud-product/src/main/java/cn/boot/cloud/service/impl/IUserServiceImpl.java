package cn.boot.cloud.service.impl;

import cn.boot.cloud.mapper.UserMapper;
import cn.boot.cloud.service.IUserService;

import cn.boot.cloud.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by LiXiaoTian 2020/5/12 20:23
 */
@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
