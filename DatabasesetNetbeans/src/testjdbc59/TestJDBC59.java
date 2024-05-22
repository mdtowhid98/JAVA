
package testjdbc59;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TestJDBC59 {

   
    public static void main(String[] args) {
        
        String url="jdbc:mysql://localhost:3306/testjdbc59";
        String user="root";
        String password="1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url, user, password);
            PreparedStatement ps=connection.prepareStatement("SELECT * FROM teacher");
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {                
                System.out.println(rs.getInt("Id")+" "+rs.getString("Name")+" "+
                        rs.getString("Addrees")+" "+rs.getString("City")); 
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestJDBC59.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TestJDBC59.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
