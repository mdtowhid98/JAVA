package jdbcconnect;

import entity.Habijabi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class JdbcConnect {

    static PreparedStatement ps;
    static ResultSet rs;
    static DbUtil db = new DbUtil();

    public static void main(String[] args) {

//        saveData();
//        showData();
        Habijabi h = new Habijabi();
        List<Habijabi>habijabiList=getById(2);
        
        h.setName(habijabiList.get(0).getName());
        h.setEmail("khijikhijikhiji@gmail.com");
        h.setAddress(habijabiList.get(0).getAddress());
        h.setCell(habijabiList.get(0).getCell());
        h.setId(habijabiList.get(0).getId());
        
        editData(h);
        showData();
        
        Habijabi h1=new Habijabi();
        h1.setId(2);
        
        deleteData(h1);
        showData();
    }

    public static void saveData() {

        String sql = "insert into habijabi(name,email,address,cell)values(?,?,?,?)";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, "khijibiji");
            ps.setString(2, "khijibiji@gmail.com");
            ps.setString(3, "fwgyhu");
            ps.setString(4, "4684884");

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(JdbcConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showData() {

        String sql = "select * from habijabi";

        try {
            ps = db.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String cell = rs.getString("cell");

                System.out.println("id is " + id + " name " + name + " email " + email + " address " + address + " cell " + cell);

            }
            ps.close();
            rs.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(JdbcConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void editData(Habijabi h) {

        String sql = "update habijabi set name=?,email=?,address=?,cell=? where id=?";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, h.getName());
            ps.setString(2, h.getEmail());
            ps.setString(3, h.getAddress());
            ps.setString(4, h.getCell());
            ps.setInt(5, h.getId());

            ps.executeUpdate();

            ps.close();
            db.getCon().close();

            System.out.println("Edit Succesfully");

        } catch (SQLException ex) {
            Logger.getLogger(JdbcConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static List<Habijabi> getById(int id) {

        List<Habijabi> list = new ArrayList<>();

        String sql = "select * from habijabi where id=?";

        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {

                Habijabi habijabi = new Habijabi(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("address"),
                        rs.getString("cell")
                );
                list.add(habijabi);

            }

        } catch (SQLException ex) {
            Logger.getLogger(JdbcConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    
    public static void deleteData(Habijabi h){
    
        
        String sql="delete from habijabi where id=?";
        
        try {
            ps=db.getCon().prepareStatement(sql);
            
            ps.setInt(1, h.getId());
            
            ps.executeUpdate();
            
            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(JdbcConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
