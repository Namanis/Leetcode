package Leetcode.Medium.Encode_and_Decode_Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String encode(List<String> strs) {
        String encodedString = new String();

        for (String str : strs) {
            int lengthOfString = str.length();
            System.out.println(lengthOfString);

            encodedString += lengthOfString + "#";
            encodedString += str;
        }

        return encodedString;
    }

    public List<String> decode(String str) {
        List<String> decodedStrings = new ArrayList<String>();

        char[] strChar = str.toCharArray();
        int numberOfStrings = 0;
        for (int i = 0; i < str.length(); i++) {
            String strLength = new String();
            while (strChar[i] != '#') {
                strLength += strChar[i];
                i++;
            }
            
            int foo;

            try {
                foo = Integer.parseInt(strLength);
            } catch (NumberFormatException e) {
                foo = 0;
            }

            decodedStrings.add("");

            StringBuilder current = new StringBuilder();

            while (foo > 0) {
                i++;
                current.append(strChar[i]);
                foo--;
            }
            decodedStrings.set(numberOfStrings, current.toString());
            numberOfStrings++;

        }

        return decodedStrings;

    }
}
