package doanhotel;

import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.JTextArea;

public class Bookings extends javax.swing.JFrame {

    public Bookings() {
        initComponents();   
        GetRoom();
        GetCustomer();
        ShowBookings();
        GetServices();
    }
    Connection Con = null;
    ResultSet Rs = null, Rs1 = null;
    Statement St = null, St1 = null;
    
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb", "root", "14022004");
    }
    ///Thanh Room//////////
    //Khi một phòng thêm vào thì ngay lập tức id phòng đó sẽ mất trên thanh Room////
    private void GetRoom(){
        try {
            String S = "Phòng trống";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","14022004");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from roomtbl where RStatus = '"+S+"'");
            while(Rs.next()){       
                String RName = Rs.getString("RName");
                RoomCb.addItem(RName);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        } finally {
            try {
                if (Rs != null) Rs.close();
                if (St != null) St.close();
                if (Con != null) Con.close();
            } catch (SQLException e) {
            }
        }
    }

    int RC;
    private void GetCost(){
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb", "root", "14022004");
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select RPrice from roomtbl where RName = '" + RoomCb.getSelectedItem().toString() + "'");
            Rs1.next();
            RC = Rs1.getInt(1);
            CostTb.setText("" + RC);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        } finally {
            try {
                if (Rs1 != null) Rs1.close();
                if (St1 != null) St1.close();
                if (Con != null) Con.close();
            } catch (SQLException e) {
            }
        }
    }
    ///Thanh Customer////////
    private void GetCustomer(){
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb", "root", "14022004");
            St = Con.createStatement();
            Rs = St.executeQuery("SELECT * FROM customer");
            CustomerCb.removeAllItems();
            while (Rs.next()) {
                String customerName = Rs.getString("CustName");
                CustomerCb.addItem(customerName);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        } finally {
            try {
                if (Rs != null) Rs.close();
                if (St != null) St.close();
                if (Con != null) Con.close();
            } catch (SQLException e) {
            }
        }
    }
    private void GetServices(){
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb", "root", "14022004");
            St = Con.createStatement();
            Rs = St.executeQuery("SELECT * FROM Services");
            ServicesCb.removeAllItems();
            while (Rs.next()) {
                String serviceName = Rs.getString("ServiceName");
                ServicesCb.addItem(serviceName);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        } finally {
            try {
                if (Rs != null) Rs.close();
                if (St != null) St.close();
                if (Con != null) Con.close();
            } catch (SQLException e) {
            }
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
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
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
        DeleteBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        RoomCb = new javax.swing.JComboBox<>();
        CustomerCb = new javax.swing.JComboBox<>();
        CostTb = new javax.swing.JTextField();
        FetchBtn = new javax.swing.JButton();
        BDate = new com.toedter.calendar.JDateChooser();
        payBtn = new javax.swing.JButton();
        printBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ServicesCb = new javax.swing.JComboBox<>();
        SerBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();

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

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Dịch vụ");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Nhân viên");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RoomBtn)
                    .addComponent(BookBtn)
                    .addComponent(CustomerBtn))
                .addGap(42, 42, 42))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(DashboardBtn)
                    .addComponent(logoutBtn)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(DashboardBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addGap(40, 40, 40))
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "BNum", "Room", "Customer", "BDate", "Duration", "Cost", "PaymentStatus"
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

        DeleteBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DeleteBtn.setText("Xóa phòng");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
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

        payBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        payBtn.setText("Thanh toán");
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });

        printBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        printBtn.setText("In Hóa Đơn");
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 102, 102));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Dịch vụ");

        ServicesCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServicesCbActionPerformed(evt);
            }
        });

        SerBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SerBtn.setText("Thêm dịch vụ");
        SerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SerBtnActionPerformed(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EditBtn.setText("Sửa phòng");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RoomCb, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(FetchBtn))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(SerBtn))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(payBtn)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(CostTb)
                                        .addComponent(ServicesCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DurationTb)
                                        .addComponent(BDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CustomerCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 104, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RoomCb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CustomerCb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DurationTb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ServicesCb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FetchBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CostTb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn)
                            .addComponent(SerBtn))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(payBtn)
                            .addComponent(printBtn))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditBtn)
                            .addComponent(DeleteBtn))))
                .addGap(38, 38, 38))
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
    private void ShowBookings() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb", "root", "14022004");
            St = Con.createStatement();
            Rs = St.executeQuery("SELECT bookingtbl.Bid, roomtbl.RName, customer.CustName, bookingtbl.BDate, bookingtbl.Duration, bookingtbl.Cost, bookingtbl.PaymentStatus FROM bookingtbl INNER JOIN roomtbl ON bookingtbl.RNum = roomtbl.RNum INNER JOIN customer ON bookingtbl.CustId = customer.CustId");
            BookingList.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        } finally {
            try {
                if (Rs != null) Rs.close();
                if (St != null) St.close();
                if (Con != null) Con.close();
            } catch (SQLException e) {
            }
        }
    }
    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        if (RoomCb.getSelectedIndex() == -1 || CustomerCb.getSelectedIndex() == -1 || BDate.getDate() == null || DurationTb.getText().isEmpty() || CostTb.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin");
    } else {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb", "root", "14022004");
            PreparedStatement add = Con.prepareStatement("INSERT INTO bookingtbl (RNum, CustId, BDate, Duration, Cost) VALUES (?, ?, ?, ?, ?)");
            
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select RNum from roomtbl where RName = '" + RoomCb.getSelectedItem().toString() + "'");
            Rs1.next();
            int RNum = Rs1.getInt(1);

            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select CustId from customer where CustName = '" + CustomerCb.getSelectedItem().toString() + "'");
            Rs1.next();
            int CustId = Rs1.getInt(1);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(BDate.getDate());

            add.setInt(1, RNum);
            add.setInt(2, CustId);
            add.setString(3, date);
            add.setInt(4, Integer.parseInt(DurationTb.getText()));
            add.setInt(5, Integer.parseInt(CostTb.getText()));

            int row = add.executeUpdate();
            
            String updateRoomQuery = "UPDATE roomtbl SET RStatus = 'Phòng đã đặt' WHERE RNum = ?";
            PreparedStatement updateRoom = Con.prepareStatement(updateRoomQuery);
            updateRoom.setInt(1, RNum);
            updateRoom.executeUpdate();

            JOptionPane.showMessageDialog(this, "Đặt phòng thành công");
            ShowBookings();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        } finally {
            try {
                if (Rs1 != null) Rs1.close();
                if (St1 != null) St1.close();
                if (Con != null) Con.close();
            } catch (SQLException e) {
            }
        }
    }
    }//GEN-LAST:event_AddBtnActionPerformed
    
    private void RoomCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomCbActionPerformed

    }//GEN-LAST:event_RoomCbActionPerformed

    private void CustomerCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerCbActionPerformed
       
    }//GEN-LAST:event_CustomerCbActionPerformed

    private void RoomCbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RoomCbItemStateChanged
        GetCost();
    }//GEN-LAST:event_RoomCbItemStateChanged

    private void FetchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FetchBtnActionPerformed
        int ToAmt = RC * Integer.parseInt(DurationTb.getText().toString());
        CostTb.setText("" + ToAmt);
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
    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        if (Key == 0) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một đặt phòng để xóa");
    } else {
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa đặt phòng này?", "Warning", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb", "root", "14022004");
                
                St1 = Con.createStatement();
                Rs1 = St1.executeQuery("SELECT RNum FROM bookingtbl WHERE Bid = " + Key);
                Rs1.next();
                int RNum = Rs1.getInt(1);

                String deleteQuery = "DELETE FROM bookingtbl WHERE Bid = ?";
                PreparedStatement deleteStatement = Con.prepareStatement(deleteQuery);
                deleteStatement.setInt(1, Key);
                deleteStatement.executeUpdate();

                String updateRoomQuery = "UPDATE roomtbl SET RStatus = 'Phòng trống' WHERE RNum = ?";
                PreparedStatement updateRoom = Con.prepareStatement(updateRoomQuery);
                updateRoom.setInt(1, RNum);
                updateRoom.executeUpdate();

                JOptionPane.showMessageDialog(this, "Đặt phòng đã được xóa thành công.");
                ShowBookings();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            } finally {
                try {
                    if (Rs1 != null) Rs1.close();
                    if (St1 != null) St1.close();
                    if (Con != null) Con.close();
                } catch (SQLException e) {
                }
            }
        }
    }
    }//GEN-LAST:event_DeleteBtnActionPerformed
    int R;
    private void BookingListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookingListMouseClicked
        DefaultTableModel model = (DefaultTableModel) BookingList.getModel();
        int MyIndex = BookingList.getSelectedRow();  
        Key = Integer.parseInt(model.getValueAt(MyIndex, 0).toString());
        RoomCb.setSelectedItem(model.getValueAt(MyIndex, 1).toString());
        CustomerCb.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            BDate.setDate(sdf.parse(model.getValueAt(MyIndex, 3).toString()));
        } catch (ParseException e) {
        }
        DurationTb.setText(model.getValueAt(MyIndex, 4).toString());
        CostTb.setText(model.getValueAt(MyIndex, 5).toString());
    }//GEN-LAST:event_BookingListMouseClicked

    private void DashboardBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardBtnMouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DashboardBtnMouseClicked

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        if (Key == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một đặt phòng để thanh toán");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb", "root", "14022004");
                String Query = "UPDATE bookingtbl SET PaymentStatus = 'Đã thanh toán' WHERE Bid = " + Key;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Thanh toán thành công");
                ShowBookings();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            } finally {
                try {
                    if (Con != null) Con.close();
                } catch (SQLException e) {
                }
            }
        }
    }//GEN-LAST:event_payBtnActionPerformed

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
                if (Key == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một đặt phòng để in hóa đơn");
        } else {
            JTextArea textArea = new JTextArea();
            textArea.setText("               HÓA ĐƠN THANH TOÁN\n");
            textArea.append("-----------------------------------------------------\n");

            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb", "root", "14022004");

                String query = "SELECT b.Bid, r.RName, c.CustName, c.CustPhone, c.CustAdd, c.CustDob, b.BDate, b.Duration, b.Cost, b.PaymentStatus " +
                               "FROM bookingtbl b " +
                               "JOIN roomtbl r ON b.RNum = r.RNum " +
                               "JOIN customer c ON b.CustID = c.CustId " +
                               "WHERE b.Bid = ?";
                
                try (PreparedStatement pst = Con.prepareStatement(query)) {
                    pst.setInt(1, Key);
                    try (ResultSet rs = pst.executeQuery()) {
                        if (rs.next()) {
                            textArea.append("Tên phòng: " + rs.getString("RName") + "\n");
                            textArea.append("Tên khách hàng: " + rs.getString("CustName") + "\n");
                            textArea.append("Số điện thoại: " + rs.getString("CustPhone") + "\n");
                            textArea.append("Địa chỉ: " + rs.getString("CustAdd") + "\n");
                            textArea.append("Ngày sinh: " + rs.getString("CustDob") + "\n");
                            textArea.append("Ngày đặt: " + rs.getString("BDate") + "\n");
                            textArea.append("Thời gian: " + rs.getInt("Duration") + " ngày\n");
                            textArea.append("Chi phí: " + rs.getInt("Cost") + "\n");
                            textArea.append("-----------------------------------------------------\n");
                            textArea.append("Trạng thái thanh toán: " + rs.getString("PaymentStatus") + "\n");
                        }
                    }
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                try {
                    if (Con != null) Con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            try {
                textArea.print();
            } catch (PrinterException e) {
                e.printStackTrace();
            }
        }
    

    }//GEN-LAST:event_printBtnActionPerformed

    private void ServicesCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServicesCbActionPerformed
        
    }//GEN-LAST:event_ServicesCbActionPerformed

    private void SerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SerBtnActionPerformed
        if (Key == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một đặt phòng để thêm dịch vụ");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb", "root", "14022004");
                
                // Get selected service details
                String selectedService = ServicesCb.getSelectedItem().toString();
                PreparedStatement ps = Con.prepareStatement("SELECT * FROM Services WHERE ServiceName = ?");
                ps.setString(1, selectedService);
                Rs1 = ps.executeQuery();
                
                if (Rs1.next()) {
                    int serviceID = Rs1.getInt("ServiceID");
                    int servicePrice = Rs1.getInt("ServicePrice");
                    int serviceQuantity = Rs1.getInt("ServiceQuantity");
                    
                    if (serviceQuantity <= 0) {
                        JOptionPane.showMessageDialog(this, "Dịch vụ này hiện không còn sẵn có.");
                        return;
                    }
                    
                    // Update booking cost
                    String updateBookingQuery = "UPDATE bookingtbl SET Cost = Cost + ? WHERE Bid = ?";
                    PreparedStatement updateBooking = Con.prepareStatement(updateBookingQuery);
                    updateBooking.setInt(1, servicePrice);
                    updateBooking.setInt(2, Key);
                    updateBooking.executeUpdate();
                    
                    // Decrement service quantity
                    String updateServiceQuery = "UPDATE Services SET ServiceQuantity = ServiceQuantity - 1 WHERE ServiceID = ?";
                    PreparedStatement updateService = Con.prepareStatement(updateServiceQuery);
                    updateService.setInt(1, serviceID);
                    updateService.executeUpdate();
                    
                    JOptionPane.showMessageDialog(this, "Dịch vụ đã được thêm thành công.");
                    ShowBookings();
                }
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            } finally {
                try {
                    if (Rs1 != null) Rs1.close();
                    if (Con != null) Con.close();
                } catch (SQLException e) {
                }
            }
        }
    }//GEN-LAST:event_SerBtnActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new Services().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        if (Key == 0) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một đặt phòng để sửa đổi");
    } else {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb", "root", "14022004");
            
            String updateQuery = "UPDATE bookingtbl SET RNum = ?, CustId = ?, BDate = ?, Duration = ?, Cost = ? WHERE Bid = ?";
            PreparedStatement updateStatement = Con.prepareStatement(updateQuery);
            
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select RNum from roomtbl where RName = '" + RoomCb.getSelectedItem().toString() + "'");
            Rs1.next();
            int RNum = Rs1.getInt(1);
            
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select CustId from customer where CustName = '" + CustomerCb.getSelectedItem().toString() + "'");
            Rs1.next();
            int CustId = Rs1.getInt(1);
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(BDate.getDate());

            updateStatement.setInt(1, RNum);
            updateStatement.setInt(2, CustId);
            updateStatement.setString(3, date);
            updateStatement.setInt(4, Integer.parseInt(DurationTb.getText()));
            updateStatement.setInt(5, Integer.parseInt(CostTb.getText()));
            updateStatement.setInt(6, Key);       
            updateStatement.executeUpdate();          
            JOptionPane.showMessageDialog(this, "Thông tin đặt phòng đã được cập nhật thành công.");
            ShowBookings(); 
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        } finally {
            try {
                if (Rs1 != null) Rs1.close();
                if (St1 != null) St1.close();
                if (Con != null) Con.close();
            } catch (SQLException e) {
            }
        }
    }
    }//GEN-LAST:event_EditBtnActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

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
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField DurationTb;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton FetchBtn;
    private javax.swing.JLabel RoomBtn;
    private javax.swing.JComboBox<String> RoomCb;
    private javax.swing.JButton SerBtn;
    private javax.swing.JComboBox<String> ServicesCb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JButton payBtn;
    private javax.swing.JButton printBtn;
    // End of variables declaration//GEN-END:variables
}