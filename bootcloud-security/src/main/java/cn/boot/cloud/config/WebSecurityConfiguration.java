package cn.boot.cloud.config;

/**
 * Create by LiXiaoTian 2020/5/13 17:27
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Create by LiXiaoTian 2020/5/13 6:45
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("admin")
                .password(new BCryptPasswordEncoder().encode("admin")).roles("USER");
        /* 配置多个用户
                        and().withUser("admin").password(new BCryptPasswordEncoder().encode("admin "))
                .roles("USER", "ADMIN");*/
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {


        http.httpBasic().and().authorizeRequests().anyRequest()
                .fullyAuthenticated();
        http.sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }

}