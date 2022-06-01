package com.cskaoyan.java41.sx.day009;

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 * 进阶：你能尝试使用一趟扫描实现吗？
 */
public class DelNodes {
    public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummyNode = new ListNode(-1);
            dummyNode.next = head;
            ListNode fastNode = dummyNode;
            ListNode slowNode = dummyNode;
            for (int i = 0; i < n; i++) {
                fastNode = fastNode.next;
            }
            ListNode pre = null;
            while (fastNode != null){
                pre = slowNode;
                slowNode = slowNode.next;
                fastNode = fastNode.next;
            }

            pre.next = slowNode.next;
            //这里不返回head是因为如果只有一个节点 将在pre.next = slowNode.next时改变dummyNode.next指向null
            return dummyNode.next;
        }
    }
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}