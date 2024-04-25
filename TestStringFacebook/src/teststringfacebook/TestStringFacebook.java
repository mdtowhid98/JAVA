
package teststringfacebook;

import java.util.Scanner;


public class TestStringFacebook {

   
    public static void main(String[] args) {
        Scanner f=new Scanner(System.in);
        System.out.println("Enter ur account or phone numere");
        String userAccount=f.next();
        System.out.println("Enter ur password");
        String password=f.next();
        
        String message=String.format("Welcome to %s Facebook", userAccount);
        
        if(userAccount.equalsIgnoreCase("Md Towhidul Alam") && password.equals("Towhid1234")){
            System.out.println(message);
            
           
            }
        else{
            System.out.println("invalid account");
        }
            
        }
        
        
        
        
        
        
        
        
    }
    

