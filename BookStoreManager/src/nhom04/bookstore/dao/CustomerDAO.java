package nhom04.bookstore.dao;

import nhom04.bookstore.bean.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class CustomerDAO {

    public Customer get(int id) {
        Customer cus = null;
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM Customer WHERE Customer_id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                cus = new Customer();
                cus.setCustomerId(rs.getInt("Customer_id"));
                cus.setCustomerName(rs.getString("Customer_name"));
                cus.setPhone(rs.getString("phone"));
                cus.setAddress(rs.getString("address"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cus;
    }

    public Vector<Customer> getAll() {
        Vector<Customer> cusv = new Vector();
        Customer cus = null;
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM Customer";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                cus = new Customer();
                //Pubv.addElement(new Publisher(rs.getInt("Publisher_id"), rs.getString("Publisher_name"),rs.getString("adress"),
                //                             rs.getInt("phone"),rs.getInt("fax"),rs.getString("Website")));
                cus.setCustomerId(rs.getInt("Customer_id"));
                cus.setCustomerName(rs.getString("Customer_name"));
                cus.setPhone(rs.getString("phone"));
                cus.setAddress(rs.getString("address"));

                cusv.addElement(cus);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cusv;
    }

    public int insert(Customer customer) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "INSERT INTO Customer([Customer_name],[phone],[address]) "
                    + "VALUES(?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, customer.getCustomerName());
            stmt.setString(2, customer.getPhone());
            stmt.setString(3, customer.getAddress());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }

    public int delete(Customer customer) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "DELETE FROM Customer where Customer_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, customer.getCustomerId());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }

    public int update(Customer customer) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "UPDATE Customer SET Customer_name=?,[phone]=?,[address]=? where Customer_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, customer.getCustomerName());
            stmt.setString(2, customer.getPhone());
            stmt.setString(3, customer.getAddress());
            stmt.setInt(4, customer.getCustomerId());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }

    public Vector<Customer> filter(Customer customer) {
        Vector<Customer> cV = new Vector<Customer>();
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM Customer";
            String where = "";
            if (customer.getCustomerName() != null) {
                where += "[Customer_name] like ? AND ";
            }
            if (customer.getPhone() != null) {
                where += "[phone] = ? AND ";
            }
            if (where.length() > 0) {
                sql += " WHERE " + where.substring(0, where.length() - 5);
            }
            PreparedStatement stmt = conn.prepareStatement(sql);
            int i = 1;
            if (customer.getCustomerName() != null) {
                stmt.setString(i++, "%" + customer.getCustomerName() + "%");
            }
            if (customer.getPhone() != null) {
                stmt.setString(i++, "%" + customer.getPhone() + "%");
            }
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Customer c = new Customer();
                c.setAddress(rs.getString("address"));
                c.setCustomerId(rs.getInt("Customer_id"));
                c.setCustomerName(rs.getString("Customer_name"));
                c.setPhone(rs.getString("phone"));
                cV.addElement(c);
            }
        } catch (Exception e) {
        }
        return cV;
    }
}
