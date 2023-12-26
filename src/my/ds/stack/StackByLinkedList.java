package my.ds.stack;

import my.ds.linkedlist.mycode.SingleLinkedList;

public class StackByLinkedList {

    SingleLinkedList list;

    public StackByLinkedList() {
        list = new SingleLinkedList();
    }

    public void push(int value){
        if (list.getHead() == null){
            list.createSingleLinkedList(value);
        } else {
            list.insertInLinkedList(value, 0);
        }
    }

    public int pop(){
        int value = -1;
        if (isEmptyStack()){
            System.out.println("Stack underflow error!!");
        } else {
            value = list.getHead().getValue();
            list.deletionOfNode(0);
        }
        return value;
    }

    public int peek(){
        if (!isEmptyStack()){
            return list.getHead().getValue();
        } else {
            System.out.println("The stack is empty!!");
            return -1;
        }
    }

    public void deleteStack() {
        list.setHead(null);
        System.out.println("Single linkedList stack deleted successfully....");
    }

    public boolean isEmptyStack(){
        if (list.getHead() == null)
            return true;
        else
            return false;
    }
}
