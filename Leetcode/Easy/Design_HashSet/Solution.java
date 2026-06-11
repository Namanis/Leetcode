package Leetcode.Easy.Design_HashSet;

public class Solution {
    static class MyHashSet {
        private boolean[] data;

        public MyHashSet() {
            data = new boolean[1000001]; // support keys 0...1,000,000
        }

        public void add(int key) {
            data[key] = true;
        }

        public void remove(int key) {
            data[key] = false;
        }

        public boolean contains(int key) {
            return data[key];
        }
    }

}
