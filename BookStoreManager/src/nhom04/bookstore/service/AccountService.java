package nhom04.bookstore.service;

import nhom04.bookstore.bean.Account;
import nhom04.bookstore.dao.AccountDAO;
import nhom04.bookstore.utils.AccountUtil;
import java.util.Vector;

public class AccountService {

    public boolean authenticate(String username, String password) {
        AccountDAO accDAO = new AccountDAO();
        Account acc = accDAO.get(username);
        if (acc == null) {
            return false;
        }
        AccountUtil util = new AccountUtil();
        String hash = util.hashPassword(password);
        if (!acc.getPassword().equals(hash)) {
            return false;
        }
        return true;
    }
    public Vector<Account> getListAccount() {
        AccountDAO accDAO = new AccountDAO();
        return accDAO.getAll();
    }
}
