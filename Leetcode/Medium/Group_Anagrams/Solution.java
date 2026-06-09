package Leetcode.Medium.Group_Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> result = new HashMap<>();
        for (String s : strs) {
            char[] charrArray = s.toCharArray();
            Arrays.sort(charrArray);
            String sortedS = new String(charrArray);
            result.putIfAbsent(sortedS, new ArrayList<>());
            result.get(sortedS).add(s);
        }

        return new ArrayList<>(result.values());
    }

}
