package com.heyq.spring.test;

import com.heyq.spring.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author heyq
 * @create 2022-09-30-20:37
 */
@RunWith(SpringJUnit4ClassRunner.class)//单元测试框架
@ContextConfiguration("classpath:bean.xml")//加载配置文件
public class JTest4 {

    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.accountMoney();
    }
}
