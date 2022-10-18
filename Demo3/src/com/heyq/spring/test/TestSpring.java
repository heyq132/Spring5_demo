package com.heyq.spring.test;

import com.heyq.spring.config.SpringConfig;
import com.heyq.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author heyq
 * @create 2022-09-26-20:18
 */
public class TestSpring {
    @Test
    public void TestService(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void TestService2(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
