
    public class ArrayUtils {
        public static int maxAdjacentProduct(int[] numbers) {
            if (numbers == null || numbers.length < 2) {
                throw new IllegalArgumentException("Array must contain at least two elements");
            }
            int maxProduct = Integer.MIN_VALUE;
            for (int i = 0; i < numbers.length - 1; i++) {
                int product = numbers[i] * numbers[i + 1];
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
            return maxProduct;
        }
}
