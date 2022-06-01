package com.cskaoyan.java41.sx.day008;

/**
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 */



public class SwapLinkedListNodes {
    public ListNode swapPairs(ListNode head) {
        ListNode cur = new ListNode(0);
        cur.next = head;
        ListNode temp = cur;
        while(temp.next != null && temp.next.next != null){
            ListNode pre = head.next.next;
            temp.next = head.next;
            head.next.next = head;
            head.next = pre;
            temp = head;
            head = head.next;
        }
        return cur.next;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }