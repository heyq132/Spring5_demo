package com.heyq.spring.dao;

import com.heyq.spring.entity.Book;

import java.util.List;

/**
 * @author heyq
 * @create 2022-09-28-16:35
 */
public interface BookDao {
    //添加的方法
    void add(Book book);
    //修改方法
    void updateBook(Book book);
    //修改方法
    void deleteBook(String id);
    //查询表记录数
    int selectCount();
    //查询返回对象
    Book findBookInfo(String id);

    //查询返回集合
    List<Book> findBookAll();

    //批量添加
    void batchAddBook(List<Object[]> batchArgs);

    //批量修改
    void batchupdateBook(List<Object[]> batchArgs);

    //批量删除
    void batchDeleteBook(List<Object[]> batchArgs);
}
