
package kiosk.mpec.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectDB {
   Connection conn;
    String database = "dkkhaisinh";
    String user = "root";
    String pass = "798052";
    String port = "3306";
    String IP = "localhost";
    public Connection getConnection() {
        if (conn == null) {
            
            try {
                Class.forName("com.mysql.jdbc.Driver");             // using when jdbc is not autoloaded
                conn = DriverManager.getConnection("jdbc:mysql://" + IP + ":" + port + "/" + database + "?verifyServerCertificate=false&useSSL=false&useUnicode=true&characterEncoding=utf-8", user, pass);       
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        return conn;
    }
}