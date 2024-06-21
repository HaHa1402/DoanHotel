
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package doanhotel;




import java.sql.PreparedStatement ;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;





/**
 *
 * @author Administrator
 */
public class Room extends javax.swing.JFrame {
    Connection Con = null;
    ResultSet Rs = null;
    Statement St = null;
    PreparedStatement ps = null;
    public Room() {
        initComponents();
        ShowRooms();
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PRoom = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RNameTb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PriceTb = new javax.swing.JTextField();
        CategoryCb = new javax.swing.JComboBox<>();
        StatusCb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        RoomList = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CategoryRefre = new javax.swing.JComboBox<>();
        StatusRefre = new javax.swing.JComboBox<>();
        RefreshBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PRoom.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Khách hàng");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phòng");

        logoutBtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Đăng xuất");
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Đặt phòng");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Thống kê");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
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
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
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
        jLabel1.setText("MANAGE ROOM");

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Name");

        RNameTb.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        RNameTb.setForeground(new java.awt.Color(51, 51, 51));

        jLabel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Price");

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Categories ");

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Status");

        PriceTb.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PriceTb.setForeground(new java.awt.Color(51, 51, 51));
        PriceTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTbActionPerformed(evt);
            }
        });

        CategoryCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIP", "Double Bed", "Single 3rd", "Family" }));
        CategoryCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryCbActionPerformed(evt);
            }
        });

        StatusCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Free", "Booked", "", "" }));

        RoomList.setBackground(new java.awt.Color(0, 102, 102));
        RoomList.setForeground(new java.awt.Color(255, 255, 255));
        RoomList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Number", "Name", "Type", "Status", "Price"
            }
        ));
        RoomList.setGridColor(new java.awt.Color(0, 0, 0));
        RoomList.setRowHeight(29);
        RoomList.setShowGrid(true);
        RoomList.setShowVerticalLines(false);
        RoomList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoomListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(RoomList);

        AddBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EditBtn.setText("Edit");
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
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("HOTEL MANAGEMENT SYSTEM");

        CategoryRefre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIP", "Double Bed", "Single 3rd", "Family" }));
        CategoryRefre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CategoryRefreItemStateChanged(evt);
            }
        });
        CategoryRefre.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                CategoryRefreCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        CategoryRefre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryRefreActionPerformed(evt);
            }
        });

        StatusRefre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Free", "Dooked", " ", " " }));
        StatusRefre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                StatusRefreItemStateChanged(evt);
            }
        });
        StatusRefre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusRefreActionPerformed(evt);
            }
        });

        RefreshBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RefreshBtn.setText("Refresh");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 102, 102));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Refresh");

        javax.swing.GroupLayout PRoomLayout = new javax.swing.GroupLayout(PRoom);
        PRoom.setLayout(PRoomLayout);
        PRoomLayout.setHorizontalGroup(
            PRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRoomLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PRoomLayout.createSequentialGroup()
                        .addGroup(PRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PRoomLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(PRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PRoomLayout.createSequentialGroup()
                                        .addComponent(AddBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(EditBtn))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RNameTb)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PriceTb)
                                    .addComponent(CategoryCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(StatusCb, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PRoomLayout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(DeleteBtn)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PRoomLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PRoomLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(348, 348, 348))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PRoomLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(440, 440, 440))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PRoomLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(CategoryRefre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(StatusRefre, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(RefreshBtn)
                                .addGap(307, 307, 307))))))
        );
        PRoomLayout.setVerticalGroup(
            PRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PRoomLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(PRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoryRefre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatusRefre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PRoomLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CategoryCb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StatusCb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(PRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn)
                            .addComponent(EditBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CategoryCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryCbActionPerformed
// Show ra bảng trong form
    private void ShowRooms()
    {
        try {
            Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelDb","root","root");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from RoomTbl");
            RoomList.setModel(DbUtils.resultSetToTableModel(Rs));
            
        } catch (Exception e) {
        }
    }
    ///Lọc dữ liệu Category 
    private void FilterByCat()
    {
        try {
            Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelDb","root","root");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from RoomTbl where RType = '" + CategoryRefre.getSelectedItem().toString()+ "'");
            RoomList.setModel(DbUtils.resultSetToTableModel(Rs));
            
        } catch (Exception e) {
        }
    }
    //Lọc dữ liệu Status
    private void FilterByStatus()
    {
        try {
            Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelDb","root","root");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from RoomTbl where RStatus = '"+StatusRefre.getSelectedItem().toString()+"'");
            RoomList.setModel(DbUtils.resultSetToTableModel(Rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    int Rid;
    private void CountRooms()
    {
        try {
            St = Con.createStatement();
            Rs = St.executeQuery("select Max(RNum) from RoomTbl");
            Rs.next();
            Rid = Rs.getInt(1)+1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    //Nút Add ở Room
    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
       if(RNameTb.getText().isEmpty() || CategoryCb.getSelectedIndex() == -1 || StatusCb.getSelectedIndex() == -1 || PriceTb.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"Missing Data!!!");
       }else{
            MyConnection con = new MyConnection();
            PreparedStatement psCheck;
            String checkNameRoom = "select * from roomtbl where RName = ?";
            String NameR = RNameTb.getText();
            try{
                psCheck= con.getConnection().prepareStatement(checkNameRoom);                                                          
                psCheck.setString(1, NameR);
                ResultSet rs = psCheck.executeQuery();
                if(rs.next()){
                        JOptionPane.showMessageDialog(this, "Tên phòng tồn tại");
                }
                else{                 
                    if(PriceTb.getText()!= null && Integer.parseInt(PriceTb.getText()) > 0){
                        PreparedStatement Save = Con.prepareStatement("insert into RoomTbl values(?,?,?,?,?) ");                       
                        CountRooms();
                        Save.setInt(1,Rid);
                        Save.setString(2, RNameTb.getText());
                        Save.setString(3, CategoryCb.getSelectedItem().toString());
                        Save.setString(4, StatusCb.getSelectedItem().toString());
                        Save.setInt(5,Integer.parseInt(PriceTb.getText()));
                        JOptionPane.showMessageDialog(this,"Room Added!!!");               
                        ShowRooms();
                        Save.executeUpdate();
                    }                     
                    else{
                        JOptionPane.showMessageDialog(this, "Price must be greater than 0");
                    }
               
                }
            }catch (SQLException ex) {
               JOptionPane.showMessageDialog(this, ex);
           }
       }    
    }//GEN-LAST:event_AddBtnActionPerformed

    //Bấm logout trả về trang login:
    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
       new Login().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked
///////Nút delete Room////
    int Key = 0;
    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        if(Key == 0)
       {
           JOptionPane.showMessageDialog(this,"Select a Room!!!");
       }else{
           try {
               CountRooms();
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelDb","root","root");
               PreparedStatement Save = Con.prepareStatement("delete from RoomTbl where RNum = " + Key);
               
               int row =Save.executeUpdate();
               JOptionPane.showMessageDialog(this,"Room Deleted!!!");
               Con.close();
               ShowRooms();
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this, ex);
           }
       }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void RoomListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomListMouseClicked
        DefaultTableModel model = (DefaultTableModel) RoomList.getModel();
        int MyIndex = RoomList.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        RNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        CategoryCb.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
        StatusCb.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
        PriceTb.setText(model.getValueAt(MyIndex, 4).toString());
    }//GEN-LAST:event_RoomListMouseClicked

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        if(RNameTb.getText().isEmpty() || CategoryCb.getSelectedIndex() == -1 || StatusCb.getSelectedIndex() == -1 || PriceTb.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"Missing Data!!!");
       }else{
           try {
               CountRooms();
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelDb","root","root");
               PreparedStatement Save = Con.prepareStatement("update RoomTbl set RName=?,RType=?,RStatus=?,RPrice=? where RNum = ? ");
               Save.setInt(5,Key);
               Save.setString(1, RNameTb.getText().toString());
               Save.setString(2, CategoryCb.getSelectedItem().toString());
               Save.setString(3, StatusCb.getSelectedItem().toString());
               Save.setInt(4,Integer.valueOf(PriceTb.getText().toString()));
               int row = Save.executeUpdate();
               JOptionPane.showMessageDialog(this,"Room Updated!!!");
               Con.close();
               ShowRooms();
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this, ex);
           }
       }    
    }//GEN-LAST:event_EditBtnActionPerformed

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        
    }//GEN-LAST:event_EditBtnMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       new Customer().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void CategoryRefreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryRefreActionPerformed
       
    }//GEN-LAST:event_CategoryRefreActionPerformed

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
        ShowRooms();
        CategoryRefre.setSelectedIndex(0);
        StatusRefre.setSelectedIndex(0);
    }//GEN-LAST:event_RefreshBtnActionPerformed

    private void CategoryRefreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CategoryRefreItemStateChanged
        FilterByCat();
    }//GEN-LAST:event_CategoryRefreItemStateChanged

    private void CategoryRefreCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_CategoryRefreCaretPositionChanged
        
    }//GEN-LAST:event_CategoryRefreCaretPositionChanged

    private void StatusRefreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusRefreActionPerformed
        
    }//GEN-LAST:event_StatusRefreActionPerformed

    private void StatusRefreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_StatusRefreItemStateChanged
        FilterByStatus();
    }//GEN-LAST:event_StatusRefreItemStateChanged

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
       new Bookings().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void PriceTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTbActionPerformed

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
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JComboBox<String> CategoryCb;
    private javax.swing.JComboBox<String> CategoryRefre;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JPanel PRoom;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JTextField RNameTb;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JTable RoomList;
    private javax.swing.JComboBox<String> StatusCb;
    private javax.swing.JComboBox<String> StatusRefre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutBtn;
    // End of variables declaration//GEN-END:variables
}
