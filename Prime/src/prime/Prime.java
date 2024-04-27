/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prime;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        System.out.println("Enter Start number");
       int startPoint=p.nextInt();
        System.out.println("enter end number");
       int endPoint=p.nextInt();
       
       
       for(int j=startPoint;j<=endPoint;j++){
           int count=0;
       for(int i=1;i<=j;i++){
       if(j%i==0){
           count+=1;
       }
       }
       
       if(count==2){
           System.out.println("the prime number is "+j);
       }
      count=0;
       }
    }
    
}
