/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom04.bookstore.service;

import nhom04.bookstore.bean.Author;
import nhom04.bookstore.bean.Book;
import nhom04.bookstore.bean.Category;
import nhom04.bookstore.bean.Publisher;
import nhom04.bookstore.dao.BookDAO;
import java.util.Vector;

/**
 *
 * @author Tuan
 */
public class BookService {

    public int addBook(Book book) {
        BookDAO bDAO = new BookDAO();
        return bDAO.insert(book);
    }

    public Book getBook(int id) {
        BookDAO bDAO = new BookDAO();
        return bDAO.get(id);
    }
    
    public boolean editBook(Book b) {
        BookDAO bDAO = new BookDAO();
        return bDAO.update(b)>0;
    }
    public boolean deleteBook(Book b) {
        BookDAO bDAO = new BookDAO();
        return bDAO.delete(b)>0;
    }

    public Vector<Book> findBook(String name, Category cat, Publisher pub, Author auth) {
        Book b = new Book();
        b.setBookName(name);
        b.setCategory(cat);
        b.setPublisher(pub);
        b.setAuthor(auth);
        BookDAO bDAO = new BookDAO();
        return bDAO.filter(b);
    }
}
