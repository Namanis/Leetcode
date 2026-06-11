package Leetcode.Medium.Group_Anagrams;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        List<List<String>> result = solution
                .groupAnagrams(new String[] { "act", "pots", "tops", "cat", "stop", "hat" });

        System.out.println(result);
    }
}
