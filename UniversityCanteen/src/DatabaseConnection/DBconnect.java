
package DatabaseConnection;

//import com.mysql.jdbc.Connection;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//import java.sql.DriverManager;


public class DBconnect {
    
    private static String serverName = "localhost";
    private static String userName = "root";
    private static String dbName = "universitycanteen";
    private static String password = "";
    private static int portNumber = 3308;
    
    public static Connection getConnect(){
        
        Connection con = null;
        //ds = datasource
        MysqlDataSource ds = new MysqlDataSource();
        
        ds.setServerName(serverName);
        ds.setUser(userName);
        ds.setPassword(password);
        ds.setDatabaseName(dbName);
        ds.setPortNumber(portNumber);
        
        try {
            con = ds.getConnection();
 
        } catch (SQLException ex) {
            Logger.getLogger("Get Connection.. "+DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;        
    }
    
}
