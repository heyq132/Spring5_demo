package com.heyq.spring.test;

import com.heyq.spring.aopanno.User;
import com.heyq.spring.aopxml.Book;
import com.heyq.spring.aopxml.ConfigAop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author heyq
 * @create 2022-09-27-17:47
 */
public class TestAopanno {

    @Test
    public void TestAopBefore(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void TestAopxml(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }

    @Test
    public void TestAopxml1(){
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigAop.class);
        Book book = context.getBean("book", Book.class);
        book.buy();
    }


}
