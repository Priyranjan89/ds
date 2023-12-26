package my.ds.letcode.essay.LinkedList;

import static my.ds.letcode.essay.LinkedList.MergeTwoSortedLinkedLists.printList;

public class DeleteNodeInLinkedList {

    public static void deleteNode(ListNode node) {
        if(node == null) return;
        node.val=node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        int[] value = {1,2,3,4,5,6,7};

        ListNode listNode = null;

        for (int i = value.length - 1; i >= 0; i--) {
            listNode = new ListNode(value[i], listNode);
        }
        printList("Before delete the node: ", listNode);
        deleteNode(listNode);
        printList("After delete the node: ", listNode);

    }
}
