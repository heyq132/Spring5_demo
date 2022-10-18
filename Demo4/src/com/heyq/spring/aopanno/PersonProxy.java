package com.heyq.spring.aopanno;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author heyq
 * @create 2022-09-27-18:18
 */
@Component
@Aspect
@Order(1)
public class PersonProxy {
    //后置通知
    @Before(value = "execution(* com.heyq.spring.aopanno.User.add(..))")
    public void afterReturning(){
        //前置通知
        System.out.println("PersonProxy before......");
    }
}
