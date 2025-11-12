package StringsManipulation.Medium;

import java.util.HashMap;
import java.util.Stack;

public class BalancedParenthesis {

    public static void main(String[] args) {

        String s1 = "{([])}";
        String s2 = "(){";
        String s3 = "()[]";

        boolean isBalanced = true;

        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        for(char ch:s1.toCharArray()) {
            if(ch == '(' || ch=='{' || ch=='[') {
                stack.push(ch);
            } else {
                if(stack.empty() || stack.peek()!=map.get(ch)) {
                    isBalanced = false;
                } else {
                    stack.pop();
                }
            }
        }

        if(!stack.empty()) isBalanced=false;

        System.out.println("isBalanced: " + isBalanced);
    }
}
