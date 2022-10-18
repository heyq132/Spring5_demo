package com.heyq.spring.test;

import com.heyq.spring.config.Txconfig;
import com.heyq.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author heyq
 * @create 2022-09-29-19:56
 */
public class TestTx {

    @Test
    public void TestAccount(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();

    }

    @Test
    public void TestAccount2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void TestAccount3(){
        ApplicationContext context=new AnnotationConfigApplicationContext(Txconfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void TestGenericApplicationContext(){
        //1创建GenericApplicationContext
        GenericApplicationContext context=new GenericApplicationContext();
        //2调用context的方法对象注册
        context.refresh();
        context.registerBean("user1",User.class,()->new User());
//        User user=(User) context.getBean("com.heyq.spring.test.User");
        User user=(User) context.getBean("user1");
        System.out.println(user);

    }
}
