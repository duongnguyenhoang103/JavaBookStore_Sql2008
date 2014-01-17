package nhom04.bookstore.service;

import nhom04.bookstore.bean.Customer;
import nhom04.bookstore.dao.CustomerDAO;
import java.util.Vector;

public class CustomerService {

    public int addCustomer(Customer c) {
        CustomerDAO cDAO = new CustomerDAO();
        return cDAO.insert(c);
    }

    public int editCustomer(Customer c) {
        CustomerDAO cDAO = new CustomerDAO();
        return cDAO.update(c);
    }
    public int deleteCustomer(Customer c) {
        CustomerDAO cDAO = new CustomerDAO();
        return cDAO.delete(c);
    }

    public Vector<Customer> searchCustomer(String name, String phone) {
        Customer c = new Customer();
        if (name.length() > 0) {
            c.setCustomerName(name);
        }
        if (phone.length() > 0) {
            c.setPhone(phone);
        }
        CustomerDAO cDAO = new CustomerDAO();
        return cDAO.filter(c);
    }
}
