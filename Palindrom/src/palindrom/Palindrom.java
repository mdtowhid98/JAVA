package palindrom;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Palindrom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word");
        String original = input.nextLine();
        original = original.replace(" ", "");

        if (doPalindrom(original)) {
            System.out.println(original + "  is palindrom");
        } else {
            System.out.println(original + " is not palindrom");
        }
    }

    public static boolean doPalindrom(String original) {
        int left = 0;
        int right = original.length() - 1;

        while (left < right) {
            if (original.toLowerCase().charAt(left) != original.toLowerCase().charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
