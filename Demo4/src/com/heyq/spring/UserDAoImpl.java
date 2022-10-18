package com.heyq.spring;

/**
 * @author heyq
 * @create 2022-09-27-14:51
 */
public class UserDAoImpl implements UserDao{

    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行了");
        return id;
    }
}
