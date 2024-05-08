
package testfile;

import static java.awt.PageAttributes.MediaType.C;
import java.io.File;
import java.util.Date;


public class TestFile {

  
    public static void main(String[] args) {
        
        File file=new File("C:\\Users\\Admin\\Desktop\\Towhid.txt");
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
        System.out.println(new Date(file.lastModified()));
       
    }
    
}
