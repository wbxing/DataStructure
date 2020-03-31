package com.bs.dao;

import com.bs.bean.Book;

import java.util.List;

public interface IBookDAO {
    /**
     * 增加图书
     *
     * @param book 需要增加的图书
     * @return 返回影响行数
     */
    int addBook(Book book);

    /**
     * 通过图书 id 删除图书
     *
     * @param id 要删除图书的 id
     * @return 返回删除的行数
     */
    int deleteBookById(int id);

    /**
     * 通过图书名删除图书
     *
     * @param name 要删除的图书名
     * @return 返回删除的行数
     */
    int deleteBookByName(String name);

    /**
     * 更改图书信息，必须提供图书 id，否则更新失败
     *
     * @param book 需要更改的信息
     * @return 返回更新的行数
     */
    int updateBook(Book book);

    /**
     * 通过 id 查询图书
     *
     * @param id 需要查询的图书 id
     * @return 返回查询到的图书，查不到返回 null
     */
    Book queryBookById(int id);

    /**
     * 通过图书名查询图书
     *
     * @param name 需要查询的图书名
     * @return 以 list 数组形式返回查询结果，查不到 null
     */
    List<Book> queryBookByName(String name);

    /**
     * 查询所有图书信息
     *
     * @return 以 list 数组形式返回查询结果，查不到 null
     */
    List<Book> queryAllBooks();
}
