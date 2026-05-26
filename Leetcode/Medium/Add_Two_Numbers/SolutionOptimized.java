package Leetcode.Medium.Add_Two_Numbers;

public class SolutionOptimized {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list3 = new ListNode(0);
        ListNode curListNode = list3;
        ListNode l1Curr = l1;
        ListNode l2Curr = l2;
        int carry = 0;

        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        while (l1Curr != null || l2Curr != null) {

            int val1 = (l1Curr != null) ? l1Curr.val : 0;
            int val2 = (l2Curr != null) ? l2Curr.val : 0;

            int sum = val1 + val2 + carry;

            carry = sum / 10;

            curListNode.next = new ListNode(sum % 10);
            curListNode = curListNode.next;

            if (l1Curr != null)
                l1Curr = l1Curr.next;
            if (l2Curr != null)
                l2Curr = l2Curr.next;
        }

        if (carry > 0) {
            curListNode.next = new ListNode(carry);
        }

        return list3.next;

    }
}
