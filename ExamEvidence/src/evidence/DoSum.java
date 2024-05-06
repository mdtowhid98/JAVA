package evidence;

public class DoSum {

    public int number1;
    public int number2;

    public DoSum() {
    }

    public DoSum(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int FindSum() {
        return number1 + number2;
    }

    public int FindSubtraction() {
        return number1 - number2;
    }

    public int FindMultiple() {
        return number1 * number2;
    }

    public int FindDivide() {
        return number1 / number2;
    }

}
