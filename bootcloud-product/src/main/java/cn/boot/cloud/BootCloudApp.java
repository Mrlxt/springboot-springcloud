package cn.boot.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Create by LiXiaoTian 2020/5/13 17:36
 */
@SpringBootApplication
@MapperScan("cn.boot.cloud.mapper")
@EnableEurekaClient
@EnableDiscoveryClient
public class BootCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(BootCloudApp.class, args);
    }
}
