/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcpractice;
import java.sql.*;

/**
 *
 * @author Mannat Gupta
 */
public class JDBCPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            Class.forName("com.mysqljdbc.drive");
            Connection conn=DriverManager.getConnection("jdbc.mysql://localhost:3206/mydb","root","");
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM Students");
        }
        catch(Exception e)
        {
                   System.out.println(e);
                    
                         
        }           
    }
    
}
