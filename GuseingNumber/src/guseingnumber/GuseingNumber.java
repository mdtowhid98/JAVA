
package guseingnumber;

import java.util.Scanner;


public class GuseingNumber {

  
    public static void main(String[] args) {
        
        
        Scanner input=new Scanner(System.in);
        System.out.println("Gess a number 1 to 100");
        int number=(int)Math.random()*101;
        
        int guess=3;
        int count=0;
        
       do{
            int guessNumber=input.nextInt();
            if(guessNumber==number){
            System.out.println("yes");
            break;
            }
            else if(guessNumber>number){
                    System.out.println("you number is high");
                    }
            else if(guessNumber<number){
                System.out.println("yuor number low");
                
                
            }
            count++;
       }
        while(guess>count);
       
       if(count==guess){
           System.out.println("Sorry you loss the game \nthe gueess number is "+number);
       }
       
        
        
        
        }
        
            
        
         
       
    }
    

