
package testbinaryio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class TestBinaryIO {

  
    public static void main(String[] args) throws FileNotFoundException {
      
        File file=new File("C:\\Users\\Admin\\Desktop\\1281524.txt");
        
        PrintWriter write=new PrintWriter(file);
        write.print("Hello mr. Towhid");
        write.append(" Wellcome to java");
        write.close();
        
        Scanner scanner=new Scanner(file);
//        System.out.println(scanner.nextLine());
//        scanner.close();
        
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
            
        }
    }
    
}
