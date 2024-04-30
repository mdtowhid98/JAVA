
package javaapplication16;

public class JavaApplication16 {

   
    public static void main(String[] args) {
        int factValue=16;
        int factorial=1;
        for(int i=factValue;i>=1;i--){
        factorial*=i;//factorial*factorial*i

        }
        System.out.println(factorial);
    }
    
}
