package com.heyq.spring.service;

import com.heyq.spring.dao.BookDao;
import com.heyq.spring.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author heyq
 * @create 2022-09-28-16:35
 */
@Service
public class BookService {

    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加的方法
    public void addBook(Book book){
        bookDao.add(book);
    }

    //修改方法
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    //删除方法
    public void deleteBook(String id){
        bookDao.deleteBook(id);
    }

    //查询表记录数
    public int findCount(){
        return bookDao.selectCount();
    }

    //查询返回对象
     public Book findOne(String id){
        return bookDao.findBookInfo(id);
     }

     //查询返回集合
    public List<Book> findAll(){
        return bookDao.findBookAll();
    }

    //批量添加
    public void batchAdd(List<Object[]> batchArgs){
        bookDao.batchAddBook(batchArgs);
    }

    //批量修改
    public void batchupdate(List<Object[]> batchArgs){
        bookDao.batchupdateBook(batchArgs);
    }

    //批量删除
    public void batchDelete(List<Object[]> batchArgs){
        bookDao.batchDeleteBook(batchArgs);
    }

}
