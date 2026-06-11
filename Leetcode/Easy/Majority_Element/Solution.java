package Leetcode.Easy.Majority_Element;

import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> res = new HashMap<>();
        int maxCount = 0;
        int result = 0;

        for(int i = 0; i<nums.length; i++){
            res.put(nums[i], res.getOrDefault(nums[i], 0) + 1);
            
            if (res.get(nums[i]) > maxCount){
                maxCount = res.get(nums[i]);
                result = nums[i];
            }
        }

        // System.out.println(res);

        return result;
    }
}
