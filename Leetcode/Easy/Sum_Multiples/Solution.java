package Leetcode.Easy.Sum_Multiples;

public class Solution {
    public int sumOfMultiples(int n) {
        //int[] intRange = new int[n];
        int result = 0;
        for (int i = 1; i <= n; i++) {
            //intRange[i] = i;
            if ((i % 3 == 0) || (i % 5 == 0) || (i % 7 == 0)) {
                result += i;
            }
        }

        return result;
    }

}
