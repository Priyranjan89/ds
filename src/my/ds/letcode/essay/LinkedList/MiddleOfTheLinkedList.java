package my.ds.letcode.essay.LinkedList;

import static my.ds.letcode.essay.LinkedList.MergeTwoSortedLinkedLists.printList;

public class MiddleOfTheLinkedList {

    public static ListNode middleNode(ListNode head) {

        int count = 0;

        ListNode dummy = head;

        while (dummy != null){
            count++;
            dummy = dummy.next;
        }

        ListNode listNode = head;
        for (int i = 1; i < (count/2)+1; i++) {
            listNode = listNode.next;
        }
        return listNode;
    }

    public static void main(String[] args) {
        int[] value = {1,2,3,4,5,6,7};

        ListNode listNode = null;

        for (int i = value.length - 1; i >= 0; i--) {
            listNode = new ListNode(value[i], listNode);
        }
        printList("listNode: ", listNode);
        ListNode result = middleNode(listNode);
        printList("Result Node: ", result);
    }
}
