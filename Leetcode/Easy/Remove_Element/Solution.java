package Leetcode.Easy.Remove_Element;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int[] res = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                res[count] = nums[i];
                count++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(count>i){
               nums[i]=res[i]; 
            }
            else{
                nums[i]=0;
            }
             
        }

        return count;
    }
}
