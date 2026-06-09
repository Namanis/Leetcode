package Leetcode.Medium.Top_K_Frequent_Elements;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] result = solution.topKFrequent(new int[] { 1, 1, 1, 2, 2,4,4,4,4, 3 }, 2);

        
        System.out.println(Arrays.toString(result));
    }

}
