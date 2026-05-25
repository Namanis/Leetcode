package Leetcode.Easy.Palindrome;

public class Solution_NoStrings {
    public boolean isPalindromeNostring(int x) {
        if (x < 0) {
            return(false);
        }

        int reversed=0;
        int temp = x;
        int num;

        while (temp > 0) {
            num = temp % 10;
            temp = (temp-num)/10;


            reversed = reversed*10 + num; 
        }

        return(reversed == x);
    }
}
