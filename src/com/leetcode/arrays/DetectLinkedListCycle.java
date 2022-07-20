package com.leetcode.arrays;

public class DetectLinkedListCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(slow != null && fast !=null && fast.next !=null ){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) break;
        }

        if(fast == null || fast.next == null) return null;

        fast = head;
        while(fast != slow){
            fast = fast.next;s
            slow = slow.next;
        }
        return fast;
    }
}
