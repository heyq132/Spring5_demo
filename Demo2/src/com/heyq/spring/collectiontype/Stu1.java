package com.heyq.spring.collectiontype;

import java.util.List;

/**
 * @author heyq
 * @create 2022-09-26-11:31
 */
public class Stu1 {
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void Test(){
        System.out.println(courseList);
    }
}
