package Leetcode.Medium.Sort_an_Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] result = solution.sortArray(new int[]{10,9,1,1,1,2,3,1});

        System.out.println(Arrays.toString(result));
    }
}
