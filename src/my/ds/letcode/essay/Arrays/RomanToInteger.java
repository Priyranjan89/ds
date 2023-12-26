package my.ds.letcode.essay.Arrays;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {
        Map<Character,Integer> numbersMap = new HashMap<>();
        numbersMap.put('I',1);
        numbersMap.put('V',5);
        numbersMap.put('X',10);
        numbersMap.put('L',50);
        numbersMap.put('C',100);
        numbersMap.put('D',500);
        numbersMap.put('M',1000);

        int result=0;

        for(int i=s.length()-1;i>=0;i--)
        {
            char ch = s.charAt(i);

            if(i>0 && numbersMap.get(ch) > numbersMap.get(s.charAt(i-1)))
            {
                result += numbersMap.get(ch) - numbersMap.get(s.charAt(i-1));
                i--;
            }

            else
                result += numbersMap.get(ch);
        }

        return result;
    }

    public static void main(String[] args) {

        String str = "MCMXCIV";
        int result = romanToInt(str);

        System.out.println(result);

    }
}
