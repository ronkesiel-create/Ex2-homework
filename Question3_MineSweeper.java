import java.util.Scanner;

public class Question3_MineSweeper {
    public static int[][] generateMinesweeperHints(boolean[][] board){

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns");
        int cols = input.nextInt();
       boolean[][] matrix = new boolean[rows][cols];
       for (int i = 0; i < matrix.length; i++){
           for (int j = 0; j < matrix[i].length; j++){
               System.out.println();
           }
       }
       input.close();
    }
}
