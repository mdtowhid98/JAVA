
package teststring;

import java.util.Scanner;


public class TestString {

  
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter ur email id");
        String userEmail=s.next();
        String message=String.format("Welcome %s to Google", userEmail);
        
        if(userEmail.equalsIgnoreCase("Java")){
            System.out.println("Enter ur password");
            
            String password=s.next();
            if(password.equals("Java1234")){
                System.out.println(message);
            }
           
        }
        else{
            System.out.println("Could not find Google account");
        }
        
    }
    
}
