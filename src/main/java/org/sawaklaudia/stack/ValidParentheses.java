package org.sawaklaudia.stack;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            Character bracket = s.charAt(i);
            if (!stack.isEmpty()) {
                Character bracketInStack = stack.peek();
                if (bracketInStack.equals('(') && bracket.equals(')')
                        || bracketInStack.equals('{') && bracket.equals('}')
                        || bracketInStack.equals('[') && bracket.equals(']')) {
                    stack.pop();
                } else {
                    stack.push(bracket);
                }
            } else {
                stack.push(bracket);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(){()(()){()(()){()(()()()()()()){()}{()}}{()}}()}";
        System.out.println(isValid(s));
    }
}
