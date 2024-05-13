
package maxmins;


public class FindMaxMin {
    
    public int number1;
   public int number2;
   public int number3;
   public int number4;
   public int number5;

    public FindMaxMin() {
    }

    public FindMaxMin(int number1, int number2, int number3, int number4, int number5) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.number4 = number4;
        this.number5 = number5;
    }
   
   public int getMax(){
   if(number1>number2 && number1>number3 && number1>number4 && number1>number5){
   return number1;
   }
   else if(number2>number1 && number2>number3 && number2>number4 && number2>number5){
   return number2;
   }
   else if(number3>number1 && number3>number2 && number3>number4 && number3>number5){
   return number3;
   }
   else if(number2>number1 && number2>number3 && number2>number4 && number2>number5){
   return number4;
   }
   else{
   return number5;
   }
   }
   
   
   public int getMin(){
   if(number1<number2 && number1<number3 && number1<number4 && number1<number5){
   return number1;
   }
   else if(number2<number1 && number2<number3 && number2<number4 && number2<number5){
   return number2;
   }
   else if(number3<number1 && number3<number2 && number3<number4 && number3<number5){
   return number3;
   }
   else if(number2<number1 && number2<number3 && number2<number4 && number2<number5){
   return number4;
   }
   else{
   return number5;
   }
   }
    
}
