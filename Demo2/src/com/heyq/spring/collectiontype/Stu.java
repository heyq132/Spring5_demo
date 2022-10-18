package com.heyq.spring.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author heyq
 * @create 2022-09-26-11:04
 */
public class Stu {
    //数组类型属性
    private String[] courses;
    //list类型属性
    private List<String> lists;
    //map类型属性
    private Map<String,String> maps;
    //set类型属性
    private Set<String> sets;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void test(){
        System.out.println(Arrays.toString(courses));
        System.out.println(lists);
        System.out.println(maps);
        System.out.println(sets);
    }
}
