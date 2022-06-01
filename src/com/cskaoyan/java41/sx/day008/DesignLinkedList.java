package com.cskaoyan.java41.sx.day008;

class MyLinkedList{
    int size;
    LinkedNode head;
    public MyLinkedList(){
        size = 0;
        head = new LinkedNode(0);
    }

    public int get(int index){
        if (index < 0 || index >= size){
            return -1;
        }
        LinkedNode current = head;
        for (int i = 0; i <= index; i++) {
            current = current.next;
        }
        return current.val;
    }
    public void addAthead(int val){
        addAtIndex(0,val);
    }
    public void addAtTail(int val){
        addAtIndex(size,val);
    }
    public void addAtIndex(int index, int val){
        if (index > size){
            return;
        }
        if (index < 0){
            index = 0;
        }
        ++size;
        LinkedNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        LinkedNode current = new LinkedNode(val);
        current.next = pre.next;
        pre.next = current;
    }
    public void deleteAtIndex(int index){
        if (index < 0 || index >= size){
            return;
        }
        //长度减少
        size--;
        LinkedNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }
}
class LinkedNode{
    int val;
    LinkedNode next;

    public LinkedNode() {
    }

    public LinkedNode(int val) {
        this.val = val;
    }

    public LinkedNode(int val, LinkedNode next) {
        this.val = val;
        this.next = next;
    }

}
