package com.heyq.spring.collectiontype;

/**
 * @author heyq
 * @create 2022-09-26-11:29
 */
//课程类
public class Course {
    private String cname;//课程名称

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
