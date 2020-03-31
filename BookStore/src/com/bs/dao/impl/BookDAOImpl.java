package com.bs.dao.impl;

import com.bs.bean.Book;
import com.bs.dao.BaseDAO;
import com.bs.dao.IBookDAO;

import java.util.List;

public class BookDAOImpl extends BaseDAO implements IBookDAO {
    @Override
    public int addBook(Book book) {
        String sql = "insert into t_book(`name`,`author`,`price`,`sales`,`stock`,`img_path`) values(?,?,?,?,?,?)";

        return update(sql, book.getName(), book.getAuthor(), book.getPrice(),
                book.getSales(), book.getStock(), book.getImgPath());
    }

    @Override
    public int deleteBookById(int id) {
        String sql = "delete from t_book where id=?";
        return update(sql, id);
    }

    @Override
    public int deleteBookByName(String name) {
        String sql = "delete from t_book where name=?";
        return update(sql, name);
    }

    @Override
    public int updateBook(Book book) {
//        if (book.getId() == null) {
//            return 0;
//        }
        String sql = "update t_book set `name`=?,`author`=?,`price`=?,`sales`=?,`stock`=?,`img_path`=? where id=?";
        return update(sql, book.getName(), book.getAuthor(), book.getPrice(),
                book.getSales(), book.getStock(), book.getImgPath(), book.getId());
    }

    @Override
    public Book queryBookById(int id) {
        String sql = "select `id`,`name`,`author`,`price`,`sales`,`stock`,`img_path` imgPath from t_book where id=?";
        return queryForOne(Book.class, sql, id);
    }

    @Override
    public List<Book> queryBookByName(String name) {
        String sql = "select `id`,`name`,`author`,`price`,`sales`,`stock`,`img_path` imgPath from t_book where name=?";
        return queryForList(Book.class, sql, name);
    }

    @Override
    public List<Book> queryAllBooks() {
        String sql = "select `id`,`name`,`author`,`price`,`sales`,`stock`,`img_path` imgPath from t_book";
        return queryForList(Book.class, sql);
    }
}
