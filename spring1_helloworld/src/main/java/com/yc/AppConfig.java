package com.yc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: testspring
 * @description:
 * @author: 汤僖龙
 * @create: 2021-04-04 15:43
 */
@Configuration  //表示当前类是一个配置类
@ComponentScan(basePackages = "com.yc")//将来要托管的bean要扫描的包及子包
public class AppConfig {


}
