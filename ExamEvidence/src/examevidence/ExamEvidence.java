package examevidence;

import evidence.DoSum;
import java.util.Scanner;

public class ExamEvidence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        DoSum calculate = new DoSum();
        System.out.println("Enter First Number");
        calculate.number1 = input.nextInt();
        System.out.println("Enter Second Number");
        calculate.number2 = input.nextInt();

        System.out.println("Enter ur choise for sum=1,Subtraction=2,Multiple=3,Divide=4");
        int userInput = input.nextInt();

        if (userInput == 1) {
            System.out.println("Result Is " + calculate.FindSum());
        } else if (userInput == 2) {
            System.out.println("Result Is " + calculate.FindSubtraction());
        } else if (userInput == 3) {
            System.out.println("Result Is " + calculate.FindMultiple());
        } else if (userInput == 4) {
            System.out.println("Result Is " + calculate.FindDivide());
        }

    }

}
