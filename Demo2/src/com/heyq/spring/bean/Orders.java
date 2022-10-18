package com.heyq.spring.bean;

/**
 * @author heyq
 * @create 2022-09-26-16:45
 */
public class Orders {
    public Orders() {
        System.out.println("第一步，执行无参数构造创建bean案例");
    }
    private String oname;
    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步，调用set方法设置属性值");
    }
    public void initMethod(){
        System.out.println("第三步，执行初始化的方法");
    }
    public void destroyMethod(){
        System.out.println("第五步，执行销毁的方法");
    }
}
