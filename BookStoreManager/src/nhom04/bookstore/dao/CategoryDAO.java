
package nhom04.bookstore.dao;

import nhom04.bookstore.bean.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class CategoryDAO {

    public Category get(int id) {
        Category cat = null;
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM category WHERE category_id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                cat = new Category(id, rs.getString("category_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cat;
    }

    public Vector<Category> getAll() {
        Vector<Category> Cat = new Vector();
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM category";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                Cat.addElement(new Category(rs.getInt("category_id"), rs.getString("category_name")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Cat;
    }

    public int insert(Category cat) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "INSERT INTO Category([category_name]) VALUES(?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cat.getCategoryName());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }
    
    
        public int delete(Category cat) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "DELETE FROM Category WHERE Category_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, cat.getCategoryId());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }
    
    public int update(Category cat) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "UPDATE Category SET category_name = ? where Category_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cat.getCategoryName());
            stmt.setInt(2, cat.getCategoryId());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }
}
