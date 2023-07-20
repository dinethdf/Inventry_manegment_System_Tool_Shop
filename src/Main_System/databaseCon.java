package Main_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class databaseCon {
     static Connection connection() 
     {
        try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tool_shop_inventry", "root" , "");
            
            System.out.println(conn);
          
             return conn;
        } 
        catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
             return null;
        }

}
}
