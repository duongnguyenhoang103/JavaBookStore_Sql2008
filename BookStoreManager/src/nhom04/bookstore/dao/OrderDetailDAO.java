package nhom04.bookstore.dao;

import nhom04.bookstore.bean.Order;
import nhom04.bookstore.bean.OrderDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class OrderDetailDAO {

    public OrderDetail get(int id) {
        OrderDetail ordDetail = null;
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM OrderDetail WHERE Order_Detail_id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                ordDetail = new OrderDetail();

                OrderDAO or = new OrderDAO();
                ordDetail.setOrder(or.get(rs.getInt("Order_id")));

                BookDAO b = new BookDAO();
                ordDetail.setBook(b.get(rs.getInt("Book_Id")));
                ordDetail.setQuantity(rs.getInt("Book_Id"));
                ordDetail.setPrice(rs.getInt("price"));
                ordDetail.setDiscount(rs.getByte("discount"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ordDetail;
    }

    public Vector<OrderDetail> get(Order order) {
        Vector<OrderDetail> orderDetailv = new Vector();
        OrderDetail ordDetail = null;
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM OrderDetail WHERE Order_id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, order.getOrderId());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ordDetail = new OrderDetail();

                OrderDAO or = new OrderDAO();
                ordDetail.setOrder(or.get(rs.getInt("Order_id")));

                BookDAO b = new BookDAO();
                ordDetail.setBook(b.get(rs.getInt("Book_Id")));
                ordDetail.setQuantity(rs.getInt("Book_Id"));
                ordDetail.setPrice(rs.getInt("price"));
                ordDetail.setDiscount(rs.getByte("discount"));

                orderDetailv.addElement(ordDetail);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orderDetailv;
    }

    public int insert(Vector<OrderDetail> orderDetail) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "INSERT INTO Order_Detail([Order_id],[Book_Id],[Quantity],[price],[discount]) VALUES ";
            int n = orderDetail.size();
            for (int j = 0; j < n; j++) {
                sql += "(?,?,?,?,?), ";
            }
            sql = sql.substring(0, sql.length() - 2);
            PreparedStatement stmt = conn.prepareStatement(sql);
            int i = 1;
            for (int j = 0; j < n; j++) {
                stmt.setInt(i++, orderDetail.get(j).getOrder().getOrderId());
                stmt.setInt(i++, orderDetail.get(j).getBook().getBookId());
                stmt.setInt(i++, orderDetail.get(j).getQuantity());
                stmt.setInt(i++, orderDetail.get(j).getPrice());
                stmt.setByte(i++, orderDetail.get(j).getDiscount());
            }

            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }

    public int delete(OrderDetail orderDetail) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "delete OrderDetail where Order_Detail_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, orderDetail.getOrderDetailId());
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
            String sql = "delete OrderDetail where Order_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, order.getOrderId());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }

    public int update(OrderDetail orderDetail) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "update OrderDetail set Book_id = ?, Quantity=?, price=?, discount=? where Order_Detail_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, orderDetail.getBook().getBookId());
            stmt.setInt(2, orderDetail.getQuantity());
            stmt.setInt(3, orderDetail.getPrice());
            stmt.setByte(4, orderDetail.getDiscount());
            stmt.setInt(5, orderDetail.getOrderDetailId());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }
}
