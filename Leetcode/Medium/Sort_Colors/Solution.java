package Leetcode.Medium.Sort_Colors;

import java.util.Arrays;

public class Solution {
    public void sortColors(int[] nums) {
        int[] arr = new int[3];

        for (int i = 0; i < nums.length; i++) {
            switch (nums[i]) {
                case 0:
                    arr[0]++;
                    break;
                case 1:
                    arr[1]++;
                    break;
                case 2:
                    arr[2]++;
                    break;
            }
        }

        for (int i = 0; i < arr[0]; i++) {
            nums[i] = 0;
        }
        for (int i = arr[0]; i < arr[0] + arr[1]; i++) {
            nums[i] = 1;
        }
        for (int i = arr[0] + arr[1]; i < arr[0] + arr[1] + arr[2]; i++) {
            nums[i] = 2;
        }

    }
}
