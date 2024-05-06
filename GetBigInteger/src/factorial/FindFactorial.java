package factorial;

import java.math.BigInteger;

public class FindFactorial {

    int number = 1;

    public FindFactorial() {
    }

    public FindFactorial(int number) {

        this.number = number;
    }

    public BigInteger getFactorial() {

        BigInteger factorial = new BigInteger("1");

        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(new BigInteger(i + ""));
        }
        return factorial;
    }

  

}
