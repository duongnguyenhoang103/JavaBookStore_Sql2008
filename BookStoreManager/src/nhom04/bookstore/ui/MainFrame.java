/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom04.bookstore.ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Luka Man
 */
public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        LoginDialog Login = new LoginDialog(this, true);
        Login.setVisible(true);
        if (!Login.isSuccess()) {
            JOptionPane.showMessageDialog(null, "Hủy đăng nhập, kết thúc chương trình! Nhưng đây là DEMO!");
        }
        initComponents();
        setFrameStyle();

        //lbRightComponent.setIcon(new ImageIcon("images/book.jpg"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        spltMain = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbRightComponent = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbLogo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        mnItemAccount = new javax.swing.JMenuItem();
        mnItemConfigSystem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnItemExit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnItemProfile = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnItemLogout = new javax.swing.JMenuItem();
        menuBookManager = new javax.swing.JMenu();
        mnItemBookManager = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnItemPublisherManager = new javax.swing.JMenuItem();
        mnItemAuthorManager = new javax.swing.JMenuItem();
        mnItemCategoryManager = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnItemOrder = new javax.swing.JMenuItem();
        mnItemInvoice = new javax.swing.JMenuItem();
        menuCustomerManager = new javax.swing.JMenu();
        mnItemCustomer = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnItemCountInvoice = new javax.swing.JMenuItem();
        mnItemCountCustomer = new javax.swing.JMenuItem();
        mnItemCountBook = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PHẦN MỀM QUẢN LÝ CỬA HÀNG SÁCH");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/biblioteca.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/icon_book_1.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/7997769.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        spltMain.setLeftComponent(jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbRightComponent, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbRightComponent, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        spltMain.setRightComponent(jPanel3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PHẦM MỀM ỨNG DỤNG QUẢN LÝ CỬA HÀNG SÁCH");

        jLabel14.setText("jLabel14");

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/new_icon_book.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spltMain)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbLogo))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(spltMain)
                .addGap(31, 31, 31))
        );

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/32px-Crystal_Clear_app_kservices.png"))); // NOI18N
        jMenu5.setText("Hệ thống     ");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnItemAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/personal.png"))); // NOI18N
        mnItemAccount.setText("Người dùng");
        mnItemAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnItemAccountMouseClicked(evt);
            }
        });
        mnItemAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemAccountActionPerformed(evt);
            }
        });
        jMenu5.add(mnItemAccount);

        mnItemConfigSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/config.png"))); // NOI18N
        mnItemConfigSystem.setText("Cấu hình");
        mnItemConfigSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemConfigSystemActionPerformed(evt);
            }
        });
        jMenu5.add(mnItemConfigSystem);
        jMenu5.add(jSeparator1);

        mnItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mnItemExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/Exit.png"))); // NOI18N
        mnItemExit.setText("Thoát");
        mnItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemExitActionPerformed(evt);
            }
        });
        jMenu5.add(mnItemExit);

        jMenuBar1.add(jMenu5);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/32px-Crystal_Clear_action_lock_-_pink.png"))); // NOI18N
        jMenu1.setText("Tài khoản      ");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnItemProfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        mnItemProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/key.png"))); // NOI18N
        mnItemProfile.setText("Tài khoản");
        mnItemProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemProfileActionPerformed(evt);
            }
        });
        jMenu1.add(mnItemProfile);
        jMenu1.add(jSeparator3);

        mnItemLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        mnItemLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/logout.png"))); // NOI18N
        mnItemLogout.setText("Đăng xuất      ");
        mnItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(mnItemLogout);

        jMenuBar1.add(jMenu1);

        menuBookManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/32px-Crystal_Clear_app_file-manager.png"))); // NOI18N
        menuBookManager.setText("Quản lý sách   ");
        menuBookManager.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnItemBookManager.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnItemBookManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/access.png"))); // NOI18N
        mnItemBookManager.setText("Sách");
        mnItemBookManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemBookManagerActionPerformed(evt);
            }
        });
        menuBookManager.add(mnItemBookManager);
        menuBookManager.add(jSeparator2);

        mnItemPublisherManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/home.png"))); // NOI18N
        mnItemPublisherManager.setText("Nhà xuất bản");
        mnItemPublisherManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemPublisherManagerActionPerformed(evt);
            }
        });
        menuBookManager.add(mnItemPublisherManager);

        mnItemAuthorManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/employee.png"))); // NOI18N
        mnItemAuthorManager.setText("Tác giả ");
        mnItemAuthorManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemAuthorManagerActionPerformed(evt);
            }
        });
        menuBookManager.add(mnItemAuthorManager);

        mnItemCategoryManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/Misc-Box.png"))); // NOI18N
        mnItemCategoryManager.setText("Loại sách");
        mnItemCategoryManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemCategoryManagerActionPerformed(evt);
            }
        });
        menuBookManager.add(mnItemCategoryManager);

        jMenuBar1.add(menuBookManager);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/32px-Crystal_Clear_app_kword.png"))); // NOI18N
        jMenu3.setText("Quản lý hóa đơn    ");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnItemOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/Next.png"))); // NOI18N
        mnItemOrder.setText("Hóa đơn bán sách");
        mnItemOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemOrderActionPerformed(evt);
            }
        });
        jMenu3.add(mnItemOrder);

        mnItemInvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/Back.png"))); // NOI18N
        mnItemInvoice.setText("Hóa đơn nhập sách");
        mnItemInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemInvoiceActionPerformed(evt);
            }
        });
        jMenu3.add(mnItemInvoice);

        jMenuBar1.add(jMenu3);

        menuCustomerManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/32px-Crystal_Clear_app_kuser.png"))); // NOI18N
        menuCustomerManager.setText("Quản lý khách hàng     ");
        menuCustomerManager.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuCustomerManager.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuCustomerManagerMenuSelected(evt);
            }
        });
        menuCustomerManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCustomerManagerActionPerformed(evt);
            }
        });

        mnItemCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/32px-Crystal_Clear_app_Community_Help.png"))); // NOI18N
        mnItemCustomer.setText("Thông tin khách hàng");
        mnItemCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemCustomerActionPerformed(evt);
            }
        });
        menuCustomerManager.add(mnItemCustomer);

        jMenuBar1.add(menuCustomerManager);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/Bar Chart.png"))); // NOI18N
        jMenu4.setText("Thống kê");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnItemCountInvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/edit.png"))); // NOI18N
        mnItemCountInvoice.setText("Hóa đơn");
        mnItemCountInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemCountInvoiceActionPerformed(evt);
            }
        });
        jMenu4.add(mnItemCountInvoice);

        mnItemCountCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/employee.png"))); // NOI18N
        mnItemCountCustomer.setText("Khách hàng");
        mnItemCountCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemCountCustomerActionPerformed(evt);
            }
        });
        jMenu4.add(mnItemCountCustomer);

        mnItemCountBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom04/bookstore/icon/access.png"))); // NOI18N
        mnItemCountBook.setText("Sách");
        mnItemCountBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemCountBookActionPerformed(evt);
            }
        });
        jMenu4.add(mnItemCountBook);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnItemBookManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemBookManagerActionPerformed
        PnlBookManager book = new PnlBookManager();
        spltMain.setRightComponent(book);
    }//GEN-LAST:event_mnItemBookManagerActionPerformed

    private void mnItemAuthorManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemAuthorManagerActionPerformed
        PnlAuthorManager author = new PnlAuthorManager();
        spltMain.setRightComponent(author);
    }//GEN-LAST:event_mnItemAuthorManagerActionPerformed

    private void mnItemPublisherManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemPublisherManagerActionPerformed
        PnlPublisherManager publisher = new PnlPublisherManager();
        spltMain.setRightComponent(publisher);
    }//GEN-LAST:event_mnItemPublisherManagerActionPerformed

    private void mnItemCategoryManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemCategoryManagerActionPerformed
        PnlCategoryManager category = new PnlCategoryManager();
        spltMain.setRightComponent(category);
    }//GEN-LAST:event_mnItemCategoryManagerActionPerformed

    private void menuCustomerManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCustomerManagerActionPerformed
    }//GEN-LAST:event_menuCustomerManagerActionPerformed

    private void menuCustomerManagerMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuCustomerManagerMenuSelected
    }//GEN-LAST:event_menuCustomerManagerMenuSelected

    private void mnItemOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemOrderActionPerformed
        PnlOrderManager order = new PnlOrderManager();
        spltMain.setRightComponent(order);
    }//GEN-LAST:event_mnItemOrderActionPerformed

    private void mnItemInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemInvoiceActionPerformed
        PnlInvoiceManager invoice = new PnlInvoiceManager();
        spltMain.setRightComponent(invoice);
    }//GEN-LAST:event_mnItemInvoiceActionPerformed

    private void mnItemAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnItemAccountMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mnItemAccountMouseClicked

    private void mnItemAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemAccountActionPerformed
        // TODO add your handling code here:
        PnlAccountManager account = new PnlAccountManager();
        spltMain.setRightComponent(account);
    }//GEN-LAST:event_mnItemAccountActionPerformed

    private void mnItemProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemProfileActionPerformed
        PnlProfileManager profile = new PnlProfileManager();
        spltMain.setRightComponent(profile);
    }//GEN-LAST:event_mnItemProfileActionPerformed

    private void mnItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemLogoutActionPerformed
        PnlMain main = new PnlMain();
        spltMain.setRightComponent(main);

        if (JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng xuất ?", "Xác nhận", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
            this.dispose();
            LoginDialog login = new LoginDialog(this, true);
            login.setVisible(true);
        }
    }//GEN-LAST:event_mnItemLogoutActionPerformed

    private void mnItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemExitActionPerformed
        PnlMain main = new PnlMain();
        spltMain.setRightComponent(main);
        if (JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát khỏi hệ thống ?", "Xác nhận thoát", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_mnItemExitActionPerformed

    private void mnItemCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemCustomerActionPerformed
        PnlCustomerManager customer = new PnlCustomerManager();
        spltMain.setRightComponent(customer);
    }//GEN-LAST:event_mnItemCustomerActionPerformed

    private void mnItemCountInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemCountInvoiceActionPerformed
        PnlCountInvoice invoice = new PnlCountInvoice();
        spltMain.setRightComponent(invoice);
    }//GEN-LAST:event_mnItemCountInvoiceActionPerformed

    private void mnItemCountCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemCountCustomerActionPerformed
        PnlCountCustomer customer = new PnlCountCustomer();
        spltMain.setRightComponent(customer);
    }//GEN-LAST:event_mnItemCountCustomerActionPerformed

    private void mnItemCountBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemCountBookActionPerformed
        PnlCountBook book = new PnlCountBook();
        spltMain.setRightComponent(book);
    }//GEN-LAST:event_mnItemCountBookActionPerformed

    private void mnItemConfigSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemConfigSystemActionPerformed
        PnlMain main = new PnlMain();
        spltMain.setRightComponent(main);

        if (JOptionPane.showConfirmDialog(null, "Cấu hình đang trong quá trình nâng cấp! \n Bạn có muốn tiếp tục ?", "Xác nhận", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            DialogConfigSystem config = new DialogConfigSystem(null, true);
            config.setVisible(true);
        }
    }//GEN-LAST:event_mnItemConfigSystemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    //kích thước Frame
    private void setFrameStyle() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        setBounds((width - 1000) / 2, 10, 1000, 720);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbRightComponent;
    private javax.swing.JMenu menuBookManager;
    private javax.swing.JMenu menuCustomerManager;
    private javax.swing.JMenuItem mnItemAccount;
    private javax.swing.JMenuItem mnItemAuthorManager;
    private javax.swing.JMenuItem mnItemBookManager;
    private javax.swing.JMenuItem mnItemCategoryManager;
    private javax.swing.JMenuItem mnItemConfigSystem;
    private javax.swing.JMenuItem mnItemCountBook;
    private javax.swing.JMenuItem mnItemCountCustomer;
    private javax.swing.JMenuItem mnItemCountInvoice;
    private javax.swing.JMenuItem mnItemCustomer;
    private javax.swing.JMenuItem mnItemExit;
    private javax.swing.JMenuItem mnItemInvoice;
    private javax.swing.JMenuItem mnItemLogout;
    private javax.swing.JMenuItem mnItemOrder;
    private javax.swing.JMenuItem mnItemProfile;
    private javax.swing.JMenuItem mnItemPublisherManager;
    private javax.swing.JSplitPane spltMain;
    // End of variables declaration//GEN-END:variables
}
