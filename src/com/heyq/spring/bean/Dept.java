package com.heyq.spring.bean;

/**
 * @author heyq
 * @create 2022-09-25-20:16
 */
public class Dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
