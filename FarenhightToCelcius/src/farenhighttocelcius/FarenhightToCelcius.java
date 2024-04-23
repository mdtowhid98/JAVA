/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package farenhighttocelcius;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class FarenhightToCelcius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("pls enter ur farenhight");
        
        float fertemp=input.nextFloat();
        float result=((fertemp-32)/9)*5;
        
        System.out.println("Temperature in celcius"+result);
    }
    
}
