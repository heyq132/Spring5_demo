package com.heyq.spring.factorybean;

import com.heyq.spring.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author heyq
 * @create 2022-09-26-15:24
 */
public class MyBean implements FactoryBean<Course> {
    //定义返回Bean
    @Override
    public Course getObject() throws Exception {
        Course course=new Course();
        course.setCname("asdf");
        return course;
    }
    @Override
    public Class<?> getObjectType() {
        return null;
    }
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
