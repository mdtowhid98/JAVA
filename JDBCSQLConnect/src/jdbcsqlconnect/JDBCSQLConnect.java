package jdbcsqlconnect;

import entity.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCSQLConnect {
    
    static PreparedStatement ps;
    static ResultSet rs;
    static DbUtil db = new DbUtil();
    
    public static void main(String[] args) {

//     saveData();

        System.out.println("----------before editing data----------");
        showData();
        Student student = new Student();
        
        List<Student> studentList = getById(3);
        
        student.setName(studentList.get(0).getName());
        student.setEmail("wexcrbyunim,ol.;[[");
        student.setAddress(studentList.get(0).getAddress());
        student.setCell(studentList.get(0).getCell());
        student.setId(studentList.get(0).getId());
        
        System.out.println("------------after editing data----------");
        editData(student);
        showData();

//     showData();
//     
//     Student student=new Student(4, "werxsgv", "crfgvy", "4sexcfgh", "+968");
//        editData(student);
//        showData();

        Student s = new Student();
        
        s.setId(5);
        
        deleteData(s);
        
        System.out.println("---------------before deleting data-------------");
       showData();
    }
    
    public static void saveData() {
        
        String insertSql = "insert into student(name,email,address,cell) values(?,?,?,?)";
        try {
            ps = db.getCon().prepareStatement(insertSql);
            
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
        
    }
    
    public static void showData() {
        
        String selectsql = "select * from student";
        
        try {
            ps = db.getCon().prepareStatement(selectsql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String cell = rs.getString("cell");
                
                System.out.println("Id is " + id + " name: " + name + " Email: " + email
                        + " Address: " + address + " Cell No :" + cell);
            }
            
            ps.close();
            rs.close();
            db.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(JDBCSQLConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void editData(Student s) {
        
        String sql = "update student set name=?,email=?,address=?,cell=? where id=?";
        
        try {
            ps = db.getCon().prepareStatement(sql);
            
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getAddress());
            ps.setString(4, s.getCell());
            ps.setInt(5, s.getId());
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
            
            System.out.println("Edit successfully");
            
        } catch (SQLException ex) {
            Logger.getLogger(JDBCSQLConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static List<Student> getById(int id) {
        
        List<Student> list = new ArrayList<>();
        
        String sql = "select * from student where id=?";
        
        try {
            ps = db.getCon().prepareStatement(sql);
            
            ps.setInt(1, id);
            
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("address"),
                        rs.getString("cell")
                );
                
                list.add(s);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(JDBCSQLConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static void deleteData(Student s) {
        
        String sql = "delete from student where id=?";
        
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setInt(1, s.getId());
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCSQLConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
