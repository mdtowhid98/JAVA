package randompassword;

import java.util.Random;

public class RandomPassword {

    public static void main(String[] args) {

        Random random = new Random();
        int range = random.nextInt(3) + 1;
        String pass = "";
        String finalPass = "";

        for (int i = 1; i <=8; i++) {
            switch (range) {
                
                case 1:
                    pass += (char) (random.nextInt(26) + 65);
                    break;
                case 2:
                    pass += (char) (random.nextInt(26) + 97);
                    break;
                case 3:
                    pass += (char) (random.nextInt(10) + 48);

                    break;
            }
        }

        for (int i = 0; i < 8; i++) {
            if (i == 4) {
                finalPass += "_" + pass.charAt(i);
            } else {
                finalPass += pass.charAt(i);
            }
        }
        System.out.println(finalPass);
    }

}
