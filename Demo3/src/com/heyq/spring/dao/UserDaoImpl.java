package com.heyq.spring.dao;

import org.springframework.stereotype.Repository;

/**
 * @author heyq
 * @create 2022-09-27-8:59
 */
//使用注解创建对象
@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("UserDaoImpl实现接口UserDao");
    }
}
