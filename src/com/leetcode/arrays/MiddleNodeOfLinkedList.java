package com.leetcode.arrays;

import java.util.HashMap;

public class MiddleNodeOfLinkedList {
    public ListNode middleNode(ListNode head) {
        if(head.next==null)
        {
            return head;
        }

        int i=0;
        HashMap<Integer, ListNode> map = new HashMap<>();
        map.put(i++, head);
        while(head.next!=null)
        {
            head = head.next;
            map.put(i++, head);
        }

        int mid = i/2;
        return map.get(mid);
    }
}
