
package singledimensionarray;

import java.util.Random;


public class TestArryMethod {
    public static void main(String[] args) {
        int [] myList=new int [100];
      myList[0]=25;

for(int i=0;i<myList.length;i++){
    Random r=new Random();
    int num=r.nextInt(100)+1;
    myList[i]=num;
}

int maxNuber=maxNumber(myList);
int avg=avg(myList);
        minNumber(myList);
        System.out.println("maxNumber is "+maxNuber);
        System.out.println("avg is "+avg);

    }
    public static int maxNumber(int[] myArray) {
      int max=myArray[0];
      for(int val:myArray){
if(max<val){
max=val;
}

}
        
        return max;
    }
    
    public static void minNumber(int[] myArray) {
        int min=myArray[0];
      for(int val:myArray){

if(min>val){
min=val;
}

} 
        System.out.println("minnumber is "+min);    
    }
    
    public static int avg(int[] myArry) {
        int sum=0;
        int avg=0;
      for(int val:myArry){
      sum+=val;
  }
avg=sum/myArry.length; 
return avg;
    }
}
