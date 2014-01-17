
package nhom04.bookstore.dao;

import nhom04.bookstore.bean.Invoice;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class InvoiceDAO {
    
    public Invoice get(int id) {
        Invoice invoice = null;
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM Invoice WHERE Invoice_id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                invoice = new Invoice();
                invoice.setInvoiceId(rs.getInt("Invoice_id"));
                invoice.setDate(rs.getDate("date"));
                invoice.setTotal(rs.getInt("total"));
                invoice.setAccountId(rs.getInt("Account_id"));
                InvoiceDetailDAO detailDAO = new InvoiceDetailDAO();
                invoice.setInvoiceDetail(detailDAO.get(invoice));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return invoice;
    }

    public Vector<Invoice> getAll() {
        Vector<Invoice> invoicev = new Vector();
        Invoice invoice = null;
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM Invoice";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                invoice = new Invoice();
                //Pubv.addElement(new Publisher(rs.getInt("Publisher_id"), rs.getString("Publisher_name"),rs.getString("adress"),
                //                             rs.getInt("phone"),rs.getInt("fax"),rs.getString("Website")));
                invoice.setInvoiceId(rs.getInt("Invoice_id"));
                invoice.setDate(rs.getDate("date"));
                invoice.setTotal(rs.getInt("total"));
                invoice.setAccountId(rs.getInt("Account_id"));

                invoicev.addElement(invoice);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return invoicev;
    }

    public int insert(Invoice invoice) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "INSERT INTO Invoice"
                    + "VALUES(?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setDate(1, invoice.getSqlDate());
            stmt.setInt(2, invoice.getTotal());
            stmt.setInt(3, invoice.getAccountId());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }

    public int delete(Invoice invoice) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "delete Invoice where Invoice_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, invoice.getInvoiceId());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }

    public int update(Invoice invoice) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "update Invoice set [date] = ?, [total]=?, account_id=? where Invoice_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setDate(1, invoice.getSqlDate());
            stmt.setInt(2, invoice.getTotal());
            stmt.setInt(3, invoice.getAccountId());
            stmt.setInt(4, invoice.getInvoiceId());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }
}
