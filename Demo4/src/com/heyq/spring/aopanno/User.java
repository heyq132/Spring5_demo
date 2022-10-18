package com.heyq.spring.aopanno;

import com.alibaba.druid.support.json.JSONUtils;
import org.springframework.stereotype.Component;

/**
 * @author heyq
 * @create 2022-09-27-17:27
 */
@Component
public class User {
    public void add(){
        System.out.println("add.....");
    }
}
