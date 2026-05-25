package Leetcode.Easy.Longest_Common_Prefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {

        int min = strs[0].length();
        String result = "";

        for (int i = 0; i < strs.length; i++) {
            if (strs.length == 1) {
                return strs[i];
            }
            min = Math.min(min, strs[i].length());
        }

        for (int i = 0; i < min; i++) {
            int index = 0;
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) == strs[j + 1].charAt(i)) {
                    index++;
                } else {
                    return result;
                }
            }
            result += String.valueOf(strs[index].charAt(i));
        }
        return (result);
    }
}
