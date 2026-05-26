package Leetcode.Medium.Add_Two_Numbers;

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

        ListNode list1 = createList(new int[] { 3, 7 });
        ListNode list2 = createList(new int[] { 9, 2 });

        ListNode result = solution.addTwoNumbers(list1, list2);

        ListNode temp = result;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
