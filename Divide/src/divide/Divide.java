package divide;


import java.util.Scanner;

public class Divide {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int result = 0;
        

//        try {
//          if(number2 !=0){
//           result = number1 / number2;
//          }
//           
//            
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        }


        try {
        
           result = number1 / number2;
          
           
            

        } catch (Exception e) {

            e.printStackTrace();

        }



        
        System.out.println(result);

    }

}
