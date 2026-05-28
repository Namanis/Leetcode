package Leetcode.Easy.Flip_Square_Submatrix_Vertically;

public class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int[][] flippedSubGrid = new int[k][k];

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                flippedSubGrid[i][j] = grid[x + k - 1 - i][y + j];
            }
        }

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                grid[x + i][y + j] = flippedSubGrid[i][j];
            }
        }

        return grid;
    }
}
