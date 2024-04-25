/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classwork;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ClassWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
//        System.out.println("Enter ur Name");
//        String userName=n.next();
//        
//        if(userName.equalsIgnoreCase("Towhid")){
//            System.out.println("Welcome "+userName );
//        }
//        else{
//            System.out.println("incorrect");
//        }
System.out.println("Enter your word");
//
String word=n.next();

if(word.startsWith("a")){
    System.out.println("vowel");
}
else if(word.startsWith("e")){
    System.out.println("vowel");
}

else if(word.startsWith("i")){
    System.out.println("vowel");
}
else if(word.startsWith("o")){
    System.out.println("vowel");
}
else if(word.startsWith("u")){
    System.out.println("vowel");
}
else{
    System.out.println("non_vowel");
}

     


        
        
    }
    
}
