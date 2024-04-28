
package breack.pkgcontinue;

import java.util.Scanner;


public class BreackContinue {

    
    public static void main(String[] args) {
       
//        Scanner input=new Scanner(System.in);
//        int sum=0;
//        
//        while(true){
//            System.out.println("enter ur value");
//            int userInput=input.nextInt();
//            
//            
//             sum += userInput;
//            
//            if(sum>200){
//            
//            }
//            else if(sum>100){
//             continue;
//            }
//           System.out.println("sum is "+sum);
//        
//        }

Scanner input=new Scanner(System.in);
        System.out.println("Enter start number");
int startPoint=input.nextInt();
        System.out.println("Enter end number");
int endPoint=input.nextInt();

while(startPoint<=endPoint){

    if(startPoint%3==0 && startPoint%5==0){
        startPoint++; 
                continue;
    }
    System.out.println(startPoint);
  startPoint++;
}


    }
    
}
