
package inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class InputOutputFile {
    public static void main(String[] args) throws FileNotFoundException {
//        File file=new File("C:\\Users\\Admin\\Desktop\\New Text Document.txt");
//        PrintWriter pw=new PrintWriter(file);
//        pw.append("drftjhinuib ");
//        pw.append(" dcvtghbnikjoik");
//        pw.append(" rdfgyhuijujl");
//        pw.append(" westyiunb");
//        pw.close();
//        
//        Scanner scanner=new Scanner(file);
//        while (scanner.hasNext()) {            
//            System.out.println(scanner.nextLine());
//        }


    SubInput si=new SubInput();
    si.write();
    si.read();
    }
    
}
