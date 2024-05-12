
package primenumber2;

import java.util.Scanner;


public class PrimeNumber2 {

    
    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        int number=input.nextInt();
        int count=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
            count++;
            }
        
        }
        if(count==2){
            System.out.println("It is prime number");
        }
        else{
            System.out.println("It is not prime number");
        }
        
        
    }
    
}
