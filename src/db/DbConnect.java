
package db;

import java.sql.*;
import javax.swing.*;

public class DbConnect
{
    public static Connection con;
    public static Statement s;
    
    static  
    {
        try
        {
            String url="jdbc:mysql://localhost:3306/inventorydb";
            String username="root";
            String password="Tmsl@123";
            
            con=DriverManager.getConnection(url,username,password); 
            s=con.createStatement();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
}
