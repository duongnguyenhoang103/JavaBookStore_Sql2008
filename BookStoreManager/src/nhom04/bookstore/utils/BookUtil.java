/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom04.bookstore.utils;

import nhom04.bookstore.bean.Book;
import nhom04.bookstore.dao.AuthorDAO;
import nhom04.bookstore.dao.CategoryDAO;
import nhom04.bookstore.dao.PublisherDAO;
import java.sql.ResultSet;

/**
 *
 * @author Tuan
 */
public class BookUtil {

    public Book rsToBook(ResultSet rs) {
        Book b = new Book();
        try {
            b.setBookId(rs.getInt("book_id"));
            b.setBookName(rs.getString("book_name"));
            b.setDiscount(rs.getByte("discount"));
            b.setPrice(rs.getInt("price"));
            b.setNumberOfPages(rs.getInt("NumberOfPages"));
            b.setPublishYear(rs.getInt("publishYear"));

            AuthorDAO aDAO = new AuthorDAO();
            b.setAuthor(aDAO.get(rs.getInt("author_id")));

            CategoryDAO cDAO = new CategoryDAO();
            b.setCategory(cDAO.get(rs.getInt("category_id")));

            PublisherDAO pDAO = new PublisherDAO();
            b.setPublisher(pDAO.get(rs.getInt("publisher_id")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }
}
