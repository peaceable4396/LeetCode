package com.cskaoyan.java41.sx.day009.listintersection;

/**
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表没有交点，返回 null 。
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = 0;
        int countB = 0;
        ListNode testA = headA;
        while (testA != null) {
            countA++;
            testA = testA.next;
        }
        ListNode testB = headB;
        while (testB != null) {
            countB++;
            testB = testB.next;
        }
        int num = (countA - countB) >= 0 ? (countA - countB) : (countB - countA);
        testA = headA;
        testB = headB;
        if (countA >= countB) {
            while (num-- > 0) {
                testA = testA.next;
            }
        }
        if (countA < countB) {
            while (num-- > 0){
                testB = testB.next;
            }
        }
        ListNode temp = new ListNode(-1);
        while (testA != null){
            if (testA == testB){
                temp.next = testA;
                break;
            }
            testA = testA.next;
            testB = testB.next;
        }
        return temp.next;
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
