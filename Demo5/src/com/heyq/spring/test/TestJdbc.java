package com.heyq.spring.test;


import com.heyq.spring.entity.Book;
import com.heyq.spring.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author heyq
 * @create 2022-09-27-17:47
 */
public class TestJdbc {

    @Test
    public void TestJdbcBookadd(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId("2");
        book.setUsername("javaspring");
        book.setUstatus("aaa2");
        bookService.addBook(book);
    }

    @Test
    public void TestJdbcBookupdate(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book=new Book();
        book.setUserId("2");
        book.setUsername("javaEE");
        book.setUstatus("abc");
        bookService.updateBook(book);
    }
    @Test
    public void TestJdbcBookdelete(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.deleteBook("2");
    }

    @Test
    public void TestJdbcBookfindCount(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.findCount());
    }
    @Test
    public void TestJdbcBookfindone(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.findOne("1"));
    }

    @Test
    public void TestJdbcBookfindall(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.findAll());
    }
    @Test
    public void TestJdbcBookbatchall(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs=new ArrayList<>();
        Object[] o1={"4","MySQL","ccc"};
        Object[] o2={"5","MySQL5","ccc5"};
        Object[] o3={"6","Java Web","eee"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchAdd(batchArgs);
    }
    @Test
    public void TestJdbcBookbatchupdate(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs=new ArrayList<>();
        Object[] o1={"MySQL0000","ccc","4"};
        Object[] o2={"MySQL0000","ccc5","5"};
        Object[] o3={"Java Web0000","eee","6"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchupdate(batchArgs);
    }
    @Test
    public void TestJdbcBookbatchDelete(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs=new ArrayList<>();
        Object[] o1={"4"};
        Object[] o2={"6"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        bookService.batchDelete(batchArgs);
    }


}
