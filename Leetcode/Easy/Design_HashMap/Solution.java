package Leetcode.Easy.Design_HashMap;

import java.util.Arrays;

public class Solution {
    static class MyHashSet {
        private int[] data;
        private static final int emptyMarker = -1;

        public MyHashSet() {
            data = new int[1000001];
            Arrays.fill(data, emptyMarker);
        }

        public void put(int key, int value) {
            data[key] = value;
        }

        public int get(int key) {
            return data[key];
        }

        public void remove(int key) {
            data[key] = emptyMarker;
        }

    }

}
