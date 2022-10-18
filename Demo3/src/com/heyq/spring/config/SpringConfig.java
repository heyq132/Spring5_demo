package com.heyq.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author heyq
 * @create 2022-09-27-9:34
 */
@Configuration//作为配置类，替代xml配置文件
@ComponentScan(basePackages = {"com.heyq"})
public class SpringConfig {
}
