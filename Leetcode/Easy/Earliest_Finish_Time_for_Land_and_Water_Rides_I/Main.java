package Leetcode.Easy.Earliest_Finish_Time_for_Land_and_Water_Rides_I;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int result = solution.earliestFinishTime(
                new int[] { 85, 19, 36 },
                new int[] { 52, 5, 47 },
                new int[] { 76 },
                new int[] { 86 });

        System.out.println((result));
    }
}
