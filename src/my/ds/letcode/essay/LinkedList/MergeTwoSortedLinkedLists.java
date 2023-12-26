package my.ds.letcode.essay.LinkedList;

public class MergeTwoSortedLinkedLists {

    public static void printList(String msg, ListNode head) {

        System.out.print(msg);
        ListNode ptr = head;

        while (ptr != null) {
            System.out.print(ptr.val + " -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
        System.out.println();
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode tempNode = new ListNode(0);
        ListNode tail = tempNode;

        while (true) {
            if (list1 == null) {
                tail.next = list2;
                break;
            } else if (list2 == null) {
                tail.next = list1;
                break;
            }

            if (list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        return tempNode.next;
    }

    public static void main(String[] args) {
        int[] keys1 = {1, 2, 4};
        int[] keys2 = {1, 3, 4};

        ListNode listNode1 = null;
        ListNode listNode2 = null;

        for (int i = keys1.length - 1; i >= 0; i--) {
            listNode1 = new ListNode(keys1[i], listNode1);
        }

        for (int i = keys1.length - 1; i >= 0; i--) {
            listNode2 = new ListNode(keys2[i], listNode2);
        }

        printList("First listNode: ", listNode1);
        printList("Second listNode: ", listNode2);

        ListNode maergeList = mergeTwoLists(listNode1, listNode2);
        printList("After merge: ", maergeList);
    }
}
