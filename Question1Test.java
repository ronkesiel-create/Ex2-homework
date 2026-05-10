import static org.junit.jupiter.api.Assertions.*;

class Question1Test {

    @org.junit.jupiter.api.Test
    void findMax() {
    }

    @org.junit.jupiter.api.Test
    void findMin() {
    }

    @org.junit.jupiter.api.Test
    void findSaddlePoints1() {
        int[][] array = {{9,7,11,5,8},{5,10,6,1,3},{4,7,6,2,1},{8,3,10,3,3},{13,9,7,1,6}};
        Question1.findSaddlePoints(array);
    }
    @org.junit.jupiter.api.Test
    void findSaddlePoints2() {
        int[][] array = {{9,7,11,5},{5,10,6,1},{4,7,6,2},{8,3,10,3},{13,9,7,1}};
        Question1.findSaddlePoints(array);
    }
    @org.junit.jupiter.api.Test
    void findSaddlePoints3() {
        int[][] array = {{6,5,3},{4,1,2}};
        Question1.findSaddlePoints(array);
    }
    @org.junit.jupiter.api.Test
    void findSaddlePoints4() {
        int[][] array = {{6},{4}};
        Question1.findSaddlePoints(array);
    }
    @org.junit.jupiter.api.Test
    void findSaddlePoints5() {
        int[][] array = new int [3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 5;
            }
        }
        Question1.findSaddlePoints(array);
    }
}
