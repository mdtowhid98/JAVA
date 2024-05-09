
package testfile;

import static java.awt.PageAttributes.MediaType.C;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;


public class TestFile {

  
    public static void main(String[] args) throws FileNotFoundException {
        
        File file=new File("C:\\Users\\Admin\\Desktop\\Towhid.txt");
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
        System.out.println(new Date(file.lastModified()));
       
        
        PrintWriter output=new  PrintWriter("C:\\Users\\Admin\\Desktop\\Towhid.txt");
        
        output.append("Hello ");
        output.append("java");
        output.close();
        
        Scanner input=new Scanner(file);
        System.out.println(input.nextLine());
    }
    
}
