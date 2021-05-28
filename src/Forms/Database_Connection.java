/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import sun.util.logging.PlatformLogger;


public class Database_Connection {
    
    private static String servername= "localhost";
    private static String username= "root";
    private static String dbname ="login_database";
    private static Integer portnumber = 3306;
    private static String password = "";
    public static Connection getConnectoin()
    {
        Connection conn = null;
        
        MysqlDataSource  datasource = new MysqlDataSource();
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            conn = datasource.getConnection();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger("Get connection -> "+Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
    }
}
