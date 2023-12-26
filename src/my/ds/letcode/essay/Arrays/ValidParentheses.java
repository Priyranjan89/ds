package my.ds.letcode.essay.Arrays;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ']') {
                if (stack.empty() || stack.pop() != '[')
                    return false;
            } else if (ch == '}') {
                if (stack.empty() || stack.pop() != '{')
                    return false;
            } else if (ch == ')') {
                if (stack.empty() || stack.pop() != '(')
                    return false;
            }
        }
        if (!stack.empty()) return false;

        return true;
    }

    public static void main(String[] args) {
        String str = "()[]{}";
        String str1 = "{ { } [ ] [ [ [ ] ] ] }";
        System.out.println(isValid(str1));
    }
}
