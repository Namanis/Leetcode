
package Leetcode.arrays.Two_Sum;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] result = solution.twoSum(
                new int[]{3, 2, 4},
                6
        );

        System.out.println(Arrays.toString(result));
    }
}
