import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ArrayUtilsTest {

    @Test
    void maxAdjacentProductNormalScenario1() {

        int[] testArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int maxProduct = ArrayUtils.maxAdjacentProduct(testArray);
        assertEquals(72, maxProduct);
    }
    @Test
    void maxAdjacentProductNormalScenario2() {

        int[] testArray = new int[]{9,8,7,6,5,4,3,2,1};
        int maxProduct = ArrayUtils.maxAdjacentProduct(testArray);
        assertEquals(72, maxProduct);
    }
    @Test
    void maxAdjacentProductNormalScenario3() {

        int[] testArray = new int[]{10,8,7,6,12,4,3,2,1};
        int maxProduct = ArrayUtils.maxAdjacentProduct(testArray);
        assertEquals(80, maxProduct);
    }

    @Test
    void maxAdjacentProductNormalScenario4() {

        int[] testArray = new int[]{10,88,7,6,162,4,3,2,1000};
        int maxProduct = ArrayUtils.maxAdjacentProduct(testArray);
        assertEquals(2000, maxProduct);
    }
    @Test
    void maxAdjacentProductExceptionScenario1() {
        int[] testArray = null;
        assertThrows(IllegalArgumentException.class, () -> { ArrayUtils.maxAdjacentProduct(testArray);} );
    }
    @Test
    void maxAdjacentProductExceptionScenario2() {

        int[] testArray = new int[]{};
        assertThrows(IllegalArgumentException.class, () -> { ArrayUtils.maxAdjacentProduct(testArray);} );
    }

    @Test
    void maxAdjacentProductExceptionScenario3() {
        int[] testArray = new int[]{9};
        assertThrows(IllegalArgumentException.class, () -> { ArrayUtils.maxAdjacentProduct(testArray);} );
    }
    @Test
    void maxAdjacentProductNegativeNumbersScenario1() {
        int[] testArray = new int[]{-10,-2,-3,-4,-5};
        int maxProduct = ArrayUtils.maxAdjacentProduct(testArray);
        assertEquals(20, maxProduct);
    }
    @Test
    void maxAdjacentProductNegativeNumbersScenario2() {
        int[] testArray = new int[]{-10,-2,-9,-4,-5};
        int maxProduct = ArrayUtils.maxAdjacentProduct(testArray);
        assertEquals(36, maxProduct);
    }
    @Test
    void maxAdjacentProductNegativeNumbersScenario3() {
        int[] testArray = new int[]{-1,-2,-9,-1,-7};
        int maxProduct = ArrayUtils.maxAdjacentProduct(testArray);
        assertEquals(18, maxProduct);
    }
    @Test
    void maxAdjacentProductNegativeNumbersWithZeroScenario1() {
        int[] testArray = new int[]{0,-2,0,-4,-5};
        int maxProduct = ArrayUtils.maxAdjacentProduct(testArray);
        assertEquals(20, maxProduct);
    }
    @Test
    void maxAdjacentProductNegativeNumbersWithZeroScenario2() {
        int[] testArray = new int[]{0,0,-20,0,0};
        int maxProduct = ArrayUtils.maxAdjacentProduct(testArray);
        assertEquals(0, maxProduct);
    }
    @Test
    void maxAdjacentProductNegativeNumbersWithZeroScenario3() {
        int[] testArray = new int[]{-20,0,0,0,-17};
        int maxProduct = ArrayUtils.maxAdjacentProduct(testArray);
        assertEquals(0, maxProduct);
    }
    @Test
    void maxAdjacentProductOnlyTwoNumbersScenario1() {
        int[] testArray = new int[]{-20,-10};
        int maxProduct = ArrayUtils.maxAdjacentProduct(testArray);
        assertEquals(200, maxProduct);
    }
    @Test
    void maxAdjacentProductOnlyTwoNumbersScenario2() {
        int[] testArray = new int[]{20,10};
        int maxProduct = ArrayUtils.maxAdjacentProduct(testArray);
        assertEquals(200, maxProduct);
    }
    @Test
    void maxAdjacentProductOnlyTwoNumbersScenario3() {
        int[] testArray = new int[]{20,0};
        int maxProduct = ArrayUtils.maxAdjacentProduct(testArray);
        assertEquals(0, maxProduct);
    }
    @Test
    void maxAdjacentProductOnlyTwoNumbersScenario4() {
        int[] testArray = new int[]{0,0};
        int maxProduct = ArrayUtils.maxAdjacentProduct(testArray);
        assertEquals(0, maxProduct);
    }
}
