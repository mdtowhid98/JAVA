package multidimensionarray;

import java.util.Random;
import java.util.Arrays;

public class MultiDimenSionArray {

    public static void main(String[] args) {
        Random random = new Random();
        int[][] nubmers = new int[4][4];

        for (int row = 0; row < nubmers.length; row++) {
            for (int column = 0; column < nubmers[0].length; column++) {
                int randomNumbers = random.nextInt(50);
                nubmers[row][column] = randomNumbers;
            }

        }
System.out.println (Arrays.deepToString(nubmers));
    }

    
}
