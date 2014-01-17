package nhom04.bookstore.dao;

import nhom04.bookstore.bean.Account;
import nhom04.bookstore.bean.Author;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class AccountDAO {

    public Account get(int id) {
        Account acc = null;
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM Account WHERE Account_Id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                acc = new Account();
                acc.setAccountId(id);
                acc.setUsername(rs.getString("username"));
                acc.setPassword(rs.getString("PassWord"));
                acc.setAccountName(rs.getString("Account_Name"));
                acc.setGender(rs.getByte("gender"));
                acc.setDateOfBirth(rs.getDate("DateOfBirth"));
                acc.setPhone(rs.getString("Phone"));
                acc.setAddress(rs.getString("Adress"));
                acc.setStatus(rs.getByte("status"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return acc;
    }

    public Account get(String username) {
        Account acc = null;
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM Account WHERE username=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                acc = new Account();
                acc.setAccountId(rs.getInt("Account_Id"));
                acc.setUsername(rs.getString("username"));
                acc.setPassword(rs.getString("PassWord"));
                acc.setAccountName(rs.getString("Account_Name"));
                acc.setGender(rs.getByte("gender"));
                acc.setDateOfBirth(rs.getDate("DateOfBirth"));
                acc.setPhone(rs.getString("Phone"));
                acc.setAddress(rs.getString("Adress"));
                acc.setStatus(rs.getByte("status"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return acc;
    }

    public Vector<Account> getAll() {
        Vector<Account> accV = new Vector<Account>();
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM Account";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                Account acc = new Account();
                acc.setAccountId(rs.getInt("Account_Id"));
                acc.setUsername(rs.getString("username"));
                acc.setPassword(rs.getString("PassWord"));
                acc.setAccountName(rs.getString("Account_Name"));
                acc.setGender(rs.getByte("gender"));
                acc.setDateOfBirth(rs.getDate("DateOfBirth"));
                acc.setPhone(rs.getString("Phone"));
                acc.setAddress(rs.getString("Adress"));
                acc.setStatus(rs.getByte("status"));
                accV.addElement(acc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return accV;
    }

    public int insert(Account acc) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "INSERT INTO Account([username],[PassWord],[Account_Name],[gender],[DateOfBirth],"
                    + "[Phone],[Adress],[status]) "
                    + "VALUES(?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, acc.getUsername());
            stmt.setString(2, acc.getPassword());
            stmt.setString(3, acc.getAccountName());
            stmt.setByte(4, acc.getGender());
            stmt.setDate(5, acc.getSqlDate());
            stmt.setString(6, acc.getPhone());
            stmt.setString(7, acc.getAddress());
            stmt.setByte(8, acc.getStatus());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }

    public int update(Account acc) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "UPDATE Account SET "
                    + "username = ?,"
                    + "PassWord = ?,"
                    + "Account_Name = ?,"
                    + "gender = ?,"
                    + "DateOfBirth = ?,"
                    + "Phone = ?,"
                    + "Adress = ?,"
                    + "status = ?"
                    + " WHERE Account_Id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, acc.getUsername());
            stmt.setString(2, acc.getPassword());
            stmt.setString(3, acc.getAccountName());
            stmt.setByte(4, acc.getGender());
            stmt.setDate(5, acc.getSqlDate());
            stmt.setString(6, acc.getPhone());
            stmt.setString(7, acc.getAddress());
            stmt.setByte(8, acc.getStatus());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }
}
