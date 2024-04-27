
package studentstatus;

import java.util.Scanner;


public class StudentStatus {


    public static void main(String[] args) {
//        Programming Exercises 155
//*4.18 (Student major and status) Write a program that prompts the user to enter two
//characters and displays the major and status represented in the characters. The first
//character indicates the major and the second is number character 1, 2, 3, 4, which
//indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
//the following chracters are used to denote the majors:
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two charecter");
        String userInput=input.next();
        if(userInput.length() !=2){
            System.out.println("please enter exactly two charecter");
        }
        
        char majorCode=Character.toUpperCase(userInput.charAt(0));
        char statusCode=userInput.charAt(1);
        
        String majorName="";
        switch (majorCode) {
            case 'M':
                majorName="Mathematics";
                break;
                case 'C':
                    majorName="Computer Scince";
                
                break;
                case 'I':
                majorName="Information Technology";
                break;
            default:
                majorName="Invalid number";
        }
        
        String status="";
        switch (statusCode) {
            case '1':
                status="freshman";
                break;
                case '2':
                status="sophomore";
                break;
                case '3':
                status="senior";
                break;
            default:
               status="Invalid number";
        }
        
       
        System.out.println(majorName +" "+ status); 
        
        
        
        
        
    }
    
}
