package netbeansql2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class NetbeanSql2 {

    static PreparedStatement ps;
    static ResultSet rs;
    static DbUtil db = new DbUtil();
    static String sql = "";

    public static void main(String[] args) {

//        saveData("gvju", "ftf@gmail.com");
//        showData();
//        updateData("nirob", "nirob@gmail.com ", 3);
        showData();
        deleteData(3);
        showData();
    }

    public static void saveData(String name, String email) {

        sql = "insert into employee (name,email)values(?,?)";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);

            ps.executeUpdate();
            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(NetbeanSql2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showData() {

        sql = "select * from employee";

        try {
            ps = db.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                int id = rs.getInt("id");

                System.out.println("id is " + id + "\t name " + name + " \temail " + email);

            }
            ps.close();
            rs.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(NetbeanSql2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void updateData(String name, String email,int id){
    
    sql="update employee set name=?,email=? where id=?";
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, id);
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(NetbeanSql2.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
     public static void deleteData(int id){
     
     sql="delete from employee where id=?";
     
        try {
            ps = db.getCon().prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(NetbeanSql2.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }
}
