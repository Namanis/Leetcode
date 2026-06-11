package Leetcode.Easy.Range_Sum_Query_Immutable;

public class Main {
    public static void main(String[] args) {

        int[] nums = new int[] { -2, 0, 3, -5, 2, -1 };

        int[][] leftRight = {
                { 0, 2 },
                { 2, 5 },
                { 0, 5 }
        };

        NumArray obj = new NumArray(nums);

        for (int[] index : leftRight) {
            System.out.println(obj.sumRange(index[0], index[1]));
        }

    }
}
