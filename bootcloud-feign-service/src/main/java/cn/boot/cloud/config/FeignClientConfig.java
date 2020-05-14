package cn.boot.cloud.config;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Create by LiXiaoTian 2020/5/13 14:39
 */
@Configuration
public class FeignClientConfig {
    @Bean
    public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("admin", "admin");
    }

    @Bean
    public Logger.Level getFeignLoggerLevel() {
        return feign.Logger.Level.FULL;
    }
}
