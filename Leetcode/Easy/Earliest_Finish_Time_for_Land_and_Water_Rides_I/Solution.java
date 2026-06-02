package Leetcode.Easy.Earliest_Finish_Time_for_Land_and_Water_Rides_I;

public class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int landTimes = landStartTime.length;
        int waterTimes = waterStartTime.length;
        int smallestL = Integer.MAX_VALUE;
        int smallestW = Integer.MAX_VALUE;
        int bestStaringL = Integer.MAX_VALUE;
        int bestStaringW = Integer.MAX_VALUE;
        for (int i = 0; i < landTimes; i++) {

            if (landStartTime[i] + landDuration[i] < smallestL) {
                smallestL = landStartTime[i] + landDuration[i];
            }
        }
        for (int i = 0; i < waterTimes; i++) {
            int diff = waterStartTime[i] - smallestL;
            if (diff > 0) {
                if (bestStaringL > smallestL + Math.abs(diff) + waterDuration[i]) {
                    bestStaringL = smallestL + Math.abs(diff) + waterDuration[i];
                }
            } else {
                if (bestStaringL > smallestL + waterDuration[i]) {
                    bestStaringL = smallestL + waterDuration[i];
                }
            }
            if (waterStartTime[i] + waterDuration[i] < smallestW) {
                smallestW = waterStartTime[i] + waterDuration[i];
            }
        }

        // for (int i = 0; i < waterTimes; i++) {

        //     if (waterStartTime[i] + waterDuration[i] < smallestW) {
        //         smallestW = waterStartTime[i] + waterDuration[i];
        //     }
        // }
        for (int i = 0; i < landTimes; i++) {
            int diff = landStartTime[i] - smallestW;
            if (diff > 0) {
                if (bestStaringW > smallestW + Math.abs(diff) + landDuration[i]) {
                    bestStaringW = smallestW + Math.abs(diff) + landDuration[i];
                }
            } else {
                if (bestStaringW > smallestW + landDuration[i]) {
                    bestStaringW = smallestW + landDuration[i];
                }
            }

        }

        return Math.min(bestStaringL, bestStaringW);
    }
}
