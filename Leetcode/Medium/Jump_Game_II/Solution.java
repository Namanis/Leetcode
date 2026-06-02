package Leetcode.Medium.Jump_Game_II;

public class Solution {
    public int jump(int[] nums) {
        int goal = nums.length - 1;
        int result = 0;

        while (goal > 0) {
            for (int j = 0; j < goal; j++) {
                if (j + nums[j] >= goal) {
                    goal = j;
                    break;
                }
            }
            result++;
        }

        return result;
    }
}
