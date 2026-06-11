package Leetcode.Easy.Longest_Common_Prefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // HashSet<Character> prefixHashSet = new HashSet<>();

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            char[] nextChar = strs[i].toCharArray();

            if(strs[i].isEmpty()) return "";

            for (int j = 0; j < Math.min(prefix.length(), strs[i].length()); j++) {
                if (prefix.charAt(j) != nextChar[j]) {
                    prefix = prefix.substring(0, j);
                    if (prefix.isEmpty())
                        return "";
                    break;
                }else{
                    if(j == Math.min(prefix.length(), strs[i].length())-1){
                        prefix = prefix.substring(0, j+1);
                    }
                }
            }
        }

        return prefix;
    }
}
