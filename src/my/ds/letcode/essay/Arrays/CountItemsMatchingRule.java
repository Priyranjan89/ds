package my.ds.letcode.essay.Arrays;
/*You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.



Example 1:

Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].*/


import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingRule {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;;

        List<String> rule = Arrays.asList("type","color","name");
        for (List<String> list : items){
            if (list.get(rule.indexOf(ruleKey)).equals(ruleValue))
                count++;
        }


        /*for (List<String> list : items) {
            if (ruleKey.equals("type") && ruleValue.equals(list.get(0))) {
                count++;
            }
            if (ruleKey.equals("color") && ruleValue.equals(list.get(1))) {
                count++;
            }
            if (ruleKey.equals("name") && ruleValue.equals(list.get(2))) {
                count++;
            }
        }*/
        return count;
    }

    public static void main(String[] args) {
        List<String> row1 = Arrays.asList("phone", "blue", "pixel");
        List<String> row2 = Arrays.asList("computer", "silver", "lenovo");
        List<String> row3 = Arrays.asList("phone", "gold", "iphone");
        List<List<String>> items = Arrays.asList(row1, row2, row3);
        String ruleKey = "color";
        String ruleValue = "silver";

        int value = countMatches(items, ruleKey, ruleValue);
        System.out.println(value);

    }
}
