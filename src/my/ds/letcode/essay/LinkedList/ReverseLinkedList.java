package my.ds.letcode.essay.LinkedList;

import static my.ds.letcode.essay.LinkedList.MergeTwoSortedLinkedLists.printList;

public class ReverseLinkedList {


    public static ListNode reverseList(ListNode head) {

        ListNode listNode = null;
        while (head != null){
            listNode = new ListNode(head.val, listNode);
            head = head.next;
        }
        return listNode;
    }

    public static void main(String[] args) {
        int[] value = {1, 2, 3, 4, 5, 6, 7};

        ListNode listNode = null;

        for (int i = value.length - 1; i >= 0; i--) {
            listNode = new ListNode(value[i], listNode);
        }
        printList("listNode: ", listNode);
        ListNode result = reverseList(listNode);
        printList("Reverse Node: ", result);
    }
}
