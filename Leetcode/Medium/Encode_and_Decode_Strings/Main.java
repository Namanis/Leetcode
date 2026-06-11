package Leetcode.Medium.Encode_and_Decode_Strings;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String encoded_string = solution.encode(Arrays.asList("we","say",":","yes","!@#$%^&*()"));

        System.out.println(encoded_string);

        // Machine 1 ---encoded_string---> Machine 2

        List<String> decoded_strs = solution.decode(encoded_string);

        System.out.println(decoded_strs);
    }
}
