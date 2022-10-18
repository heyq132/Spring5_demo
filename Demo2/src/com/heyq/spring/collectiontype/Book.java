package com.heyq.spring.collectiontype;

import java.util.Arrays;
import java.util.List;

/**
 * @author heyq
 * @create 2022-09-26-14:44
 */
public class Book {
    private List<String> bname;

    public void setBname(List<String> bname) {
        this.bname = bname;
    }
    public void test(){
        System.out.println(bname);
    }
}
