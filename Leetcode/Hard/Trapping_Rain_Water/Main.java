package Leetcode.Hard.Trapping_Rain_Water;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int result = solution.trap(new int[] {0,1,2,1,2,3,0,3});

        System.out.println(result);
    }
}
