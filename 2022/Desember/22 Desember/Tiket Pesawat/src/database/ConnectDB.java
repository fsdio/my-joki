package database;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BEM-FIKI
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

    private static Connection mysqlconfig;
    
    public static Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/db_tiket_pesawat"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass); 
        } catch (SQLException e) {
            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return mysqlconfig;
    }
    
    public static boolean cekDataEmail(String collums, String email, String where){
        
        try {
            int hasil=0;
            String sql = "select * from "+ collums +" where "+where+"='"+ email +"'";
            java.sql.Connection conn = (Connection)ConnectDB.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while(res.next()){
                hasil++;
            }
            if (hasil>0) { return true; }
        } catch (SQLException e) {
            System.out.println("GAGAL DICEK !!!");
        }
        return false;
    }
    
    
    
}
