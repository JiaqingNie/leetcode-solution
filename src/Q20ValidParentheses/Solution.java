package Q20ValidParentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){

            char c = s.charAt(i);
            if (isOpenParenthese(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()){
                    return false;
                }
                char open = stack.pop();
                if (!isMapped(open, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isOpenParenthese(char c) {
        return c == '(' || c =='[' || c == '{';
    }

    public boolean isMapped(char open, char close) {
        return open =='(' && close == ')' || open =='[' && close == ']' || open =='{' && close == '}';
    }

    public static void main(String[] args) {
        String testcase = "{[()]}";
        Solution solution = new Solution();
        System.out.println(solution.isValid(testcase));
    }
}
