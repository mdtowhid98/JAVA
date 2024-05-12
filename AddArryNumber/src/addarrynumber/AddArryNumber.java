
package addarrynumber;

import java.util.Random;
import java.util.Arrays;

public class AddArryNumber {

   
    public static void main(String[] args) {
       
     Random r=new Random();
     
     
     int [][]number=new int[3][3];
     
     for(int row=0;row<number.length;row++){
         
         for(int column=0;column<number[0].length;column++){
           int randomNum=r.nextInt(10);
           number[row][column]=randomNum;
         
         }
     
     }
        System.out.println(Arrays.deepToString(number));        
        
        
    }
    
}
