package maxmin;

public class FindMaxMin {

   public int number1;
   public int number2;
   public int number3;

    public FindMaxMin() {
    }

    public FindMaxMin(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public int getMax() {
        if (number1 > number2 && number1 > number3) {
            return number1;
        }
        
        else if(number2>number1 && number2>number3){
        return number2;
        }
        else{
        return number3;
        } 
    }
    
    public int getMin() {
        if (number1 < number2 && number1 < number3) {
            return number1;
        }
        
        else if(number2<number1 && number2<number3){
        return number2;
        }
        else{
        return number3;
        } 
    }

}
