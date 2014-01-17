/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom04.bookstore.service;

import nhom04.bookstore.bean.Category;
import nhom04.bookstore.dao.CategoryDAO;
import java.util.Vector;

/**
 *
 * @author Tuan
 */
public class CategoryService {
    public Vector<Category> getListCategory() {
        CategoryDAO cDAO = new CategoryDAO();
        return cDAO.getAll();
    }
    public int addCategory(Category cat) {
        CategoryDAO cDAO = new CategoryDAO();
        return cDAO.insert(cat);
    }
    public int deleteCategory(Category cat) {
        CategoryDAO cDAO = new CategoryDAO();
        return cDAO.delete(cat);
    }
    public int editCategory(Category cat) {
        CategoryDAO cDAO = new CategoryDAO();
        return cDAO.update(cat);
    }
}
