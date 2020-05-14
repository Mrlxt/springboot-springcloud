package cn.boot.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Create by LiXiaoTian 2020/5/13 17:40
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka1App {
    public static void main(String[] args) {
        SpringApplication.run(Eureka1App.class,args);
    }
}
