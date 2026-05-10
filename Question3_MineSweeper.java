import java.util.Scanner;

public class Question3_MineSweeper {
    /**
     *
     * @return true if "isInsideOfArray", false otherwise
     */
    public static boolean isInsideOfArray(boolean[][] board,int i , int j) {
        boolean flag = i < 0 || j < 0;
        if (flag) {
            return false;
        }
        flag = i > board.length - 1 || j > board[0].length - 1;
        if (flag) {
            return false;
        }
        return true;
    }
    public static int computeCurrentCell(boolean[][] board, int i, int j) {
        if (board.length == 0 || board[0].length == 0) {
            throw new IllegalArgumentException("Board is empty");
        }
        int count = 0;
        // default case
        for (int k = i-1; k <= i+1; k++) {
            for (int l = j-1; l <= j+1; l++) {
                // catching the edge case
                if (isInsideOfArray(board, k, l) ) {
                    if (board[k][l]) {
                        count++;
                    }
                }
            }
        }
        return count;

    }

   public static int[][] generateMinesweeperHints(boolean[][] board){
       if (board.length == 0 || board[0].length == 0) {
           throw new IllegalArgumentException("Board is empty");
       }
       int[][] outputArray = new int[board.length][board[0].length];
       for(int i = 0; i < board.length; i++){
           for(int j = 0; j < board[0].length; j++){
               if(board[i][j] == true){
                   outputArray[i][j] = 1;
               }
               else {
                   outputArray[i][j] = computeCurrentCell(board, i, j);
               }
           }
       }
       return outputArray;

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
