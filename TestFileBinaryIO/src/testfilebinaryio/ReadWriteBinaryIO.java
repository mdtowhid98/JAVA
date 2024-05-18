package testfilebinaryio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ReadWriteBinaryIO {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File file = new File("C:\\Users\\Admin\\Desktop\\Towhid - Copy.dat");

        FileOutputStream fos = new FileOutputStream(file);
        
        for (int i = 1; i <= 100; i++) {
            fos.write(i);
        }
        fos.close();
        
        FileInputStream fis=new FileInputStream(file);
        
        int value=0;
        while ((value=fis.read()) !=-1) {
            System.out.println(value);
            
        }
    }

}
