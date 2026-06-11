package Leetcode.Easy.Range_Sum_Query_Immutable;

import java.util.Arrays;

public class NumArray {
    //private int[] nums;
    private int[] prefixes;

    public NumArray(int[] nums) {
        //this.nums = nums;
        prefixes = new int[nums.length + 1];
        int prefix = 0;

        for (int i = 1; i < nums.length + 1; i++) {
            prefix += nums[i - 1];
            prefixes[i] += prefix;
        }

    }

    public int sumRange(int left, int right) {
        //System.out.println(Arrays.toString(prefixes));
        int res = prefixes[right+1] - prefixes[left];

        return res;
    }

}
