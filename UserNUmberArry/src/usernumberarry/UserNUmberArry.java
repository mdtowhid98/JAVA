
package usernumberarry;




public class UserNUmberArry {

    
    public static void main(String[] args) {
       
        
        int[] numbers = new int[10];
        
        
        for (int i = 0; i < 10; i++) {
            numbers[i] = i + 1; 
        }
        
       
        System.out.println();
        for (int number : numbers) {
            System.out.print(number+" " );
        }
        
        
    }
    
}
