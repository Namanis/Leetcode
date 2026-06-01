package Leetcode.Medium.Divide_Two_Integers;

public class Solution {
    public int divide(int dividend, int divisor) {
        int result = 0;

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        if (dividend == Integer.MAX_VALUE && divisor == -1)
            return Integer.MIN_VALUE+1;

        if (dividend == 0)
            return 0;

        if (dividend > 0) {
            if (divisor > 0) {
                if (dividend < divisor) {
                    return 0;
                }
                if (dividend - divisor < 0) {
                    return -1;
                }
                while (dividend - divisor >= 0) {
                    dividend -= divisor;
                    result++;
                }
                return result;
            } else {
                if(dividend + divisor == 0){
                    return -1;
                }
                
                if (dividend + divisor <= 0) {
                    return 0;
                }
                while (dividend + divisor >= 0) {
                    dividend += divisor;
                    result--;
                }
                return result;
            }

        }

        if (dividend < 0) {
            if (divisor > 0) {
                if (dividend + divisor > 0) {
                    return 0;
                }
                if (dividend + divisor == 0) {
                    return -1;
                }
                while (dividend + divisor <= 0) {
                    dividend += divisor;
                    result--;
                }

                return result;
            } else {
                if (dividend == divisor) {
                    return 1;
                }
                if (dividend > divisor) {
                    return 0;
                }
                if (dividend - divisor > 0) {
                    return 1;
                }
                // if (dividend + divisor < 0) {
                //     return -1;
                // }
                while (dividend - divisor <= 0) {
                    dividend -= divisor;
                    result++;
                }
                return result;
            }

        }

        return result;
    }

}
