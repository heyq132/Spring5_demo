package com.heyq.spring.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author heyq
 * @create 2022-09-27-17:29
 */
@Component
@Aspect     //生成代理对象
@Order(2)
public class UserProxy {
    //相同切入点抽取
    @Pointcut(value = "execution(* com.heyq.spring.aopanno.User.add(..))")
    public void piontcut(){}

    //前置通知
    //@Before注解表示作为前置通知
    @Before(value = "piontcut()")
    public void before(){
        //前置通知
        System.out.println("before......");
    }

    //后置通知
    @AfterReturning(value = "execution(* com.heyq.spring.aopanno.User.add(..))")
    public void afterReturning(){
        //前置通知
        System.out.println("afterReturning......");
    }

    //最终通知
    @After(value = "execution(* com.heyq.spring.aopanno.User.add(..))")
    public void after(){
        //前置通知
        System.out.println("after......");
    }

    //异常通知
    @AfterThrowing(value = "execution(* com.heyq.spring.aopanno.User.add(..))")
    public void afterThrowing(){
        //前置通知
        System.out.println("afterThrowing......");
    }

    //环绕通知
    @Around(value = "execution(* com.heyq.spring.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        //前置通知
        System.out.println("环绕之前......");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后......");
    }

}
