package Leetcode.Medium.Product_of_Array_Except_Self;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] result = solution.productExceptSelf(new int[] { 1,2,3,4});

        
        System.out.println(Arrays.toString(result));
    }
}
