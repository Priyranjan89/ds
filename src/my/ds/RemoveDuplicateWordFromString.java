package my.ds;

import java.util.*;

public class RemoveDuplicateWordFromString {

    public static String getStringWithoutDuplicate(String str){

        String arr[] = str.split("\\s");
        StringBuilder sb = new StringBuilder();
        Set<String> sets = new LinkedHashSet<>();

        for (int i =0 ; i<arr.length; i++){
            String temp = arr[i];
            if (sets.contains(temp)){
                continue;
            }else if (i<arr.length-1 && arr[i+1].equals(temp)){
                sets.add(arr[i+1]);
            }
            else {
                sets.add(arr[i]);
            }
        }

        Iterator itr = sets.iterator();
        while (itr.hasNext()){
            sb.append(itr.next()).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "i love to love to code to i code to code";
        System.out.println(getStringWithoutDuplicate(str));
    }
}
