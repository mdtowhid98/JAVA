
package sqlnetbeans;

import entity.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;


public class SqlNetBeans {

    static PreparedStatement ps;
    static ResultSet rs;
    static DbUtil db=new DbUtil();
   
    public static void main(String[] args) {
        
//      saveData();
        System.out.println("-------before editing data---------");
       showData();
       
       Student s=new Student();
       List<Student>studentList=getById(1);
       
       s.setName("ygeyhgghey");
       s.setEmail(studentList.get(0).getEmail());
       s.setCell(studentList.get(0).getCell());
       s.setId(studentList.get(0).getId());
       
        editData(s);
        System.out.println("-----------after editing data-----------");
        showData();
        
        Student s1=new Student();
        s1.setId(2);
        deleteData(s1);
        System.out.println("------------after deleting data-----------");
        showData();
       
    }
    
    public static void saveData(){
    
   String sql="insert into student (name,email,cell)values(?,?,?)";
   
        try {
            ps=db.getCon().prepareStatement(sql);
            ps.setString(1, "Raju");
            ps.setString(2, "raju@gmail.com");
            ps.setString(3, "1564546145");
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(SqlNetBeans.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void showData(){
    
    String sql="select * from student";
    
        try {
            ps=db.getCon().prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {                
           int id=  rs.getInt("id");
            String name= rs.getString("name");
            String email= rs.getString("email");
             String cell=rs.getString("cell");
             
                System.out.println(" id is "+id+" name "+name+" email "+" cell "+cell);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlNetBeans.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
   public static void editData(Student s){
   
   String sql="update student set name=?,email=?,cell=? where id=?";
   
        try {
            ps=db.getCon().prepareStatement(sql);
            
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getCell());
            ps.setInt(4, s.getId());
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlNetBeans.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   } 
   
   
   public static List<Student>getById(int id){
   
       List<Student>list=new ArrayList<>();
       
       String sql="select * from student where id=?";
       
        try {
            ps=db.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            while (rs.next()) {                
              Student s=new Student(
                      rs.getInt("id"), 
                      rs.getString("name"), 
                      rs.getString("email"), 
                      rs.getString("cell"));
              
              list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlNetBeans.class.getName()).log(Level.SEVERE, null, ex);
        }
   return list;
   }
   
   public static void deleteData(Student s){
   
   String sql="delete  from student where id=?";
   
        try {
            ps=db.getCon().prepareStatement(sql);
            
          ps.setInt(1, s.getId());
          
          ps.executeUpdate();
          
          ps.close();
          db.getCon().close();
          
        } catch (SQLException ex) {
            Logger.getLogger(SqlNetBeans.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   }
}
