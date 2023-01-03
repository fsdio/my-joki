/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kesehatan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author fsdio
 */
public class config {
    
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try {
            String database = "2010010529_db_lapangan";  // database
            String user="root"; //user database
            String pass=""; //password database
            String url="jdbc:mysql://localhost:3306/"+database; //url
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return mysqlconfig;
    }

}
