
package readwritefile;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ReadWriteFile {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        File file=new File("C:\\Users\\Administrator\\Desktop\\towhid.txt");
        
        PrintWriter pw=new PrintWriter(file);
        pw.write("Wellcome ");
        pw.write("java");
        pw.close();
        
        Scanner scanner=new Scanner(file);
        System.out.println(scanner.nextLine());
        
        
        
        
    }
    
}
