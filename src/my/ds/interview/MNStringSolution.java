package my.ds.interview;

import java.util.PriorityQueue;

public class MNStringSolution {

    public static void main(String[] args) {
        int result = findPossibleSmallestNumberMatchingPattern("MNM");
        System.out.println(result);
    }

    static int findPossibleSmallestNumberMatchingPattern(String pattern) {
        if (validatePattern(pattern))
            return -1;
        return Integer.parseInt(processString(pattern));

    }

    static boolean validatePattern(String pattern) {
        return (pattern.equals("") || pattern == "" || pattern == " " || pattern == null
                || getMNCount(pattern) != pattern.length());
    }

    static int getMNCount(String pattern) {
        int mCount = 0, nCount = 0;
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == 'M') {
                mCount++;
            }
            if (pattern.charAt(i) == 'N') {
                nCount++;
            }
        }
        return nCount + mCount;
    }

    static String processString(String input) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        String result = "";
        int len = input.length();
        for (int k = 1; k <= len + 1; k++)
            heap.add(k);
        int mCount = 0;
        int nCount = 0;
        for (int i = 0; i < len; i++) {
            if (input.charAt(i) == 'M') {
                mCount = getConsecutiveCount(input, i, 'M');
                result += getElement(mCount + 1, heap);
                mCount = 0;
            } else {
                result += getElement(1, heap);
                nCount = 0;
            }

        }
        return result + heap.poll();
    }

    static int getConsecutiveCount(String input, int index, char ch) {
        int count = 0;
        for (int i = index; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                count++;
            } else {
                break;
            }
        }
        return count;

    }

    static String getElement(int count, PriorityQueue<Integer> heap) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        int element = 0;
        while (count-- > 0) {
            element = heap.poll();
            if (count > 0) {
                priorityQueue.add(element);
            } else {
                break;
            }
        }
        heap.addAll(priorityQueue);
        return Integer.toString(element);
    }
}
