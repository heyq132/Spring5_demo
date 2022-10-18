package com.heyq.spring.service;

import com.heyq.spring.dao.UserDao;
import com.heyq.spring.dao.UserDaoImpl;

/**
 * @author heyq
 * @create 2022-09-25-19:38
 */
public class UserService {
    private UserDao userDao;
    public void add(){
        System.out.println("UserService add........");
        userDao.update();
    }
    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }
}
