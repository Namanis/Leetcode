package Leetcode.Medium.Range_Sum_Query_2D_Immutable;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                { 3, 0, 1, 4, 2 },
                { 5, 6, 3, 2, 1 },
                { 1, 2, 0, 1, 5 },
                { 4, 1, 0, 1, 7 },
                { 1, 0, 3, 0, 5 }
        };

        int[][] queries = {
                { 2, 1, 4, 3 },
                { 1, 1, 2, 2 },
                { 1, 2, 2, 4 }
        };

        NumMatrix obj = new NumMatrix(matrix);

        for (int[] q : queries) {
            System.out.println(obj.sumRegion(q[0], q[1], q[2], q[3]));
        }

        //System.out.println(result);
    }

}
