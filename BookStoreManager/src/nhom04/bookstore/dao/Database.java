
package nhom04.bookstore.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //conn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=BookStore", "sa", "123456");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:51777;databaseName=BS","test","123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
