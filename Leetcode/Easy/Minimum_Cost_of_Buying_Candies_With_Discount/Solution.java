package Leetcode.Easy.Minimum_Cost_of_Buying_Candies_With_Discount;

public class Solution {
    public int minimumCost(int[] cost) {
        int minimumCost = 0;
        for (int i = 0; i < cost.length; i++) {
            for (int j = i; j < cost.length; j++) {
                if (cost[i] < cost[j]) {
                    int temp = cost[i];
                    cost[i] = cost[j];
                    cost[j] = temp;
                }
            }
            if ((i + 1) % 3 != 0) {
                minimumCost += cost[i];
            }
        }

        return minimumCost;
    }
}
