package nhom04.bookstore.dao;

import nhom04.bookstore.bean.Publisher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class PublisherDAO {

    public Publisher get(int id) {
        Publisher pub = null;
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM Publisher WHERE Publisher_id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                pub = new Publisher();
                pub.setPublisherId(rs.getInt("Publisher_id"));
                pub.setPublisherName(rs.getString("Publisher_name"));
                pub.setAddress(rs.getString("address"));
                pub.setPhone(rs.getString("phone"));
                pub.setFax(rs.getString("fax"));
                pub.setWebsite(rs.getString("Website"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pub;
    }

    public Vector<Publisher> getAll() {
        Vector<Publisher> Pubv = new Vector();
        Publisher pub = null;
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM Publisher";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                pub = new Publisher();
                //Pubv.addElement(new Publisher(rs.getInt("Publisher_id"), rs.getString("Publisher_name"),rs.getString("adress"),
                //                             rs.getInt("phone"),rs.getInt("fax"),rs.getString("Website")));
                pub.setPublisherId(rs.getInt("Publisher_id"));
                pub.setPublisherName(rs.getString("Publisher_name"));
                pub.setAddress(rs.getString("address"));
                pub.setPhone(rs.getString("phone"));
                pub.setFax(rs.getString("fax"));
                pub.setWebsite(rs.getString("Website"));

                Pubv.addElement(pub);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Pubv;
    }

    public int insert(Publisher pub) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "INSERT INTO Publisher([Publisher_name], [address], [Phone], [fax], [Website]) VALUES(?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, pub.getPublisherName());
            stmt.setString(2, pub.getAddress());
            stmt.setString(3, pub.getPhone());
            stmt.setString(4, pub.getFax());
            stmt.setString(5, pub.getWebsite());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }

    public int delete(Publisher pub) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "DELETE FROM Publisher WHERE Publisher_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, pub.getPublisherId());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }

    public int update(Publisher pub) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "UPDATE Publisher SET [Publisher_name] = ?, [address]=?, [Phone]=? , [fax]=?, [Website] =? WHERE Publisher_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, pub.getPublisherName());
            stmt.setString(2, pub.getAddress());
            stmt.setString(3, pub.getPhone());
            stmt.setString(4, pub.getFax());
            stmt.setString(5, pub.getWebsite());
            stmt.setInt(6, pub.getPublisherId());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }
}
