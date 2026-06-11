package Leetcode.Medium.Group_Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> resMap = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            System.out.println(sorted);

            resMap.putIfAbsent(sorted, new ArrayList<>());
            resMap.get(sorted).add(str);
        }
        System.out.println(resMap.values());
        return new ArrayList<>(resMap.values());
    }

}
