package doanhotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.ResultSet;
import com.mysql.jdbc.Driver;

public class MyConnection {
    public static Connection getConnection(){
        Connection con = null ;
        try {         
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","14022004");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}