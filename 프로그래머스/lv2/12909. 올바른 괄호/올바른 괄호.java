import java.util.*;
class Solution {
        boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') stack.push(s.charAt(i));
            else if (ch == ')' && stack.isEmpty()) return answer = false;
            else if (ch == ')' && !stack.isEmpty()) stack.pop();
        }

        answer = stack.isEmpty() ? true : false;

        return answer;
    }
}