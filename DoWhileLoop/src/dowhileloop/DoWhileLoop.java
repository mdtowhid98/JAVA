
package dowhileloop;

import java.util.Scanner;


public class DoWhileLoop {

  
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter start point");
        int startPoint=s.nextInt();
        System.out.println("Enter end point");
        int endPoint=s.nextInt();
        
        while(startPoint<=endPoint){ 
            if(startPoint%3!=0 || startPoint%5!=0){
                System.out.println(startPoint); 
            }
           
            System.out.println(startPoint+" Hello World");
            
            startPoint++;
        }
        
        
    
}
}
