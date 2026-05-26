package Leetcode.Easy.Merge_Two_Sorted_Lists;

public class Main {

    static ListNode createList(int[] arr) {
        ListNode dummyListNode = new ListNode(0);
        ListNode curListNode = dummyListNode;

        for (int num : arr) {
            curListNode.next = new ListNode(num);
            curListNode = curListNode.next;
        }

        return dummyListNode.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode list1 = createList(new int[] { 1, 2, 4 });
        ListNode list2 = createList(new int[] { 1, 3, 4 });

        ListNode result = solution.mergeTwoLists(list1, list2);

        ListNode temp = result;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
