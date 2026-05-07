import java.util.EmptyStackException;
import java.util.Scanner;

public class Question1 {

    /**
     * this function returns the biggest value within the columns by doing:
     * 1.
     * @param matrix the given 2d array
     * @return the biggest value within the columns, 0 or the first value if
     */
    public static int findMax(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0){
           throw new IllegalArgumentException("cant find the maximum size in an empty array");
        }
        // a case for a single digit array
        if(matrix.length == 1 && matrix[0].length == 1){
            return matrix[0][0];
        }

       int max = 0;
       for (int i = 0; i < matrix.length-1; i++) {
           max = Math.max(matrix[])
       }
       return max;
    }

    public static int findMin(int[][] matrix) {

        int max = Math.min(matrix[0][0], matrix[1][0]);
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] > max) {
                max = matrix[i][0];
            }
        }
        return max;
    }

    public static void findSaddlePoints(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int minRow = Integer.MAX_VALUE;
        int maxCol = Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] < minRow) {
                minRow = matrix[i][0];
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the rows of the 2d array: ");
        int rows = input.nextInt();
        System.out.println("Please enter the columns of the 2d array: ");
        int columns = input.nextInt();
        int[][] array = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("please enter a number in row " + (i+1) + " within column " + (j+1) + " ");
                array[i][j] = input.nextInt();
            }
        }
        findSaddlePoints(array);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j == columns - 1) {
                    System.out.print(array[i][j] +" ");
                }
                else {
                    System.out.print(array[i][j] + " , ");
                }
            }
            System.out.println();
        }
    }

}
