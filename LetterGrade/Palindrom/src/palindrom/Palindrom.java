
package palindrom;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Palindrom {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter word");
        String original=input.next();
        
        if(doPalindrom(original)){
            System.out.println(original+"  is palindrom");
        }
        else{
            System.out.println(original+" is not palindrom");
        }
        
    }
    
    
    public static boolean doPalindrom( String original) {
     int left=0;
     int right=original.length()-1;
     
     while(left<right){
         if(original.charAt(left)!=original.charAt(right)){
         return false;
         }
     left++;
     right--;
     }
     return true;
    }
    
}
