
package testfile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


public class Url {
  
    public static void main(String[] args) throws MalformedURLException, IOException {
        
      String url=new String("http://google.com/index.html");
      
      URL url1=new URL(url);
      
        Scanner input= new Scanner(url1.openStream());
        
        System.out.println(input.nextLine());
        
    }
   
    
    
}
