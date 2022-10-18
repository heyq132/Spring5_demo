package com.heyq.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author heyq
 * @create 2022-09-27-14:54
 */
public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        //方式一
//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });
        //方式二
        UserDAoImpl userDAo = new UserDAoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDAo));
        int add = dao.add(1, 2);
        System.out.println("add:" + add);
    }
}

//创建代理对象代码
class UserDaoProxy implements InvocationHandler {
    //1、把创建的是谁的代理对象，把谁传递过来
    //有参数构造传递
    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("方法之前执行。。。" + method.getName() + ":传递的参数...." + Arrays.toString(args));
        //被增强的方法执行
        Object res = method.invoke(obj, args);
        //方法之后
        System.out.println("方法执行之后执行。。。" + obj);
        return res;

    }
}