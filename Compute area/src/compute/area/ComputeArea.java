package compute.area;

import java.util.Scanner;

public class ComputeArea {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("pls enter the value of number1:");
        int number1 = input.nextInt();
        System.out.println("pls enter the value of number2");
        int number2=input.nextInt();
        System.out.println("pls enter the value of number3");
        int number3=input.nextInt();
        System.out.println("pls enter the value of number4");
        int number4=input.nextInt();
  
        double area = number1+number2+number3+number4 ;
        System.out.println(area);
    }

}
