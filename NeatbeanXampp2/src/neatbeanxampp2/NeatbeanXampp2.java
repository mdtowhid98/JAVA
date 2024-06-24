
package neatbeanxampp2;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;


public class NeatbeanXampp2 {

    static PreparedStatement ps;
    static ResultSet rs;
    static DbUtil db=new DbUtil();
    static String sql="";
    
    public static void main(String[] args) {
       
        saveData("sabab", "sabab@gmail.com", "58454");
//        System.out.println("--------after inserting data-----------"); 
        showData();
        
//        updateData("Amin", "amin@gmail.com", "454154", 1);
//         System.out.println("--------after editing data-----------"); 
//        showData();
//
//        deleteData(1);
//         System.out.println("--------after deleting data-----------"); 
//        showData();
    }
    
    
    public static void saveData(String name,String email,String cell){
    
       sql="insert into student (name,email,cell)values(?,?,?)";
        try {
            ps=db.getCon().prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, cell);
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(NeatbeanXampp2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void showData(){
        
        sql="select * from student";
        
        try {
            ps=db.getCon().prepareStatement(sql);
            
            rs=ps.executeQuery();
            
            while (rs.next()) {                
                String name=rs.getString("name");
                String email=rs.getString("email");
                String cell=rs.getString("cell");
                int id=rs.getInt("id");
                
                System.out.println("id "+id+" \tname "+name+" \temail"+email+" \tcell"+cell);
                
            }
            
            ps.close();
            rs.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(NeatbeanXampp2.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
 public static void updateData(String name, String email, String cell, int id) {

        sql = "update student set name=?,email=?,cell=? where id=?";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, cell);
            ps.setInt(4, id);

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(NeatbeanXampp2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void deleteData(int id){
    
        sql="delete from student where id=?";
        
        try {
            ps=db.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(NeatbeanXampp2.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
