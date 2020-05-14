package cn.boot.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Create by LiXiaoTian 2020/5/13 17:48
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("cn.boot.cloud.service")
public class FeignConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerApp.class);
    }
}
