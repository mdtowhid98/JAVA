package netbeanxampp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class NetbeanXampp {

    static PreparedStatement ps;
    static ResultSet rs;
    static DbUtil db = new DbUtil();
    static String sql = "";

    public static void main(String[] args) {

//        saveData("tygefugvb", "tygefugvb@gmail.com", "4548");
System.out.println("----------after inserting data-----------");
        showData();
        updateData("Raju", "raju@gamil.com", "454454", 3);
System.out.println("----------after editing data-----------");
        showData();
        
        deleteData(4);
        System.out.println("----------after deleting data-----------");
        showData();
    }

    public static void saveData(String name, String email, String cell) {

        sql = "insert into employee (name,email,cell)values(?,?,?)";
        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, cell);

            ps.executeUpdate();
            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(NetbeanXampp.class.getName()).log(Level.SEVERE, null, ex);
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
                String cell = rs.getString("cell");
                int id = rs.getInt("id");

                System.out.println("id " + id + " \tname " + name + " \temail " + email + " \tcell " + cell);
            }

            ps.close();
            rs.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(NetbeanXampp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateData(String name, String email, String cell, int id) {

        sql = "update employee set name=?,email=?,cell=? where id=?";

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
            Logger.getLogger(NetbeanXampp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteData(int id) {

       sql="delete from employee where id=?"; 
        
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            
           ps.executeUpdate();
            ps.close();
            db.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(NetbeanXampp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
