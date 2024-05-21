
package binaryiostudents;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class BinaryIOStudents {

   
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Students s=new Students("Towhid", 25);
        Students s1=new Students("Raju", 28);
        Students s3=new Students("Kutub", 26);
        
        
        
     
        File file=new File("C:\\Users\\Admin\\Desktop\\Towhid - Copy.dat");
//        
//        PrintWriter pw=new PrintWriter(file);
//        pw.append(" "+s);
//        pw.append(" "+s1);
//        pw.append(" "+s3);
//        pw.close();
//        
//        Scanner scanner=new Scanner(file);
//        System.out.println(scanner.nextLine());
        
        DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
        dos.writeUTF(s.toString());
        dos.writeUTF(s1.toString());
        dos.writeUTF(s3.toString());
       dos.close();
       
        
        DataInputStream dis=new DataInputStream(new FileInputStream(file));
        while(dis.available()>0){
            System.out.println(dis.readUTF());
        }
       
    }
    
}
