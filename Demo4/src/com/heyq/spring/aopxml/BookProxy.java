package com.heyq.spring.aopxml;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author heyq
 * @create 2022-09-28-14:49
 */
@Component
@Aspect
public class BookProxy {

    @Before(value = "execution(* com.heyq.spring.aopxml.Book.buy(..))")
    public void before(){
        System.out.println("before........;.");
    }
}
