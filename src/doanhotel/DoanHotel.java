package doanhotel;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Statement;

public class DoanHotel {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb", "root", "123456");
            // Tiếp tục với các thao tác trên cơ sở dữ liệu         
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DoanHotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}