
package primenumber;

import prime.TestPrime;


public class PrimeNumber {

    
    public static void main(String[] args) {
        
        TestPrime pn=new TestPrime(9);
        
        String message=pn.getPrime();
        
        System.out.println(message);
        
    }
    
}
