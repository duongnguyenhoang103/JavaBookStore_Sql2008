
package nhom04.bookstore.dao;

import nhom04.bookstore.bean.Author;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class AuthorDAO {

    public Author get(int id) {
        Author auth = null;
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM Author WHERE Author_id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                auth = new Author(id, rs.getString("Author_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return auth;
    }

    public Vector<Author> getAll() {
        Vector<Author> Author = new Vector();
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM Author";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                Author.addElement(new Author(rs.getInt("Author_id"), rs.getString("Author_name")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Author;
    }

    public int insert(Author author) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "INSERT INTO Author([Author_name]) VALUES(?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, author.getAuthorName());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }
    
    public int delete(Author author) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "DELETE FROM Author where Author_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, author.getAuthorId());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }
    
    public int update(Author author) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "UPDATE Author SET Author_name = ? where Author_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, author.getAuthorName());
            stmt.setInt(2, author.getAuthorId());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }
    
}

