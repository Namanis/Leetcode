package Leetcode.Easy.Merge_Two_Sorted_Lists;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode(0);
        ListNode curListNode = list3;
        ListNode list1Curr = list1;
        ListNode list2Curr = list2;

        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        while (list1Curr != null && list2Curr != null) {

            if (list1Curr.val <= list2Curr.val) {
                curListNode.next = list1Curr;
                curListNode = curListNode.next;
                list1Curr = list1Curr.next;
            } else {
                curListNode.next = list2Curr;
                curListNode = curListNode.next;
                list2Curr = list2Curr.next;
            }
        }

        curListNode.next = (list1Curr != null) ? list1Curr : list2Curr;

        return list3.next;

    }
}
