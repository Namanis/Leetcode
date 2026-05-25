
package Leetcode.arrays.Two_Sum;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution_HashMap solution = new Solution_HashMap();

        int[] result = solution.twoSum(
                new int[]{3, 2, 3},
                6
        );

        System.out.println(Arrays.toString(result));
    }
}
