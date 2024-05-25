package recursionfactorial2;

import java.util.Scanner;
import recursion.RFeb;

public class Febonacci {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int ind=scanner.nextInt();

        RFeb rf=new RFeb();
        System.out.println(rf.feb(ind));
        
       
    }

  

}
