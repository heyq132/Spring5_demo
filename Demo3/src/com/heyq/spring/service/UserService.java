package com.heyq.spring.service;

import com.heyq.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author heyq
 * @create 2022-09-26-20:11
 */
    //在注解里面value属性值可以省略不写
    //默认值是类名称，首字母小写
    //<bean id="userService" class="..."/>
@Service
public class UserService {
    @Value( value = "小何")
    private String name;

    //定义dao类型属性
    //不需要添加set方法
    //添加注入属性注解
    @Autowired
    @Qualifier(value = "userDaoImpl1")

    private UserDao userDao;

    public void add(){
        System.out.println("service add......");
        System.out.println(name);
        userDao.add();
    }
}
