
package binary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;




public class ReadWriteBinaryIO {
  
    public static void main(String[] args) throws FileNotFoundException, IOException {
     
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop\\Towhid - Copy.dat");
        
        for(int i=1;i<=100;i++){
        fos.write(i);
        }
        fos.close();
        
        
        
        FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Towhid - Copy.dat");
        
        
        while(fis.read()!=-1){
        System.out.println(fis.read());
        }
    }
    
    
    
}
