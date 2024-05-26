package recarsionfebonacci;

import java.util.Scanner;

public class RecarsionFebonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Index number");
        int index = scanner.nextInt();
        System.out.println(febonacci(index));

    }

    public static int febonacci(int index) {
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        }
        else{
        return febonacci(index-1)+febonacci(index-2);
        }
    }

}
