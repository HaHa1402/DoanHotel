package doanhotel;

import com.mysql.cj.MysqlConnection;
import java.math.BigDecimal;
import java.sql.PreparedStatement ;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.sql.*;
public class Services extends javax.swing.JFrame {

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    public Services() {
        initComponents();
        ShowServices();
        loadServiceTypes();
    }

    private void ShowServices() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb", "root", "123456");
            St = Con.createStatement();
            Rs = St.executeQuery("SELECT * FROM Services");
            ServicesList.setModel(DbUtils.resultSetToTableModel(Rs));        
        } catch (SQLException e) {
        }
    }

    int ServiceID;
    int Key = 0;
    private void CountRooms() {
        try {
            St = Con.createStatement();
            Rs = St.executeQuery("SELECT MAX(ServiceID) FROM Services");
            Rs.next();
            ServiceID = Rs.getInt(1) + 1;
        } catch (SQLException e) {
        }
    }
    private void loadServiceTypes() {
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb", "root", "123456");
        St = Con.createStatement();
        Rs = St.executeQuery("SELECT DISTINCT ServiceType FROM Services");

        CategoryCb.removeAllItems();

        while (Rs.next()) {
            String serviceType = Rs.getString("ServiceType");
            CategoryCb.addItem(serviceType);
        }
        Con.close();
    } catch (SQLException e) {
    }
}  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PRoom = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        QuantityTb = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        PriceTb = new javax.swing.JTextField();
        CategoryCb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ServicesList = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ServiceNameTb = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PRoom.setBackground(new java.awt.Color(255, 255, 255));

        jPanel33.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Khách hàng");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Phòng");

        logoutBtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Đăng xuất");
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Đặt phòng");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Thống kê");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Dịch vụ");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutBtn)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel3)
                    .addComponent(jLabel23))
                .addGap(42, 42, 42))
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addGap(29, 29, 29))
        );

        jPanel34.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Quản Lý Dịch vụ");

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Tên dịch vụ");

        QuantityTb.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        QuantityTb.setForeground(new java.awt.Color(51, 51, 51));

        jLabel24.setBackground(new java.awt.Color(0, 102, 102));
        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 102, 102));
        jLabel24.setText("Giá");

        jLabel25.setBackground(new java.awt.Color(0, 102, 102));
        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 102, 102));
        jLabel25.setText("Loại dịch vụ");

        jLabel26.setBackground(new java.awt.Color(0, 102, 102));
        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 102, 102));
        jLabel26.setText("Số lượng");

        PriceTb.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PriceTb.setForeground(new java.awt.Color(51, 51, 51));

        CategoryCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phòng VIP", "Phòng giường đôi", "Phòng giường đơn", "Phòng gia đình" }));
        CategoryCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryCbActionPerformed(evt);
            }
        });

        ServicesList.setBackground(new java.awt.Color(0, 102, 102));
        ServicesList.setForeground(new java.awt.Color(255, 255, 255));
        ServicesList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Type", "Quantity", "Price"
            }
        ));
        ServicesList.setGridColor(new java.awt.Color(0, 0, 0));
        ServicesList.setRowHeight(29);
        ServicesList.setShowGrid(true);
        ServicesList.setShowVerticalLines(false);
        ServicesList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ServicesListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ServicesList);

        AddBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddBtn.setText("Thêm");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EditBtn.setText("Sửa");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DeleteBtn.setText("Xoá");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("HỆ THỐNG QUẢN LÝ KHÁCH SẠN");

        ServiceNameTb.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ServiceNameTb.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout PRoomLayout = new javax.swing.GroupLayout(PRoom);
        PRoom.setLayout(PRoomLayout);
        PRoomLayout.setHorizontalGroup(
            PRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRoomLayout.createSequentialGroup()
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PRoomLayout.createSequentialGroup()
                        .addGroup(PRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PRoomLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(PRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PRoomLayout.createSequentialGroup()
                                        .addComponent(AddBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                        .addComponent(EditBtn))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QuantityTb)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PriceTb)
                                    .addComponent(CategoryCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ServiceNameTb, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(PRoomLayout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(DeleteBtn)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PRoomLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
                        .addGroup(PRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PRoomLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(440, 440, 440))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PRoomLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(325, 325, 325))))))
        );
        PRoomLayout.setVerticalGroup(
            PRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PRoomLayout.createSequentialGroup()
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(PRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PRoomLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(ServiceNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CategoryCb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(QuantityTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(PRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn)
                            .addComponent(EditBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PRoom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new Customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        new Bookings().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel23MouseClicked

    private void CategoryCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryCbActionPerformed

    private void ServicesListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServicesListMouseClicked
        DefaultTableModel model = (DefaultTableModel) ServicesList.getModel();
        int MyIndex = ServicesList.getSelectedRow();
        Key = Integer.parseInt(model.getValueAt(MyIndex, 0).toString());
        ServiceNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        CategoryCb.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
        QuantityTb.setText(model.getValueAt(MyIndex, 3).toString());
        PriceTb.setText(model.getValueAt(MyIndex, 4).toString());    
    }//GEN-LAST:event_ServicesListMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        if(ServiceNameTb.getText().isEmpty() || CategoryCb.getSelectedIndex() == -1 || QuantityTb.getText().isEmpty() || PriceTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,"Missing Data!!!");
        } else {
            try {
                CountRooms();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb", "root", "123456");
                PreparedStatement Save = Con.prepareStatement("INSERT INTO Services VALUES (?, ?, ?, ?, ?)");
                Save.setInt(1, ServiceID);
                Save.setString(2, ServiceNameTb.getText());
                Save.setString(3, CategoryCb.getSelectedItem().toString());
                Save.setInt(4, Integer.parseInt(QuantityTb.getText()));
                Save.setBigDecimal(5, new BigDecimal(PriceTb.getText()));
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this,"Added!!!");
                Con.close();
                ShowServices();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        } 
    }//GEN-LAST:event_AddBtnActionPerformed

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked

    }//GEN-LAST:event_EditBtnMouseClicked

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        if(ServiceNameTb.getText().isEmpty() || CategoryCb.getSelectedIndex() == -1 || QuantityTb.getText().isEmpty() || PriceTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,"Missing Data!!!");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb", "root", "123456");
                String Query = "UPDATE Services SET ServiceName=?, ServiceType=?, ServiceQuantity=?, ServicePrice=? WHERE ServiceID=?";
                PreparedStatement Update = Con.prepareStatement(Query);
                Update.setString(1, ServiceNameTb.getText());
                Update.setString(2, CategoryCb.getSelectedItem().toString());
                Update.setInt(3, Integer.parseInt(QuantityTb.getText()));
                Update.setBigDecimal(4, new BigDecimal(PriceTb.getText()));
                Update.setInt(5, Key);
                int row = Update.executeUpdate();
                JOptionPane.showMessageDialog(this,"Service Updated!!!");
                Con.close();
                ShowServices();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        if(Key == 0) {
            JOptionPane.showMessageDialog(this,"Select a Service!!!");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb", "root", "123456");
                String Query = "DELETE FROM Services WHERE ServiceID=?";
                PreparedStatement Delete = Con.prepareStatement(Query);
                Delete.setInt(1, Key);
                int row = Delete.executeUpdate();
                JOptionPane.showMessageDialog(this,"Service Deleted!!!");
                Con.close();
                ShowServices();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        new Services().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Services().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JComboBox<String> CategoryCb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JPanel PRoom;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JTextField QuantityTb;
    private javax.swing.JTextField ServiceNameTb;
    private javax.swing.JTable ServicesList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutBtn;
    // End of variables declaration//GEN-END:variables
}
