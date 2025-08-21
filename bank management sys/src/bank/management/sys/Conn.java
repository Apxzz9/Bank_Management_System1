
package bank.management.sys;
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

     public Conn()
{     
    try{
       
        c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Gupta975@");
        s = c.createStatement();
    
    
    } catch (Exception e){
        System.out.println(e);
    
    
    }




}
    
}

