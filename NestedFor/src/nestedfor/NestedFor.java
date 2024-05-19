package nestedfor;

import java.util.LinkedList;
import java.util.Arrays;

public class NestedFor {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> primeArray = new LinkedList<>();
      for (int i = 1; i <=100; i++) {
           
            int count=0;
            for(int j=1;j<=i;j++){
                
                if(i%j==0){
                count++;
                }
            
            }
            if(count==2){
            primeArray.add(i);
            }
        }
        System.out.println(Arrays.toString(primeArray.toArray())); 
     
    }
    
}
