/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agen;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Connect{

    private static Component parentComponent;
    public static Connection konek(){
        Connection C = null;
        try{
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
        C = DriverManager.getConnection("jdbc:mysql://localhost:3306/agen", "root", "");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(parentComponent, ex);
        }
        return C;
}
}
