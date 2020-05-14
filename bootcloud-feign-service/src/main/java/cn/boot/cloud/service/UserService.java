package cn.boot.cloud.service;

import cn.boot.cloud.config.FeignClientConfig;
import cn.boot.cloud.vo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Create by LiXiaoTian 2020/5/13 17:44
 */
@FeignClient(name = "BOOTCLOUD-PRODUCER", configuration = FeignClientConfig.class)
public interface UserService {

    @RequestMapping("/user/list")
    public List<User> findAll();

}
