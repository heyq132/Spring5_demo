package com.heyq.spring.aopxml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author heyq
 * @create 2022-09-28-15:03
 */

@Configuration
@ComponentScan(basePackages = {"com.heyq"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
