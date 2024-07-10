 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doanhotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.ResultSet;
import com.mysql.jdbc.Driver;

/**
 *
 * @author Administrator
 */
public class MyConnection {
    public static Connection getConnection(){
        Connection con = null ;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelDb","root","root");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
    
}
