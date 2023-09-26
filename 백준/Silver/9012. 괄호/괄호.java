import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            if (str.length() % 2 == 1) {
                System.out.println("NO");
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                if (!stack.isEmpty() && stack.peek() == '(' && str.charAt(j) == ')') {
                    stack.pop();
                } else {
                    stack.push(str.charAt(j));
                }
            }
            System.out.println(stack.isEmpty() ? "YES" : "NO");
            stack.clear();
        }
        
    }
    
}