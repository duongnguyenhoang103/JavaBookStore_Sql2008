/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom04.bookstore.ui;

import nhom04.bookstore.bean.Author;
import nhom04.bookstore.bean.Book;
import nhom04.bookstore.bean.Category;
import nhom04.bookstore.bean.Publisher;
import nhom04.bookstore.service.AuthorService;
import nhom04.bookstore.service.BookService;
import nhom04.bookstore.service.CategoryService;
import nhom04.bookstore.service.PublisherService;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luka Man
 */
public class PnlBookManager extends javax.swing.JPanel {

    /**
     * Creates new form PnlBookManager
     */
    public PnlBookManager() {
        initComponents();

        PublisherService pubS = new PublisherService();
        cbbPublisher.setModel(new javax.swing.DefaultComboBoxModel(pubS.getListPublisher()));
        Vector<Publisher> pubV = pubS.getListPublisher();
        pubV.add(0, new Publisher(0, "Tất cả"));
        cbbSearchPublisher.setModel(new javax.swing.DefaultComboBoxModel(pubV));

        AuthorService authS = new AuthorService();
        cbbAuthor.setModel(new javax.swing.DefaultComboBoxModel(authS.getListAuthor()));
        Vector<Author> authV = authS.getListAuthor();
        authV.add(0, new Author(0, "Tất cả"));
        cbbSearchAuthor.setModel(new javax.swing.DefaultComboBoxModel(authV));

        CategoryService catS = new CategoryService();
        cbbCategory.setModel(new javax.swing.DefaultComboBoxModel(catS.getListCategory()));
        Vector<Category> catV = catS.getListCategory();
        catV.add(0, new Category(0, "Tất cả"));
        cbbSearchCategory.setModel(new javax.swing.DefaultComboBoxModel(catV));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfBookName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbbCategory = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cbbPublisher = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cbbAuthor = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfPrice = new javax.swing.JTextField();
        tfDiscount = new javax.swing.JTextField();
        tfNumberOfPages = new javax.swing.JTextField();
        tfPublishYear = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnAddBook = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnAddNewCategory = new javax.swing.JButton();
        btnAddNewPublisher = new javax.swing.JButton();
        btnAddNewAuthor = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfSearchName = new javax.swing.JTextField();
        cbbSearchAuthor = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbbSearchPublisher = new javax.swing.JComboBox();
        cbbSearchCategory = new javax.swing.JComboBox();
        btnSearchBook = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBook = new javax.swing.JTable();
        btnDeleteBook = new javax.swing.JButton();
        btnEditBook = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setPreferredSize(new java.awt.Dimension(839, 502));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel20.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Thêm, sửa thông tin sách");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thêm sách", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 51, 51))); // NOI18N

        jLabel1.setText("Tên sách:");

        jLabel2.setText("Loại sách:");

        cbbCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Nhà xuất bản:");

        cbbPublisher.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Tác giả:");

        cbbAuthor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Giá tiền:");

        jLabel6.setText("Chiết khấu:");

        jLabel8.setText("Số trang sách:");

        jLabel9.setText("Năm xuất bản:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("%");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("VNĐ");

        btnAddBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/add_16.png"))); // NOI18N
        btnAddBook.setText("Thêm mới");
        btnAddBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddBookMouseClicked(evt);
            }
        });
        btnAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/edit-clear.png"))); // NOI18N
        btnClear.setText("Làm lại");

        btnAddNewCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/1add.png"))); // NOI18N
        btnAddNewCategory.setBorder(null);
        btnAddNewCategory.setContentAreaFilled(false);
        btnAddNewCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddNewCategoryMouseClicked(evt);
            }
        });
        btnAddNewCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewCategoryActionPerformed(evt);
            }
        });

        btnAddNewPublisher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/1add.png"))); // NOI18N
        btnAddNewPublisher.setBorder(null);
        btnAddNewPublisher.setContentAreaFilled(false);
        btnAddNewPublisher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddNewPublisherMouseClicked(evt);
            }
        });
        btnAddNewPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewPublisherActionPerformed(evt);
            }
        });

        btnAddNewAuthor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/1add.png"))); // NOI18N
        btnAddNewAuthor.setBorder(null);
        btnAddNewAuthor.setContentAreaFilled(false);
        btnAddNewAuthor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddNewAuthorMouseClicked(evt);
            }
        });
        btnAddNewAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewAuthorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfBookName)
                                    .addComponent(cbbAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddNewAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbbPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddNewPublisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddNewCategory)))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNumberOfPages, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPublishYear, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(btnAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(cbbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(tfDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbbPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(tfNumberOfPages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAddNewCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddNewPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cbbAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(tfPublishYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAddNewAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddBook)
                    .addComponent(btnClear))
                .addGap(99, 99, 99))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Thêm sách    ", new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/Add.png")), jPanel3); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm sách", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(51, 51, 0))); // NOI18N

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setText("Tác giả:");

        jLabel12.setText("Tên sách:");

        cbbSearchAuthor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setText("Loại sách:");

        jLabel14.setText("Nhà xuất bản:");

        cbbSearchPublisher.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbbSearchCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSearchBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/btn_search.png"))); // NOI18N
        btnSearchBook.setText("Tìm kiếm");
        btnSearchBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchBookMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfSearchName)
                    .addComponent(cbbSearchAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbSearchPublisher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbbSearchCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(btnSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cbbSearchPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cbbSearchAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(cbbSearchCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên", "Loại", "NXB", "Tác giả", "Giá", "Chiết khấu", "Năm phát hành"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBook.setCellSelectionEnabled(true);
        tblBook.getTableHeader().setReorderingAllowed(false);
        tblBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblBookMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBookMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblBookMousePressed(evt);
            }
        });
        tblBook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblBookKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblBook);
        tblBook.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tblBook.getColumnModel().getColumn(0).setResizable(false);
        tblBook.getColumnModel().getColumn(1).setResizable(false);
        tblBook.getColumnModel().getColumn(2).setResizable(false);
        tblBook.getColumnModel().getColumn(3).setResizable(false);
        tblBook.getColumnModel().getColumn(4).setResizable(false);
        tblBook.getColumnModel().getColumn(5).setResizable(false);
        tblBook.getColumnModel().getColumn(6).setResizable(false);
        tblBook.getColumnModel().getColumn(7).setResizable(false);

        btnDeleteBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/delete_32.png"))); // NOI18N
        btnDeleteBook.setContentAreaFilled(false);

        btnEditBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/32px-Crystal_Clear_app_kwrite.png"))); // NOI18N
        btnEditBook.setContentAreaFilled(false);
        btnEditBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteBook, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnEditBook, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnEditBook, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeleteBook, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tìm kiếm và thay đổi thông tin sách", new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/find.png")), jPanel4); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jTabbedPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNewCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewCategoryActionPerformed
        DialogAddNewCategory cate = new DialogAddNewCategory(null, true);
        cate.setVisible(true);
    }//GEN-LAST:event_btnAddNewCategoryActionPerformed

    private void btnAddNewPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewPublisherActionPerformed
        DialogAddNewPublisher pub = new DialogAddNewPublisher(null, true);
        pub.setVisible(true);
    }//GEN-LAST:event_btnAddNewPublisherActionPerformed

    private void btnAddNewAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewAuthorActionPerformed
        DialogAddNewAuthor auth = new DialogAddNewAuthor(null, true);
        auth.setVisible(true);
    }//GEN-LAST:event_btnAddNewAuthorActionPerformed

    private void btnAddBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBookMouseClicked
        // TODO add your handling code here:
        byte discount = 0;
        try {
            discount = Byte.parseByte(tfDiscount.getText());
        } catch (Exception e) {
        }
        int page = 0;
        try {
            page = Integer.parseInt(tfNumberOfPages.getText());
        } catch (Exception e) {
        }
        int price = 0;
        try {
            price = Integer.parseInt(tfNumberOfPages.getText());
        } catch (Exception e) {
        }
        int year = 0;
        try {
            year = Integer.parseInt(tfPublishYear.getText());
        } catch (Exception e) {
        }
        // Validate success!
        Book b = new Book();
        b.setBookName(tfBookName.getText());
        b.setAuthor((Author) cbbAuthor.getSelectedItem());
        b.setCategory((Category) cbbCategory.getSelectedItem());
        b.setPublisher((Publisher) cbbPublisher.getSelectedItem());
        b.setDiscount(discount);
        b.setNumberOfPages(page);
        b.setPrice(price);
        b.setPublishYear(year);
        BookService bookS = new BookService();
        int k = bookS.addBook(b);
        if (k == 1) {
            JOptionPane.showMessageDialog(this, "Success!");
        } else {
            JOptionPane.showMessageDialog(this, "Fail!");
        }
    }//GEN-LAST:event_btnAddBookMouseClicked

    private void btnSearchBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchBookMouseClicked
        // TODO add your handling code here:
        String name = tfSearchName.getText().trim();
        if (name.length() == 0) {
            name = null;
        }
        Category cat = (Category) cbbSearchCategory.getSelectedItem();
        if (cat.getCategoryId() == 0) {
            cat = null;
        }
        Author auth = (Author) cbbSearchAuthor.getSelectedItem();
        if (auth.getAuthorId() == 0) {
            auth = null;
        }
        Publisher pub = (Publisher) cbbSearchPublisher.getSelectedItem();
        if (pub.getPublisherId() == 0) {
            pub = null;
        }
        BookService bS = new BookService();
        Vector<Book> bV = bS.findBook(name, cat, pub, auth);
        DefaultTableModel model = new DefaultTableModel();
        DefaultTableModel oldModel = (DefaultTableModel) tblBook.getModel();
        int n = oldModel.getColumnCount();
        for (int i = 0; i < n; i++) {
            model.addColumn(oldModel.getColumnName(i));
        }
        n = bV.size();
        for (int i = 0; i < n; i++) {
            Book b = bV.get(i);
            model.addRow(new Object[]{b.getBookId(), b, b.getCategory(), b.getPublisher(), b.getAuthor(), b.getPrice(), b.getDiscount() + "%", b.getPublishYear()});
        }
        tblBook.setModel(model);
    }//GEN-LAST:event_btnSearchBookMouseClicked

    private void btnAddNewCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNewCategoryMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNewCategoryMouseClicked

    private void btnAddNewPublisherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNewPublisherMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNewPublisherMouseClicked

    private void btnAddNewAuthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNewAuthorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNewAuthorMouseClicked

    private void tblBookKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblBookKeyReleased
    }//GEN-LAST:event_tblBookKeyReleased

    private void btnAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddBookActionPerformed

    private void tblBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookMouseClicked
       
    }//GEN-LAST:event_tblBookMouseClicked

    private void tblBookMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookMouseReleased

    }//GEN-LAST:event_tblBookMouseReleased

    private void tblBookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookMousePressed

    }//GEN-LAST:event_tblBookMousePressed

    private void btnEditBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditBookActionPerformed
        DialogEditBook book = new DialogEditBook(null, true);
        book.setVisible(true);
    }//GEN-LAST:event_btnEditBookActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnAddNewAuthor;
    private javax.swing.JButton btnAddNewCategory;
    private javax.swing.JButton btnAddNewPublisher;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteBook;
    private javax.swing.JButton btnEditBook;
    private javax.swing.JButton btnSearchBook;
    private javax.swing.JComboBox cbbAuthor;
    private javax.swing.JComboBox cbbCategory;
    private javax.swing.JComboBox cbbPublisher;
    private javax.swing.JComboBox cbbSearchAuthor;
    private javax.swing.JComboBox cbbSearchCategory;
    private javax.swing.JComboBox cbbSearchPublisher;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblBook;
    private javax.swing.JTextField tfBookName;
    private javax.swing.JTextField tfDiscount;
    private javax.swing.JTextField tfNumberOfPages;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfPublishYear;
    private javax.swing.JTextField tfSearchName;
    // End of variables declaration//GEN-END:variables
}
