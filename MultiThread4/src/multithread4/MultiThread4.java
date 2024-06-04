
package multithread4;



public class MultiThread4 {

    
    public static void main(String[] args) {
      
        Runnable printA = new PrintChar('a', 100);
        Runnable printB = new PrintChar('b', 100);
       Runnable runnable=new PrintNum(100);


      
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(runnable);

      
        
        
        thread1.start();
        thread2.start();
        thread3.start(); 
        
    }
    
}
