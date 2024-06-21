package doanhotel;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Bookings extends javax.swing.JFrame {

    public Bookings() {
        initComponents();
        GetRoom();
        GetCustomer();
        ShowBooking();
        CostTb.setEditable(false);       
    }
    Connection Con = null;
//    PrepareStatement Pst=null;
    ResultSet Rs = null, Rs1 = null;
    Statement St = null, St1 = null;
    
    ///Thanh Room//////////
    //Khi một phòng thêm vào thì ngay lập tức id phòng đó sẽ mất trên thanh Room////
    private void GetRoom(){
        try {
            String S = "Free";
            Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","123456");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from RoomTbl where RStatus = '"+S+"'");
            while(Rs.next()){
                
                String RNum = Rs.getString("RNum");
                RoomCb.addItem(RNum);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    /////Gửi thông báo đến Room là đã được đặt phòng//////
    private void UpdateRoom(){
        try {
            String s = "Booked";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","123465");
               PreparedStatement Save = Con.prepareStatement("update RoomTbl set RStatus=? where RNum = ? ");
               Save.setInt(2,Integer.parseInt(RoomCb.getSelectedItem().toString()));
               Save.setString(1, s);
              
               int row = Save.executeUpdate();
               JOptionPane.showMessageDialog(this,"Room Updated!!!");
               Con.close();  
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }                        
    }
    private void UpdatetoFree(){
        try {
            String s = "Free";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","123465");
               PreparedStatement Save = Con.prepareStatement("update RoomTbl set RStatus=? where RNum = ? ");
               Save.setInt(2,R);
               Save.setString(1, s);
              
               int row = Save.executeUpdate();
               JOptionPane.showMessageDialog(this,"Room Updated!!!");
               Con.close();  
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }                        
    }
    ///Thanh Cost/////
    int RC;
    private void GetCost(){
         try {
            
            St1 = Con.createStatement();
            
            Rs1 = St1.executeQuery("select RPrice from RoomTbl where RNum = " + RoomCb.getSelectedItem().toString());
            Rs1.next();
            
            RC = Rs1.getInt(1);
            CostTb.setText(""+RC);
            
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(this, e);
        }
    }
    ///Thanh Customer////////
     private void GetCustomer   (){
        try {
            Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","123465");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from Customer");
            while(Rs.next()){
                
                String C = Rs.getString("CustId");
                CustomerCb.addItem(C);
            }
        } catch (SQLException e) {
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        CustomerBtn = new javax.swing.JLabel();
        RoomBtn = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        BookBtn = new javax.swing.JLabel();
        DashboardBtn = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DurationTb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        BookingList = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        RoomCb = new javax.swing.JComboBox<>();
        CustomerCb = new javax.swing.JComboBox<>();
        CostTb = new javax.swing.JTextField();
        FetchBtn = new javax.swing.JButton();
        BDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        CustomerBtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        CustomerBtn.setForeground(new java.awt.Color(255, 255, 255));
        CustomerBtn.setText("Khách hàng");
        CustomerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerBtnMouseClicked(evt);
            }
        });

        RoomBtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        RoomBtn.setForeground(new java.awt.Color(255, 255, 255));
        RoomBtn.setText("Phòng");
        RoomBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoomBtnMouseClicked(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Đăng xuất");
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });

        BookBtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        BookBtn.setForeground(new java.awt.Color(255, 255, 255));
        BookBtn.setText("Đặt phòng");

        DashboardBtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        DashboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        DashboardBtn.setText("Thống kê");
        DashboardBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutBtn)
                    .addComponent(RoomBtn)
                    .addComponent(BookBtn)
                    .addComponent(CustomerBtn)
                    .addComponent(DashboardBtn))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(RoomBtn)
                .addGap(18, 18, 18)
                .addComponent(CustomerBtn)
                .addGap(18, 18, 18)
                .addComponent(BookBtn)
                .addGap(18, 18, 18)
                .addComponent(DashboardBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addGap(29, 29, 29))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Quản Lý Đặt Phòng");

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Phòng");

        jLabel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Thời lượng tính bằng ngày");

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Khách hàng");

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Ngày đặt phòng");

        DurationTb.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        DurationTb.setForeground(new java.awt.Color(51, 51, 51));

        BookingList.setBackground(new java.awt.Color(0, 102, 102));
        BookingList.setForeground(new java.awt.Color(255, 255, 255));
        BookingList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "BNum", "Room", "Customer", "BDate", "Duration", "Cost"
            }
        ));
        BookingList.setGridColor(new java.awt.Color(0, 0, 0));
        BookingList.setRowHeight(29);
        BookingList.setShowGrid(true);
        BookingList.setShowVerticalLines(false);
        BookingList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookingListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BookingList);

        AddBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddBtn.setText("Đặt phòng");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancelBtn.setText("Huỷ");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("HỆ THỐNG QUẢN LÝ KHÁCH SẠN");

        jLabel9.setBackground(new java.awt.Color(0, 102, 102));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Trị giá");

        RoomCb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RoomCbItemStateChanged(evt);
            }
        });
        RoomCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomCbActionPerformed(evt);
            }
        });

        CustomerCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerCbActionPerformed(evt);
            }
        });

        CostTb.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        CostTb.setForeground(new java.awt.Color(51, 51, 51));

        FetchBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        FetchBtn.setForeground(new java.awt.Color(255, 0, 0));
        FetchBtn.setText("Tổng");
        FetchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FetchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(431, 431, 431))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(311, 311, 311))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CostTb, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DurationTb)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(FetchBtn))
                                .addComponent(RoomCb, javax.swing.GroupLayout.Alignment.TRAILING, 0, 183, Short.MAX_VALUE)
                                .addComponent(CustomerCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AddBtn)
                                .addGap(18, 18, 18)
                                .addComponent(cancelBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RoomCb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(CustomerCb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DurationTb, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FetchBtn)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CostTb, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn)
                            .addComponent(cancelBtn))
                        .addGap(78, 78, 78))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked
 //// Show ra trên bảng BookingList
    private void ShowBooking()
    {
        try {
            Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","123456");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from BookingTbl");
            BookingList.setModel(DbUtils.resultSetToTableModel(Rs));
            
        } catch (SQLException e) {
        }
    }
    int Bid;
    private void CountBookings()
    {
        try {
            St = Con.createStatement();
            Rs = St.executeQuery("select Max(BId) from BookingTbl");
            Rs.next();
            Bid = Rs.getInt(1)+1;
        } catch (SQLException e) {
        }
    }
    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        if(RoomCb.getSelectedIndex() == -1 || CustomerCb.getSelectedIndex() == -1 || DurationTb.getText().isEmpty() || CostTb.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"Missing Data!!!");
       }else{
           try {
               String Bdate = BDate.getDate().toString().substring(0,11);
               CountBookings();
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","123465");
               PreparedStatement Save = Con.prepareStatement("insert into BookingTbl values(?,?,?,?,?,?) ");
               Save.setInt(1,Bid);
               Save.setInt(2,Integer.parseInt(RoomCb.getSelectedItem().toString()) );
               Save.setInt(3,Integer.parseInt(CustomerCb.getSelectedItem().toString()) );
               Save.setString(4, Bdate);
               Save.setInt(5, Integer.parseInt(DurationTb.getText()));
               Save.setInt(6, Integer.parseInt(CostTb.getText()));
               
               int row = Save.executeUpdate();
               JOptionPane.showMessageDialog(this,"Room Booked!!!");
               Con.close();
               ShowBooking();
               UpdateRoom();
               RoomCb.removeAllItems();
               GetRoom();
               
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this, ex);
           }
       }    
    }//GEN-LAST:event_AddBtnActionPerformed

    private void RoomCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomCbActionPerformed

    private void CustomerCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerCbActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CustomerCbActionPerformed

    private void RoomCbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RoomCbItemStateChanged
        GetCost();
    }//GEN-LAST:event_RoomCbItemStateChanged
/// Tính giá phòng ở theo bao nhiêu ngày///
    private void FetchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FetchBtnActionPerformed
        int ToAmt = RC * Integer.valueOf(DurationTb.getText().toString());
        CostTb.setText(""+ToAmt);
    }//GEN-LAST:event_FetchBtnActionPerformed

    private void RoomBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomBtnMouseClicked
       new Room().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_RoomBtnMouseClicked

    private void CustomerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerBtnMouseClicked
       new Customer().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_CustomerBtnMouseClicked
int Key = 0;
    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        if(Key == 0)
       {
           JOptionPane.showMessageDialog(this,"Select a Booking!!!");
       }else{
           try {
               
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","123456");
               PreparedStatement Save = Con.prepareStatement("delete from BookingTbl where BId = " + Key);
               
               int row = Save.executeUpdate();
               JOptionPane.showMessageDialog(this,"Booking Deleted!!!");
               Con.close();
               ShowBooking();
               UpdatetoFree();
               RoomCb.removeAllItems();
               GetRoom();
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this, ex);
           }
       }
    }//GEN-LAST:event_cancelBtnActionPerformed
int R;
    private void BookingListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookingListMouseClicked
        DefaultTableModel model =  (DefaultTableModel) BookingList.getModel();
        int MyIndex = BookingList.getSelectedRow();
        Key = Integer.parseInt(model.getValueAt(MyIndex, 0).toString());
        R = Integer.parseInt(model.getValueAt(MyIndex, 1).toString());
        RoomCb.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
        CustomerCb.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
        DurationTb.setText(model.getValueAt(MyIndex, 4).toString());
        CostTb.setText(model.getValueAt(MyIndex, 5).toString());
    }//GEN-LAST:event_BookingListMouseClicked

    private void DashboardBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardBtnMouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DashboardBtnMouseClicked

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Bookings().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private com.toedter.calendar.JDateChooser BDate;
    private javax.swing.JLabel BookBtn;
    private javax.swing.JTable BookingList;
    private javax.swing.JTextField CostTb;
    private javax.swing.JLabel CustomerBtn;
    private javax.swing.JComboBox<String> CustomerCb;
    private javax.swing.JLabel DashboardBtn;
    private javax.swing.JTextField DurationTb;
    private javax.swing.JButton FetchBtn;
    private javax.swing.JLabel RoomBtn;
    private javax.swing.JComboBox<String> RoomCb;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutBtn;
    // End of variables declaration//GEN-END:variables
}
