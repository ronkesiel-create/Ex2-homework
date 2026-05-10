import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question3_MineSweeperTest {

    @Test
    void isInsideOfArray() {
    }

    @Test
    void computeCurrentCell() {
    }

    @Test
    void generateMinesweeperHints1() {
        boolean[][] board =
                {{true, true, true, true},
                 {true, false, true, true},
                 {true, true, true, true},
                 {true, true, true, true},};
        int[][] hint = Question3_MineSweeper.generateMinesweeperHints(board);
        for (int i = 0; i < hint.length; i++) {
            for (int j = 0; j < hint[i].length; j++) {
                System.out.print(hint[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    @Test
    void generateMinesweeperHints2() {
        boolean[][] board =
                {{true, true, true, true},
                        {true, false, false, true},
                        {true, true, true, true},
                        {true, true, true, true},};
        int[][] hint = Question3_MineSweeper.generateMinesweeperHints(board);
        for (int i = 0; i < hint.length; i++) {
            for (int j = 0; j < hint[i].length; j++) {
                System.out.print(hint[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    @Test
    void generateMinesweeperHints3() {
        boolean[][] board =
                        {{false, true, true, true},
                        {true, false, false, false},
                        {true, false, false, true},
                        {true, false, true, true},};
        int[][] hint = Question3_MineSweeper.generateMinesweeperHints(board);
        for (int i = 0; i < hint.length; i++) {
            for (int j = 0; j < hint[i].length; j++) {
                System.out.print(hint[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    @Test
    void generateMinesweeperHintsEdge() {
        boolean[][] board =
                        {{false, true, true, false},
                        {true, false, false, false},
                        {true, false, false, true},
                        {false, false, true, false},};
        int[][] hint = Question3_MineSweeper.generateMinesweeperHints(board);
        for (int i = 0; i < hint.length; i++) {
            for (int j = 0; j < hint[i].length; j++) {
                System.out.print(hint[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}