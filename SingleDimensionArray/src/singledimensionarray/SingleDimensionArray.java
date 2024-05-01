
package singledimensionarray;

import java.util.Arrays;
import java.util.Random;
public class SingleDimensionArray {

    public static void main(String[] args) {
       
      int [] myList=new int [100];
//      String [] stutus=new String[10];
//        
//      
//      myList[0]=25;

for(int i=0;i<myList.length;i++){
    Random r=new Random();
    int num=r.nextInt(100)+1;
    myList[i]=num;
}
  int sum=0;
  int avg=0;
  int count=0;
  int [] newList=new int[myList.length];
  int max=0;
  int min=999;
  int max1=myList[0];
  int min1=myList[0];
  
  
  for(int val:myList){
      sum+=val;
  }
avg=sum/myList.length;
int index=0;
for(int val:myList){
if(val>avg){
count+=1;
newList[index]=val;
index++;
}
}

for(int val:myList){
if(max<val){
max=val;
}
if(min>val){
min=val;
}
}

for(int i=0;i<myList.length;i++){
if(max1<myList[i]){
max1=myList[i];
}
if(min1>myList[i]){
min1=myList[i];
}
}


        System.out.println(Arrays.toString(myList));
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(count);
        System.out.println(Arrays.toString(newList));
        System.out.println(max);
        System.out.println(min);
        System.out.println(max1);
        System.out.println(min1);
        
        
    }
    
}
