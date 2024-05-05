
package testobjectorclass;

import getprime.Prime;


public class TestObjectorClass {

    
    public static void main(String[] args) {
     
        Prime prime=new Prime(6);
       
        boolean isPrime= prime.getPrime();
        if(isPrime){
         System.out.println("it is prime number");
        }
        else{
            System.out.println("it is not prime number");
        }
        
       
        

    }
    
}
