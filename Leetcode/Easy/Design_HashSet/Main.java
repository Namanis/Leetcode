package Leetcode.Easy.Design_HashSet;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        //int result = solution.majorityElement(new int[] { 5, 5, 1, 1, 1, 5, 5 });

        //System.out.println(result);

        Solution.MyHashSet obj = new Solution.MyHashSet();

        System.err.println(obj);
        obj.add(1);
        //obj.remove(1);
        boolean param_3 = obj.contains(1);

        System.out.println(param_3);
    }
}
