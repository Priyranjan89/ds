package my.ds.linkedlist.mycode;

import my.ds.linkedlist.mynode.DoubleNode;

public class DoubleLinkedList {

    DoubleNode head;
    DoubleNode tail;
    int size;//denotes size of list

    public DoubleNode createDoubleLinkedList(int nodeValue){
        head = new DoubleNode();
        DoubleNode node = new DoubleNode();
        node.setValue(nodeValue);
        node.setNext(null);
        node.setPrev(null);
        head = node;
        tail = node;
        size = 1;

        return head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
