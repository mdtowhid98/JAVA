package getprime;

public class Prime {

    int number = 1;

    public Prime() {
    }

    public Prime(int newNumber) {
        number = newNumber;
    }

    public boolean getPrime() {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count += 1;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }

    }

}
