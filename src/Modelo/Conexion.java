/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
  import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author feña
 */
public class Conexion {
      private static String db = "RedBanc";
    private static String user = "root";
    private static String pass = "root";
    private static String url="jdbc:mysql://localhost/" + db;
    private static Connection Conn;
    private static Statement st;
   
    
        public static Connection getConnection(){
        try{
         Class.forName("com.mysql.jdbc.Driver");   
         Conn = DriverManager.getConnection(url, user, pass);
            
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Error  base de dato " + e.getMessage());
        }
    return Conn;
    }

    public Statement cc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Statement conectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
   
}
