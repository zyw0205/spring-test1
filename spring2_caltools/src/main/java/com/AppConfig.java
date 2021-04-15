package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

/**
 * @program: testSpring
 * @description:
 * @author: Erebus
 * @create: 2021-04-05 09:17
 */
@Configuration
@ComponentScan(basePackages = {"com.huwei","com.mimi"})
public class AppConfig {


    //使用bean来加载第三类bean（jar）包
    @Bean
    public Random r(){
        return new Random();
    }
}
