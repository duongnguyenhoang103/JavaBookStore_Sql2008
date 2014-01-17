package nhom04.bookstore.bean;

import java.util.Date;
import java.util.Vector;

public class Order {

    private int orderId;
    private Customer customer;
    private Date date;
    private int total;
    private byte status;
    private Vector<OrderDetail> orderDetail;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public Vector<OrderDetail> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(Vector<OrderDetail> orderDetail) {
        this.orderDetail = orderDetail;
    }

    public java.sql.Date getSqlDate() {
        return new java.sql.Date(this.date.getTime());
    }
}
