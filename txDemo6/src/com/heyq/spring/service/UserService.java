package com.heyq.spring.service;

import com.heyq.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author heyq
 * @create 2022-09-29-20:09
 */
@Service
//@Transactional(timeout = -1,propagation = Propagation.REQUIRED ,isolation = Isolation.REPEATABLE_READ)
public class UserService {


    @Autowired
    private UserDao userDao;
    public void accountMoney(){


            //第一步开启事务

            //第二部进行业务操作
            //lucy少100
            userDao.reduceMoney();

            //模拟异常
            int i=10/0;

            //mary多100
            userDao.addMoney();
            //第三步，没有放生异常，提交事务

            //第四步，出现异常，事务回滚


    }
}
