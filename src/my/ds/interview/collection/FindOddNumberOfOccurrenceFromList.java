package my.ds.interview.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindOddNumberOfOccurrenceFromList {
    public static void main(String[] args) {
        {
            List<Integer> numbers = new ArrayList<>();

            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(3);
            numbers.add(3);
            numbers.add(4);
            numbers.add(4);
            numbers.add(5);
            numbers.add(5);
            numbers.add(5);
            numbers.add(5);
            numbers.add(5);

            int tempValue = numbers.get(0);
            Map<Integer, Integer> hashMap = new HashMap<>();

            int occurence = 0;
            //1,2,3,3,3,4,4,5,5,5,5;

            int lenght = numbers.size();

            for (int i = 0; i < lenght; i++) {
                if (tempValue == numbers.get(i)) {
                    occurence++;
                    if ((i == lenght - 1) && (occurence % 2 != 0)) {
                        hashMap.put(tempValue, occurence);
                    }
                    continue;
                }
                if (occurence % 2 != 0) {
                    hashMap.put(tempValue, occurence);
                }
                tempValue = numbers.get(i);
                occurence = 1;
            }

            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                System.out.println(entry.getKey() + "    " + entry.getValue());
            }

        }
    }
}
