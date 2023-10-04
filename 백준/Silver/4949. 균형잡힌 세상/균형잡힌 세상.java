import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        Stack<Character> stack = new Stack<>();

        while (true) {
            str = br.readLine();

            if (str.equals(".")) {
                break;
            }

            boolean flag = true;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')' || ch == ']') {
                    if (stack.isEmpty() || !isMatchingPair(stack.peek(), ch)) {
                        flag = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (!stack.isEmpty()) {
                flag = false;
            }

            System.out.println(flag ? "yes" : "no");
            stack.clear();
        }

    }
    private static boolean isMatchingPair(char left, char right) {
        return (left == '(' && right == ')') || (left == '[' && right == ']');
    }
}