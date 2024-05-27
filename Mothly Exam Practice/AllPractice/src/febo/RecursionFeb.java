
package febo;

import static febo.Febonacci.feb;
import java.util.Scanner;


public class RecursionFeb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Index number");
        int index = scanner.nextInt();
        System.out.println(feb(index));
    }

}
