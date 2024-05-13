
package recarsionfebonacci;

import java.util.Scanner;


public class RecarsionFebonacci {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter index of febonacci number");
        int index=input.nextInt();
        
        System.out.println("The febonacci number is "+index+"is "+fib(index));
        
        
        
    }
    
    
    public static long fib(long index) {
       if(index==0){
       return 0;
       } 
       else if(index==1){
       return 1;
       }
       else{
       return fib(-1)+fib(-2);
       }
    }
}
