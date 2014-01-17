package nhom04.bookstore.dao;

import nhom04.bookstore.bean.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class OrderDAO {

    public Order get(int id) {
        Order order = null;
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM Order WHERE Order_id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                order = new Order();
                order.setOrderId(rs.getInt("Order_id"));
                order.setDate(rs.getDate("date"));
                order.setTotal(rs.getInt("total"));
                order.setStatus(rs.getByte("Status"));
                OrderDetailDAO detailDAO = new OrderDetailDAO();
                order.setOrderDetail(detailDAO.get(order));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return order;
    }

    public Vector<Order> getAll() {
        Vector<Order> orderv = new Vector();
        Order order = null;
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM Order";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                order = new Order();
                order.setOrderId(rs.getInt("Invoice_id"));

                CustomerDAO cusDAO = new CustomerDAO();
                order.setCustomer(cusDAO.get(rs.getInt("Customer_id")));
                order.setDate(rs.getDate("date"));
                order.setStatus(rs.getByte("status"));

                orderv.addElement(order);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orderv;
    }

    public int insert(Order order) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "INSERT INTO [Order]([customer],[date],[status]) "
                    + "VALUES(?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, order.getCustomer().getCustomerId());
            stmt.setDate(2, order.getSqlDate());
            stmt.setByte(3, order.getStatus());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }

    public int delete(Order order) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "delete Order where Order_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, order.getOrderId());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }

    public int update(Order order) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "update Order set customer =?, date=?, status=? where Order_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, order.getCustomer().getCustomerId());
            stmt.setDate(2, order.getSqlDate());
            stmt.setInt(3, order.getStatus());
            stmt.setInt(4, order.getOrderId());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }
}
