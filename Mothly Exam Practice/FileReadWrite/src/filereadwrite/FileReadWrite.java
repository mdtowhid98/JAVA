
package filereadwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileReadWrite {

   
    public static void main(String[] args) throws FileNotFoundException {
  
        File file=new File("C:\\Users\\Admin\\Desktop\\habijabi.dat");
        
        PrintWriter pw=new PrintWriter(file);
        pw.write("Hello ");
        pw.write("Java ");
        pw.write("World");
        pw.close();
        
        Scanner scanner=new Scanner(file);
        System.out.println(scanner.nextLine());
    }
    
}
