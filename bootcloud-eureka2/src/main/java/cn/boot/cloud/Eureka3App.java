package cn.boot.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Create by LiXiaoTian 2020/5/13 18:31
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka3App {
    public static void main(String[] args) {
        SpringApplication.run(Eureka3App.class);
    }
}
