
package binarysearch;
import java.util.Arrays;

public class BinarySearch {

    
    public static void main(String[] args) {
        
       int intArray[]={2,5,1,9,3,4,7,6};
       
       Arrays.sort(intArray);
       
       int intKey=6;
       
        System.out.println(intKey+" Found at index "+Arrays.binarySearch(intArray, intKey));
        
    }
    
}


