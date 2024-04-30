

import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {

        Random random = new Random();

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            char randomChar;
            if (random.nextBoolean()) {
                randomChar = (char) ('A' + random.nextInt(26));
            } else {
                randomChar = (char) ('a' + random.nextInt(26));
            }
            password.append(randomChar);
        }

        System.out.println("Generated password: " + password);
    }
}

