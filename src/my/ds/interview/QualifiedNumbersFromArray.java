package my.ds.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class QualifiedNumbersFromArray {

    static String findQualifiedNumbers(int[] numberArray) {

        List<Integer> array = new ArrayList<>();
        for (int number : numberArray) {

            if (findValueHaveOneTwoThree(number))
                array.add(number);
        }

        Collections.sort(array);

        String str ="";
        Iterator it = array.iterator();
        while (it.hasNext()) {

            int value = (int)it.next();
            if (str.length() > 0)
                str +=",";

            str +=Integer.toString(value);
        }

        return getString(str);
    }

    private static String getString(String str) {
        return (str.length() > 0) ?
                str : "-1";
    }

    private static boolean findValueHaveOneTwoThree(
            int number) {
        String str = Integer.toString(number);
        return (str.contains("1")  && str.contains("2") && str.contains("3"));
    }

    public static void main(String[] args)
    {
        int[] numberArray = {1456,345671,43218,123};
        System.out.println(findQualifiedNumbers(numberArray));
    }
}
