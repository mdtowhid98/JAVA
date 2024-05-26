package pkg100randomindex;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class RandomIndex {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i <= 100; i++) {
            list.add(random.nextInt(101));
        }
        System.out.println(list);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter index number");
        
        try {
            int index=scanner.nextInt();
            System.out.println(list.get(index));
        } catch (Exception e) {
            System.out.println("Out of bounds");
        }

    }

}
