package com.heyq.spring.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author heyq
 * @create 2022-09-29-20:10
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //少钱
    @Override
    public void reduceMoney() {
        String  sql="update t_account set money=money-? where username=?";
        jdbcTemplate.update(sql,100,"lucy");

    }

    //多钱
    @Override
    public void addMoney() {
        String  sql="update t_account set money=money+? where username=?";
        jdbcTemplate.update(sql,100,"mary");

    }
}
