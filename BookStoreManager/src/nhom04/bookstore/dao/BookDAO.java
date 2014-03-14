package nhom04.bookstore.dao;

import nhom04.bookstore.bean.Book;
import nhom04.bookstore.utils.BookUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class BookDAO {

    public Book get(int id) {
        Book b = null;
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM Book WHERE book_id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            BookUtil util = new BookUtil();
            if (rs.next()) {
                b = util.rsToBook(rs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    public Vector<Book> getAll() {
        Vector<Book> Bookv = new Vector();
        Book book = null;
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM Book";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            BookUtil util = new BookUtil();
            while (rs.next()) {
                Bookv.addElement(util.rsToBook(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Bookv;
    }

    public int insert(Book book) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "INSERT INTO Book([Book_Name],[Category_id],"
                    + "[Publisher_id],[Author_id],[price],[discount],[NumberOfPages],[publishYear]) "
                    + "VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            int i = 1;
            stmt.setString(i++, book.getBookName());
            stmt.setInt(i++, book.getCategory().getCategoryId());
            stmt.setInt(i++, book.getPublisher().getPublisherId());
            stmt.setInt(i++, book.getAuthor().getAuthorId());
            stmt.setInt(i++, book.getPrice());
            stmt.setByte(i++, book.getDiscount());
            stmt.setInt(i++, book.getNumberOfPages());
            stmt.setInt(i++, book.getPublishYear());

            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }

    public Vector<Book> filter(Book book) {
        Vector<Book> B = new Vector();
        try {
            Connection conn = Database.getConnection();
            String sql = "SELECT * FROM Book";
            String where = "";
            if (book.getBookName() != null) {
                where += "[Book_Name] like ? AND ";
            }
            if (book.getAuthor() != null) {
                where += "[author_id]=? AND ";
            }
            if (book.getCategory() != null) {
                where += "[category_id]=? AND ";
            }
            if (book.getPublisher() != null) {
                where += "[publisher_id]=? AND ";
            }
            if (where.length() > 0) {
                sql += " WHERE " + where.substring(0, where.length() - 5);
            }
            PreparedStatement stmt = conn.prepareStatement(sql);
            int i = 1;
            if (book.getBookName() != null) {
                stmt.setString(i++, "%" + book.getBookName() + "%");
            }
            if (book.getAuthor() != null) {
                stmt.setInt(i++, book.getAuthor().getAuthorId());
            }
            if (book.getCategory() != null) {
                stmt.setInt(i++, book.getCategory().getCategoryId());
            }
            if (book.getPublisher() != null) {
                stmt.setInt(i++, book.getPublisher().getPublisherId());
            }
            ResultSet rs = stmt.executeQuery();
            BookUtil util = new BookUtil();
            while (rs.next()) {
                B.add(util.rsToBook(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return B;
    }

    public int delete(Book book) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "delete FROM book where book_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, book.getBookId());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }

    public int update(Book book) {
        int k = -1;
        try {
            Connection conn = Database.getConnection();
            String sql = "update book set [book_name]=? ,[Category_id] =?,[Publisher_id] =?,[Author_id] =?"
                    + ",[price] =?,[discount]=?,[NumberOfPages]=?,[publishYear]=? where book_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            int i = 1;
            stmt.setString(i++, book.getBookName());
            stmt.setInt(i++, book.getCategory().getCategoryId());
            stmt.setInt(i++, book.getPublisher().getPublisherId());
            stmt.setInt(i++, book.getAuthor().getAuthorId());
            stmt.setInt(i++, book.getPrice());
            stmt.setByte(i++, book.getDiscount());
            stmt.setInt(i++, book.getNumberOfPages());
            stmt.setInt(i++, book.getPublishYear());
            stmt.setInt(i++, book.getBookId());
            k = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }
}
