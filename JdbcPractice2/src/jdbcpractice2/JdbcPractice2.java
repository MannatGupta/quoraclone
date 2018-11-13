/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcpractice2;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Mannat Gupta
 */
public class JdbcPractice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","muffin151297");
            Statement stmt=conn.createStatement();
           /* ResultSet rs=stmt.executeQuery("SELECT * FROM Students");
            while(rs.next())
            {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                
            }*/
           int r=stmt.executeUpdate("INSERT INTO STUDENT VALUES(\'Charu\',8,\'abc@gmail.com\')");
           System.out.println(r);
        }
         
        catch(Exception e)
        {
                   System.out.println(e);
                    
                         
        }
        // TODO code application logic here
    }
    
}
