
package randommultidimensionarray;

import java.util.Random;
public class RandomMultiDimensionArray {

  
    public static void main(String[] args) {
       
       int[][] numers=new int[3][4];        
        int sum=sumRandom(numers);
        System.out.println(sum);
         
        
        
    }
    public static int sumRandom(int[][] myArrys) {
      Random random=new Random();
      int sum=0;
        for(int row=0; row<myArrys.length; row++){
            for(int column=0; column<myArrys[0].length; column++){
                int randomNumber=random.nextInt(20);
                myArrys[row][column]=randomNumber;
                sum+=randomNumber;
            }        
        }  
        return sum;
    }
 
}
