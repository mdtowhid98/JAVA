
package testfilebinaryio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;




public class TestFileBinaryIO {

   
    public static void main(String[] args) throws FileNotFoundException {
      
        File file=new File("C:\\Users\\Admin\\Desktop\\habijabi.dat");
        
        PrintWriter pw=new PrintWriter(file);
        
        pw.append("Helo world");
        pw.append(" This is Bangladesh");
        
        pw.close();
        
        Scanner scanner=new Scanner(file);
        System.out.println(scanner.nextLine());
        
        scanner.close();
    }
    
}
