package binaryio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryIO {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Student s = new Student("Towhid", 25);
        Student s1 = new Student("Raju", 28);
        File file = new File("C:\\Users\\Admin\\Desktop\\student.dat");

//          DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
//        dos.writeUTF(s.getName()+s.getAge());
//        dos.writeUTF(s1.getName()+s1.getAge());
//      
//       dos.close();
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
        dos.writeUTF(s.getName() + s.getAge());
        dos.writeUTF(s1.getName() + s1.getAge());
        dos.close();
        
//         DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
//        dos.writeUTF(nc.getName()+nc.getId());
//        dos.writeUTF(nc1.getName()+nc1.getId());
//        dos.writeUTF(nc2.getName()+nc2.getId());
//      
//       dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream(file));

        while (dis.available() > 0) {
            System.out.println(dis.readUTF());
        }

    }

}
