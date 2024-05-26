
package bbb;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Bo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        NewClass nc=new NewClass("fcf", 25);
        NewClass nc1=new NewClass("fjk", 28);
        NewClass nc2=new NewClass("fdf", 29);
        
        File file=new File("C:\\Users\\Admin\\Desktop\\student.dat");
        
         DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
        dos.writeUTF(nc.getName()+nc.getId());
        dos.writeUTF(nc1.getName()+nc1.getId());
        dos.writeUTF(nc2.getName()+nc2.getId());
      
       dos.close();
       
        DataInputStream dis=new DataInputStream(new FileInputStream(file));
        while(dis.available()>0){
            System.out.println(dis.readUTF());
        }
       
        
        
        
    }
}
