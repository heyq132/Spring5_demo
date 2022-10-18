package com.heyq.spring.test;

import com.heyq.spring.bean.Orders;
import com.heyq.spring.collectiontype.Book;
import com.heyq.spring.collectiontype.Course;
import com.heyq.spring.collectiontype.Stu;
import com.heyq.spring.collectiontype.Stu1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author heyq
 * @create 2022-09-26-11:13
 */
public class Testspring {

    @Test
    public void TestStu(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }

    @Test
    public void TestStu1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        Stu1 stu1 = context.getBean("stu1", Stu1.class);
        stu1.Test();
    }

    @Test
    public void TestBook(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        Book book1 = context.getBean("book", Book.class);
        System.out.println(book);
        System.out.println(book1);
    }
    @Test
    public void TestFactorybean(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean3.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }
    @Test
    public void TestBean2(){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders",Orders.class);
        System.out.println(orders);
        System.out.println("第四步，获取创建bean实例对象");
        context.close();
    }
}
