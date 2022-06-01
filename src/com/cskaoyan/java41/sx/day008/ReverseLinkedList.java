package com.cskaoyan.java41.sx.day008;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }
    public LinkedList reverseList(LinkedList head){
            LinkedList pre = null;
            LinkedList cur = head;
            LinkedList temp = null;
        while (cur != null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
class LinkedList{
    int val;
    LinkedList next;

    public LinkedList() {
    }

    public LinkedList(int val) {
        this.val = val;
    }

    public LinkedList(int val, LinkedList next) {
        this.val = val;
        this.next = next;
    }
}
