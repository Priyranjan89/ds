package my.ds.array.program;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputFromCmd {

    public static void main(String[] agr) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        do {
            String input = scanner.next();
           // boolean isNumber = input.chars().allMatch(Character::isDigit);

            if (Pattern.matches("[0-9]+", input)) {
                int intNum = Integer.parseInt(input);
                if (intNum >= 1) {
                    int result = intNum * intNum;
                    System.out.println("Square of input :" + result);
                } else {
                    flag = false;
                }
            } else {
                flag = false;
            }
        } while (flag);
    }
}
