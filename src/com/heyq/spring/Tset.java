package com.heyq.spring;

import com.heyq.spring.bean.Emp;
import com.heyq.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author heyq
 * @create 2022-09-25-15:20
 */
public class Tset {

    @Test
    public void testAdd(){
        //1加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        //2获取配置创建的对象
        UserService userService = context.getBean("userService",UserService.class);
        userService.add();
    }


    @Test
    public void testBean(){
        //1加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        //2获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }

}
