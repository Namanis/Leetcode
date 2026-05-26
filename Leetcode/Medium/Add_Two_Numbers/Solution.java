package Leetcode.Medium.Add_Two_Numbers;

public class Solution {
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

        while (l1Curr != null && l2Curr != null) {

            if (l1Curr.val + l2Curr.val + carry >= 10) {
                // System.out.println(l1Curr.val);
                // System.out.println(l2Curr.val);
                if (carry == 1) {
                    curListNode.next = new ListNode((l1Curr.val + l2Curr.val + carry) % 10);
                } else {
                    curListNode.next = new ListNode((l1Curr.val + l2Curr.val) % 10);
                }

                curListNode = curListNode.next;
                carry = 1;
                System.out.println(curListNode);
                l1Curr = l1Curr.next;
                l2Curr = l2Curr.next;
            } else {
                curListNode.next = new ListNode((l1Curr.val + l2Curr.val + carry));
                curListNode = curListNode.next;
                System.out.println(curListNode);
                l1Curr = l1Curr.next;
                l2Curr = l2Curr.next;
                carry = 0;
            }
        }
        if (carry != 1) {
            curListNode.next = (l1Curr != null) ? l1Curr : l2Curr;
        } else {
            if (l1Curr != null) {
                while (l1Curr != null) {
                    if (l1Curr.val + carry == 10) {
                        curListNode.next = new ListNode((l1Curr.val + carry) % 10);
                        curListNode = curListNode.next;
                        carry = 1;
                        l1Curr = l1Curr.next;
                    } else {
                        curListNode.next = new ListNode((l1Curr.val + carry));
                        curListNode = curListNode.next;
                        l1Curr = l1Curr.next;
                        carry = 0;
                    }
                }
                if (carry == 1) {
                    curListNode.next = new ListNode(carry);
                    curListNode = curListNode.next;
                }
            } else {
                while (l2Curr != null) {
                    if (l2Curr.val + carry == 10) {
                        curListNode.next = new ListNode((l2Curr.val + carry) % 10);
                        curListNode = curListNode.next;
                        carry = 1;
                        l2Curr = l2Curr.next;
                    } else {
                        curListNode.next = new ListNode((l2Curr.val + carry));
                        curListNode = curListNode.next;
                        l2Curr = l2Curr.next;
                        carry = 0;
                    }
                }
                if (carry == 1) {
                    curListNode.next = new ListNode(carry);
                    curListNode = curListNode.next;
                }

            }

        }

        return list3.next;

    }
}
