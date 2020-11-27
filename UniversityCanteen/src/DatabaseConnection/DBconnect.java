
package DatabaseConnection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


public class DBconnect {
    
    public static Connection connect(){
        
        Connection con = null;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/universitycanteen","root","");
            
        }catch(Exception e){
            
             
        }
        
       
        
        return con;        
    }
    
}
