package Leetcode.Easy.Palindrome;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        Solution_NoStrings solution_NoStrings = new Solution_NoStrings();

        Boolean result = solution.isPalindrome(998765432);
        Boolean result_Nostrings = solution_NoStrings.isPalindromeNostring(121);

        System.out.println(result);
        System.out.println(result_Nostrings);
    }
    
}
