
package gradenumber;

import java.util.Scanner;


public class GradeNumber {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String grade="";
        System.out.println("Enter ur marks");
        int marks=input.nextInt();
        if(marks<=32){
            grade="F";
        }
        
        else if(marks<=39){
            grade="D";
            
        }
        
          else if(marks<=49){
            grade="C";
        }
        else if(marks<=59){
            grade="B";
            
        }
        else if(marks<=69){
            grade="A-";
            
        }
        
        else if(marks<=79){
            grade="A";
            
        }
        else if(marks<=100){
            grade="A+";
            
        }
        else{
            grade="wrong input";
        }
        System.out.println(grade);
        
    }
    
}
