package Leetcode.Easy.Flip_Square_Submatrix_Vertically;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] grid = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };


        int[][] result = solution.reverseSubmatrix(grid, 1, 0, 3);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }

        System.out.println(Arrays.deepToString(result));
    }
}