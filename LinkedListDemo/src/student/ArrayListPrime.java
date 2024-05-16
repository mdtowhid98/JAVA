package student;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPrime {

    public static void main(String[] args) {
        
        ArrayList<Integer>arrayList=new ArrayList<>();
        
        for (int i = 1; i <= 100; i++) {
            int count=0;
            for (int j=1;j<=i;j++) {
                if(i%j==0){
                count++;
                }
            }
            if(count==2){
            arrayList.add(i);
            }
        }
        System.out.println(Arrays.toString(arrayList.toArray()));
    }

}
