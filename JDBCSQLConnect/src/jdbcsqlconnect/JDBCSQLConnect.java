
package jdbcsqlconnect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JDBCSQLConnect {

    static PreparedStatement ps;
    static ResultSet rs;
    public static void main(String[] args) {
        
     DbUtil db=new DbUtil();
     
     String insertSql="insert into student(name,email,address,cell) values(?,?,?,?)";
        try {
            ps=db.getCon().prepareStatement(insertSql);
            ps.setString(1, "Towhid");
            ps.setString(2, "towhid@gmail.com");
            ps.setString(3, "Naogaon");
            ps.setString(4, "017852212");
            
            ps.executeUpdate();
            
            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCSQLConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
      
     String selectsql="select * from student";
     
        try {
            ps=db.getCon().prepareStatement(selectsql);
           rs=ps.executeQuery();
            
             while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String email=rs.getString("email");
                String address=rs.getString("address");
                String cell=rs.getString("cell");
                
                System.out.println("Id is "+id+" name: "+name +" Email: "+email
                +" Address: "+address+ " Cell No :"+cell );
            }
             
             ps.close();
             rs.close();
             db.getCon().close();
             
        } catch (SQLException ex) {
            Logger.getLogger(JDBCSQLConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
     
     
    }
    
}
