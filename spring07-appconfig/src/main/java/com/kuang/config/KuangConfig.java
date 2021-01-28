package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：fzj
 * @date ：2021/1/14
 */

@Configuration
@ComponentScan("com.kuang.pojo")
public class KuangConfig {

    @Bean
    public User getUser(){
        return new User();
    }

}
