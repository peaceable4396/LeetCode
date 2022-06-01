package com.cskaoyan.java41.sx.day008;

import java.awt.*;

public class RemovesLinkedListElement {
    public static void main(String[] args) {

    }
    public LinkNode removeElements(LinkNode head, int val){
        LinkNode realHead = new LinkNode(-1, head);
        LinkNode pre = realHead;
        LinkNode current = head;
        while(current != null){
            if (current.val == val){
                pre.next = current.next;
            }else {
                pre = pre.next;
            }
            current = current.next;
        }
        // return head;
        return realHead.next;
    }
}
class LinkNode{
    int val;
    LinkNode next;

    public LinkNode() {
    }

    public LinkNode(int val, LinkNode next) {
        this.val = val;
        this.next = next;
    }
}