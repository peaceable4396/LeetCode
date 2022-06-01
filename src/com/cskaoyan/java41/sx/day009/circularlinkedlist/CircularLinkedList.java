package com.cskaoyan.java41.sx.day009.circularlinkedlist;

/**
 * 题意： 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 *
 * 为了表示给定链表中的环，使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * 说明：不允许修改给定的链表。
 */


public class CircularLinkedList {
    public ListNode detectCycle(ListNode head) {
        ListNode cur = new ListNode(-1);
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            //初始条件slow==fast 先跑起来再判断
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode point1 = head;
                ListNode point2 = slow;
                while (point1 != point2) {
                    point1 = point1.next;
                    point2 = point2.next;
                }
                return point1;
            }
        }
        return null;
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
