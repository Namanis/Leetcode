package Leetcode.Medium.Top_K_Frequent_Elements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> res = new HashMap<>();
        int[] result = new int[k];

        for (int i = 0; i < nums.length; i++) {
            if (!res.containsKey(nums[i])) {
                res.put(nums[i], 1);
            } else {
                res.put(nums[i], res.get(nums[i]) + 1);
            }
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (Map.Entry<Integer, Integer> entry : res.entrySet()) {
            heap.offer(new int[] { entry.getValue(), entry.getKey() });
            if (heap.size() > k) {
                heap.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            result[i] = heap.poll()[1];
        }
        // List<Map.Entry<Integer, Integer>> sorted = new ArrayList<>(res.entrySet());

        // sorted.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        // for (int i = 0; i < k; i++) {
        // result[i] = sorted.get(i).getKey();
        // }
        return result;
    }

}
