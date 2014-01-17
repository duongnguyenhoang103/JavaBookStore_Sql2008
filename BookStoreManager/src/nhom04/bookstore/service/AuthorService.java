/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom04.bookstore.service;

import nhom04.bookstore.bean.Author;
import nhom04.bookstore.dao.AuthorDAO;
import java.util.Vector;

/**
 *
 * @author Tuan
 */
public class AuthorService {
    public Vector<Author> getListAuthor() {
        AuthorDAO aDAO = new AuthorDAO();
        return aDAO.getAll();
    }
    public int addAuthor(Author auth) {
        AuthorDAO aDAO = new AuthorDAO();
        return aDAO.insert(auth);
    }
    public int editAuthor(Author auth) {
        AuthorDAO aDAO = new AuthorDAO();
        return aDAO.update(auth);
    }
    public int deleteAuthor(Author author) {
        AuthorDAO aDAO = new AuthorDAO();
        return aDAO.delete(author);
    }
}
