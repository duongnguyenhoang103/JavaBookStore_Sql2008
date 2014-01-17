package nhom04.bookstore.bean;

import java.util.Date;
import java.util.Vector;

public class Invoice {

    private int invoiceId;
    private Date date;
    private int total;
    private int accountId;
    private Vector<InvoiceDetail> invoiceDetail;

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Vector<InvoiceDetail> getInvoiceDetail() {
        return invoiceDetail;
    }

    public void setInvoiceDetail(Vector<InvoiceDetail> invoiceDetail) {
        this.invoiceDetail = invoiceDetail;
    }
    
    public java.sql.Date getSqlDate() {
        return new java.sql.Date(this.date.getTime());
    }
}
