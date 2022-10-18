package com.heyq.spring.dao;

import com.heyq.spring.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author heyq
 * @create 2022-09-28-16:35
 */
@Repository
public class BookDaoImpl implements BookDao{

    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

//添加方法
    @Override
    public void add(Book book) {
        //1、创建sql语句
        String sql="insert into t_book values(?,?,?)";
        Object[] args={book.getUserId(), book.getUsername(), book.getUstatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    //修改方法
    @Override
    public void updateBook(Book book) {
        String sql="update t_book set username=?,ustatus=? where user_id=?";
        Object[] args={ book.getUsername(), book.getUstatus(),book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);

    }

    //删除方法
    @Override
    public void deleteBook(String id) {
        String sql="delete from t_book where user_id=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);

    }

    //查询表记录数
    @Override
    public int selectCount() {
        String sql="select count(*) from t_book";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        return integer;
    }

    //查询返回对象
    @Override
    public Book findBookInfo(String id) {
        String sql="select *from t_book where user_id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    //查询返回集合
    @Override
    public List<Book> findBookAll() {
        String sql="select * from t_book";
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }

    //批量添加
    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql="insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    //批量修改
    @Override
    public void batchupdateBook(List<Object[]> batchArgs) {
        String sql="update t_book set username=?,ustatus=? where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDeleteBook(List<Object[]> batchArgs) {
        String sql="delete from t_book where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }


}
