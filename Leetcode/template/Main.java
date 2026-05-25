package Leetcode.template;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = s.twoSum(nums, target);
        System.out.println(java.util.Arrays.toString(res));
    }
}
