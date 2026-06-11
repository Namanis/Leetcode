package Leetcode.Medium.Sort_Colors;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = { 2,1,0};

        solution.sortColors(nums);

        System.out.println(Arrays.toString(nums));
    }
}
