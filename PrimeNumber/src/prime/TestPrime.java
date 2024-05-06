package prime;

public class TestPrime {

    int number = 1;

    public TestPrime() {
    }

    public TestPrime(int number) {
        this.number = number;
    }

    public String getPrime() {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count+=1;
            }
        }
        if(count==2){
        return "It is Prime Number";
        }
        else{
        return "It Is Not Prime Number";
        }
    }

}
