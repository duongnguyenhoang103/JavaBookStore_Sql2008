/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom04.bookstore.dao;

import nhom04.bookstore.bean.Invoice;
import nhom04.bookstore.bean.InvoiceDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class InvoiceDetailDAO {
    
    

    public Vector<InvoiceDetail> get(Invoice invoice) {
        Vector<InvoiceDetail> invoiceDetailv = new Vector();
        InvoiceDetail invoiceDetail = null;
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM InvoiceDetail WHERE Invoice_id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, invoice.getInvoiceId());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                invoiceDetail = new InvoiceDetail();
                
                invoiceDetail.setQuantity(rs.getInt("Quantity"));
                invoiceDetail.setPrice(rs.getInt("price"));
                invoiceDetail.setInvoice(invoice);

                BookDAO bDAO = new BookDAO();
                invoiceDetail.setBook(bDAO.get(rs.getInt("Book_id")));
                invoiceDetailv.addElement(invoiceDetail);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return invoiceDetailv;
    }
    
    

    public int insert(InvoiceDetail invoiceDetail) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "INSERT INTO Invoice"
                    + "VALUES(?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, invoiceDetail.getBook().getBookId());
            stmt.setInt(2, invoiceDetail.getBook().getBookId());
            stmt.setInt(3, invoiceDetail.getQuantity());
            stmt.setInt(4, invoiceDetail.getPrice());
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
            String sql = " delete InvoiceDetail where Invoice_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, invoice.getInvoiceId());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }
    public int delete(InvoiceDetail invoiceDetail) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = " delete InvoiceDetail where Invoice_Detail_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, invoiceDetail.getInvoiceDetailId());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }

    public int update(InvoiceDetail invoiceDetail) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "update InvoiceDetail set Book_id =?, Quantity=?, price=? where Invoice_Detail_id =?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, invoiceDetail.getBook().getBookId());
            stmt.setInt(2, invoiceDetail.getQuantity());
            stmt.setInt(3, invoiceDetail.getPrice());
            stmt.setInt(4, invoiceDetail.getInvoiceDetailId());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }
}
