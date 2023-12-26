package my.ds.letcode.essay.LinkedList;

import static my.ds.letcode.essay.LinkedList.MergeTwoSortedLinkedLists.printList;

public class ConvertBinaryNumberInLinkedListToInteger {

    public static int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();

        if (head == null) {
            return 0;
        }

        while (head != null) {
            int value = head.val;
            sb.append(value);
            head = head.next;
        }

        int result = Integer.parseInt(sb.toString(), 2);

        return result;
    }

    public static void main(String[] args) {
        int[] value = {1, 0, 1};

        ListNode listNode = null;

        for (int i = value.length - 1; i >= 0; i--) {
            listNode = new ListNode(value[i], listNode);
        }
        printList("listNode: ", listNode);
        System.out.println(getDecimalValue(listNode));

    }
}
