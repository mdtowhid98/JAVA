/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcase;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dayNumber=new Scanner(System.in);
        System.out.println("pls enter dayNumber");
        int numberOfDay=dayNumber.nextInt();
        
        String dayName="";
        
        switch (numberOfDay) {
            case 1:
                dayName="Suterday";
                break;
                
                case 2:
                dayName="Sunday";
                break;
                case 3:
                dayName="Monday";
                break;
                case 4:
                dayName="Tuesday";
                break;
                case 5:
                dayName="Wednesday";
                break;
                case 6:
                dayName="Thusday";
                break;
                case 7:
                dayName="Friday";
                break;
            default:
               dayName="Invalid Number";
        }
        System.out.println("the number of day "+dayName);
    }
    
}
