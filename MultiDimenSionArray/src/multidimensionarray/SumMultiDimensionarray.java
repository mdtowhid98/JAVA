package multidimensionarray;

public class SumMultiDimensionarray {

    public static void main(String[] args) {
        int[][] number = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum=sumDimension(number);
        System.out.println(sum);
    }

    public static int sumDimension(int[][] myarry) {
        int sum = 0;
        for (int row = 0; row < myarry.length; row++) {
            for (int column = 0; column < myarry[0].length; column++) {
                sum+=myarry[row][column];
            }
        }
        return sum;
    }
}
