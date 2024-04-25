
package leapyear;

import java.util.Scanner;


public class LeapYear {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter year number");
        int year=input.nextInt();
        
        
      boolean leapYear=(year%4==0||year%400==0);

      System.out.println("the leap year is "+leapYear);
        }
    }
    

