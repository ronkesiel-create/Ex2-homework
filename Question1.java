import java.util.EmptyStackException;
import java.util.Scanner;

public class Question1 {

    /**
     * This function is for finding the Saddle Points within a 2D array
     * The function uses the first 1st loop to determine "rowMin" of each collum
     * Then it uses the second 2nd loop to see if "rowMin" ("saddlePoint") is the Maximum within its collum
     * If so it prints the position of The "saddlePoint" within the array and its value
     * @param matrix the given array
     * @throws EmptyStackException if given array is empty
     */
    public static void findSaddlePoints(int[][] matrix) {

        if (matrix.length == 0||matrix[0].length == 0) {
            throw new IllegalArgumentException("The matrix is empty");
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean found = false;
        int rowMin = Integer.MAX_VALUE;
        int rowIndex = 0;
        int colIndex = 0;
        int saddlePoint = 0;
        // STEP 1: Loop through each row
        for (int i = 0; i < rows; i++) {
            // STEP 2: Find the minimum in the current row
            rowMin =  matrix[i][0];
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                }
            }
            for (int j = 0; j < cols; j++) {
                //STEP 3. Iterates over the elements of the row, goes for "STEP 4" for each value equal to "rowMin"
                if (matrix[i][j] == rowMin) {
                    rowIndex = i;
                    colIndex = j;
                    //It's rowMin, but I made "saddlePoint" just for convenience
                    saddlePoint = matrix[rowIndex][colIndex];
                    //STEP 4: check if the current "saddlePoint" is the maximum within its column
                    found = true;
                    for (int k = 0; k < rows; k++) {
                        if (matrix[k][colIndex] > saddlePoint) {
                            found = false; // Someone in the column is bigger
                            break;
                        }
                    }

                    if (found) {
                        System.out.println("Saddle Point found at [" + i + "][" + colIndex + "]: " + rowMin);
                    }

                }
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
        int colIndex =0;
        int rowIndex =0;
        int[][] saddleArray = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                saddleArray[i][j] = 0;
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
