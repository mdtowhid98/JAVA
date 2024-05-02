
package sumtwodimensionalarrays;


public class SumTwoDimensionalArrays {

    
    public static void main(String[] args) {
       
        int[][] numbers={{1,2,3},{4,5,6},{7,8,9}};
        int sum=sumArrays(numbers);
        System.out.println(sum);
        
    }
    
    public static int sumArrays(int[][] myArrays) {
        int sum=0;
        for(int row=0;row<myArrays.length;row++){
            for(int column=0;column<myArrays[0].length;column++){
            sum+=myArrays[row][column];
            }
        
        }
       return sum;
    }
    
}
